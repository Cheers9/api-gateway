package com.artcode.cloudgateway.config;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class RouterValidator {
 static List<String> openApiEndpoints = null;
	static {
//		List<String> openApiEndpoints =  List.of("/auth/register", "/auth/login");
		openApiEndpoints = new ArrayList<>();
		openApiEndpoints.add("/restaurant/register");
		openApiEndpoints.add("/auth/login");
		openApiEndpoints.add("/admin/register");
//		openApiEndpoints.add("/v3/api-docs/**");
	}
     

 
    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

          
                   
}
