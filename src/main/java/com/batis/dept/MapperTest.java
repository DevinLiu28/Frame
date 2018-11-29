package com.batis.dept;

import com.batis.pojo.Dept;
import com.batis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MapperTest {

    public static SqlSession sqlSession;
    public static DeptDao deptDao;
    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();
            deptDao = sqlSession.getMapper(DeptDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试 if
     */
    @Test
    public void testIf(){
        List<DeptEmp> deptEmpList = deptDao.testIf(7498,"");
        for (DeptEmp deptEmp:deptEmpList){
            System.out.println("部门信息:"+deptEmp);
            List<Emp> empList = deptEmp.getEmpList();
            for (Emp emp:empList){
                System.out.println("\t员工信息:"+emp);
            }
        }

    }

    /**
     * 测试 trim
     */
    @Test
    public void testTrim(){
        List<DeptEmp> deptEmpList = deptDao.testTrim("ALLEN","SALESMAN");
        for (DeptEmp deptEmp:deptEmpList){
            System.out.println("部门信息:"+deptEmp);
            List<Emp> empList = deptEmp.getEmpList();
            if (!empList.isEmpty()){
                for (Emp emp:empList){
                    System.out.println("\t员工信息:"+emp);
                }
            }

        }
    }
    @Test
    public void testChooseWhen(){
        List<DeptEmp> deptEmpList = deptDao.testChooseWhen("ALLEN","");
        for (DeptEmp deptEmp:deptEmpList){
            System.out.println("部门信息:"+deptEmp);
            List<Emp> empList = deptEmp.getEmpList();
            if (!empList.isEmpty()){
                for (Emp emp:empList){
                    System.out.println("\t员工信息:"+emp);
                }
            }
        }
    }

    @Test
    public void testForeachList(){
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(20);
        integers.add(30);
        integers.add(40);
        List<DeptEmp> integerList = deptDao.testForeachList(integers);
        for (DeptEmp deptEmp:integerList){
            System.out.println("部门信息:"+deptEmp);
            List<Emp> empList = deptEmp.getEmpList();
            if (!empList.isEmpty()){
                for (Emp emp:empList){
                    System.out.println("\t员工信息:"+emp);
                }
            }
        }
    }

    @Test
    public void testForeachArray(){
        Integer[] integers = {20,30,40};
        List<DeptEmp> integerList = deptDao.testForeachArray(integers);
        for (DeptEmp deptEmp:integerList){
            System.out.println("部门信息:"+deptEmp);
            List<Emp> empList = deptEmp.getEmpList();
            if (!empList.isEmpty()){
                for (Emp emp:empList){
                    System.out.println("\t员工信息:"+emp);
                }
            }
        }
    }
}
