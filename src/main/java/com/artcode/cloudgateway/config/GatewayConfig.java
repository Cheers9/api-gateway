package com.artcode.cloudgateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;
    


    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("restaurant-service", r -> r.path("/restaurant/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://restaurant-service"))
                
                .route("admin-service", r -> r.path("/admin/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://admin-service"))

                .route("auth-service", r -> r.path("/auth/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://auth-service"))
//                .route("openapi", r -> r.path("/v3/api-docs/**")
//                        .filters(f -> f.filter(filter))
//                        .uri("http://localhost:9090"))
                .build();
        
        
    }


}
