package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		List<Department> list = new ArrayList<>();
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Department department = new Department();
		
		System.out.println("=== TEST 1: Seller findById ===");
		department = depDao.findById(1);
		System.out.println(department);

		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		
		
		System.out.println("\n=== TEST 3: Seller findAll ===");
		list = depDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: Seller Insert ===");
		depDao.insert(new Department(null, "Sex"));
	
		
		System.out.println("\n=== TEST 5: Seller Update ===");
		department = depDao.findById(7);
		department.setName("Shoes");
		depDao.update(department);
		System.out.println("Update complete");
		
		System.out.println("\n=== TEST 6: Delete ===");
		depDao.deleteById(12);
	
	}

}
