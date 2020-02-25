package MAin;

import java.time.LocalDate;
import java.util.Scanner;
import Exception.NoDataFoundException;
import Service.OrderService;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		OrderService obj = new OrderService();
		System.out.println("Product Ids are:"+obj.getId());
		System.out.println("Enter the Id:");
		int prod_id;
		while(true){
			prod_id = sc.nextInt();
			try{
				if(obj.validateservice(prod_id)){
					break;
				}

		}catch(NoDataFoundException e){
			System.out.println(e);
		}
	}
		System.out.println("Enter the exit date:format:yyyy-mm-dd");
		System.out.println("Enter the manufacturing date:format:yyyy-mm-dd");
		System.out.println("Enter the expiry date:format:yyyy-mm-dd");
		while(true){
			String exit_date = sc.next();
			String man_date = sc.next();
			String exp_date = sc.next();
			
			
				LocalDate converteddate = LocalDate.parse(exit_date);
				LocalDate converteddate1 = LocalDate.parse(man_date);
				LocalDate converteddate2 = LocalDate.parse(exp_date);
				System.out.println(obj.orderservice(prod_id, converteddate, converteddate1, converteddate2));			
		}
	
	}
}

	

