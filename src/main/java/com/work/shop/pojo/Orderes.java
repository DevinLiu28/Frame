package com.work.shop.pojo;

import java.util.Date;
import java.util.List;
/**
 * 订单类
 * 编号、时间、总金额 
 * @author Emlio Liu
 *
 */
public class Orderes {
 	private Integer osid;   
 	private Date createtime;
 	private Double sum ;
 	List<OrdersDetail> detail;
	public Orderes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orderes(Integer osid, Date createtime, Double sum, List<OrdersDetail> detail) {
		super();
		this.osid = osid;
		this.createtime = createtime;
		this.sum = sum;
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Orderes [osid=" + osid + ", createtime=" + createtime + ", sum=" + sum + ", detail=" + detail + "]";
	}
	public Integer getOsid() {
		return osid;
	}
	public void setOsid(Integer osid) {
		this.osid = osid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public List<OrdersDetail> getDetail() {
		return detail;
	}
	public void setDetail(List<OrdersDetail> detail) {
		this.detail = detail;
	}
 	
 	

}
