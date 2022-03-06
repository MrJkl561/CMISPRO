package cmis.obj;

import java.util.Arrays;

public class Customer {

	private int[] customerId;
	private int[] customerSales;
	private String[] customerNames;

	
	

	public Customer() {}

	public Customer(int[] customerId, int[] customerSales, String[] customerNames) {
		this.customerId = customerId;
		this.customerSales = customerSales;
		this.customerNames = customerNames;

	}

	public int[] getCustomerId() {
		return customerId;
	}



	public String[] getCustomerName() {
		return customerNames;
	}



	public int[] getCustomerSales() {
		return customerSales;
	}



	public void printAllData() {
		//String[] allNames = new String[numOfCustomers];
		System.out.printf("Their are %d of Customers. Here is the list \n", customerId.length + 1);
		for (int i = 0; i < customerNames.length; i++) {
		
			System.out.println("Customer id: " + customerId[i] + " Name: " + customerNames[i] + " ");
			
			
			
		}
		
	}



	public void setCustomerId(int[] customerId) {
		this.customerId = customerId;
	}



	public void setCustomerName(String[] customerNames) {
		this.customerNames = customerNames;
	}



	public void setCustomerSales(int[] customerSales) {
		this.customerSales = customerSales;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + Arrays.toString(customerId) + ", customerSales="
				+ Arrays.toString(customerSales) + ", customerNames=" + Arrays.toString(customerNames)
				+ "]";
	}
}
