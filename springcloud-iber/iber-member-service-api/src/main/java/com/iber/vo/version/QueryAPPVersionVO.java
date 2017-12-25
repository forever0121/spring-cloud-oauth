package com.iber.vo.version;

import java.io.Serializable;

public class QueryAPPVersionVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Integer id;

    private String appDesc; //app描述

    private String appName;//app名称

    private Integer currentRecord;//当前记录数

    private String versionNo;//版本编号

    private String publishDate ;//发行时间

	private String downloadUrl;//下载URL

    private String isForceUpdate;//是否强制升级 0不强制，1强制

    private String appCategory;//app类别   member  会员   car  车载      shop 商户   driver 司机

    private Double appSize ;
    
    public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc == null ? null : appDesc.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public Integer getCurrentRecord() {
        return currentRecord;
    }

    public void setCurrentRecord(Integer currentRecord) {
        this.currentRecord = currentRecord;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

//    public Date getPublishDate() {
//        return publishDate;
//    }
//
//    public void setPublishDate(Date publishDate) {
//        this.publishDate = publishDate;
//    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public String getIsForceUpdate() {
        return isForceUpdate;
    }

    public void setIsForceUpdate(String isForceUpdate) {
        this.isForceUpdate = isForceUpdate == null ? null : isForceUpdate.trim();
    }

    public String getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(String appCategory) {
        this.appCategory = appCategory == null ? null : appCategory.trim();
    }

	public Double getAppSize() {
		return appSize;
	}

	public void setAppSize(Double appSize) {
		this.appSize = appSize;
	}

}
