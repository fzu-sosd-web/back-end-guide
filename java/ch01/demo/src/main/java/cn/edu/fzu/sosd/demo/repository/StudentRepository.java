package cn.edu.fzu.sosd.demo.repository;

import cn.edu.fzu.sosd.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

  Student findStudentByName(String name);

}
