/**
 * 
 */
package com.mwendapeter.gmail.webserver;

import javax.jws.WebService;

/**
 * @author peter
 *
 */

@WebService(endpointInterface="com.mwendapeter.gmail.webserver.AppAddNum")
public class AddNum implements AppAddNum {

	@Override
	public double addNum(double num1, double num2) {
		return num1 + num2; 
	}

}
