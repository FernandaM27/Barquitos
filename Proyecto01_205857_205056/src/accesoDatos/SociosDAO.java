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
import objetosNegocios.Socio;

/**
 *
 * @author Dany
 */
public class SociosDAO extends ConexionDAO {

    public boolean guardar(Socio socio) {
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            //INSERT INTO `proyectobarcos`.`socios` (`dni`, `nombre`) VALUES ('prueba', 'daniel');
            String sql = String.format("INSERT INTO socios(dni, nombre) VALUES('%s','%s')",
                    socio.getDni(), socio.getNombre());
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

    public void actualizar(Socio socio) {
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            //UPDATE `proyectobarcos`.`socios` SET `dni` = 'a', `nombre` = 'H' WHERE (`idsocio` = '1');
            String sql = String.format("UPDATE socios SET dni = '%s', nombre = '%s' WHERE idsocio = %d;",
                    socio.getDni(), socio.getNombre(), socio.getIdSocio());
            comando.executeUpdate(sql);
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public ArrayList<Socio> consultar(String textoBusqueda) {
        ArrayList<Socio> listaAutores = new ArrayList<>();
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            if (textoBusqueda.isEmpty()) {
                String sql = "SELECT idsocio, dni, nombre FROM socios;";
                ResultSet resultado = comando.executeQuery(sql);
                while (resultado.next()) {
                    int id = resultado.getInt("idsocio");
                    String dni = resultado.getString("dni");
                    String nombre = resultado.getString("nombre");
                    Socio socio = new Socio(id, dni, nombre);
                    listaAutores.add(socio);
                }
                return listaAutores;
            } else {
                String sql = String.format("SELECT idsocio, dni, nombre FROM socios WHERE nombre='%s';", textoBusqueda);
                ResultSet resultado = comando.executeQuery(sql);
                while (resultado.next()) {
                    int id = resultado.getInt("idsocio");
                    String dni = resultado.getString("dni");
                    String nombre = resultado.getString("nombre");
                    Socio socio = new Socio(id, dni, nombre);
                    listaAutores.add(socio);
                }
                return listaAutores;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return listaAutores;
        }
    }

    public Socio consultar(int idsocio) {
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("SELECT idsocio, dni, nombre FROM socios WHERE idsocio = %d;", idsocio);
            ResultSet resultado = comando.executeQuery(sql);
            if (resultado.next()) {
                int id = resultado.getInt("idsocio");
                String dni = resultado.getString("dni");
                String nombre = resultado.getString("nombre");
                Socio socio = new Socio(id, dni, nombre);
                return socio;
            }
            return null;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public boolean eliminar(int idSocio) {
        try {
            Connection conexion = this.crearConexion();
            Statement comando = conexion.createStatement();
            //DELETE FROM `proyectobarcos`.`socios` WHERE (`idsocio` = '1');
            String sql = String.format("DELETE FROM socios WHERE idsocio=%d",
                     idSocio);
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
}
