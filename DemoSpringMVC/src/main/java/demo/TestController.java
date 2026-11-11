package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	@GetMapping("/home")
	public String sayHello() {
		return "hi.jsp";
	}
	
	@PostMapping("/register")
	public String readFormData(@ModelAttribute Student student, Model model) {

//		System.out.println(student.getName());
//		System.out.println(student.getAge());
//		System.out.println(student.getEmail());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("email", student.getEmail());
		
		return "display.jsp";
		//return "success.jsp";
	}
}
