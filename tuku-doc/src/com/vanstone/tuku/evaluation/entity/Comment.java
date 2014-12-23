/**
 * 
 */
package com.vanstone.tuku.evaluation.entity;

import java.util.Date;

/**
 * 评论
 * 
 * @author shipeng
 */
public class Comment {

	private String id;
	private String content;
	private String ip;
	private String geoLocation;
	private Date sysInsertTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	public Date getSysInsertTime() {
		return sysInsertTime;
	}
	
	public void setSysInsertTime(Date sysInsertTime) {
		this.sysInsertTime = sysInsertTime;
	}

}
