package springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		System.out.println("trimming");
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer, 
			BindingResult theBindingResult
			) {
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {	
			theCustomer.setFirstName(theCustomer.getFirstName().toUpperCase());
			return "customer-confirmation";
		}
	}
	
}
