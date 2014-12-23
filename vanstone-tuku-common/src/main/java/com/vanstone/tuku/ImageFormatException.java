/**
 * 
 */
package com.vanstone.tuku;

/**
 * 图片格式错误异常
 * @author shipeng
 */
public class ImageFormatException extends TukuException {

	private static final long serialVersionUID = 2494854025951206963L;
	
	public ImageFormatException() {
		super();
	}
	
	public ImageFormatException(String message) {
		super(message);
	}
	
	public ImageFormatException(Exception e) {
		super(e);
	}
	
}
