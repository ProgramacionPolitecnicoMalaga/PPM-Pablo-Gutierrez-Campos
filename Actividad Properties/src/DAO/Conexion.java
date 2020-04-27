package DAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conexionBD() throws SQLException {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.1.143:3306/aplicacion", "aplicacionuser", "1234");
            if (con != null) {
                System.out.println("Conexión establecida");
            }
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
            e.printStackTrace();
        }
        return  con;
    }
}
