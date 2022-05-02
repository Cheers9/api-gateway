/**
 * 
 */
package com.artcode.cloudgateway;


/**
 * @author VISION
 *
 */
//@Primary
//@Configuration

//@EnableWebSecurity
public class SwaggerConfig {// implements SwaggerResourcesProvider{

//	extends WebSecurityConfigurerAdapter 
//	
//	extends WebSecurityConfigurerAdapter 
//	
	
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

//   @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/swagger-ui/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("arunarun")
//                .authorities("ADMIN");
//    }

    
    

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/swagger-ui/**","/javainuse-openapi/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("javainuse")
//                .password(passwordEncoder().encode("javainuse"))
//                .authorities("ADMIN");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
	
}
