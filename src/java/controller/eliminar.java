/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GestorBD;

/**
 *
 * @author JoséLuis
 */
@WebServlet(name = "eliminar", urlPatterns = {"/eliminar"})
public class eliminar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String pass=request.getParameter("pass");
            GestorBD gestorBD=new GestorBD();
            if(gestorBD.eliminar(pass)){
                request.getRequestDispatcher("CuentaEliminada.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("ErrorAlEliminarCuenta.jsp").forward(request, response);
            }
        }finally{
            out.close();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            processRequest(request, response);
    }
    
    }


