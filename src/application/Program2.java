package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: department findById ====");
		Department department = departmentdao.findById(1);
		
		System.out.println(department);
		System.out.println();
		
		System.out.println("==== TEST 2: department findAll ====");
		List<Department> list = departmentdao.findAll();
		
		for(Department dep: list) {
			System.out.println(dep);
		}
		System.out.println();
		
		System.out.println("==== TEST 3: insert department ====");
		
		Department newDepartment = new Department(null, "Music");
		departmentdao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		System.out.println();
		
		System.out.println("==== TEST 4: delete department ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
				
		departmentdao.deleteById(id);
		System.out.println("Delete completed");
		System.out.println();
		
		System.out.println("==== TEST 5: update department ====");
		department = departmentdao.findById(4);
		department.setName("Library");
		
		departmentdao.update(department);
		System.out.println("Update completed");
		System.out.println();
		
		sc.close();
	}

}
