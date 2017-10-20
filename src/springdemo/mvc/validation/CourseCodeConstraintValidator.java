package springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String>{

	private String prefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {

		prefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCodeEnteredByUser, 
			ConstraintValidatorContext additionalErrorMessages) {

		boolean result = theCodeEnteredByUser.startsWith(this.prefix);
		
		return result;
	}

}
