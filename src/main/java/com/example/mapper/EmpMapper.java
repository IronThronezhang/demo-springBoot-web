package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Emp;

@Mapper
public interface EmpMapper {
	/**
	 * 新增员工
	 * @param record
	 * @return
	 */
    int insert(Emp record);

    int insertSelective(Emp record);
    
    /**
     * 查询所有员工
     * @return
     */
    List<Emp> getAll();
    /**
     * 根据Id查询员工
     * @return
     */
    Emp getEmpById(int id);
    /**
     * 删除员工
     * @param id
     * @return
     */
    int deleteEmp(int id);
    /**
     * 更新员工
     * @param id
     * @return
     */
    int upDateEmp(Emp emp);
}