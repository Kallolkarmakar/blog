package com.achiva.model.blogs.dto;

import java.io.Serializable;

public class ServiceResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7828400977567235943L;

	private String result;
	private String messsage;
	private Object responseObject;
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the messsage
	 */
	public String getMesssage() {
		return messsage;
	}
	/**
	 * @param messsage the messsage to set
	 */
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	/**
	 * @return the responseObject
	 */
	public Object getResponseObject() {
		return responseObject;
	}
	/**
	 * @param responseObject the responseObject to set
	 */
	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceResponse [result=" + result + ", messsage=" + messsage + ", responseObject=" + responseObject + "]";
	}
	
	
	
}
