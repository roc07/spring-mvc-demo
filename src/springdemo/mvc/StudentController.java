package springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		System.out.println("trimming");
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		model.addAttribute("itemOptions", student.getItemOptions());
		
		return "student-form";
	}
	
	@RequestMapping("/processStudent")
	public String processStudent(@ModelAttribute("student") Student theStudent) {
		
		return "student-confirmation";
	}
}
