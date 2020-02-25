package Service;

import java.time.LocalDate;
import java.util.List;
import status.UpdateProductStatus;
import Constructors.ProductOrderDetailsCons;
import Exception.NoDataFoundException;



public class OrderService {
	UpdateProductStatus obj = new UpdateProductStatus();
  public List<Integer> getId()
  {
	  return obj.getOrderid();
	  
  }
  public String orderservice(int orderid, LocalDate exitdate, LocalDate manufacturingdate, LocalDate expirydate) {
	  String result = "Not valid id";
	  List<Integer> list = obj.getOrderid();
	  for(Integer i: list) {
		  if(i==orderid) {
			  result = obj.updatedate(orderid, exitdate, manufacturingdate, expirydate);
		  }
	  }
	return result;
  }
  
  public boolean validateservice(int orderid ) throws NoDataFoundException
  {
	  boolean check = false ;
	  for(Integer i:obj.getOrderid())
	  {
		if(i==orderid)
			check=true;
		
	  }
	 if(check)
	 {
		 return check;
	 }
	 else 
	 {
		 throw new NoDataFoundException("Not valid id... Please enter valid ID");
	 }
  }
  public boolean dateValidate(String date) {
	  if(date.matches("\\d{4}-\\d{2}-\\d{2}")) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  public List<Integer> getOrderid(){
	  return obj.getOrderid();
  }
  
  
  
  

}
