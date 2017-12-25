package com.iber.util;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

public class FileUploadForm {

	public FileUploadForm() {
	}
	
	private String cid;
	private String memberId;
	private String method;
	private String param;
	private String phone;
	private String type;
	private String version;
	private String fileUse;
	private String fileFormat;
	private String fileName;
	private InputStream file;
	private InputStream idCardFile;
	private InputStream file1;
	private InputStream file2;
	private InputStream file3;
	private InputStream file4;
	
	public InputStream getFile1() {
		return file1;
	}
	
	@FormParam("file1")
	@PartType(MediaType.APPLICATION_OCTET_STREAM)
	public void setFile1(InputStream file1) {
		this.file1 = file1;
	}

	public String getCid() {
		return cid;
	}

	@FormParam("cId")
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getMemberId() {
		return memberId;
	}

	@FormParam("memberId")
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMethod() {
		return method;
	}

	@FormParam("method")
	public void setMethod(String method) {
		this.method = method;
	}

	public String getParam() {
		return param;
	}

	@FormParam("param")
	public void setParam(String param) {
		this.param = param;
	}

	public String getPhone() {
		return phone;
	}

	@FormParam("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	@FormParam("type")
	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	@FormParam("version")
	public void setVersion(String version) {
		this.version = version;
	}

	public InputStream getFile() {
		return file;
	}

	@FormParam("file")
	@PartType(MediaType.APPLICATION_OCTET_STREAM)
	public void setFile(InputStream file) {
		this.file = file;
	}
	
	public InputStream getIdCardFile() {
		return idCardFile;
	}

	@FormParam("idCardFile")
	@PartType(MediaType.APPLICATION_OCTET_STREAM)
	public void setIdCardFile(InputStream idCardFile) {
		this.idCardFile = idCardFile;
	}
	
	@FormParam("fileUse")
	public void setFileUse(String fileUse) {
		this.fileUse = fileUse;
	}
	
	public String getFileUse() {
		return fileUse;
	}
	
	@FormParam("fileFormat")
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	
	public String getFileFormat() {
		return fileFormat;
	}
	
	@FormParam("fileName")
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public InputStream getFile2() {
		return file2;
	}
	
	@FormParam("file2")
	@PartType(MediaType.APPLICATION_OCTET_STREAM)
	public void setFile2(InputStream file2) {
		this.file2 = file2;
	}

	public InputStream getFile3() {
		return file3;
	}
	
	@FormParam("file3")
	@PartType(MediaType.APPLICATION_OCTET_STREAM)
	public void setFile3(InputStream file3) {
		this.file3 = file3;
	}

	public InputStream getFile4() {
		return file4;
	}
	
	@FormParam("file4")
	@PartType(MediaType.APPLICATION_OCTET_STREAM)
	public void setFile4(InputStream file4) {
		this.file4 = file4;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("===========================");
		s.append("cid=").append(cid).append("\n");
		s.append("memberId=").append(memberId).append("\n");
		s.append("method=").append(method).append("\n");
		s.append("param=").append(param).append("\n");
		s.append("phone=").append(phone).append("\n");
		s.append("type=").append(type).append("\n");
		s.append("version=").append(version).append("\n");
		s.append("fileFormat=").append(fileFormat).append("\n");
		s.append("fileName=").append(fileName).append("\n");
		s.append("fileUse=").append(fileUse);
		s.append("===========================");
		return s.toString();
	}
}
