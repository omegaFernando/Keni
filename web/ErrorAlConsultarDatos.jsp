<%-- 
    Document   : ErrorAlConsultarDatos
    Created on : 6/12/2015, 07:27:17 PM
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
        <h1>Los sentimos no se puede Mostrar los Datos</h1>
        <img src="Imagenes/Error.jpg">
        <table style="margin: 0 auto;">
            <tr>
                <td><form action="ConsultarDatosDelUsuario.jsp" method="post">
                    <input type="submit" value="Intentar Nuevamente"></td>
                <td><form action="PrincipalInicio.html" method="post">
                    <input type="submit" value="Regresar"></td>
            </tr>
        </form>
        </table>
        </div>
    </body>
</html>
