package cn.edu.fzu.sosd.demo.controller;

import cn.edu.fzu.sosd.demo.entity.Student;
import cn.edu.fzu.sosd.demo.service.StudentService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/stu/name")
  public Student findStuByName(String name) {
    return studentService.findByName(name);
  }

  @PostMapping("/stu")
  public Student registerStu(@RequestBody Student student) {
    return studentService.save(student);
  }

  @GetMapping("/stu")
  public List<Student> findAll() {
    return studentService.findAll();
  }
}
