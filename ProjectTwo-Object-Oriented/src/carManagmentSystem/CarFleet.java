package carManagmentSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarFleet {

	
	String OrganizationName;
	List <Vehicle> Cars;
	
	public CarFleet(String name){
		OrganizationName=name;
		Cars=new ArrayList<>();
	}
	
	public void add(Vehicle o){
		Cars.add(o);
	}
	
	public Iterator<Vehicle> iterator(){
		return new CarIterator();
		
	}
	@Override
	public String toString() {
		return "CarFleet [OrganizationName=" + OrganizationName + ", Cars=\n" + Cars + "]";
	}
	public class CarIterator implements Iterator<Vehicle> {

		int cursor=-1;
	
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (cursor<Cars.size()-1);
		}

		@Override
		public Vehicle next()  {
			if(cursor<Cars.size())
			return Cars.get(++cursor);
			else return null ;
		}
		
	}
}
