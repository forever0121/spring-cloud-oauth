package com.iber.service.token;

import com.iber.mapper.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Token implements IToken {

//	@Autowired
//    private RedisTemplate redisTemplate;  
	
	@Autowired
	private MemberMapper memberMapper;
	
//	public void setRedisTemplate(RedisTemplate redisTemplate) {
//		this.redisTemplate = redisTemplate;
//	}
//	
//	public RedisTemplate getRedisTemplate() {
//		return redisTemplate;
//	}
      
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(final String key, final String value) {
//		 boolean result = (Boolean) redisTemplate.execute(new RedisCallback<Boolean>() {  
//	            public Boolean doInRedis(RedisConnection connection)  
//	                    throws DataAccessException {  
//	                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();  
//	                byte[] keyByte  = serializer.serialize(key);  
//	                byte[] valueByte = serializer.serialize(value);  
//	                return connection.setNX(keyByte, valueByte);  
//	            }  
//	        });  
//	      return result; 
		Map<String , Object> tokenMap = new HashMap<String, Object>() ;
		tokenMap.put("id", key);
		tokenMap.put("token", value);
		memberMapper.updateMemberToken(tokenMap) ;
		return true ;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(String key) {
//		redisTemplate.delete(key);
		Map<String , Object> tokenMap = new HashMap<String, Object>() ;
		tokenMap.put("id", key);
		tokenMap.put("token", null);
		memberMapper.updateMemberToken(tokenMap) ;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String get(final String key) {
//		String  result = (String) redisTemplate.execute(new RedisCallback<String>() {  
//            public String doInRedis(RedisConnection connection)  
//                    throws DataAccessException {  
//                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();  
//                byte[] keyByte = serializer.serialize(key);  
//                byte[] value = connection.get(keyByte);   
//                if (value == null) {  
//                    return null;  
//                }  
//                return serializer.deserialize(value);  
//            }  
//        });  
		if(memberMapper.selectByPrimaryKey(Integer.parseInt(key==null||key.equals("")?"0":key)) == null) {
			return "" ;
		}else{
			return memberMapper.selectByPrimaryKey(Integer.parseInt(key)).getToken() ;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public String getEmployee(String key) {
		if(memberMapper.selectEmployeeByPrimaryKey(Integer.parseInt(key==null||key.equals("")?"0":key)) == null) {
			return "" ;
		}else{
			return memberMapper.selectEmployeeByPrimaryKey(Integer.parseInt(key)).getToken() ;
		}
	}

}
