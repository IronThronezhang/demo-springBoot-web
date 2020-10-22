package com.example.entity;

public class Emp {
    private String name;

    private Integer deptId;

    private Long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Emp [name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}
    
}