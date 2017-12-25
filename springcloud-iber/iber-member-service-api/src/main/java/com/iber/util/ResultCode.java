package com.iber.util;

public final class ResultCode {

	/**统一成功状态*/
	public static final String SUCCESS_CODE = "00";
	/**统一成功状态中文字符*/
	public static final String SUCCESS_MSG = "操作成功";
	
	/**请求参数错误状态*/
	public static final String PARAM_CODE = "01";
	/**请求参数错误中文字符*/
	public static final String PARAM_MSG = "请求参数错误";
	
	/**请求参数字段错误状态*/
	public static final String PARAM_FILED_CODE = "02";
	/**请求参数字段错误中文字符*/
	public static final String PARAM_FILED_MSG = "请求参数字段错误";
	
	/**请求参数必填字段为空状态*/
	public static final String PARAM_REQUIRED_CODE = "03";
	/**请求参数必填字段为空中文字符*/
	public static final String PARAM_REQUIRED_MSG = "请求参数必填字段为空";
	
	/**请求参数必填字段为空状态*/
	public static final String TOKEN_CODE = "04";
	/**请求参数必填字段为空中文字符*/
	public static final String TOKEN_MSG = "token error";
	/**请求参数必填字段为空中文字符*/
	public static final String TO_LOGIN_MSG = "请重新登陆！";

	/**统一失败状态*/
	public static final String FAIL_CODE = "99";

	/**统一附属订单未支付状态*/
	public static final String ATTACHED_UNPLY_CODE = "101";
	/**统一失败状态中文字符*/
	public static final String FAIL_MSG = "出问题了，请稍后重试";
	
	/**分时租赁约车失败状态*/
	public static final String FAIL_TIMESHARE_CODE = "300301" ;
	/**分时租赁约车失败信息*/
	public static final String FAIL_TIMESHARE_MSG = "已经被人预定，请重新选择" ;
	
	/**分时租赁约车失败状态*/
	public static final String FAIL_TIMESHARE_ORDER_CODE = "300302" ;
	/**分时租赁约车失败信息*/
	public static final String FAIL_TIMESHARE_ORDER_MSG = "生存订单失败" ;

	/**为兼容版本而作的提示，请升级（如新版充电桩程序已去掉预约功能，而未升级APP的用户点预约时提示他请升级）*/
	public static final String UPGRADE_CODE = "300303";
	public static final String UPGRADE_MSG = "请将APP升级至最新版本";

	
	/**************会员******************** */
	public static final String MEMBER_NOT_EXISTS_CODE = "1000";
	public static final String MEMBER_NOT_EXISTS_MSG = "会员不存在";
	/**根据手机号码和登陆密码进行登陆操作是，输入的手机号码不存在*/
	public static final String MEMBER_LOGIN_PHONE_CODE = "100301";
	/**根据手机号码和登陆密码进行登陆操作是，输入的手机号码不存在*/
	public static final String MEMBER_LOGIN_PHONE_MSG = "您输入手机号码有误，请重新输入";
	/**根据手机号码和登陆密码进行登陆操作是，输入的密码有误*/
	public static final String MEMBER_LOGIN_PASSWORD_CODE = "100302";
	/**根据手机号码和登陆密码进行登陆操作是，输入的密码有误*/
	public static final String MEMBER_LOGIN_PASSWORD_MSG = "您输入密码有误，请重新输入";
	/**根据手机号码和登陆密码进行登陆操作是，员工已被冻结*/
	public static final String MEMBER_LOGIN_FREEZE_CODE = "100303";
	/**根据手机号码和登陆密码进行登陆操作是，员工已被冻结*/
	public static final String MEMBER_LOGIN_FREEZE_MSG = "您的账号已被冻结";
	/**根据手机号码和登陆密码进行登陆操作是，输入的旧密码有误*/
	public static final String MEMBER_MODIFY_OLD_PASSWORD_ERROR_CODE = "100401";
	/**根据手机号码和登陆密码进行登陆操作是，输入的旧密码有误*/
	public static final String MEMBER_MODIFY_OLD_PASSWORD_ERROR_MSG = "您输入旧密码有误，请重新输入";
	public static final String MEMBER_PHONE_EXISTS_CODE = "100201";
	public static final String MEMBER_PHONE_EXISTS_MSG = "您输入的手机号码已存在，请重新输入";
	public static final String MEMBER_PHONE_FORMAT_ERROR_CODE = "100202";
	public static final String MEMBER_PHONE_FORMAT_ERROR_MSG = "您输入的手机号码格式有误，请重新输入";
	
	/**************优惠券******************** */
	public static final String COUPON_NOT_EXISTS_CODE = "6100";
	public static final String COUPON_NOT_EXISTS_MSG = "优惠券不存在";
	
	public static final String COUPON_EMPLOYMENT_CODE= "6101";
	public static final String COUPON_EMPLOYMENT_MSG = "优惠券已经领用";
	
	public static final String COUPON_FAILURE_CODE= "6102";
	public static final String COUPON_FAILURE_MSG = "优惠券已失效";
	
	public static final String ACTIVITY_FAILURE_CODE= "6103";
	public static final String ACTIVITY_FAILURE_MSG = "活动已失效";
	
	public static final String PILE_TOAST_CODE= "7101";
	public static final String PILE_TOAST_MSG = "提示信息";
	public static final String PILE_NORETURN_CODE= "7102";
	public static final String PILE_NORETURN_MSG = "无信息返回";
	public static final String PILE_AUTHENTICATION_CODE= "7103";
	public static final String PILE_AUTHENTICATION_MSG = "获取接口认证失败";
	
	public static final String CAR_ISEXIST_CODE= "900501";
	public static final String CAR_ISEXIST_MSG = "车牌不存在";
	public static final String CAR_CID_LPN_TRUE_CODE= "900601";
	public static final String CAR_CID_LPN_TRUE_MSG = "CID和车牌是绑定关系";
	public static final String CAR_CID_LPN_FALSE_CODE= "900602";
	public static final String CAR_CID_LPN_FALSE_MSG = "CID和车牌不是绑定关系";
	
	public static final String DAY_RENT_ORDER_CODE = "1500501";
	
	public static final String FAIL_BLUETOOTH_CODE = "9000"; //需要连接蓝牙
	
	/**************员工端******************** */
	/**员工约车失败状态*/
	public static final String FAIL_EMPLOYEE_ORDER_CODE = "190001" ;
	/**员工约车失败信息*/
	public static final String FAIL_EMPLOYEE_ORDER_MSG = "员工约车失败" ;
	/**员工任务创建状态*/
	public static final String EMPLOYEE_ORDER_CREATE_STATUS = "1" ;
	/**员工任务执行状态*/
	public static final String EMPLOYEE_ORDER_EXCUTE_STATUS = "2" ;
	/**员工任务完成状态*/
	public static final String EMPLOYEE_ORDER_END_STATUS = "3" ;
	
	/**是员工端订单*/
	public static final String EMPLOYEE_IS_EMPLOYEE_ORDERED = "1" ;
	
	/**************易事特充电桩******************** */
	/** 易事特接口业务调用失败 */
	public static final String EAST_FAIL_STATUS = "20001";
	
	/***********************交大洋电机新能源*******************************/
	public static final String BROAD_OCEAN_FIAL_STATUS = "21001";
	/*验证码错误提示*/
    public static final String CAPTCHA_ERROR = "验证码错误";
	public static final String CAPTCHA_INVALID = "验证码已失效";
	/**
	 * 发送短信请求token错误
	 */
    public static final String SMS_TOKEN_ERROR = "send token error";
}
