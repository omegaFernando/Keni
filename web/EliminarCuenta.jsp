<%-- 
    Document   : EliminarCuenta
    Created on : 3/12/2015, 05:37:38 PM
    Author     : JoséLuis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Cuenta</title>
    </head>
    <body>
        <div style="text-align:center;">
        <h1>Ingresa tu Contraseña para eliminar la Cuenta</h1>
        <form action="eliminar" method="post" id="formulario">
        <table style="margin: 0 auto;" >
          <tr>
            <td colspan=2><img src="Imagenes/EliminarCuenta.jpg"></td>
            </tr> 
          <tr>
            <td align="right"> Contraseña: </td>
            <td><input type="password" name="pass" id="pass"></td> 
          </tr> 
        </table>
     
        <input type="reset" value="Borrar">
        <input type="submit" value="Eliminar Cuenta">
      </form>
        <br>
      <form action="SesionIniciada.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </div>
    </body>
</html>
<script type="text/javascript">
    
var forma = document.getElementById("formulario");
forma.onsubmit = function(){
   var txtpass;
     
        txtpass = document.getElementById("pass").value.toString();
                
        if(txtpass.length <= 0)
        {
            alert("Favor de agregar la Contraseña");
            return false;
        }
        if(txtpass.length >10)
        {
            alert("El numero maximo de caracteres en el password es de 10 caracteres");
            return false;
        }
        return true;
}
</script>