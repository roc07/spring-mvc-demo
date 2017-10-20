package springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import springdemo.mvc.validation.CourseCode;


public class Customer {

	private String firstName;
	
	@NotNull(message="shouldn't be empty")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="shouldn't be empty")	
	@Min(value=0, message="should be more than 0")
	@Max(value=10, message="should be no more than 10")
	private Integer passes;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="a-z, A-Z, 0-9, size 5")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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

	public Integer getPasses() {
		return passes;
	}

	public void setPasses(Integer passes) {
		this.passes = passes;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
}
