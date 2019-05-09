package com.shiv.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessageModel {

	private String errorCode;
	private String errorMessage;
	private String errorRef;

	public ErrorMessageModel() {
		super();
	}

	public ErrorMessageModel(String errorCode, String errorMessage, String errorRef) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorRef = errorRef;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorRef() {
		return errorRef;
	}

	public void setErrorRef(String errorRef) {
		this.errorRef = errorRef;
	}

}
