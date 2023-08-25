package com.project.recipe.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.recipe.dao.RecipeRepository;
import com.project.recipe.dao.UserRepository1;
import com.project.recipe.model.CreateRecipe;
import com.project.recipe.model.RecipeUser1;

import jakarta.transaction.Transactional;

@Service
public class RecipeServiceImp implements RecipeService{
	
	
	
		
	@Autowired
	UserRepository1 userRepository1;
	
	@Autowired
	RecipeRepository recipeRepository;

	public RecipeServiceImp(RecipeRepository recipeRepository, UserRepository1 userRepository1) {
		this.recipeRepository= recipeRepository;
		this.userRepository1 = userRepository1;
		
		System.out.println("Services Impliment start");
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public RecipeUser1 saveRecipeUser(RecipeUser1 recipeUser1) {
		
		RecipeUser1 save = userRepository1.save(recipeUser1);
		return save;
	}
	

	@Override
	public List<RecipeUser1> recipeUserByList(RecipeUser1 recipeUser1 ) {
		
		List<RecipeUser1> list = userRepository1.findAll();
		
		return list;
	}

	
	@Override
	public RecipeUser1 getRecipeUserByIdJpa(int userId) {
		RecipeUser1 recipeUserByIdJpa = userRepository1.getRecipeUserByIdJpa(userId);
		return recipeUserByIdJpa;
	}

	@Override
	@Transactional
	public String  deleteRecipeUser(int UserId) {
		userRepository1.deleteById(UserId);
		return "list_recipe_user";
	}

	@Override
	public RecipeUser1 getRecipeUserByEmailId(String userEmail) {
		// TODO Auto-generated method stub
		return userRepository1.getRecipeUserByEmailId(userEmail);
	}
	
	//____________recipe method___________

	//recipe save
	@Override
	public CreateRecipe saveCreateRecipe(CreateRecipe createRecipe) {
		
		CreateRecipe recipeSave = recipeRepository.save(createRecipe);
		
		return recipeSave;
	}


	//getRecipeList
	
	@Override
	public List<CreateRecipe> getAllrecipeList(CreateRecipe createRecipe) {
		
			List<CreateRecipe> allRecipe = recipeRepository.findAll();
		
		return allRecipe;
	}
	
	
	//delete Recipe 
	
	public String deleteRecipe(int recipeId) {
		
		recipeRepository.deleteById(recipeId);
		
		return "recipe_all_list"; 
	}

	//update recipe
	@Override
	public  CreateRecipe getCreateRecipeByIdJpa(int recipeId) {
		CreateRecipe createRecipeByIdJpa = recipeRepository.getCreateRecipeByIdJpa(recipeId);
		return createRecipeByIdJpa;
	}
	
	
	//getall joindata
	
	public List<CreateRecipe> getJoinedData(){
		return  recipeRepository.findAll();
	}
		
	
}
