/**
 * 
 */
package com.vanstone.tuku;

import com.vanstone.business.VanstoneException;

/**
 * @author shipeng
 *
 */
public class TukuException extends VanstoneException {

	private static final long serialVersionUID = 9077136099851256244L;
	
	public TukuException() {
		super();
	}
	
	public TukuException(String message) {
		super(message);
	}

	public TukuException(Throwable cause) {
		super(cause);
	}

	public TukuException(String message, Throwable cause) {
		super(message, cause);
	}

	public Throwable fillInStackTrace() {
		return this;
	}
}
