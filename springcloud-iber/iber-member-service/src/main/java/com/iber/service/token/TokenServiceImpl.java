package com.iber.service.token;

import com.iber.mapper.sys.SysParamMapper;
import com.iber.mapper.token.TokenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

	@Autowired
	IToken token;
	
	@Autowired
	private SysParamMapper sysParamMapper;
		
	@Autowired
	private TokenMapper tokenMapper;
	

	@Override
	public String getToken(String key) throws Exception {
		if(sysParamMapper.selectByKey("token_switch").getValue().equalsIgnoreCase("off")){
			return "offtoken";
		}
		return token.get(key);
	}

	@Override
	public String getEmployeeToken(String key) throws Exception {
		if(sysParamMapper.selectByKey("token_switch").getValue().equalsIgnoreCase("off")){
			return "offtoken";
		}
		return token.getEmployee(key);
	}

	@Override
	public int updateTokenByType(String token, String type) throws Exception {
		if(sysParamMapper.selectByKey("token_switch").getValue().equalsIgnoreCase("off")){
			return 0;
		}
		return tokenMapper.updateTokenByType(token, type);
	}

	@Override
	public com.iber.model.token.Token getByType(String type) throws Exception {
		if(sysParamMapper.selectByKey("token_switch").getValue().equalsIgnoreCase("off")){
			return null;
		}
		return tokenMapper.getByType(type);
	}
}
