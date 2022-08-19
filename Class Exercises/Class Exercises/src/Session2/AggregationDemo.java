package Session2;

import java.util.*;


class Country{
	List<Sportsperson> sportspersons; //Association (Aggregation)
	private String countryName;
	
	public Country(String countryName) {
		//super();
		this.countryName = countryName;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public List<String> getSportpersons(){
		List<Sportsperson> listofSportspersons = this.sportspersons;
		List<String> names= new ArrayList<>();
		for(Sportsperson sportsperson:listofSportspersons) {
			names.add(sportsperson.getName());
		}
		return names;
	}
	public void setSportspersons(List<Sportsperson> sportspersons) {
		this.sportspersons = sportspersons;
	}
}

class Sportsperson
{
	private String name;
	public Sportsperson(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class AggregationDemo {
	public static void main(String[] args) {
		Sportsperson dhoni = new Sportsperson("Dhoni");
		Sportsperson kohli = new Sportsperson("Kohli");
		Sportsperson rohit = new Sportsperson("Rohit");
		Country india = new Country("India");
		List<Sportsperson> listSportspersons = new ArrayList<>();
		listSportspersons.add(dhoni);
		listSportspersons.add(kohli);
		listSportspersons.add(rohit);
		india.setSportspersons(listSportspersons);
		System.out.println("The sports people from country "+india.getCountryName()+" are "+india.getSportpersons());
	}

}
