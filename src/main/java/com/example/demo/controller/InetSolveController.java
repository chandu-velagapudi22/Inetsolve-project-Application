package com.example.demo.controller;

import java.util.Random;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.InetSolveStudentData;
import com.example.demo.repository.InetsolveStudentRepository;
import com.example.demo.service.EmailService;
import com.example.demo.service.InetSolveStudentService;

@Controller
public class InetSolveController {

	Logger logger = LoggerFactory.getLogger(InetSolveController.class);
	@Autowired
	private InetSolveStudentService service;
	@Autowired
	private InetsolveStudentRepository repo;
	@Autowired
	private EmailService emailService;

	// @GetMapping("/")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/")
	public String formLogin(Model model) {
		System.out.println("InetSolveController.formLogin()");
		InetSolveStudentData studentData = new InetSolveStudentData();
		model.addAttribute("studentData", studentData);
		return "index";
	}

//this method is used for to display the form page
	@PostMapping("/getform")
	public String getDisplayPage(@ModelAttribute("student") InetSolveStudentData student, Model model) {
		String studentName = student.getStudentName();
		InetSolveStudentData findByStudentName = repo.findByStudentName(studentName);
		String studentName4 = findByStudentName.getStudentName();
		if (studentName.contentEquals(studentName4)) {
			model.addAttribute("student", "Yes your credantials are true");
			return "display";
		} else {
			model.addAttribute("ub", "Credantials are invalid");
			logger.info("I am inside the getForm page");
			return "signup";
		}
	}

//This method is used for the saving the user sign up data code
	@PostMapping("/saveData")
	public String postSignUpCredantls(@ModelAttribute("student") InetSolveStudentData student, Model model) {
		InetSolveStudentData saveData = service.saveData(student);
		model.addAttribute("studentData", saveData);
		return "display";
	}

	@GetMapping("/signUpData")
	public String savenewdata(@ModelAttribute("student") InetSolveStudentData student, Model model) {
		model.addAttribute("esave all data", student);
		return "signup";
	}

	@GetMapping("/forgotpassword")
	public String forgettnPassword(@ModelAttribute("student") InetSolveStudentData student, Model model) {
		return "checkpassword";

	}

	@PostMapping("/savepassword")
	public String forogotMyPassword(@ModelAttribute("student") InetSolveStudentData student, Model model) {

		int length = 8;
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";
		String str = new Random().ints(length, 0, chars.length()).mapToObj(i -> "" + chars.charAt(i))
				.collect(Collectors.joining());

		// Cheacking user name with db
		String studentName = student.getStudentName();
		InetSolveStudentData findByStudentName = repo.findByStudentName(studentName);
		String studentName2 = findByStudentName.getStudentName();
		if (studentName.contentEquals(studentName2)) {

			
			
			emailService.sendMail("vinodh.sun6@gmail.com", str, "please check and us ethe password");

			model.addAttribute("mymail", "please go to youe email and check the password");
			return "checkEmail";
		} else {
			return "signup";
		}
	}

}
