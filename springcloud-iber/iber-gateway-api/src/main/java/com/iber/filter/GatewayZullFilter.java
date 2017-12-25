package com.iber.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 刘晓杰 on 2017/12/16.
 */
@Component
public class GatewayZullFilter extends ZuulFilter {

    private static Set<String> notTokenData = new HashSet<>();

    static {
        //不参与token
        notTokenData.add("getCaptcha"); //获取验证码
        notTokenData.add("uploadTelematics");
        notTokenData.add("getLowBatteryTipStrategy");
        notTokenData.add("carUploadCatchedPhoto");
        notTokenData.add("submitLpn");
        notTokenData.add("getCidLpnState");
        notTokenData.add("quickRegister");
        notTokenData.add("memberLogin");
        notTokenData.add("verificationCode");
        notTokenData.add("checkSms");
        notTokenData.add("restMemberPassword");
        notTokenData.add("h5Login");
        notTokenData.add("oauth2Login");
        notTokenData.add("queryOauth2Id");
        notTokenData.add("selectAdInfo");
        notTokenData.add("queryParkList");
        notTokenData.add("querySystemParam");
        notTokenData.add("queryCarList");
        notTokenData.add("queryCarInfoAndParkInfoByLpn");
        notTokenData.add("queryCarEvaluateList");
        notTokenData.add("shareContent");
        notTokenData.add("queryPMsgLog");
        notTokenData.add("queryAPPVersion");
        notTokenData.add("queryCarModelList");
        notTokenData.add("memberRegisterValidate");
        notTokenData.add("queryCityList");
        notTokenData.add("queryDayRentParkInfo");
        notTokenData.add("queryCarModelList");
        notTokenData.add("queryStartPage");
        notTokenData.add("queryUserGuide");
        notTokenData.add("queryHotSearch");
        notTokenData.add("saveHotSearch");
        notTokenData.add("getIosAppLatestVersion");//获取IOS APP 最新版本信息
        notTokenData.add("getStationList");//根据cityCode获取充电站列表
        notTokenData.add("getEquipmentListByStationId");//根据充电站获取设备列表
        notTokenData.add("carUploadCatchedPhoto");//根据充电站获取设备列表
        notTokenData.add("carUploadMemberFingerprintAtt");//车载上传指纹


        /**************   给管理平台通过HTTP调用的控制充电桩的方法   ******************/
        notTokenData.add("sendOrderPileCtrl");//下发预约桩命令
        notTokenData.add("sendOneLockCtrl");//下发控制地锁
        notTokenData.add("startOrStopCharging");//启停充电接口
        notTokenData.add("employeeRequestLogin");//员工端登陆
        //根据车牌查询正在充电的直流桩数据
        notTokenData.add("queryChargingEquipmentByLpn");
        //查询附近车
        notTokenData.add("queryNearByCarList");
        //用户动态
        notTokenData.add("queryUseDynamic");
        //根据手机号码登录或者注册
        notTokenData.add("loginOrRegister");
    }

    /**
     * per：路由之前
     * routing：路由时
     * post：路由后
     * error：错误时调用
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器顺序，类似@Filter中的order
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * @return
     */
    @Override
    public Object run() {
        /*RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getHeader("token");
        String method = request.getHeader("method");
        if(token == null && !notTokenData.contains(method)) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(404);
            ctx.setResponseBody("token cannot be empty");
        }*/
        return null;
    }
}
