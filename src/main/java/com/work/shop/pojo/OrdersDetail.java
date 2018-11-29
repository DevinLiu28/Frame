package com.work.shop.pojo;
/**
 *   订单详情类
 *   订单编号、商品编号、数量  
 * @author Emlio Liu
 *
 */
public class OrdersDetail {
	private Integer osid;
	private Integer gid;
	private Integer quantity;
	
	Goods good;
	public OrdersDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrdersDetail(Integer osid, Integer gid, Integer quantity, Goods good) {
		super();
		this.osid = osid;
		this.gid = gid;
		this.quantity = quantity;
		this.good = good;
	}
	@Override
	public String toString() {
		return "OrdersDetail [osid=" + osid + ", gid=" + gid + ", quantity=" + quantity + ", good=" + good + "]";
	}
	public Integer getOsid() {
		return osid;
	}
	public void setOsid(Integer osid) {
		this.osid = osid;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}
	

	 
}
