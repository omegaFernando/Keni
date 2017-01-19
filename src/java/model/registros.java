/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JoséLuis
 */
public class registros {
    String nombre;
    String correo;
    String pass;
    public registros(){
        this.nombre=null;
        this.pass=null;
        this.correo=null;
    }
    public registros(String nombre,String pass,String correo){
        this.nombre=nombre;
        this.pass=pass;
        this.correo=correo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPass(){
        return pass;
    }
    
}
