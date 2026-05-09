package com.jspiders.Restaurants;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/update")
public class UpdateCartServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
	    String indexStr = req.getParameter("index");
	    String action = req.getParameter("action");

	    if (indexStr == null || action == null) {
	        resp.sendRedirect("cart");
	        return;
	    }

	    int index = Integer.parseInt(indexStr);

	    HttpSession session = req.getSession();
	    List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

	    if (cart != null && index < cart.size()) {

	        CartItem item = cart.get(index);

	        if (action.equals("inc")) {
	            item.setQty(item.getQty() + 1);
	        } 
	        else if (action.equals("dec")) {
	            if (item.getQty() > 1) {
	                item.setQty(item.getQty() - 1);
	            } else {
	                cart.remove(index);
	            }
	        } else if (action.equals("remove")) {
	            cart.remove(index);
	        }
	    }

	    session.setAttribute("cart", cart);

	    resp.sendRedirect("cart");
	}

}
