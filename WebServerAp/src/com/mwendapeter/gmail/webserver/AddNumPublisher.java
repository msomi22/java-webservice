/**
 * 
 */
package com.mwendapeter.gmail.webserver;

import javax.xml.ws.Endpoint;

/**
 * @author peter
 *
 */
public class AddNumPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/APP/AddNum", new AddNum()); 

	}

}
