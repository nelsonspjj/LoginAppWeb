package br.com.login.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQL {

    private Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/atividade?useTimezone=true&serverTimezone=UTC", "root", "");
            if (connection != null) {
                System.out.println("CONECTADO COM SUCESSO!");
            } else {
                System.out.println("NÃO FOI POSSÍVEL CONECTAR AO BANCO DE DADOS.");
            }
            return connection;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

}
