package com.batis.dao;

import com.batis.pojo.Dept;

import java.util.List;
public interface DeptMapper {

    int addNewDept(Dept dept);

    int updateDeptInformation();

    List<Dept> getAllDept();


}
