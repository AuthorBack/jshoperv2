package com.jshop.entity;

// Generated 2012-6-4 11:26:05 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GoodsBelinkedT generated by hbm2java
 */
public class GoodsBelinkedT implements java.io.Serializable {

	private String belinkedid;
	private int version;
	private String maingoodsid;
	private String belinkedgoodsid;
	private String mode;
	private String state;
	private String creatorid;
	private Date createtime;
	private Date updatetime;
	private String sxlinkedgoodsid;

	public GoodsBelinkedT() {
	}

	public GoodsBelinkedT(String belinkedid, String maingoodsid,
			String belinkedgoodsid, String mode, String state,
			String creatorid, Date createtime, Date updatetime,
			String sxlinkedgoodsid) {
		this.belinkedid = belinkedid;
		this.maingoodsid = maingoodsid;
		this.belinkedgoodsid = belinkedgoodsid;
		this.mode = mode;
		this.state = state;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.sxlinkedgoodsid = sxlinkedgoodsid;
	}

	public String getBelinkedid() {
		return this.belinkedid;
	}

	public void setBelinkedid(String belinkedid) {
		this.belinkedid = belinkedid;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getMaingoodsid() {
		return this.maingoodsid;
	}

	public void setMaingoodsid(String maingoodsid) {
		this.maingoodsid = maingoodsid;
	}

	public String getBelinkedgoodsid() {
		return this.belinkedgoodsid;
	}

	public void setBelinkedgoodsid(String belinkedgoodsid) {
		this.belinkedgoodsid = belinkedgoodsid;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getSxlinkedgoodsid() {
		return this.sxlinkedgoodsid;
	}

	public void setSxlinkedgoodsid(String sxlinkedgoodsid) {
		this.sxlinkedgoodsid = sxlinkedgoodsid;
	}

}