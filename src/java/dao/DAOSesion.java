/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ABEL
 */
public class DAOSesion {
    
    private Connection connection;
    private String tipoUsuario="";
    
    public String obtenerTipoSesion(String usuario,String contraseña){
        try { 
          Statement statement =  null; 
          statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery("select idtipousuario from usuario where nomuser='"+usuario+"' and contraseña='"+contraseña+"'");  
         
          while (resultSet.next()){ 
            tipoUsuario=resultSet.getString(1); 
            }
         }catch (SQLException e) { 
             System.out.println("Error crear la sentencia " + e.getMessage()); 
            } 
       
      return tipoUsuario;             
    }
    
    public DAOSesion() {
        Conexion c1=new Conexion();
        connection = c1.initialize();
    }
    
}

