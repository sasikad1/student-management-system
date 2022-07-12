package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Lecturer;
import net.javaguides.sms.entity.Student;

public interface LecturerService {
	List<Lecturer> getAllLecturers();

	Lecturer saveLecturer(Lecturer lecturer);
	
	Lecturer getLecturerById(Long id);
	
	Lecturer updateLecturer(Lecturer lecturer);
	
	void deleteLecturerById (Long id);
}
