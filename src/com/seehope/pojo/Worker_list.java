package com.seehope.pojo;

public class Worker_list {
	private String worker_id;
	private String worker_account;
	private String worker_password;
	private String worker_name;
	private String worker_sex;
	private int worker_age;
	private String post_id;
	private int state;
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	public String getWorker_account() {
		return worker_account;
	}
	public void setWorker_account(String worker_account) {
		this.worker_account = worker_account;
	}
	public String getWorker_password() {
		return worker_password;
	}
	public void setWorker_password(String worker_password) {
		this.worker_password = worker_password;
	}
	public String getWorker_name() {
		return worker_name;
	}
	public void setWorker_name(String worker_name) {
		this.worker_name = worker_name;
	}
	public String getWorker_sex() {
		return worker_sex;
	}
	public void setWorker_sex(String worker_sex) {
		this.worker_sex = worker_sex;
	}
	public int getWorker_age() {
		return worker_age;
	}
	public void setWorker_age(int worker_age) {
		this.worker_age = worker_age;
	}
	public String getPost_id() {
		return post_id;
	}
	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Worker_list() {
	
	}
	public String toString() {
		return "Worker_list [worker_id=" + worker_id + ", worker_account=" + worker_account + ", worker_password="
				+ worker_password + ", worker_name=" + worker_name + ", worker_sex=" + worker_sex + ", worker_age="
				+ worker_age + ", post_id=" + post_id + ", state=" + state + "]";
	}
	
}
