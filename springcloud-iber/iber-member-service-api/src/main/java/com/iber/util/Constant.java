package com.iber.util;

/**
 * Created by lf on 2017/2/24.
 * 项目基础常量
 */
public class Constant {

    // 创建时间
    public static final String CREATE_TIME = "createTime";
    /**
     * 推送给员工
     */
    public static final String EMPLOYEE = "2";
    /**
     * 推送给会员
     */
    public static final String MEMBER = "1";

    /**
     * 短信验证码失效时间
     */
    public final static String INVALIDTIME = "invalid_time";

    // 出问题了，请稍后重试vo
    public static final CommonVo FAIL_VO = new CommonVo(ResultCode.FAIL_CODE, ResultCode.FAIL_MSG, "");
    // 请求参数字段错误vo
    public static final CommonVo PARAM_FILED_VO = new CommonVo(ResultCode.PARAM_FILED_CODE, ResultCode.PARAM_FILED_MSG, "");
    // 请求参数字段错误vo
    public static final CommonVo PARAM_VO = new CommonVo(ResultCode.PARAM_CODE, ResultCode.PARAM_MSG, "");
    // 请求参数必填字段为空vo
    public static final CommonVo PARAM_REQUIRED_VO = new CommonVo(ResultCode.PARAM_REQUIRED_CODE, ResultCode.PARAM_REQUIRED_MSG, "");
    // token校验失败
    public static final CommonVo TOKEN_VO = new CommonVo(ResultCode.TOKEN_CODE, ResultCode.TOKEN_MSG, "");
    // token校验失败
    public static final CommonVo TO_LOGIN_VO = new CommonVo(ResultCode.TOKEN_CODE, ResultCode.TO_LOGIN_MSG, "");
    // 成功
    public static final CommonVo SUCCESS_VO = new CommonVo(ResultCode.SUCCESS_CODE, ResultCode.SUCCESS_MSG, "");
}
