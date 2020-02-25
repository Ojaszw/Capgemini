package Constructors;

import java.time.LocalDate;

public class ProductOrderDetailsCons {
	int orderid;
	LocalDate exitdate;
	LocalDate manufacturingdate;
	LocalDate expirydate;
	
	public ProductOrderDetailsCons(int orderid, LocalDate exitdate, LocalDate manufacturingdate, LocalDate expirydate) {
		super();
		this.orderid = orderid;
		this.exitdate = exitdate;
		this.manufacturingdate = manufacturingdate;
		this.expirydate = expirydate;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public LocalDate getExitdate() {
		return exitdate;
	}
	public void setExitdate(LocalDate exitdate) {
		this.exitdate = exitdate;
	}
	public LocalDate getManufacturingdate() {
		return manufacturingdate;
	}
	public void setManufacturingdate(LocalDate manufacturingdate) {
		this.manufacturingdate = manufacturingdate;
	}
	public LocalDate getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(LocalDate expirydate) {
		this.expirydate = expirydate;
	}

}
