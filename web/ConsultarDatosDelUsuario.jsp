<%-- 
    Document   : ConsultarDatosDelUsuario
    Created on : 6/12/2015, 07:21:39 PM
    Author     : JoséLuis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="text-align:center;">
        <h1>Ingrese su correo por favor</h1>
        <form action="consultar" method="post">
            <table style="margin: 0 auto;">
            <tr>
            <td colspan="2"><img src="Imagenes/DatosDelUsuario.jpg"></td>
            </tr> 
            <tr>
                <td>Correo:<input type="text" name="correo"></td>
            </tr> 
            <tr>
                <td colspan="2"><input type="submit" value="Consultar"></td>
            </tr>
            </table>
         </form>
        <br>
        <form action="PrincipalInicio.html" method="post">
            <input type="submit" value="Regresar">
        </form>
        </div>
    </body>
</html>
