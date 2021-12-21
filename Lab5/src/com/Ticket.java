package com;
public class Ticket {

	int tid;
	String desc;
	Customer customer;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", desc=" + desc + ", customer=" + customer + "]";
	}
}
