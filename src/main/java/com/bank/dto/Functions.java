package com.bank.dto;

public class Functions {
	private String name;
	private String desc;

	public Functions(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Functions [name=" + name + ", desc=" + desc + "]";
	}

}
