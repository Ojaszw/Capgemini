package repository;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import constructors.ProductOrderDetailsCons;
public class ProductOrderRepository {
	static Map<Integer,ProductOrderDetailsCons> map=new HashMap<Integer,ProductOrderDetailsCons>();
	static {
		map.put(1,new ProductOrderDetailsCons (101,LocalDate.of(2020, 02, 21),LocalDate.of(2020, 02, 20),LocalDate.of(2020, 02, 12)));
		map.put(2,new ProductOrderDetailsCons (102,LocalDate.of(2020, 04, 22),LocalDate.of(2020, 07, 20),LocalDate.of(2020, 02, 13)));
		map.put(3,new ProductOrderDetailsCons (103,LocalDate.of(2020, 03, 23),LocalDate.of(2020, 06, 24),LocalDate.of(2020, 02, 14)));
		map.put(4,new ProductOrderDetailsCons (104,LocalDate.of(2020, 05, 24),LocalDate.of(2020, 05, 12),LocalDate.of(2020, 02, 15)));

	}
	static public Map<Integer,ProductOrderDetailsCons> get()
	{
		return map;
	}
		
}
