package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		Department depart = new Department(1, "Books");
		System.out.println(depart);
		
		Seller seller = new Seller(1, "John", "john@gmail.com", sdf.parse("22/05/1983"), 6200.00, depart);
		
		System.out.println(seller);
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
