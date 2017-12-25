package com.iber.service.token;

public interface IToken {

    boolean add(String key, String value);  
      
    void delete(String key);  
      
    String get(String key);  
    
    String getEmployee(String key);
}
