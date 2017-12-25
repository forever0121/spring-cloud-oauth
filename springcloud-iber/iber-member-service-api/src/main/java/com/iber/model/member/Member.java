package com.iber.model.member;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable{
    private Integer id;

    private String name;

    private String sex;

    private String password;

    private String phone;

    private String email;

    private String idcard;

    private String driverIdcard;

    private String status;

    private String headPhotoUrl;

    private String driverIdcardPhotoUrl;

    private String idcardPhotoUrl;

    private String fingerPrint;

    private String registerIp;

    private String registerCategory;

    private String accoutStatus;

    private String cityCode;

    private Integer enterpriseId;

    private String memberLevel;

    private String enterpriseCheckStatus;

    private String isDrive;
    
    private Date createTime;
    
    private String remark;
    
    private String token ;
    
    private Date queryMsgTime ;
    
    private Date driverIdcardValidityTime ;
    
    private Integer driverIdcardUpdate ;

    private Integer latestContributedVal;//上月累计贡献值
    
    private Integer levelCode;//会员等级code
    
    private Date driverIdCardTime;//初次领证日期

    private Integer isUseBirthDayCoupon;

    private String cid; // 会员设备id
    
    private Date lastUseCarTime;

    private Date uploadTime;

    public Date getLastUseCarTime() {
		return lastUseCarTime;
	}

	public void setLastUseCarTime(Date lastUseCarTime) {
		this.lastUseCarTime = lastUseCarTime;
	}

	public Integer getIsUseBirthDayCoupon() {
        return isUseBirthDayCoupon;
    }

    public void setIsUseBirthDayCoupon(Integer isUseBirthDayCoupon) {
        this.isUseBirthDayCoupon = isUseBirthDayCoupon;
    }

    public Integer getLatestContributedVal() {
        return latestContributedVal;
    }

    public void setLatestContributedVal(Integer latestContributedVal) {
        this.latestContributedVal = latestContributedVal;
    }

    public Integer getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(Integer levelCode) {
		this.levelCode = levelCode;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getDriverIdcard() {
        return driverIdcard;
    }

    public void setDriverIdcard(String driverIdcard) {
        this.driverIdcard = driverIdcard == null ? null : driverIdcard.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHeadPhotoUrl() {
        return headPhotoUrl;
    }

    public void setHeadPhotoUrl(String headPhotoUrl) {
        this.headPhotoUrl = headPhotoUrl == null ? null : headPhotoUrl.trim();
    }

    public String getDriverIdcardPhotoUrl() {
        return driverIdcardPhotoUrl;
    }

    public void setDriverIdcardPhotoUrl(String driverIdcardPhotoUrl) {
        this.driverIdcardPhotoUrl = driverIdcardPhotoUrl == null ? null : driverIdcardPhotoUrl.trim();
    }

    public String getIdcardPhotoUrl() {
        return idcardPhotoUrl;
    }

    public void setIdcardPhotoUrl(String idcardPhotoUrl) {
        this.idcardPhotoUrl = idcardPhotoUrl == null ? null : idcardPhotoUrl.trim();
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint == null ? null : fingerPrint.trim();
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public String getRegisterCategory() {
        return registerCategory;
    }

    public void setRegisterCategory(String registerCategory) {
        this.registerCategory = registerCategory == null ? null : registerCategory.trim();
    }

    public String getAccoutStatus() {
        return accoutStatus;
    }

    public void setAccoutStatus(String accoutStatus) {
        this.accoutStatus = accoutStatus == null ? null : accoutStatus.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel == null ? null : memberLevel.trim();
    }

    public String getEnterpriseCheckStatus() {
        return enterpriseCheckStatus;
    }

    public void setEnterpriseCheckStatus(String enterpriseCheckStatus) {
        this.enterpriseCheckStatus = enterpriseCheckStatus == null ? null : enterpriseCheckStatus.trim();
    }

    public String getIsDrive() {
        return isDrive;
    }

    public void setIsDrive(String isDrive) {
        this.isDrive = isDrive == null ? null : isDrive.trim();
    }
    
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
    public Date getCreateTime() {
		return createTime;
	}
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getQueryMsgTime() {
		return queryMsgTime;
	}

	public void setQueryMsgTime(Date queryMsgTime) {
		this.queryMsgTime = queryMsgTime;
	}

	public Date getDriverIdcardValidityTime() {
		return driverIdcardValidityTime;
	}

	public void setDriverIdcardValidityTime(Date driverIdcardValidityTime) {
		this.driverIdcardValidityTime = driverIdcardValidityTime;
	}

	public Integer getDriverIdcardUpdate() {
		return driverIdcardUpdate;
	}

	public void setDriverIdcardUpdate(Integer driverIdcardUpdate) {
		this.driverIdcardUpdate = driverIdcardUpdate;
	}

	public Date getDriverIdCardTime() {
		return driverIdCardTime;
	}

	public void setDriverIdCardTime(Date driverIdCardTime) {
		this.driverIdCardTime = driverIdCardTime;
	}

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}