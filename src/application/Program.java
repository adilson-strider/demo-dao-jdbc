package application;

import java.sql.Connection;

import db.DB;
import model.entities.Departament;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Departament obj = new Departament(1, "Books");
		System.out.println(obj);
	}

}
