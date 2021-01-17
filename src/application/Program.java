package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
		
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
	}

}
