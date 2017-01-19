<%-- 
    Document   : DatosDelUsuario
    Created on : 6/12/2015, 07:17:16 PM
    Author     : JoséLuis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String nombre=( String)request.getAttribute("nombre"); %>
<% String pass=( String)request.getAttribute("password"); %>
<% String correo=( String)request.getAttribute("correo"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos de Usuario</title>
    </head>
    <body>
        <br><br><br>
        
        <div style="text-align:center;">
        <h1>Datos Personales</h1>
        <table style="margin: 0 auto;">
            <tr>
                <td rowspan="5"><img src="Imagenes/perfil.png"></td>
            </tr>
            <tr>
                <td rowspan="5"><br></td>
            </tr>
            <tr>
                <td>Nombre:</td>
                <td align="left"><%=nombre%></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td align="left"><%=pass%></td>
            </tr>
            <tr>
                <td>Correo:</td>
                <td align="left"><%=correo%></td>
            </tr>
            <tr>
                <td colspan=4><form action="PrincipalInicio.html" method="post">
                    <input type="submit" value="Regresar"></form></td>
             </tr>
        </table>
       </div>
    </body>
</html>