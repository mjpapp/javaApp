package com.seehope.pojo;

public class Prefer_list {
	private String pre_type;
	private double pre_percent;
	public String getPre_type() {
		return pre_type;
	}
	public void setPre_type(String pre_type) {
		this.pre_type = pre_type;
	}
	public double getPre_percent() {
		return pre_percent;
	}
	public void setPre_percent(double pre_percent) {
		this.pre_percent = pre_percent;
	}
	public Prefer_list() {
	
	}

	public String toString() {
		return "Prefer_list [pre_type=" + pre_type + ", pre_percent=" + pre_percent + "]";
	}
	
}
