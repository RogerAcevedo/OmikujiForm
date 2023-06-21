package com.rogera.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {
	@GetMapping("/omikuji")
	public String index(Model model, HttpSession session) {
//		System.out.println(session.getAttribute("sessionNumber"));
//		System.out.println(session.getAttribute("sessionCity"));
//		System.out.println(session.getAttribute("sessionPerson"));
		
//		WORKS WITH c:out tag to display in index.jsp
		model.addAttribute("number", session.getAttribute("sessionNumber"));
		model.addAttribute("city", session.getAttribute("sessionCity"));
		model.addAttribute("person", session.getAttribute("sessionPerson"));
		model.addAttribute("hobby", session.getAttribute("sessionHobby"));
		model.addAttribute("thing", session.getAttribute("sessionThing"));
		model.addAttribute("saynice", session.getAttribute("sessionSaynice"));
		
		return "index.jsp";
	}
	
	
	
	
	@PostMapping("/omikuji/show")
	public String omikuji(
			@RequestParam(value="number") Integer number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="saynice") String saynice,
			
//			session.getAttribute is used to display info in jsp file
//			SESSION DEPENDENCY INJECTION
			HttpSession session
			) {
			session.setAttribute("sessionNumber", number);
			session.setAttribute("sessionCity", city);
			session.setAttribute("sessionPerson", person);
			session.setAttribute("sessionHobby", hobby);
			session.setAttribute("sessionThing", thing);
			session.setAttribute("sessionSaynice", saynice);
		
		
		
//		System.out.println(number);
//		System.out.println(city);
//		System.out.println(person);
		return "redirect:/omikuji/show";
		
	}
	
	@GetMapping("/omikuji/show")
	public String show(Model model, HttpSession session) {
//		System.out.println(session.getAttribute("sessionNumber"));
//		System.out.println(session.getAttribute("sessionCity"));
//		System.out.println(session.getAttribute("sessionPerson"));
		
		
//		MAKING AN INSTANCE WITH A MODEL- doing this lets us use the "city, person" key, not "sessionCity"
//		WORKS WITH c:out tag to display in index.jsp
//		model.addAttribute("number", session.getAttribute("sessionNumber"));
//		model.addAttribute("city", session.getAttribute("sessionCity"));
//		model.addAttribute("person", session.getAttribute("sessionPerson"));
//		model.addAttribute("hobby", session.getAttribute("sessionHobby"));
//		model.addAttribute("thing", session.getAttribute("sessionThing"));
//		model.addAttribute("saynice", session.getAttribute("sessionSaynice"));
		
		return "show.jsp";
	}
	
	
}
