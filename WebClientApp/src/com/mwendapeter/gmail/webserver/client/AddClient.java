/**
 * 
 */
package com.mwendapeter.gmail.webserver.client;

import com.mwendapeter.gmail.webserver.AddNumService;
import com.mwendapeter.gmail.webserver.AppAddNum;

/**
 * @author peter
 *
 */
public class AddClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddNumService addNumService = new AddNumService();
		AppAddNum addNum = addNumService.getAddNumPort();
		System.out.println(addNum.addNum(10,40));  

	}

}
