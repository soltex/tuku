/**
 * 
 */
package com.vanstone.tuku.album.entity;

import java.util.Date;

/**
 * @author shipeng
 */
public class Photo {

	private String id;
	private String title;
	private String brief;
	private String content;
	private int pv;
	private int sort = 0;
	private Date sysInsertTime;
	private Date sysUpdateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Date getSysInsertTime() {
		return sysInsertTime;
	}

	public void setSysInsertTime(Date sysInsertTime) {
		this.sysInsertTime = sysInsertTime;
	}

	public Date getSysUpdateTime() {
		return sysUpdateTime;
	}

	public void setSysUpdateTime(Date sysUpdateTime) {
		this.sysUpdateTime = sysUpdateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}
	
}
