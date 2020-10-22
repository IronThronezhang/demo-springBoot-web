package com.example.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Emp;
import com.example.service.EmpService;

@RestController
@RequestMapping("/testBoot")
public class EmpController {

	@Resource
	private EmpService empService;

	@RequestMapping("getEmp/{id}")
	public String GetUser(@PathVariable int id) {
		Emp emp = empService.getEmpByID(id);
		return emp.toString();
	}
	
	@RequestMapping("getAllEmp")
	public String GetAllUser() {
		     List<Emp> list = empService.getAll();
		return list.toString();
	}

}
