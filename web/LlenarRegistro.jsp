<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Llena Registro</title>
    </head>
    <body>
        <div style="text-align:center;">  
            <h3> Registra tus datos</h3>
            <form action="registro" method="post" id="formulario">
            <table style="margin: 0 auto;">
            <tr>
            <td colspan=2><img src="Imagenes/LlenarRegistro.jpg"></td>
            </tr> 
            <tr>
                <td align="right"> Nombre: </td>
                <td><input type="text" name="nombre" id="nombre"></td> 
            </tr> 
            <tr>
                <td align="right"> Contraseña: </td>
                <td><input type="password" name="pass" id="pass"></td> 
            </tr> 
            <tr>
                <td align="right"> Correo: </td>
                <td><input type="text" name="mail" id="mail"></td> 
            </tr> 
            </table>
        <input type="submit" value="Guardar Registro">
        <input type="reset" value="Borrar">
      </form>
      <br>
      <form action="index.html" method="post">
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
        var txtnombre=document.getElementById("nombre").value.toString();              
        var txtmail=document.getElementById("mail").value.toString();
        
        if(txtnombre.length <=0&&txtpass.length <= 0&&txtmail.length <= 0)
        {
            alert("Favor de llenar los campos");
            return false;
        }
        
        if(txtnombre.length <= 0)
        {
            alert("Favor de agregar el Nombre");
            return false;
        }
        if(txtpass.length <= 0)
        {
            alert("Favor de agregar la Contraseña");
            return false;
        }
        if(txtmail.length <= 0)
        {
            alert("Favor de agregar el Correo ");
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