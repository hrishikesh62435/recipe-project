//package com.project.recipe.security1;
//
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.project.recipe.model.RecipeUser1;
//
//public class CustomRecipeUserDetails1 implements UserDetails {
//	
//	
//	private static final long serialVersionUID = 1L;
//	@Autowired
//	private RecipeUser1 recipeUser1;
//
//	public CustomRecipeUserDetails1(RecipeUser1 recipeUser1) {
//		super();
//		this.recipeUser1=recipeUser1;
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//			SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(recipeUser1.getUserRole());
//			System.out.println(Arrays.asList(simpleGrantedAuthority).size());
//			return Arrays.asList(simpleGrantedAuthority) ;
//			
//
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return recipeUser1.getUserPass();
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return recipeUser1.getUserEmail();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//}
