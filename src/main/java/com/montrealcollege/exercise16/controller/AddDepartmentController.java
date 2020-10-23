package com.montrealcollege.exercise16.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.montrealcollege.exercise16.model.AddDepartment;
import com.montrealcollege.exercise16.service.AddDepartmentService;

@Controller
public class AddDepartmentController {

	@Autowired
	AddDepartmentService addDepService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/showForm", method = RequestMethod.GET)
	public String getForm(Model model) {
		model.addAttribute("addDepartment", new AddDepartment());
		return "addDepartmentForm";
	}

	@PostMapping("/new")
	public String insertDepartment(@Valid @ModelAttribute("addDepartment") AddDepartment addDep, BindingResult br,
			Model model) {
		if (br.hasErrors()) {
			return "addDepartmentForm";
		}
		addDepService.saveDepartment(addDep);
		model.addAttribute("success", addDep.getDepartmentName() + " successfully inserted");
		return "success";
	}
	
	@GetMapping("/list")
	public String listOfEmployees(Model model) {
		List<AddDepartment> list = addDepService.retrieveAllDepartments();
		model.addAttribute("list", list);
		return "allDepartments";
	}
}
