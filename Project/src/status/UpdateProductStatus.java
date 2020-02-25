package status;
import Repository.ProductOrderRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import Constructors.ProductOrderDetailsCons;



public class UpdateProductStatus {
	Map<Integer, ProductOrderDetailsCons> prod;
	public UpdateProductStatus() 
	{
		prod= ProductOrderRepository.get();
		
	}
	public List<Integer> getOrderid()
	{
		List<Integer> Idlist=new ArrayList<Integer>();
		for(Entry<Integer, ProductOrderDetailsCons> map:prod.entrySet())
		{
			Idlist.add(map.getKey());
		}
		return Idlist;
		
	}
	public  String updatedate(int orderid, LocalDate exitdate, LocalDate manufacturingdate, LocalDate expirydate)
	{
		
		for(Entry<Integer, ProductOrderDetailsCons> map:prod.entrySet())
		{
			if(map.getKey()==orderid)
			{
				map.getValue().setExitdate(exitdate);
				map.getValue().setManufacturingdate(manufacturingdate);
				map.getValue().setExpirydate(expirydate);
				
			}
			
		}
	
       return "data inserted";
       
		
	}

}
