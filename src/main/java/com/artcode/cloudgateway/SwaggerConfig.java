/**
 * 
 */
package com.artcode.cloudgateway;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//import springfox.documentation.swagger.web.SwaggerResource;
//import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * @author VISION
 *
 */
//@Primary
//@Configuration
public class SwaggerConfig {// implements SwaggerResourcesProvider{

//	 @Autowired
//	  private RouteLocator routeLocator;
//
//	  @Override
//	  public List<SwaggerResource> get() {
//	    List<SwaggerResource> resources = new ArrayList<>();
//
//	// I used service names with lowercase hence the toLowerCase.
//	// Remove the toLowerCase if you use service name with caps as is default with eureka.
//	    routeLocator.getRoutes().subscribe(route -> {
//	      String name = route.getId().split("-")[1];
//	      resources.add(swaggerResource(name, "/" + name.toLowerCase() + "/v3/api-docs", "1.0"));
//	    });
//
//	    return resources;
//	  }
//
//	  private SwaggerResource swaggerResource(final String name, final String location,
//	      final String version) {
//	    SwaggerResource swaggerResource = new SwaggerResource();
//	    swaggerResource.setName(name);
//	    swaggerResource.setLocation(location);
//	    swaggerResource.setSwaggerVersion(version);
//	    return swaggerResource;
//	  }
}
