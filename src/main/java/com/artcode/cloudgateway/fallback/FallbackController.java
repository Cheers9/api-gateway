/**
 * 
 */
package com.artcode.cloudgateway.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VISION
 *
 */
@RestController
public class FallbackController {

	@GetMapping("/restaurant-fallback")
	public String restaurantFallback() {
		
		return "Restaurant Service is taking longer than expected. Please try again later";
	}
	
	@GetMapping("/delivery-fallback")
	public String deliveryFallback() {
		
		return "Delivery Service is taking longer than expected. Please try again later";
	}
}
