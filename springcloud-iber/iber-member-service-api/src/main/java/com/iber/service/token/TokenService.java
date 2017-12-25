package com.iber.service.token;


import com.iber.model.token.Token;

public interface TokenService {
	public String getToken(String key) throws Exception;
	public String getEmployeeToken(String key)throws Exception;
	
	public int updateTokenByType(String token, String type) throws Exception;
	public Token getByType(String type) throws Exception;
	
}
