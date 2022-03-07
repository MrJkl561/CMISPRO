package cmis.obj;

public class Customer {

	private int customerId;
	private int customerSales;
	private String customerNames;

	public Customer() {
	}

	public Customer(int customerId, int customerSales, String customerNames) {
		this.customerId = customerId;
		this.customerSales = customerSales;
		this.customerNames = customerNames;

	}

	/* Getters and Setters */
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerNames;
	}

	public int getCustomerSales() {
		return customerSales;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerNames) {
		this.customerNames = customerNames;
	}

	public void setCustomerSales(int customerSales) {
		this.customerSales = customerSales;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerSales=" + customerSales + ", customerName="
				+ customerNames + "]";
	}

}
