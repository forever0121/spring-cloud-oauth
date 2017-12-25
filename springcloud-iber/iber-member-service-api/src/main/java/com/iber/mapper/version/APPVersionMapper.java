package com.iber.mapper.version;


import com.iber.vo.version.QueryAPPVersionVO;

import java.util.Map;

public interface APPVersionMapper {

    QueryAPPVersionVO queryAPPVersion(Map<String, Object> map);

}