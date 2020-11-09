/**
 * 
 */
package io.sms.demo;

/**
 * @author rohan
 *
 */
public class hellobean {

	private String message;

	public hellobean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}


	@Override
	public String toString() {
		return "hellobean [message=" + message + ", getMessage()=" + getMessage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
