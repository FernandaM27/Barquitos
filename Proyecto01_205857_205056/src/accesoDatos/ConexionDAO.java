/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dany
 */
public class ConexionDAO {
    private static final String CADENA_CONEXION = "jdbc:mysql://localhost/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "1234";
    
    public ConexionDAO() {}
    
    protected Connection crearConexion() throws SQLException{
        Connection conexion = DriverManager.getConnection(CADENA_CONEXION, USUARIO, CONTRASENIA);
        return conexion;
    }
}
