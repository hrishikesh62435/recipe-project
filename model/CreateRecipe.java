package com.project.recipe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_create_recipe")
public class CreateRecipe {
	
		
	public CreateRecipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne
	@JoinColumn(name = "recipeUser1_userId")
//	@JoinColumn(name = "recipeUser1_userFullName")
	private RecipeUser1 recipeUser1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recipeId;
	private String recipeName;
	private String recipeIngredient;
	private String recipeInstruction;
	
	
	
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getRecipeIngredient() {
		return recipeIngredient;
	}
	public void setRecipeIngredient(String recipeIngredient) {
		this.recipeIngredient = recipeIngredient;
	}
	public String getRecipeInstruction() {
		return recipeInstruction;
	}
	public void setRecipeInstruction(String recipeInstruction) {
		this.recipeInstruction = recipeInstruction;
	}
	
	
	
	@Override
	public String toString() {
		return "CreateRecipe [recipeId=" + recipeId + ", recipeName=" + recipeName + ", recipeIngredient="
				+ recipeIngredient + ", recipeInstruction=" + recipeInstruction +  "]";
	}
	
	
	
	
	
	
	
	
	

}
