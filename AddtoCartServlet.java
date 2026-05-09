package com.jspiders.Restaurants;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddtoCartServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));

        HttpSession session = req.getSession();

        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        boolean found = false;

        for (CartItem item : cart) {
            if (item.getName().equals(name)) {
                item.setQty(item.getQty() + 1);
                found = true;
                break;
            }
        }

        if (!found) {
            cart.add(new CartItem(name, price, 1));
        }

        session.setAttribute("cart", cart);

        resp.sendRedirect("index.html");
    }
}

