package com.matiasservices.servicios.Datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectorSQL {

        private static ConectorSQL instancia;
        String serverName, instanceName, portNumber, user, pass;
        ResultSet restult;
        Statement statement;
        Connection connection;


        ConectorSQL(){
            serverName = "DESKTOP-L5BK9C0";
            instanceName = "SQLEXPRESS";
            portNumber = "1433";
            user = "";
            pass = "";
        }

        public static ConectorSQL getInstancia(){
            if(instancia == null ){
                instancia = new ConectorSQL();
            }
            return instancia;
        }

        public Connection contectar(String usuario, String pass) throws SQLException {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection(getConectionString(),
                    usuario, pass);
            return connection;
        }

        public Connection conectar() throws SQLException{
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection(getConectionString());
            return connection;
        }

        public void desconectar() throws SQLException {
            if (!connection.isClosed()){
                connection.close();
            };
        }

        private String getConectionString(){
            String conectionString =
                    "jdbc:sqlserver://"+serverName+"\\"+instanceName+":"+portNumber+";databaseName=MiClub2022;"
                    + "user="+ user + ";"
                    + "password=" + pass + ";"
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=30;";


            return conectionString;
        }
}
