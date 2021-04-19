package seventh_assignment2;

public class Marketting {
	
	private String employeeName;
	private String productName;
	private double salesAmount;
	
	
	public Marketting(String employeeName, String productName, double salesAmount) {
		
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}	
	
	@Override
	public String toString() {
		return "Marketting [employeeName=" + employeeName + ", productName=" + productName + ", salesAmount="
				+ salesAmount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 17;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salesAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Marketting other = (Marketting) obj;
		
		if (employeeName == other.employeeName &&
				productName == other.productName &&
				Double.doubleToLongBits(salesAmount) == Double.doubleToLongBits(other.salesAmount)
			) {
			return true;
		}
		return false;
	}
	
}
