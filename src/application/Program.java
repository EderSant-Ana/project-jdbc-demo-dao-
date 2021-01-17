package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
//		try {
//		Department depart = new Department(1, "Books");
//		System.out.println(depart);
//		
//		Seller seller = new Seller(1, "John", "john@gmail.com", sdf.parse("22/05/1983"), 6200.00, depart);
//		
//		System.out.println(seller);
//		}
//		catch(ParseException e) {
//			System.out.println(e.getMessage());
//		}
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("==== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("==== TEST 3: seller findAll ====");
		List<Seller> list2 = sellerdao.findAll();
		for(Seller obj: list2) {
			System.out.println(obj);
		}
		System.out.println();
		
		
	}

}
