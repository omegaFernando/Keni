/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GestorBD;


@WebServlet(name = "modificar", urlPatterns = {"/modificar"})
public class modificar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String[] campos=(String [])request.getParameterValues("campos"); 
            String nombre=request.getParameter("nombre");
            String password=request.getParameter("password");
            String correo=request.getParameter("correo");
            GestorBD gestorBD=new GestorBD();
            if(campos==null){
            request.getRequestDispatcher("CamposVacios.html").forward(request, response);
            }
            for(String campo: campos){
                if(campos.length==1){
                    if("nombre".equals(campo)){
                        if(gestorBD.modificarNombre(nombre,correo)){
                           request.getRequestDispatcher("CamposModificados.jsp").forward(request, response);
                        }else{
                           request.getRequestDispatcher("ErrorAlModificarCuenta.jsp").forward(request, response);
                        }                       
                    }else{
                        if("password".equals(campo)){
                            if(gestorBD.modificarPassword(password,correo)){
                                request.getRequestDispatcher("CamposModificados.jsp").forward(request, response);
                            }else{
                                request.getRequestDispatcher("ErrorAlModificarCuenta.jsp").forward(request, response);
                            } 
                        }
                    }
                }else{
                    if("nombre".equals(campo)){
                        gestorBD.modificarNombre(nombre,correo);
                    }else{
                        if("password".equals(campo)){
                            gestorBD.modificarPassword(password,correo);
                        }
                    }
                    
                }
                request.getRequestDispatcher("CamposModificados.jsp").forward(request, response);                
            }            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(modificar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(modificar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
