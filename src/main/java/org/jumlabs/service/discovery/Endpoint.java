/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jumlabs.service.discovery;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class Endpoint {

	
	
	public Endpoint() {
	
	}

	@GET
	public String message() {
		return "Hello ";
	}

}