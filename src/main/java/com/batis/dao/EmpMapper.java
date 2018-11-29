package com.batis.dao;

import com.batis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    List<Emp> getAllEmp();

    List<Emp> getEmpByCondition(@Param("start") Integer start, @Param("end") Integer end);
}
