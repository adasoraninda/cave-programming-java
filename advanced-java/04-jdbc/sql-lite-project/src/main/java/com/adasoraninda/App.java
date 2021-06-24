package com.adasoraninda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        int[] ids = { 1, 2, 3 };
        String[] names = { "Bob", "Maria", "Paul" };

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Class loaded");

            // jdbc/[driver_name]/[database_name]
            String dbUrl = "jdbc:sqlite:people.db";

            try (Connection conn = DriverManager.getConnection(dbUrl); Statement stmt = conn.createStatement();) {

                String sql = "CREATE TABLE if not exists user(id INTEGER PRIMARY KEY, name TEXT NOT NULL)";
                stmt.execute(sql);

                sql = "INSERT INTO user (id, name) values (?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(sql);

                for (int i = 0; i < ids.length; i++) {
                    insertStmt.setInt(1, ids[i]);
                    insertStmt.setString(2, names[i]);

                    insertStmt.executeUpdate();
                }

                insertStmt.close();

                sql = "SELECT * FROM user";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");

                    System.out.println(id + ": " + name);
                }

                sql = "DROP TABLE user";
                stmt.execute(sql);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
