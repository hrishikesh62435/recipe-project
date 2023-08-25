package com.project.recipe.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.project.recipe.model.CreateRecipe;
import com.project.recipe.model.RecipeUser1;

@Service
public interface RecipeService  {
	
	
	
	
	//save opreation
	
	public RecipeUser1 saveRecipeUser(RecipeUser1 recipeUser1);
	
	
	//read list opreation	
	
	public List<RecipeUser1> recipeUserByList(RecipeUser1 recipeUser1);
	
	
	//EDITE  user OPREATION 
	
	public RecipeUser1 getRecipeUserByIdJpa(int userId); 


	//delet   user OPREATION
	String deleteRecipeUser(int UserId);
	
	
	public RecipeUser1 getRecipeUserByEmailId(String userEmail);
	
	
	//save recipe creating 
	
	public CreateRecipe saveCreateRecipe(CreateRecipe createRecipe);
	
	
	//getRecipeList
	
	public List<CreateRecipe> getAllrecipeList(CreateRecipe createRecipe);
	
	//delete recipe 
	
	public String deleteRecipe(int recipeId);
	
	
	//edite recipe
	
	public CreateRecipe getCreateRecipeByIdJpa(int recipeId); 
	
	
	//getall joint data 
	public List<CreateRecipe> getJoinedData();
	
}
