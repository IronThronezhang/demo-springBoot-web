package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.entity.Emp;
import com.example.mapper.EmpMapper;

@Service
public class EmpService {
    
	@Resource
	private EmpMapper empMapper;
	
	 public List<Emp> getAll(){
	        return empMapper.getAll();
	    }

	    public Emp getEmpByID(int id){
	    	Emp empById = empMapper.getEmpById(id);
	        return empById;
	    }

	    public void  delete(int id){
	        empMapper.deleteEmp(id);
	    }

	    public void update(Emp p){
	        empMapper.upDateEmp(p);
	    }
}
