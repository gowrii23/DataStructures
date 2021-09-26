package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileRead {

	public static void main(String[] args) {
		
		FileRead fileRead = new FileRead();
		
		

		ExecutorService service = Executors.newFixedThreadPool(10);
		
		
		service.submit(
						new Runnable(){ 
										public void run()
										{ fileRead.readFile();
										}
									   }
						);
		 
		   
			/*
			 * Thread t1 = new Thread( new Runnable(){ public void run(){
			 * fileRead.readFile(); } });
			 * 
			 * 
			 * t1.start();
			 */
		  System.out.println("Thread main "+ Thread.currentThread().getName());
		   

	}

	 void readFile() {
		 System.out.println("T " + Thread.currentThread().getName());
		List<Employee> empList = new ArrayList<>();
		Employee emp;
		
		File file = new File("D:\\test\\test.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);
			
			while(sc.hasNext()) {
				String line = sc.next();
				String[] employee = line.split(",");
				
				emp = new Employee();
				emp.setName(employee[0]);
				emp.setPhoneNumber(employee[1]);
				empList.add(emp);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 System.out.println(empList.toString());
	}

	
	


}
