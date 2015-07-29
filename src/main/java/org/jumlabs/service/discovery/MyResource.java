/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jumlabs.service.discovery;


import javax.ws.rs.Path;
import org.apache.curator.x.discovery.server.rest.DiscoveryContext;
import org.apache.curator.x.discovery.server.rest.DiscoveryResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 
 @Component
 @Path("/")
   public class MyResource extends DiscoveryResource<String> {
        
       @Autowired
       public MyResource(DiscoveryContext<String> context) {
          
           // note: this may not work with all JAX-RS implementations
           super(context);
          
       }
   }
