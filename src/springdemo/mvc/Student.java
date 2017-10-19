package springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;

import com.sun.javafx.collections.MappingChange.Map;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> city;
	private String favoriteLanguage;
	private String[] operSystem;
    
	@Value("#{itemOptions}") 
	private Map<String, String> itemOptions;
	
	public Student() {
		city = new LinkedHashMap<>();
				
		city.put("BER", "Berlin");
		city.put("PAR", "Paris");
		city.put("LON", "London");
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCity() {
		return city;
	}
	
//	public void setCity(LinkedHashMap<String, String> city) {
//		this.city = city;
//	}

	public Map<String, String> getItemOptions() {
		return itemOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperSystem() {
		return operSystem;
	}

	public void setOperSystem(String[] operSystem) {
		this.operSystem = operSystem;
	}
	
	
	
}
