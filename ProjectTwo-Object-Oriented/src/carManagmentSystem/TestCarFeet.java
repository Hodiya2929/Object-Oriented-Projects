package carManagmentSystem;

import java.util.Iterator;

public class TestCarFeet {


	public static void main(String[] args) {
		CarFleet fleet=new CarFleet ("Avis");
		fleet.add(new Vehicle(240000,5079930,"���� �����"));
		fleet.add(new Vehicle(98000,3049377,"��� �����"));
		fleet.add(new Vehicle(56000,5079930,"����� �����")); 
		fleet.add(new Vehicle(89000,20230786,"����� ���"));
		fleet.add(new Vehicle(310000,9599,"��� ���"));
		Iterator<Vehicle> it=fleet.iterator();
		Vehicle v=null;
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		it=fleet.iterator();
		while (it.hasNext()) {
			v=it.next();
			if(v.getOwnerName().contains("���"))
			System.out.format("Car Licence %d costs %d%n",
					v.getLicencePlate(), v.getTotalValue());
					}
		

	}

}
