package com.iber.service.version;

import com.iber.util.CommonVo;
import com.iber.util.ParamVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("member-service")
public interface APPVersionService {

	/**
	 * 查询版本代数
	 * @return
	 */
	//@PreAuthorize("#oauth2.hasScope('server')")
	@RequestMapping(value = "/queryAPPVersion",method = RequestMethod.GET)
	public CommonVo queryAPPVersion(ParamVo vo);

}
