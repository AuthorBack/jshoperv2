package com.jshop.entity;

// Generated 2012-9-13 10:50:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * QuestionnaireT generated by hbm2java
 */
public class QuestionnaireT implements java.io.Serializable {

	private String qid;
	private String question;
	private String choosetag;
	private String answer;
	private String inputtype;
	private String state;
	private int statistics;
	private String goodsid;
	private Date createtime;
	private String creatorid;
	private int versiont;
	private String title;

	public QuestionnaireT() {
	}

	public QuestionnaireT(String qid, String question, String choosetag,
			String answer, String inputtype, String state, int statistics,
			String goodsid, Date createtime, String creatorid, int versiont,
			String title) {
		this.qid = qid;
		this.question = question;
		this.choosetag = choosetag;
		this.answer = answer;
		this.inputtype = inputtype;
		this.state = state;
		this.statistics = statistics;
		this.goodsid = goodsid;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.versiont = versiont;
		this.title = title;
	}

	public String getQid() {
		return this.qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getChoosetag() {
		return this.choosetag;
	}

	public void setChoosetag(String choosetag) {
		this.choosetag = choosetag;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getInputtype() {
		return this.inputtype;
	}

	public void setInputtype(String inputtype) {
		this.inputtype = inputtype;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getStatistics() {
		return this.statistics;
	}

	public void setStatistics(int statistics) {
		this.statistics = statistics;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
