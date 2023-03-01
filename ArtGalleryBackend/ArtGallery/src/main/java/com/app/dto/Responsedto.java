package com.app.dto;

public class Responsedto<T> {
	
	private String status;
    private T data;
    
    
     public Responsedto(String status,T data) {
		super();
		this.status = status;
		this.data = data;
	}
     
     public Responsedto() {
    	 
     }


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Object getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Responsedto [status=" + status + ", data=" + data + "]";
	}
     
     
	
}
