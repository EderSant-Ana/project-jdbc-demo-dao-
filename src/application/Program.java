package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("==== TEST 4: insert seller ====");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		System.out.println();
			
		System.out.println("==== TEST 5: update seller ====");
		
		seller = sellerdao.findById(1);
		seller.setName("Bruce Wayne");
		sellerdao.update(seller);
		System.out.println("Update completed");
		System.out.println();
		
		System.out.println("==== TEST 6: delete seller ====");

		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerdao.deleteById(id);
		System.out.println("Delete completed");
		System.out.println();
		
		sc.close();
	}
}
