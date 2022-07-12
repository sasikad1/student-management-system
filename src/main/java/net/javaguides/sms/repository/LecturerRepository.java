package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long>{

}
