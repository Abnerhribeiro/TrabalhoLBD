package main;

import connection.ConnectionDB;

public class Main {
	public static void main(String[] args) {
		ConnectionDB con = new ConnectionDB();
		con.conecta();
	}
}
