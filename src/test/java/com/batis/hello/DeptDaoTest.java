package com.batis.hello;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DeptDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	SqlSession session;
	@Before
	public void init()  {
		
		try {
			//1、利用流加载核心配置
			Reader reader = Resources.getResourceAsReader("Config.xml");
			//2、创建SQL会话构建器
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			//3、创建SQL会话工程(读取核心配置文件)
			SqlSessionFactory factory=builder.build(reader);
			session= factory.openSession();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@After
	public void destory() {
		if(session!=null) {
			session.close();
		}
	}
	
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoInsert() {
		//5、通过隐射关系获取DAO对象
		try {
			IDeptDao deptDao=session.getMapper(IDeptDao.class);
			//6、用方法
			Dept dept=new Dept(99, "", "");
			int result=deptDao.doInsert(dept);
			if(result >0) {
				session.commit();
			}else {
				session.rollback();
			}
		} catch (Exception e) {
			if(session!=null) {
				session.rollback();
			}
			e.printStackTrace();
		}
	}
	@Test
	public void testDoDelete() {
		fail("Not yet implemented");
	}

}
