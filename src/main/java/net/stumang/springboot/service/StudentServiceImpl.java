package net.stumang.springboot.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.stumang.springboot.model.Student;
import net.stumang.springboot.repository.StudentRepository;
	@Service
	public class StudentServiceImpl implements StudentService {
		@Autowired
		private StudentRepository  studentRepository;

		@Override
		public List<Student> getAllStudent() {
			
			return studentRepository.findAll();
		}

		@Override
		public void saveStudent(Student student) {
			this.studentRepository.save(student);
			
		}

		@Override
		public Student getStudentById(long id) {
			Optional<Student> optional = studentRepository.findById(id);
			Student student = null;
			if(optional.isPresent()){
				student =optional.get();

			}
			else{
				throw new RuntimeException("Student is not found for id ::" + id);
			}
			return student;
		}

		@Override
		public void deleteStudentById(long id) {
			this.studentRepository.deleteById(id);
		}

	}