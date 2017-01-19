package model;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBD{
    public static Connection con;
    //private static String bd="usuarios";
    public static String usuario="root";
    public static String passw="3676";
    public static String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=convertToNull";
    
    public static Connection abrir(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,usuario,passw);
        }catch(Exception e){
            System.out.println("Erro en la conexion...");
            e.printStackTrace();
        }
        return con;
    }
    
    public static void cerrar(){
        try{
            if(con!=null){
                con.close();
            }
        }catch(Exception e){
            System.out.println("Error: No se logro cerrar la conexion \n"+e);
        }
    }
}