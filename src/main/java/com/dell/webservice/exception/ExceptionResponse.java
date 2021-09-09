package com.dell.webservice.exception;

import java.util.Date;

public class ExceptionResponse {
   String message;
   Date timestamp;
   String ststus;
   String error;
public ExceptionResponse() {
	super();
	// TODO Auto-generated constructor stub
}
public ExceptionResponse(String message, Date timestamp, String ststus, String error) {
	super();
	this.message = message;
	this.timestamp = timestamp;
	this.ststus = ststus;
	this.error = error;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public String getStstus() {
	return ststus;
}
public void setStstus(String ststus) {
	this.ststus = ststus;
}
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
@Override
public String toString() {
	return "ExceptionResponse [message=" + message + ", timestamp=" + timestamp + ", ststus=" + ststus + ", error="
			+ error + "]";
}
   
}
