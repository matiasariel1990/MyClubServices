package com.matiasservices.servicios;

import com.matiasservices.servicios.Datos.ConectorSQL;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
 class ConectorSQLTest {


     /*@Test
     void conectionConCredencialesDeAppUsuarioTest() throws SQLException {

        ConectorSQL conectorSQL = ConectorSQL.getInstancia();

        Assert.isTrue(!conectorSQL.contectar("SA2", "SA2*").isClosed(),"OK");
    }*/

    @Test
    void conectionConCredencialesDeWindowsTest() throws SQLException {

        ConectorSQL conectorSQL = ConectorSQL.getInstancia();

        Assert.isTrue(!conectorSQL.conectar().isClosed(),"OK");
    }

    @Test
    void consultaSimple() throws SQLException {
        ConectorSQL conectorSQL = ConectorSQL.getInstancia();
        Connection con = conectorSQL.conectar();
        Statement stm = con.createStatement();
        ResultSet resultSet = stm.executeQuery("select * from USR_USUARIOS.ROLES");
        resultSet.
        Assert.isTrue(!conectorSQL.conectar().isClosed(),"OK");
    }
}
