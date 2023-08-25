package com.project.recipe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.project.recipe.model.RecipeUser1;
@Repository
@EnableJpaRepositories
public interface UserRepository1 extends JpaRepository<RecipeUser1, Integer> {   

	
//	@Query("SELECT CASE WHEN COUNT(e) > 0 THEN TRUE ELSE FALSE END FROM RecipeUser1 e WHERE e.userId = ?1")
//	Boolean isEmployeeByExistId(int id);
//	
//	public RecipeUser1 getRecipeUserByUserID(int userId);
	
	
	 
	@Query("select e from RecipeUser1 e where userId= :userId ")
	public RecipeUser1 getRecipeUserByIdJpa(int userId);  
	
	
	@Query("select e from RecipeUser1 e where userEmail= :userEmail ")
	public RecipeUser1 getRecipeUserByEmailId(String userEmail); 
	
	
	

}
