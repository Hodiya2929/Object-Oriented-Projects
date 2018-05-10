package carManagmentSystem;

public class Vehicle implements Comparable<Vehicle> {

	private int totalValue;
	private int licencePlate;
	private String ownerName;

	@Override
	public String toString() {
		return "Vehicle [totalValue=" + totalValue + ", licencePlate=" + licencePlate + ", ownerName=" + ownerName
				+ "]\n";
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public int getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(int licencePlate) {
		this.licencePlate = licencePlate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Vehicle(int totalValue,int licencePlate,String ownerName) {
		this.totalValue=totalValue;
		this.licencePlate = licencePlate;
		this.ownerName=ownerName;

	}


	@Override
	public int compareTo(Vehicle o) {
		
		if (this.totalValue-o.totalValue>0)
			return -1;
		else if (this.totalValue-o.totalValue==0)
			return 0;
		else return 1;
	}
}