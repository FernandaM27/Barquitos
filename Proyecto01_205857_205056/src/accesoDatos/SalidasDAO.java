/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import objetosNegocios.Barco;
import objetosNegocios.Salida;

/**
 *
 * @author Dany
 */
public class SalidasDAO extends ConexionDAO {
    private BarcosDAO barcosDAO;
    
    public SalidasDAO(){
        barcosDAO=new BarcosDAO();
    }
    
    public boolean guardar(Salida salida){
        try{
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            PreparedStatement com= conexion.prepareStatement("INSERT INTO salidas (fechahora, destino,idbarco) VALUES(?,?,?)");
            java.sql.Timestamp fec= salida.getFecha();
            com.setTimestamp(1, fec);
            com.setString(2, salida.getDestino());
            com.setInt(3, salida.getBarco().getIdBarco());
            if(com.executeUpdate()==1){
               conexion.close();
               return true;
            }
            return false;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return false;
        }                
    }
    
    public boolean actualizar(Salida salida){
        try{
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            java.sql.Date fec= new java.sql.Date(salida.getFecha().getTime());
//UPDATE `proyectobarcos`.`salidas` SET `fechahora` = '2020-02-16 10:00:00', `destino` = 'holaa' WHERE (`idsalida` = '6');
            PreparedStatement com= conexion.prepareStatement("UPDATE salidas SET fechahora = ?, destino = ?, idbarco=? WHERE idsalida = ?");            
            com.setDate(1, fec);
            com.setString(2, salida.getDestino());
            com.setInt(3, salida.getBarco().getIdBarco());
            com.setInt(4, salida.getIdSalida());
            com.executeUpdate();
           if(com.executeUpdate()==1){
               conexion.close();
               return true;
            }
            return false;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return false;
        }                
    }   
    
    public ArrayList<Salida> consultar(String textoBusqueda){
        ArrayList<Salida> listaSalidas = new ArrayList<>();
        try{            
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idsalida, fechahora, destino, idbarco FROM salidas;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()){
                int id = resultado.getInt("idsalida");
                Timestamp fecha = resultado.getTimestamp("fechahora");
                String destino = resultado.getString("destino");
                int idbarco = resultado.getInt("idbarco");
                Barco barco = barcosDAO.consultar(idbarco);
                Salida salida = new Salida(id, fecha,destino,barco);
                listaSalidas.add(salida);
            }
            return listaSalidas;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaSalidas;
        }
    }
    
     public ArrayList<Salida> consultar2(String textoBusqueda){
         ArrayList<Salida> listaSalidas = new ArrayList<>();
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            ResultSet resultado;
             String sql;
            if(textoBusqueda.isEmpty()){
                sql = "SELECT idsalida, fechahora, destino, idbarco FROM salidas;";
            }else{
                sql = String.format("SELECT idsalida, fechahora, destino, idbarco FROM salidas WHERE destino='%s';", textoBusqueda);
            }
            resultado = comando.executeQuery(sql);
            while (resultado.next()) {
                int id = resultado.getInt("idsalida");
                Timestamp fechahora = resultado.getTimestamp("fechahora");
                String nombre = resultado.getString("nombre");
                String destino = resultado.getString("destino");
                int idBarco = resultado.getInt("idbarco");
                Barco barco= barcosDAO.consultar(idBarco);
                Salida salida = new Salida(id,fechahora,destino,barco);
                listaSalidas.add(salida);
            }
            return listaSalidas;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return listaSalidas;
        }
     }
    
    public Salida consultar(int idsalida){        
        try{            
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("SELECT idsalida, fechahora, destino, idbarco FROM salidas WHERE idsalida=%d;",idsalida);
            ResultSet resultado = comando.executeQuery(sql);
            if(resultado.next()){
                int id = resultado.getInt("idsalida");
                Timestamp fecha = resultado.getTimestamp("fechahora");
                String destino = resultado.getString("destino");
                int idbarco = resultado.getInt("idbarco");
                Barco barco= barcosDAO.consultar(idbarco);
                Salida salida = new Salida(id, fecha,destino, barco);
                return salida;
            }
            return null;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }   
      
    public boolean eliminar(int idSalida){
        try{
            //comando.executeUpdate(sql);
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            //DELETE FROM `proyectobarcos`.`socios` WHERE (`idsocio` = '1');
            String sql = String.format("DELETE FROM salidas WHERE idsalida=%d" 
                    ,idSalida);
          if(comando.executeUpdate(sql)==1){
               conexion.close();
               return true;
            }
            return false;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return false;
        }   
    }
}
