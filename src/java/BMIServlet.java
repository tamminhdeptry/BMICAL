/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * @author nguye
 */
public class BMIServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("MESSAGE", "");
        request.getRequestDispatcher("newjsp1.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String txtWeight = request.getParameter("weight");
        String txtHeight = request.getParameter("height");
        
        double weightt = Double.parseDouble(txtWeight);
        double heightt = Double.parseDouble(txtHeight);
        
        double result = 0;
        result = weightt/(heightt*heightt);
        
        if(result < 19){
            request.setAttribute("MESSAGE", "Under-standard");
        }
        else if(result <= 25){
            request.setAttribute("MESSAGE", "Standard");
        }
        else if(result <= 30){
            request.setAttribute("MESSAGE", "Overweight");
        }
        else if(result <= 40){
            request.setAttribute("MESSAGE", "Fat - should lose weight");
        }
        else{
            request.setAttribute("MESSAGE", "Very fat - should lose weight immediately");
        }
        
        request.setAttribute("weightt", weightt);
        request.setAttribute("heightt", heightt);
        request.getRequestDispatcher("newjsp1.jsp").forward(request, response);
    }

    

}
