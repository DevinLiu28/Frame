package com.work.shop.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.work.shop.dao.OrderesDao;
import com.work.shop.pojo.Orderes;
import com.work.shop.pojo.OrdersDetail;

public class OrderTest {

	OrderesDao orderDao=null;
	SqlSession openSession;
	@Before
	public void init() {
		try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			openSession = factory.openSession();
			orderDao = openSession.getMapper(OrderesDao.class);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test() {
		List<Orderes> selectAll = orderDao.selectAll();
		int i=1;
		for (Orderes Order : selectAll) {
			System.out.println("订单编号："+Order.getOsid());
			List<OrdersDetail> Details = Order.getDetail();
			for (OrdersDetail detail : Details) {
				System.out.println("商品"+(i++)+"：");
				System.out.println("商品编号："+detail.getGood().getGid());
				System.out.println("名称："+detail.getGood().getGname());
				System.out.println("价格："+detail.getGood().getPrice());
			}
			
		}
	}
	
	@After
	public void destroy() {
		if(openSession!=null) {
			openSession.close();
		}
	}

}
