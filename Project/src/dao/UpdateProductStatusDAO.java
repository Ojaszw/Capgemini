package dao;
import constructors.ProductOrderDetailsCons;
import repository.ProductOrderRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class UpdateProductStatusDAO {
	Map<Integer, ProductOrderDetailsCons> prod;
	public UpdateProductStatusDAO() 
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
	public String getDetails(int Id) {
		String result = null;
		for(Map.Entry<Integer, ProductOrderDetailsCons> obj : prod.entrySet() ) {
			result = obj.getValue().getOrderid()+"\n"+obj.getValue().getExitdate()+"\n"+obj.getValue().getManufacturingdate()+"\n"+obj.getValue().getExpirydate();
		}
		return result;
	}

}
