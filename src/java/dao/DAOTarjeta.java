/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ABEL
 */
public class DAOTarjeta {
    
    private Connection connection;
    private String estado="";
    private int monto=0;
    private boolean existe=false;
    private int id = 0;
        
    public String obtenerEstadoTarjeta(int idTarjeta){
        try { 
          Statement statement =  null; 
          statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery("select estado from tarjeta where idtarjeta='"+idTarjeta+"';");  
         
          while (resultSet.next()){ 
            estado=resultSet.getString(1); 
            }
         }catch (SQLException e) { 
             System.out.println("Error crear la sentencia " + e.getMessage()); 
            } 
       
      return estado;             
    }
    
    public int obtenerMonto(int idTarjeta){
        try { 
          Statement statement =  null; 
          statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery("select montototal from tarjeta where idtarjeta='"+idTarjeta+"';");  
         
          while (resultSet.next()){ 
            monto=resultSet.getInt(1); 
            }
         }catch (SQLException e) { 
             System.out.println("Error crear la sentencia " + e.getMessage()); 
            } 
       
      return monto;             
    }
   
    public DAOTarjeta() {
        Conexion c1=new Conexion();
        connection = c1.initialize();
    }
    
}
