package com.example.studentrecordsystem;

import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {

        Connection conn = DBConnection.connect();

        if (conn != null) {
            System.out.println("Connected to PostgreSQL!");
        } else {
            System.out.println("Connection failed.");
        }
    }
}