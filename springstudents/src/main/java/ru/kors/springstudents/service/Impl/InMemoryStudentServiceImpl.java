package ru.kors.springstudents.service.Impl;

import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().firstName("John").email("john19@gmail.com").age(37).build(),
                Student.builder().firstName("Jessa").email("jessa57@gmail.com").age(53).build(),
                Student.builder().firstName("Marco").email("marco101@gmail.com").age(21).build()
        );
    }
}
