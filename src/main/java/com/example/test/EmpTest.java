package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.controller.EmpController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpTest {
	@Autowired
	private EmpController empController;

	@Test
	public void getAllEmp() {
		  String getAllUser = empController.GetAllUser();
		  System.out.println(getAllUser);
	}

}
