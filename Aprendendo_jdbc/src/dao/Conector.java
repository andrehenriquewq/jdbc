package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    static String url = "jdbc:mysql://localhost/pessoa?serverTimezone=America/Fortaleza" ;
    static String usuario = "root";
    static String senha = "";
    static Connection con;
   
    public static Connection getConexao() throws SQLException {
//com.mysql.jdbc.Driver
//org.gjt.mm.mysql.Driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            if(con == null){
                con = DriverManager.getConnection(url,usuario,senha);
            }
            return con;
        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }
}