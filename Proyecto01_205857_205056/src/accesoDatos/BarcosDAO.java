/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import objetosNegocios.Barco;
import objetosNegocios.Socio;

/**
 *
 * @author miran
 */
public class BarcosDAO extends ConexionDAO {
    private SociosDAO sociosDAO;
    
    public BarcosDAO(){
        sociosDAO=new SociosDAO();
    }
  
    public boolean guardar(Barco barco) {
        try {
            Socio socio=barco.getSocio();
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("INSERT INTO barcos (`matricula`, `nombre`, `numamarre`, `cuota`, `idsocio`) VALUES ('%s', '%s', '%d', '%.2f', '%d');",
                    barco.getMatricula(), barco.getNombre(), barco.getNumamarre(), barco.getCuota(), socio.getIdSocio());
            if (comando.executeUpdate(sql) == 1) {
                conexion.close();
                return true;
            }
            return false;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }
public void actualizar(Barco barco) {
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE barcos SET  matricula='%s', nombre='%s', numamarre='%d', cuota='%.2f', idsocio='%d' WHERE idbarco='%d';",
                    barco.getMatricula(), barco.getNombre(),barco.getNumamarre(), barco.getCuota(), barco.getSocio().getIdSocio(), barco.getIdBarco());
            comando.executeUpdate(sql);
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public boolean eliminar(int idBarco) {
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("DELETE FROM barcos WHERE idbarco='%d';", idBarco);
            if (comando.executeUpdate(sql) == 1) {
                conexion.close();
                return true;
            }
            return false;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    public ArrayList<Barco> consultar(String textoBusqueda) {
        ArrayList<Barco> listaBarcos = new ArrayList<>();
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            ResultSet resultado;
             String sql;
            if(textoBusqueda.isEmpty()){
                sql = "SELECT idbarco, matricula, nombre, numamarre, cuota, idsocio FROM barcos;";
            }else{
                 sql = String.format("SELECT idbarco, matricula, nombre, numamarre, cuota, idsocio FROM barcos WHERE matricula='%s' OR nombre= '%s';", textoBusqueda, textoBusqueda);
            }
            resultado = comando.executeQuery(sql);
            while (resultado.next()) {
                int id = resultado.getInt("idbarco");
                String matricula = resultado.getString("matricula");
                String nombre = resultado.getString("nombre");
                int numamarre = resultado.getInt("numamarre");
                Float cuota = resultado.getFloat("cuota");
                int idsocio = resultado.getInt("idsocio");
                Socio socio= sociosDAO.consultar(idsocio);
                Barco barco = new Barco(id, matricula, nombre, numamarre, cuota, socio);
                listaBarcos.add(barco);
            }
            return listaBarcos;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return listaBarcos;
        }
    }
    
    
    public Barco consultar(int idBarco) {
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("SELECT idbarco, matricula, nombre, numamarre, cuota, idsocio FROM barcos WHERE idbarco = %d;", idBarco);
            ResultSet resultado = comando.executeQuery(sql);
            if (resultado.next()) {
                int id = resultado.getInt("idbarco");
                String matricula = resultado.getString("matricula");
                String nombre = resultado.getString("nombre");
                int numamarre = resultado.getInt("numamarre");
                Float cuota = resultado.getFloat("cuota");
                int idsocio = resultado.getInt("idsocio");
                Socio socio=sociosDAO.consultar(idsocio);
                Barco barco = new Barco(id, matricula, nombre, numamarre, cuota, socio);
                return barco;
            }
            return null;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

}
