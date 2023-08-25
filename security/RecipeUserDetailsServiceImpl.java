//package com.project.recipe.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.project.recipe.model.RecipeUser1;
//import com.project.recipe.service.RecipeService;
//
//@Service
//public class RecipeUserDetailsServiceImpl implements UserDetailsService {
//
//	
//	@Autowired
//	RecipeService recipeService;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		  RecipeUser1 user = recipeService.getRecipeUserByEmailId(username); 
//		  System.out.println("user11 : "+user);
//		  if(user==null) {
//				throw new UsernameNotFoundException("Could not found user");
//			}
//		  CustomRecipeUserDetails userDetails = new CustomRecipeUserDetails(user);
//		  System.out.println("userDetails : "+userDetails);
//			return 	userDetails;    
//	}
//
//}
