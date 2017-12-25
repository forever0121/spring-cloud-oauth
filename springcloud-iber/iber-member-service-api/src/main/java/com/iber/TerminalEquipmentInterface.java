package com.iber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IOS，Android终端设备调用方法名称
 * @author Administrator
 *
 */
public final class TerminalEquipmentInterface {
	

	private static Map<String, Integer> data = new HashMap<String, Integer>();
	private static List<String> notTokenData = new ArrayList<String>();
	
	static{
		//添加方法名
		/*
		 * 1001, 1002   以1开头为会员
		 * 
		 * 2001, 20002   以2开头为企业
		 * 
		 * 3001, 30002   以3开头为分时租赁
		 * 
		 * 4001, 40002   以4开头为订单
		 * 
		 * 5001, 5002   以5开头为评价
		 * 
		 * 6001, 6002   以6开头优惠券
		 * 
		 * 7001, 7002   以7开头充电桩
		 * 
		 * 8001, 8002   以8开头为其他功能，如查看版本
		 */
		
		//按照这个格式写，其中KEY为前端终端设备提供的调用的方法名，VALUE为int类型值，规则按照上面要求命名
		
		//会员相关接口
		data.put("memberQueryInfo", 1001);
		data.put("quickRegister", 1002);
		data.put("memberLogin", 1003);
		data.put("modifyMemberPassword", 1004);
		data.put("doneMemberInfo", 1005);
		data.put("verificationCode", 1006);
		data.put("restMemberPassword", 1007);
		data.put("preloadCharge", 1008);
		data.put("getCaptcha", 1009);
		//data.put("chargeResult", 1009);
		data.put("queryAllCity", 1010);
		data.put("rebirth", 1011);
		data.put("tmpCharge", 1012);
		data.put("refundRequest", 1013);
		data.put("h5Login", 1014);
		data.put("oauth2Login", 1015);
		data.put("queryOauth2Id", 1016);
		data.put("oauth2DeleteBinding", 1017);
		data.put("queryMonenLog", 1018);
		data.put("shareContent", 1019);
		data.put("oauth2IsBinding", 1020);
		data.put("oauth2Binding", 1021);
		data.put("systemMsgLog", 1022);
		data.put("queryPMsgLog", 1023);
		data.put("uploadHeadPhoto", 1024);
		data.put("zhimaxyAuth", 1025);
		data.put("zhimaxyScoreQuery", 1026);
		data.put("acpPreAuth", 1027);
		data.put("querySystemParam", 1028);
		data.put("uploadMemberQueryMsgTime", 1029);
		data.put("uploadMemberphotos", 1030);
		
		data.put("queryMemberLinkman", 1031);
		data.put("addMemberLinkman", 1032);
		data.put("updateMemberLinkman", 1033);
		data.put("deleteMemberLinkman", 1034);
		data.put("cancelRefundRequest", 1035);
		data.put("bindCouponAfterSharing", 1036);//分享送优惠券
		data.put("queryMemberLevel", 1037);//会员等级查询
		data.put("insertMemberContributedDetail", 1038);//会员贡献值增减
		data.put("ymlMemberQueryInfo", 1039);//会员信息查询-友门鹿
		data.put("queryContributedDetail", 1041);//查询会员贡献值明细
		data.put("insertMemberContributedDetailByBehavior", 1040);//根据会员行为,保存贡献值明细,并增减memberCard贡献值
		data.put("queryDenominationAndBalance", 1042);//查询充值面额以及对应的优惠
		data.put("memberRegisterValidate", 1043);
		data.put("getParkNoList", 1044);
		data.put("memberRequestQueryLpn", 1045);
		data.put("insertMemberContributedDetailByBehavior2", 1046);//根据会员行为,保存贡献值明细,并增减memberCard贡献值.带createTime
		data.put("queryMemberChargingList", 1047);//查询会员未退款的充值记录
		data.put("queryHistoryCardMessage", 1048);
		data.put("memberReturnCarByTemplatePark", 1049);//超长订单时会员通过临时网点还车
		data.put("queryStartPage",1050);//启动页面
		data.put("queryUserGuide",1051);
		data.put("zhimaDataFeedbackByPlatform", 1052);
		data.put("forceReturnCar", 1053);
		data.put("checkSms", 1054);
		data.put("loginOrRegister", 1055); //根据验证码登录注册
		data.put("getInvoiceExplain",1056);//获取开票说明
		data.put("getInvoiceHistory",1057);//获取开票历史
		data.put("uploadMemberOperation",1058);//会员上传操作信息
		data.put("sumbitInvoiceApplication",1059);//会员提交开具发票申请
		data.put("prePayInvoicePostage",1060);//邮费预支付接口
		data.put("getAvailableInvoiceList",1061);//获取会员可开发票的订单
		data.put("getInvoiceDetail",1062);//获取开票详情
		data.put("cancelInvoice",1063);//取消开发票
		data.put("checkCarBeforeSelfCkeck",1064);//还车前检查能否还车
		data.put("echoAddress",1065);//回显收件地址
		//企业
		data.put("selectEnterpriseInfo", 2001);
		data.put("selectStayCheckOrder", 2002);
		data.put("checkEnterpriseOrder", 2003);
		data.put("selectCheckedEnterpriseOrder", 2004);
		data.put("selectStayCheckEnterpriseMember", 2005);
		data.put("checkEnterpriseMember", 2006);
		data.put("selectEnterpriseMemberList", 2007);
		data.put("addEnterpriseMember", 2008);
		data.put("updateEnterpriseMember", 2009);
		data.put("selectEnterpriseMoneyDetail", 2010);
		
		//分时租赁
		data.put("queryTimeShareUsableCar", 3001);
		data.put("queryCarInfoAndParkInfoByLpn", 3002);
		data.put("memberGenerateOrder", 3003);
		data.put("memberCancelOrder", 3004);
		data.put("memberGetCarSuccess", 3005);
		data.put("memberParkReturnCarList", 3006);
		data.put("memberChooseParkReturnCar", 3007);
		data.put("memberCancelParkReturnCar", 3008);
		data.put("memberParkReturnCar", 3009);
		data.put("carQueryOrder", 3010);
		data.put("carQueryChargeTactics", 3011);
		data.put("carUploadLog", 3012);
		data.put("carUploadMemberFingerprint", 3013);
		data.put("carUploadCarRunInfo", 3014);
		data.put("memberCancelOrderQuartz", 3015);
		data.put("carUploadMemberFingerprintAtt", 3016);
		data.put("carUploadcheckCarStatus", 3017);
		data.put("queryTimeShareOrder", 3018);
		data.put("reportCarStateChanged", 3019);
		
		
		data.put("getCarRunFenceDatas", 3020) ;
		data.put("getServiceDatasByArea", 3021) ;
		
		data.put("preloadPayTimeShareOrder", 3022) ;
		data.put("payTimeShareOrder", 3023) ;
		data.put("queryParkList", 3024) ;
		data.put("sendWarnMessageQuratz", 3025) ;
		data.put("queryCarList", 3026) ;
		data.put("queryEnterpriseParkList", 3027) ;
		data.put("queryNearByCarList", 3028);
		data.put("queryUseDynamic", 3029);
		
		//订单
		data.put("memberRequestOrderFlows", 4001);
		data.put("memberRequestTimeShare", 4002);
		data.put("requestHistoryCarOrder", 4003);
		//附属订单
		data.put("requestAttachedOrder",4004);
		data.put("requestAttachedOrderDetail",4005);
		data.put("preloadPayAttachedOrder",4006);
		data.put("payAttachedOrderCallBack",4007);
		data.put("returnZhiMa",4008);


		//评价
		data.put("memberRequestEvaluateLable", 5001);
		data.put("memberSubmitEvaluate", 5002);
		data.put("queryEvaluate", 5003);
		data.put("evaluateContent", 5004);
		data.put("queryCarEvaluateList", 5005);
		
		//优惠券
		data.put("bindEnterpriseCoupon", 6001);
		data.put("memberBindingCoupon", 6002);
		data.put("queryEnterpriseCoupon", 6003);
		data.put("queryMemberBindingCoupon", 6004);
		
		//充电桩
		data.put("queryPile", 7001);
		data.put("selectStationList", 7002);
		data.put("selectPileList", 7003);
		data.put("scanCode", 7004);
		data.put("startChargingOrder", 7005);
		data.put("selectChargingInfo", 7006);
		data.put("finishChargingOrder", 7007);
		data.put("selectChargingOrder", 7008);
		data.put("selectCharging", 7009);
		
		//其他功能，如查看版本
		data.put("queryAPPVersion", 8001);
		data.put("versionsUpgradeLog", 8002);
		data.put("saveExceptionLog", 8003);
		data.put("getIosAppLatestVersion", 8004);//获取IOS APP 最新版本信息
		
		//车载
		data.put("uploadTelematics", 9001);
		data.put("trumpetlashingLight", 9002);
		data.put("getLowBatteryTipStrategy", 9003);
		data.put("carUploadCatchedPhoto", 9004);
		data.put("submitLpn", 9005);
		data.put("getCidLpnState", 9006);
		
		data.put("openCarDoor", 9007);
		data.put("closeCarDoor", 9008);
		data.put("startCarEngine", 9009);
		data.put("carFireOff", 9010);
		
		//预警信息
		data.put("saveCancelOrderSysWarnInfo", 10001);
		data.put("saveLongTimeCarNotUploadGpsSysWarnInfo", 10002);
		data.put("saveLongTimeNotReturnCarSysWarnInfo", 10003);
		data.put("saveParkLittleCarSysWarnInfo", 10004);
		data.put("reportCarTouchFenceTrigger", 10005);
		
		//广告信息
		data.put("selectAdInfo", 11001);

		//日租
		data.put("queryCityList", 15001);
		data.put("queryDayRentParkInfo", 15002);
		data.put("queryCarModelList", 15003);
		data.put("queryDayRentMoneyDetail", 15004);
		data.put("requestCreateDayRentOrder", 15005);
		data.put("requestCancelDayRentOrder", 15006);
		data.put("requestDayRentOrderPay", 15007);
		data.put("requestDayRentOpenCar", 15008);
		data.put("requestDayRentDelayPay", 15009);
		data.put("requestDayRentReturnCar", 15010);
		data.put("requestDayRentReturnCarPay", 15011);
		data.put("carQueryDayOrder", 15012);
		data.put("payDayRentOrderCallBack", 15013);
		data.put("queryDayRentOrderInfo", 15014);
		data.put("queryOrderList", 15015);
		data.put("requestCancelDayRentOrderQuartz", 15016);
		data.put("aliRefund", 15017);
		data.put("wxRefund", 15018);
		
		//充电桩
		data.put("queryChargingParkList", 16001);
		data.put("queryCarBrandByChargingPark", 16002);
		data.put("requestCreateChargingOrder", 16003);
		data.put("queryCharingOrderByOrder", 16004);
		data.put("requestEndCharging", 16005);
		data.put("requestPayChargingOrder", 16006);
		data.put("payChargingOrderCallBack", 16007);
		data.put("queryChargingOrderList", 16008);
		 
		//互联互通充电业务
		data.put("generateChargeOrder", 17001);
		data.put("getEquipmentListByStationId", 17002);
		data.put("getStationList", 17003);
		data.put("queryConnectorStatusByOrder", 17004);
		data.put("requestEndCharging", 17005);
		data.put("payChargingOrder", 17006);
		data.put("payChargingOrderCallBack", 17007);
		data.put("queryChargingOrderList", 17008);
		data.put("updateLockStatus", 17009);
		data.put("getConnectorInfoListByEquipmentCode", 17010);
		data.put("getChargingByMemberId", 17011);
		data.put("getChargingByChargeSeq", 17012);
		data.put("getOrderAndEvaluateDetailById", 17013);//充电订单与评价详情
		data.put("uploadCarPicture", 17014);
		data.put("queryChargingCarList", 17015);
		data.put("generateOrdChargeOrder", 17016);//生成预约充电订单
		data.put("cancelOrdChargeOrder", 17017);// 取消预约充电订单
		
		data.put("chargingUpLock", 17018);//充电桩上锁
		data.put("chargingDownLock", 17019);//充电桩下锁
		data.put("chargingOrderCancelQuartz", 17020);//车位预约后，10分钟没有开启充电，自动取消，且要把地锁降下

		/**************   给管理平台通过HTTP调用的控制充电桩的方法   ******************/
		data.put("sendOrderPileCtrl", 17021);//下发预约桩命令
		data.put("sendOneLockCtrl", 17022);//下发控制地锁
		data.put("startOrStopCharging", 17023);//启停充电接口
		
		data.put("chargingAfterReturnCar", 17024);//还车后扫码充电，赠送优惠券
		data.put("queryChargingEquipmentByLpn", 17025);//根据车牌查询正在充电的直流桩数据
		data.put("stopChargingExceptIberCarQuartz", 17026);//根据车牌查询正在充电的直流桩数据
		//会员预约车位，只停车，不充电，平台对地锁状态进行预警，让客服提醒会员或者现场工作人员提醒移车位
		data.put("saveOccupyParkWithoutChargingSysWarnInfo", 17027);
		//下发远程升级命令
		data.put("sendRemoteUpgradePileSoftware", 17028);
		//下发计费策略
		data.put("sendPilePrice", 17029);
		//
		data.put("startChargingAfterCancelTSOrder", 17030);
		
		
		
		//热搜网点
		data.put("saveHotSearch", 18001);//热门搜索内容保存
		data.put("queryHotSearch", 18002);//查询热门搜索内容
		data.put("queryBehaviourType", 18003);//查询会员行为
		data.put("memberReport", 18004);//会员举报
		data.put("memberNeatLevelAccess", 18006);//会员整洁度评价
		
		//员工端
		data.put("employeeRequestLogin", 19001);//登陆
		data.put("employeeRequestIsWork",19002);//员工上下班
		data.put("employeeRequestUpdatePwd",19003);//修改密码
		data.put("employeeAddressReported", 19004);//员工位置时时上报
		data.put("employeeRequestTaskNum", 19005);//查询任务数
		data.put("employeeRequestTaskTypeList", 19006);//查询任务列表
		data.put("employeeRequestEmployeeList", 19007);//查询人员信息
		data.put("employeeRequestTaskLevelList", 19008);//查询任务等级
		data.put("employeeRequestTaskType", 19009);//查询任务类型
		data.put("employeeRequestParkList", 19010);//查询网点列表
		data.put("employeeRequestExecuteTask", 19011);//执行任务
		data.put("employeeRequestDoneTask", 19012);//完成任务
		data.put("employeeRequestQueryCarList", 19013);//根据网点获取车辆信息
		data.put("employeeRequestOrderCar", 19014);//车辆预约
		data.put("employeeRequestCancelOrder", 19015);//取消用车
		data.put("employeeRequestReturnCar", 19016);//还车
		data.put("server_push_employee_task", 19017);//推送任务
		data.put("employeeRequestAppUpdate", 19018);//检查更新
		data.put("employeeRequestResurgence", 19019);//员工端满状态复活接口
		data.put("employeeRequestOpenCarDoor", 19020);//打开车门
		data.put("employeeRequestCloseCarDoor", 19021);//关闭车门
		data.put("employeeRequestStartCarEngine", 19022);//启动车辆
		data.put("employeeRequestCarFireOff", 19023);//熄火车辆
		data.put("employeeRequestFindCar", 19024);//找车
		data.put("employeeRequestCreateTask", 19025);//创建任务
		data.put("employeeRequestPeopleInfo", 19026);//查看人员信息
		data.put("employeeRequestParkCarInfo", 19027);//查看网点车辆信息
		data.put("employeeCarUploadMemberFingerprintAtt", 19028);//上传员工指纹信息
		data.put("employeeRequestUploadPhoto", 19029);//上传头像
		data.put("carQueryEmployeeOrder", 19030);//查询员工用车订单信息
		data.put("employeeRequestChargingConnectorInfo", 19031);//根据网点获取充电桩信息
		data.put("employeeRequestStartCharging", 19032);//开始充电
		data.put("employeeRequestEndCharging", 19033);//结束充电
		data.put("employeeRequestUpLock", 19034);//升起地锁
		data.put("employeeRequestDownLock", 19035);//降下地锁
		data.put("employeeRequestShiftManager", 19036);//转移管理员
		data.put("employeeRequestQueryLpn", 19037);//模糊查询车牌
		data.put("employeeRequestResponsibilityType", 19038);//获取结束救援责任类型
		data.put("employeeRequestEndRescue", 19039);//结束救援
		data.put("employeeRequestBehaviourType", 19040);//获取举报分类
		data.put("employeeRequestReportMember", 19041);//员工举报
		data.put("employeeRequestGetCityArea", 19042);//获取区域编码
		data.put("employeeRequestReportPark", 19043);//获取举报的网点和车位号
		data.put("employeeGetCarSuccess", 19044);//员工上车成功通知客服
		data.put("employeeGetCarDetail", 19045);//员工查看车辆位置
		data.put("employeeGetCarStatusDetail", 19046);//员工查看车辆状态查询条件
		data.put("employeeForceReturnCar", 19047);//员工端强制还车
		data.put("employeeGetInsuranceFileAndDriverFile", 19048);//员工端获取行驶证和保险单
		data.put("employeeRequestModifyCarStatus", 19049); // 员工提请车辆下线状态变更
		data.put("employeeQueryCarStatusModifyRecords", 19050); // 员工查看车辆下线状态变更记录
		//接收来自易事特平台的账单
		data.put("receiveChargeBill", 20001);
		data.put("queryChargePointList", 20002);
		data.put("queryPointDetails", 20003);
		data.put("downGroundLock", 20006);
		
		//大洋机电
		data.put("carsNotify", 21001);
		data.put("orderNotify", 21002);
		data.put("carsRealNotify", 21003);
		
		data.put("verifyCarOfflineApplication", 9011);  // 审核车辆下线申请

		//短信接口
		data.put("dataHandle",22001);
		
		//上下车自检
		data.put("queryCarSelfCheckItem", 23001);//查询自检项目
		data.put("carSelfCheck", 23002);//保存用户自检
		data.put("employeeCheckCarBeforeSelfCkeck",23003);//自检前检查能否还车
	}
	
	public static Integer getValue(String key){
		if(data.containsKey(key)){
			return data.get(key);
		}
		return -1;
	}
	
	public static List<String> getNotTokenData() {
		return notTokenData;
	}
}
