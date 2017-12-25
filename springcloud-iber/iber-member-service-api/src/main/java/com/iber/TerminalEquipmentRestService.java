package com.iber;

import com.iber.util.ParamVo;

import javax.servlet.http.HttpServletRequest;

public interface TerminalEquipmentRestService {

	/**普通JSON字符串*/
	public String exectue(ParamVo paramVo, HttpServletRequest request);

}
