package springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.sun.org.apache.xml.internal.serialize.ElementState;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface CourseCode {
	
	public String value() default "SPRING";
	
	public String message() default "needs to start with \"SPRING\" ";
	
	//>??
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}
