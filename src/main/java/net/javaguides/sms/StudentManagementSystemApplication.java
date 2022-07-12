package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Lecturer;
import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.LecturerRepository;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private LecturerRepository lecturerRepository;

	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Sasika", "Dilum", "sasika@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sanka", "Madushan", "sanka@gmail.com");
//		studentRepository.save(student2);
//		
//		Lecturer lecturer1 = new Lecturer("Sasika", "Dilum", "Sasika@gmail.com");
//		lecturerRepository.save(lecturer1);
	}

 }
