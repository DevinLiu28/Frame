package com.work.shop.pojo;
/**
 *   商品类
 *   编号、名称、价格 
 * @author Emlio Liu
 *
 */
public class Goods {
	 private Integer gid;
	 private String gname;
	 private Double price;
	 
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(Integer gid, String gname, Double price) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + "]";
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	 
	    

}
