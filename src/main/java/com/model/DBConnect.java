package com.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//import java.util.Properties;
//import java.util.jar.Attributes.Name;

/**
 * Set up connection access to database(postgres was used)
 */
public class DBConnect {
    public void DBC() {
        String query;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Ol0.");
                Scanner sc = new Scanner(System.in)) {
            System.out.println("postgres=> ");
            query = sc.nextLine();
            Statement statement1 = connection.createStatement();
            statement1.execute(query);
            // result = statement.execute("select * from players where id = ' " + id + "'");

            System.out.println("postgres=> ");
            query = sc.nextLine();
            Statement statement2 = connection.createStatement();
            statement2.execute(query);

            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        

    }
            
}
