package com.iber.util;

import java.io.Serializable;

public class CommonVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String msg;
	private Object result;
	
	public CommonVo(){}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public CommonVo(String code, String msg, Object result) {
		this.code = code;
		this.msg = msg;
		this.result = result;
	}

	
}
