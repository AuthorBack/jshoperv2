package com.jshop.entity;

// Generated 2012-9-8 14:04:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * FunctionM generated by hbm2java
 */
public class FunctionM implements java.io.Serializable {

	private String id;
	private String visiturl;
	private String visitmethodname;
	private String functionname;
	private Date createtime;
	private String moduleid;

	public FunctionM() {
	}

	public FunctionM(String id, String visiturl, String visitmethodname,
			String functionname, Date createtime, String moduleid) {
		this.id = id;
		this.visiturl = visiturl;
		this.visitmethodname = visitmethodname;
		this.functionname = functionname;
		this.createtime = createtime;
		this.moduleid = moduleid;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVisiturl() {
		return this.visiturl;
	}

	public void setVisiturl(String visiturl) {
		this.visiturl = visiturl;
	}

	public String getVisitmethodname() {
		return this.visitmethodname;
	}

	public void setVisitmethodname(String visitmethodname) {
		this.visitmethodname = visitmethodname;
	}

	public String getFunctionname() {
		return this.functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(String moduleid) {
		this.moduleid = moduleid;
	}

}
