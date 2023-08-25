package com.project.recipe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.project.recipe.model.CreateRecipe;


@Repository
@EnableJpaRepositories
public interface RecipeRepository  extends JpaRepository<CreateRecipe, Integer>{
	
	@Query("select c from CreateRecipe c where recipeId= :recipeId ")
	public CreateRecipe getCreateRecipeByIdJpa(int recipeId); 

}
