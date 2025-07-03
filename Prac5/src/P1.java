
public class P1 {

	private String customername;
	private int customerId;
	private String customerCity;
	
	public P1() {
		System.out.println();
	}

	public P1(String customername, int customerId, String customerCity) {
		this(); //calling default constructor
		
		System.out.println("Hello is the Para Constructor");
		this.customername = customername;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	
	

	public P1(String customername,  String customerCity) {
		
		this.customername = customername;
		
		this.customerCity = customerCity;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "P1 [customername=" + customername + ", customerId=" + customerId + ", customerCity=" + customerCity
				+ "]";
	}
	
	
	

}
