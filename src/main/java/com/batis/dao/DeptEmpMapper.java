package com.batis.dao;

import com.batis.pojo.Dept1;
import com.batis.pojo.EmpBoss;
import com.batis.pojo.EmpBossDept;

import java.util.List;
import java.util.Map;

public interface DeptEmpMapper {
    List<Dept1> selectAllDeptAndEmp();
    EmpBoss selectEmpByEmpno(Integer empno);
    EmpBossDept selectEmpBossDeptByEmpno(Integer empno);
    List<Map<Object,Object>> selectDept();
    List<Map<Object,Object>> selectHire();
}
