package com.ssafy.happyhouse.model;

import java.util.Date;

public class QnaDto {
	private int no;
	private String userid,title,contents,reply;
	private Date regdate;
	
	private String loginId;
	
	public QnaDto(int no, String userid, String title, String contents, String reply, Date regdate) {
		super();
		this.no = no;
		this.userid = userid;
		this.title = title;
		this.contents = contents;
		this.reply = reply;
		this.regdate = regdate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	
	
}
