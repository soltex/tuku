/**
 * 
 */
package com.vanstone.tuku.album.entity;

/**
 * @author shipeng
 */
public class Album {
	
	private String id;
	private String albumName;
	private ImageBean coverImageBean;
	
	public ImageBean getCoverImageBean() {
		return coverImageBean;
	}

	public void setCoverImageBean(ImageBean coverImageBean) {
		this.coverImageBean = coverImageBean;
	}

	private int pv;
	
	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
}
