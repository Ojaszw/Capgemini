package MAin;

import java.time.LocalDate;
import java.util.Scanner;

import dao.UpdateProductStatusDAO;
import exception.NoDataFoundException;
import exception.NotNegativeId;
import service.OrderService;
public class Main {
	public static void main(String[] args) throws NoDataFoundException, NotNegativeId {
	Scanner sc = new Scanner(System.in);
		OrderService obj = new OrderService();
		UpdateProductStatusDAO obj1 = new UpdateProductStatusDAO();
		System.out.println("Product Ids are:"+obj.getId());
		System.out.println("Enter the Id:");
		int prod_id;
		while(true){
			prod_id = sc.nextInt();
			try{
				if(obj.validateservice(prod_id)){		
					break;
				}
				 if(prod_id<0)
	        	  {
	        		  throw new NotNegativeId("Id Should be positive");
	        	  }
				
		}
			catch(NoDataFoundException | NotNegativeId e){
			
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
				System.out.println("The product id details are: " +obj1.getDetails(prod_id));
		}
	
	}
}

	

