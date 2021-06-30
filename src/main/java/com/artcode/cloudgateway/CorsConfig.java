/**
 * 
 */
package com.artcode.cloudgateway;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


/**
 * @author VISION
 *
 */
@Configuration
public class CorsConfig {

	
	  @Bean public CorsWebFilter corsWebFilter() {
	  
	  final CorsConfiguration corsConfig = new CorsConfiguration();
	  corsConfig.setAllowedOrigins(Collections.singletonList("*"));
	  corsConfig.setMaxAge(3600L); // corsConfig.addAllowedOrigin("*"); //
//	  corsConfig.addAllowedOrigin("http://localhost:4200"); //
//	  corsConfig.addAllowedHeader("http://localhost:4200");
	  corsConfig.setAllowedMethods(Arrays.asList("*","GET", "POST"));
	  corsConfig.addAllowedHeader("*");
	  corsConfig.addAllowedHeader("Authorization");
	  corsConfig.addAllowedHeader("Access-Control-Allow-Origin");
	  corsConfig.addAllowedHeader("Content-Type");
	  corsConfig.addAllowedHeader("X-Requested-With");
	  corsConfig.setAllowCredentials(true); final UrlBasedCorsConfigurationSource
	  source = new UrlBasedCorsConfigurationSource();
	  source.registerCorsConfiguration("/**", corsConfig);
	  
	  return new CorsWebFilter(source); }
	  
}
