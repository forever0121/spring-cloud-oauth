/*
 * 
 */
package com.iber.model.token;

import java.io.Serializable;
import java.util.Date;

/**
 * token
 * @author ouxx
 * @since 2017-6-28 上午10:50:39
 *
 */
public class Token implements Serializable {

	private Integer id;
	private String token;
	private String type;//类别(如省平台：province)
	private Date updateTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
