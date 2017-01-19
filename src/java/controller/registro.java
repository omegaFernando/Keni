package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

@WebServlet(name="registro", urlPatterns={"/registro"})

public class registro extends HttpServlet{
    protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            String nombre=request.getParameter("nombre");
            String pass=request.getParameter("pass");
            String correo=request.getParameter("mail");
            GestorBD gestorBD=new GestorBD();
            if(gestorBD.registrar(nombre, pass, correo)){
                request.getRequestDispatcher("PrincipalInicio.html").forward(request, response);
            }else{
                request.getRequestDispatcher("errorEnRegistro.jsp").forward(request, response);
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

