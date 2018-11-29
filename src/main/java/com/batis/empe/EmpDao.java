package com.batis.empe;

import org.apache.ibatis.annotations.Param;

import com.batis.dept.DeptEmp;
import com.batis.pojo.Emp;

import java.util.List;

public interface EmpDao {
    List<Emp> selectLimit();
    
}
