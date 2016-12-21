package com.mwendapeter.gmail.webserver;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService 
public interface AppAddNum {
	
	@WebMethod
	public double addNum(double num1, double num2);

}
