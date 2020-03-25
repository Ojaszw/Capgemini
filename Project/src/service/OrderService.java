package service;

import java.time.LocalDate;
import java.util.List;
import java.util.*;
import constructors.ProductOrderDetailsCons;
import dao.UpdateProductStatusDAO;
import exception.NoDataFoundException;
import exception.NotNegativeId;



public class OrderService implements Orderserviceinterface {
	UpdateProductStatusDAO obj = new UpdateProductStatusDAO();
  public List<Integer> getId()
  {
	  return obj.getOrderid();
	  
  }
  public String orderservice(int orderid, LocalDate exitdate, LocalDate manufacturingdate, LocalDate expirydate) throws NoDataFoundException , NotNegativeId 
  {
	  String result = "Not valid id";
	  if(orderid<0)
		 {
			 throw new NotNegativeId(" ID cannot a negative number");
		 }
		 else if(orderid==0)
		 {
			 result="Id can not be 0";
			 return result;
		 }
		 if(result==null)
			 
		 {
			 throw new NoDataFoundException("Not a Valid Id"); 
		 }
	  List<Integer> list = obj.getOrderid();
	  for(Integer i: list)
	  {
		  if(i==orderid) 
		  {
			  result = obj.updatedate(orderid, exitdate, manufacturingdate, expirydate);
		  }
	  }
	  
	return result;
  }
  
  public boolean validateservice(int orderid ) throws NoDataFoundException, NotNegativeId
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
	 if(orderid<0)
	 {
		 throw new NotNegativeId("ID cant be a negative");
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
