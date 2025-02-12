package com.cruzeiro;

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
@RequestMapping("/employee")
public class EmployeeController {
	
	@InitBinder
	public void initBinder(WebDataBinder preenchimentoCampo) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		preenchimentoCampo.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
	    model.addAttribute("employee", new Employee());
	    return "employee-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
	        @Valid @ModelAttribute("employee") Employee employee,
	        BindingResult validationRules) 
	{
	    if (validationRules.hasErrors()) {
	        return "employee-form";
	    } else {
	        return "employee-confirmation";
	    }
	}
}
