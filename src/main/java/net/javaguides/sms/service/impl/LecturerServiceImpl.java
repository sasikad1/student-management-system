package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Lecturer;
import net.javaguides.sms.repository.LecturerRepository;
import net.javaguides.sms.service.LecturerService;

@Service
public class LecturerServiceImpl implements LecturerService{
	
	private LecturerRepository lecturerRepository;

	
	public LecturerServiceImpl(LecturerRepository lecturerRepository) {
		super();
		this.lecturerRepository = lecturerRepository;
	}

	
	@Override
	public List<Lecturer> getAllLecturers() {
		// TODO Auto-generated method stub
		return lecturerRepository.findAll();
	}


	@Override
	public Lecturer saveLecturer(Lecturer lecturer) {
		// TODO Auto-generated method stub
		return lecturerRepository.save(lecturer);
	}


	@Override
	public Lecturer getLecturerById(Long id) {
		// TODO Auto-generated method stub
		return lecturerRepository.findById(id).get();
	}


	@Override
	public Lecturer updateLecturer(Lecturer lecturer) {
		// TODO Auto-generated method stub
		return lecturerRepository.save(lecturer);
	}
	
	@Override
	public void deleteLecturerById(Long id) {
	lecturerRepository.deleteById(id);
	}
}
