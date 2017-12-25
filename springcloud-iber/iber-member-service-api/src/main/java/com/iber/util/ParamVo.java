package com.iber.util;

import java.io.Serializable;

public class ParamVo implements Serializable{

	private static final long serialVersionUID = 3698545555546868L;
	
	private String cid;
	private String memberId;
	private String method;
	private String param;
	private String phone;
	private String type;
	private String version;

	public ParamVo(){}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		//将ios上传上来的版本的 . 替换掉
		this.version = version.replace(".","");
	} 

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("cid =" + getCid() + "\n");
		s.append("method =" + getMethod() + "\n");
		s.append("param =" + getParam() + "\n");
		return s.toString();
	}
	
}
