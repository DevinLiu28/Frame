package com.batis.hello;

public class Dept {

	private Integer deptId;
	private String dename ;
	private String location;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDename() {
		return dename;
	}
	public void setDename(String dename) {
		this.dename = dename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Dept(Integer deptId, String dename, String location) {
		super();
		this.deptId = deptId;
		this.dename = dename;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", dename=" + dename + ", location=" + location + "]";
	}
	
	
	
}
