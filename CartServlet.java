package com.jspiders.Restaurants;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/cart")
public class CartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        HttpSession session = req.getSession();
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        
        int total = 0;
        
        out.println("<h2 align='center'>Your Cart</h2>");
        out.println("<table border='1' align='center'>");
        out.println("<tr><th>Food</th><th>Qty</th><th>Price</th><th>Total</th><th>Action</th></tr>");

        if (cart != null) {
            for (int i = 0; i < cart.size(); i++) {
                CartItem item = cart.get(i);
                total += item.getTotal();

                out.println("<tr>");

                out.println("<td>" + item.getName() + "</td>");

                out.println("<td>"
                        + "<form action='update' method='post' style='display:inline;'>"
                        + "<input type='hidden' name='index' value='" + i + "'>"
                        + "<input type='hidden' name='action' value='dec'>"
                        + "<button>-</button></form> "

                        + item.getQty()

                        + " <form action='update' method='post' style='display:inline;'>"
                        + "<input type='hidden' name='index' value='" + i + "'>"
                        + "<input type='hidden' name='action' value='inc'>"
                        + "<button>+</button></form>"
                        + "</td>");

                out.println("<td>" + item.getPrice() + "</td>");
                out.println("<td>" + item.getTotal() + "</td>");
                out.println("<td>"
                        + "<form action='update' method='post'>"
                        + "<input type='hidden' name='index' value='" + i + "'>"
                        + "<input type='hidden' name='action' value='dec'>"
                        + "<button>Remove</button></form>"
                        + "</td>");

                out.println("</tr>");
            }
        }

        out.println("</table>");

        out.println("<h3 align='center'>Total Price: ₹ " + total + "</h3>");

        out.println("<center><a href='order'><button>Place Order</button></a></center>");

    }
}
