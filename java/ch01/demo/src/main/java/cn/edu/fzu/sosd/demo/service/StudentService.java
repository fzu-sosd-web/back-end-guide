package cn.edu.fzu.sosd.demo.service;

import cn.edu.fzu.sosd.demo.entity.Student;
import cn.edu.fzu.sosd.demo.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public Student findByName(String name) {
    return studentRepository.findStudentByName(name);
  }

  public Student save(Student student) {
    return studentRepository.save(student);
  }

  public List<Student> findAll() {
    return studentRepository.findAll();
  }

}
