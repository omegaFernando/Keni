package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorBD {
    Connection conn=null;
    Statement stm;
    ResultSet rs;
    public boolean registrar(String nombre,String password,String correo){        
        int resultUpdate=0;
        try{
            conn=ConectaBD.abrir();
            stm=conn.createStatement();
            resultUpdate=stm.executeUpdate("insert into registros values('"+
                    nombre+"','"+correo+"','"+password+"');");
            if(resultUpdate!=0){
                ConectaBD.cerrar();
                return true;
            }else{
                ConectaBD.cerrar();
                return false;
            }
        }catch (Exception e){
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
    public boolean consultar(String correo, String pass) throws SQLException{
        try{
            conn=ConectaBD.abrir();
            stm=conn.createStatement();
            rs=stm.executeQuery("SELECT * FROM registros WHERE email='"+correo+"'and password='"+pass+"'");
            if(!rs.next()){
                return false;
            }else{
                return true;
            }
        }catch(Exception e){
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }
    public boolean eliminar(String pass){        
        int resultUpdate=0;
        try{
            conn=ConectaBD.abrir();
            stm=conn.createStatement();
            resultUpdate=stm.executeUpdate("DELETE FROM registros WHERE password='"+pass+"'");
            if(resultUpdate!=0){
                ConectaBD.cerrar();
                return true;
            }else{
                ConectaBD.cerrar();
                return false;
            }
        }catch (Exception e){
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
    public boolean consultarCNombre(String correo, String nombre) throws SQLException{
        try{
            conn=ConectaBD.abrir();
            stm=conn.createStatement();
            rs=stm.executeQuery("SELECT * FROM registros WHERE nombre='"+nombre+"'and email='"+correo+"'");
            if(!rs.next()){
                return false;
            }else{
                return true;
            }
        }catch(Exception e){
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }
    public boolean consultarCPassword(String correo, String password) throws SQLException{
        try{
            conn=ConectaBD.abrir();
            stm=conn.createStatement();
            rs=stm.executeQuery("SELECT * FROM registros WHERE password='"+password+"'and email='"+correo+"'");
            return rs.next();
        }catch(Exception e){
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }
    public boolean modificarNombre(String nombre,String correo) throws SQLException{
        conn=ConectaBD.abrir();
        stm=conn.createStatement();
        stm.execute("update registros SET nombre='"+nombre+"' where email='"+correo+"';");    
        return consultarCNombre(correo, nombre);
    }
    public boolean modificarPassword(String password,String correo) throws SQLException{
        conn=ConectaBD.abrir();
        stm=conn.createStatement();
        stm.execute("update registros SET password='"+password+"' where email='"+correo+"';");    
        return consultarCPassword(correo, password);
    }
    @SuppressWarnings("empty-statement")
    public String[] consultarDatos(String correo) throws SQLException{
        try{
            conn=ConectaBD.abrir();
            stm=conn.createStatement();
            rs=stm.executeQuery("SELECT * FROM registros WHERE email='"+correo+"'");
            rs.next();
            String[] consultarDat={rs.getString("nombre"),rs.getString("password")};  
            return consultarDat;
        }catch(Exception e){
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }
}