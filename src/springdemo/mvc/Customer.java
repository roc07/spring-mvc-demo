package springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {

	private String firstName;
	
	@NotNull(message="shouldn't be empty")
	@Size(min=1, message="is required")
	private String lastName;
	
	public Customer() {
		// TODO Auto-generated constructor stub
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
	
	
	
}
