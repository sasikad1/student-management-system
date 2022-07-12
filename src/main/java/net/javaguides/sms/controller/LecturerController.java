package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Lecturer;
import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.LecturerService;

@Controller
public class LecturerController {
	
	private LecturerService lecturerService;

	public LecturerController(LecturerService lecturerService) {
		super();
		this.lecturerService = lecturerService;
	}
	
	//handler method to handle list student and return mode and view
	@GetMapping("/lecturers")
	public String listLecturers(Model model) {
		model.addAttribute("lecturers", lecturerService.getAllLecturers());
		return"lecturers";
	}
	
	@GetMapping("/lecturers/new")
	public String createLecturerForm(Model model) {
		//create lecturer object to hold lecturer form data
		Lecturer lecturer = new Lecturer();
		model.addAttribute("lecturer", lecturer);
		return "create_lecturer";
	}
	
	@PostMapping("/lecturers")
	public String saveLecturer(@ModelAttribute("lecturer") Lecturer lecturer) {
		lecturerService.saveLecturer(lecturer);
		return "redirect:/lecturers";
	}
	
	@GetMapping("/lecturers/edit/{id}")
	public String editLecturerForm(@PathVariable Long id, Model model) {
		model.addAttribute("lecturer", lecturerService.getLecturerById(id));
		return "edit_lecturer";
	}
	
	@PostMapping ("/lecturers/{id}")
	public String updateLecturer(@PathVariable Long id, @ModelAttribute("lecturer") Lecturer lecturer, Model model) {
		
		//get lecturer from database by id
		Lecturer existingLecturer = lecturerService.getLecturerById(id);
		existingLecturer.setId(id);
		existingLecturer.setFirstName(lecturer.getFirstName());
		existingLecturer.setLastName(lecturer.getLastName());
		existingLecturer.setEmail(lecturer.getEmail());
		
		//save update student object
		lecturerService.updateLecturer(existingLecturer);
		return "redirect:/lecturers";

	}
	
	//handler method to handel delete student request
	@GetMapping("/lecturers/{id}")
	public String deleteLecturer(@PathVariable Long id) {
		lecturerService.deleteLecturerById(id);
		return "redirect:/lecturers";
	}
}
