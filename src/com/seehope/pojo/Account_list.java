package com.seehope.pojo;

public class Account_list {
	private String acc_id;
	private String cus_id;
	private String acc_bankNum;
	private String acc_openBank;
	private String acc_subBank;
	private double acc_readyAccount;
	private double acc_costAccount;
	private double acc_monthAccount;
	public String getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	public String getAcc_bankNum() {
		return acc_bankNum;
	}
	public void setAcc_bankNum(String acc_bankNum) {
		this.acc_bankNum = acc_bankNum;
	}
	public String getAcc_openBank() {
		return acc_openBank;
	}
	public void setAcc_openBank(String acc_openBank) {
		this.acc_openBank = acc_openBank;
	}
	public String getAcc_subBank() {
		return acc_subBank;
	}
	public void setAcc_subBank(String acc_subBank) {
		this.acc_subBank = acc_subBank;
	}
	public double getAcc_readyAccount() {
		return acc_readyAccount;
	}
	public void setAcc_readyAccount(double acc_readyAccount) {
		this.acc_readyAccount = acc_readyAccount;
	}
	public double getAcc_costAccount() {
		return acc_costAccount;
	}
	public void setAcc_costAccount(double acc_costAccount) {
		this.acc_costAccount = acc_costAccount;
	}
	public double getAcc_monthAccount() {
		return acc_monthAccount;
	}
	public void setAcc_monthAccount(double acc_monthAccount) {
		this.acc_monthAccount = acc_monthAccount;
	}
	public Account_list() {
		
	}

	public String toString() {
		return "Account_list [acc_id=" + acc_id + ", cus_id=" + cus_id + ", acc_bankNum=" + acc_bankNum
				+ ", acc_openBank=" + acc_openBank + ", acc_subBank=" + acc_subBank + ", acc_readyAccount="
				+ acc_readyAccount + ", acc_costAccount=" + acc_costAccount + ", acc_monthAccount=" + acc_monthAccount
				+ "]";
	}
	
}
