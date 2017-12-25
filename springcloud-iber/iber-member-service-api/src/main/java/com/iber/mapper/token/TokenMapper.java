package com.iber.mapper.token;

import com.iber.model.token.Token;
import org.apache.ibatis.annotations.Param;

public interface TokenMapper {

	int insert(Token record);

    int insertSelective(Token record);
    
    int updateTokenByType(@Param("token") String token,
                          @Param("type") String type);
    
    Token getByType(@Param("type") String type);
}
