package com.day2.demo;

import com.day2.demo.dao.StudentDao;
import com.day2.demo.dao.StudnetDAOImpl;
import com.day2.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDao studentDAO)
//	{
//		return runner -> { createStudent(studentDAO);};
//	}


//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDao studentDAO)
//	{
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... runner) throws Exception {
//				DemoApplication.this.createStudent(studentDAO);
//			}
//		};
//	}
//@Bean
//public void run(String... runner) throws Exception {
//	DemoApplication.this.createStudent(studentDAO);
//}

	@Autowired
	StudentDao  studentDAO;
	//StudentDao  studentDAO=new StudnetDAOImpl()
	@Override
	public void run(String... args) throws Exception {

		DemoApplication.this.createStudent(studentDAO);
		System.out.println("HEllo World");
		DemoApplication d=new DemoApplication();
		d.justathing();

	}
	public void justathing()
	{
		System.out.println("HEllo World 2");

	}



	private void createStudent(StudentDao studentDAO) {
		System.out.println("HEllo World2");
		// create teh student object
		System.out.println("Creatieng new student Object");
		Student st=new Student("nisu1","devil2","nishat@gmail.com");

		// save the object
		System.out.println("Saving the  student");

		studentDAO.save(st);

		//display the id of saved student
		System.out.println("Student Genreated Id is "+st.getId());

	}


}
