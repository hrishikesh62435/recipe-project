package com.project.recipe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_RecipUser")
public class RecipeUser1 {

	public RecipeUser1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  userId;
	private String userFullName;
	private String userPass;
	private String readPass;
	private String userEmail;
	private String userLocation;
	private String userMobile;
	private String userRole;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getReadPass() {
		return readPass;
	}
	public void setReadPass(String readPass) {
		this.readPass = readPass;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	@Override
	public String toString() {
		return "RecipeUser [userId=" + userId + ", userFullName=" + userFullName + ", userPass=" + userPass + ", readPass="
				+ readPass + ", userEmail=" + userEmail + ", userLocation=" + userLocation + ", userMobile="
				+ userMobile + ", userRole=" + userRole + "]";
	}
	
	

}
