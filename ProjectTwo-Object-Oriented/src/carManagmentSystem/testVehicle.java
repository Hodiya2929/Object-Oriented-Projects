package carManagmentSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testVehicle {

	public static void main(String[] args) {
		List<Vehicle> cars=new ArrayList<>();
		cars.add(new Vehicle(240000,5079930,"���� �����"));
		cars.add(new Vehicle(98000,3049377,"��� �����"));
		cars.add(new Vehicle(56000,5079930,"����� �����"));
		cars.add(new Vehicle(89000,20230786,"����� ���"));
		cars.add(new Vehicle(310000,9599,"��� ���"));
		Collections.sort(cars);
		for (Vehicle v : cars) {
		System.out.println(v);
		}
		}

}
