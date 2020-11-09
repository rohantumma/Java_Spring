/**
 * 
 */
package io.smsapi.spring_demo;

/**
 * @author rohan
 *
 */
public class demo {
	
	long id;
	String messs;

	public demo(long id, String messs) {
		super();
		this.id = id;
		this.messs = messs;
	}

	@Override
	public String toString() {
		return "demo [id=" + id + ", messs=" + messs + ", getId()=" + getId() + ", getMesss()=" + getMesss()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMesss() {
		return messs;
	}
	public void setMesss(String messs) {
		this.messs = messs;
	}
	

}
