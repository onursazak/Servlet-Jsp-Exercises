package com.onur.web.model;

public class Gadgets 
{
	private int gid;
	private String name;
	private int gprice;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGprice() {
		return gprice;
	}
	public void setGprice(int gprice) {
		this.gprice = gprice;
	}
	@Override
	public String toString() {
		return "Gadgets [gid=" + gid + ", name=" + name + ", gprice=" + gprice + "]";
	}
	
}
