package com.batis.hello;
/**
 * 创建Dao类的抽象方法
 * @author Emlio Liu
 *
 */
public interface IDeptDao {
	/**
	 * 插入操作
	 * @param dept pojo类
	 * @return
	 */
	int doInsert(Dept dept);
	/**
	 * 定义删除方法
	 * @param did 主键id
	 * @return
	 */
	public int doDelete(int did);
	

}
