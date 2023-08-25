//package com.project.recipe.security1;
//
//import java.io.IOException;
//import java.util.Set;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Configuration
//@EnableWebSecurity
//public class CustomSecurityConfiguration1 extends AbstractSecurityWebApplicationInitializer  {
//	
//	
//	
//		@Bean
//		PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//		}
//	
//	
//		@Bean
//		UserDetailsService getUserDetailService() {
//			return new RecipeUserDetailsServiceImpl1();
//		}
//
//	
//	
//	
//	@Bean
//	@SuppressWarnings("deprecation")
//	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//		
//		http
//		.authorizeRequests(authorizeRequests ->
//        authorizeRequests
//            .requestMatchers("/admin/home","/normal/home","/normal/login","/normal/registration","/admin/registration").permitAll() // Allow access to home page
//            .requestMatchers("/admin/**").hasRole("ADMIN")
//            .requestMatchers("/normal/**").hasRole("NORMAL")
//            .anyRequest()
//            .authenticated()
//            
//    )
//    .formLogin(formLogin ->
//        formLogin
//            .loginPage("/normal/login") // Custom login page URL
//            .loginProcessingUrl("/dologin")
//            .successHandler(new AuthenticationSuccessHandler() {
//              
//
//                          @Override
//                          public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//                             Authentication authentication) throws IOException, ServletException {
//                              // TODO Auto-generated method stub
//                              String redirectUrl = "";
//
//                              System.out.println("hello");
//
//                              UserDetails userDetails =  (UserDetails) authentication.getPrincipal();
//                              String username = userDetails.getUsername();
//                              System.out.println(username);
//
//
//                              Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
//                              System.out.println(roles);
//
//                              if (roles.contains("ROLE_NORMAL")) {
//                                  System.out.println("The user " + username + " has logged in.");
//                                  redirectUrl = "/Normal/**";
//                              } else if (roles.contains("ROLE_ADMIN")) {
//
//                                  System.out.println("The user " + username + " has logged in.");
//                                  redirectUrl = "/admin/**";
//
//                              }
//
//                              new DefaultRedirectStrategy().sendRedirect(request, response, redirectUrl);
//                          }
//                      })
//    )
//    .logout(logout ->
//        logout
//            .permitAll()
//    );
//
//			return http.build();
//	}
//	
//}
