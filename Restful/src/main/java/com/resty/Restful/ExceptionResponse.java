package com.resty.Restful;

import java.util.Date;

public class ExceptionResponse  { 

	@Override
	public String toString() {
		return "ExceptionResponse [timestamp=" + timestamp + ", msg=" + msg + "]";
	}
	Date timestamp;
	public ExceptionResponse(Date timestamp, String msg) {
		super();
		this.timestamp = timestamp;
		this.msg = msg;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	String msg;
	
}
