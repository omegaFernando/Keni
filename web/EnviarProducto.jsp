<%-- 
    Document   : EnviarProducto
    Created on : 7/12/2015, 12:13:44 AM
    Author     : JoséLuis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enviar Producto</title>
    </head>
    <body>
        <div style="text-align:center;">
        <h1>Favor de Llenar los campos</h1>

  <p> Despues de introducir tus datos oprime el botón "enviar"</p>
  <h1>Datos Personales</h1>   
  <form action="Gracias.html" method="post">
      <table style="margin: 0 auto;">
          <tr>
              <td align="right"> Nombre(s): </td>
              <td><input type="text" name="nombre"></td> 
          </tr>  
          <tr>
              <td align="right"> Apellidos: </td>    
              <td> <input type="text" name="apellidos"> </td> 
          </tr>
          <tr>
              <td align="right"> Telefono: </td>    
              <td> <input type="text" name="telefono"> </td> 
          </tr>
          <tr>
              <td align="right"> Correo Electronico: </td>    
              <td> <input type="text" name="mail"> </td> 
          </tr>
          <tr>
              <td align="right"> Sexo: </td>    
              <td><input type="radio" name="genero" value="hombre"> Hombre
                  <input type="radio" name="genero" value="mujer">Mujer</td>
          </tr>
          <tr>
              <td align="right"> Dirección: </td>    
              <td> <input type="text" name="direccion"> </td> 
          </tr>
          <tr>
              <td align="right"> Colonia: </td>    
              <td> <input type="text" name="colonia"> </td> 
          </tr>
          <tr>
              <td align="right"> Ciudad: </td>    
              <td> <input type="text" name="ciudad"> </td> 
          </tr>
          <tr>
              <td align="right"> Estado: </td>    
              <td><select name="estado" size="1">
                    <option value"">Aguascalientes</option>
                    <option value"">Baja California Norte</option>
                    <option value"">Baja California Sur</option>
                    <option value"">Campeche </option>
                    <option value"">Chiapas</option>
                    <option value"">Coahuila</option>
                    <option value"">Colima</option>
                    <option value"" selected>Distrito Federal</option>
                    <option value"">Durango</option>
                    <option value"">Estado de México</option>
                    <option value"">Guanajuato</option>
                    <option value"">Guerrero</option>
                    <option value"">Hidalgo</option>
                    <option value"">Jalisco</option>
                    <option value"">Michoacán</option>
                    <option value"">Morelos</option>
                    <option value"">Nayarit</option>
                    <option value"">Nuevo León</option>
                    <option value"">Oaxaca</option>
                    <option value"">Puebla</option>
                    <option value"">Querétaro</option>
                    <option value"">Quintana Roo</option>
                    <option value"">San Luis Potosi</option>
                    <option value"">Sinaloa</option>
                    <option value"">Sonora</option>
                    <option value"">Tabasco</option>
                    <option value"">Tamaulipas</option>
                    <option value"">Tlaxcala</option>
                    <option value"">Veracruz</option>
                    <option value"">Yucatán</option>
                    <option value"">Zacatecas</option>
                  </select></td>
          </tr>
          <tr>
              <td align="right"> Codigo Postal: </td>    
              <td> <input type="text" name="cp"> </td>
          </tr>
      </table>    

    
      <input type="reset" value="Borrar">
      <input type="submit" value="Enviar">
            
     </form>
     <br>
     <form action="Principal1.0.html" method="post">
            <input type="submit" value="Regresar">
     </form>
     </div>
    </body>
</html>
