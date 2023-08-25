//package com.project.recipe.security;
//
//import java.io.IOException;
//import java.util.Set;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
//import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Configuration
//
//public class RecipeSecurityConfig  extends AbstractSecurityWebApplicationInitializer {  // extends SavedRequestAwareAuthenticationSuccessHandler 
//	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//		
//	}
//	
//	@Bean
//	UserDetailsService getUserDetailService() {
//			return new RecipeUserDetailsServiceImpl();
//	}
//
//	
//	/*
//	 * public boolean supports(Class<? extends Object> authentication) { return
//	 * (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
//	 * }
//	 */
//	
//    @Bean
//    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        http
//                .authorizeHttpRequests((requests) -> requests
//
//                        .requestMatchers("/home", "/login", "/registration").permitAll()
//                        .requestMatchers("/getRecipeUserList").hasRole("ADMIN")
////			.requestMatchers("/Admin").hasRole("ADMIN")
//                        .requestMatchers("/Normal").hasRole("NORMAL")
////			.requestMatchers("/Normal").hasRole("NORMAL")
//                        .anyRequest()
//                        .authenticated())
//
//                .formLogin((form) -> form
// 
//                                .loginPage("/login")
//                                .loginProcessingUrl("/dologin")
//                                .successHandler(new AuthenticationSuccessHandler() {
//                        
//
//                                    @Override
//                                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//                                                                                                                                                    Authentication authentication) throws IOException, ServletException {
//                                        // TODO Auto-generated method stub
//                                        String redirectUrl = "";
//
//                                        System.out.println("hello");
//
//                                        UserDetails userDetails =  (UserDetails) authentication.getPrincipal();
//                                        String username = userDetails.getUsername();
//                                        System.out.println(username);
//
//
//                                        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
//                                        System.out.println(roles);
//
//                                        if (roles.contains("ROLE_NORMAL")) {
//                                            System.out.println("The user " + username + " has logged in.");
//                                            redirectUrl = "/Normal";
//                                        } else if (roles.contains("ROLE_ADMIN")) {
//
//                                            System.out.println("The user " + username + " has logged in.");
//                                            redirectUrl = "/getRecipeUserList";
//
//                                        }
//
//                                        new DefaultRedirectStrategy().sendRedirect(request, response, redirectUrl);
//                                    }
//                                })
//                                .failureHandler(new SimpleUrlAuthenticationFailureHandler() {
//                                    
//                                    @Override
//                                    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
//                                            AuthenticationException exception) throws IOException, ServletException {
//                                        //String email = request.getParameter("email");
//                                        String error = exception.getMessage();
//                                        System.out.println("A failed login attempt with email:  Reason: " + error);
//                                         
//                                        super.setDefaultFailureUrl("/login?error");
//                                        super.onAuthenticationFailure(request, response, exception);
//                                    }
//                                })
//                );
//
//
//        return http.build();
//
//    }
//		
//}  
//
