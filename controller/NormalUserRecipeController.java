package com.project.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.recipe.dao.UserRepository1;
import com.project.recipe.model.CreateRecipe;
import com.project.recipe.model.RecipeUser1;
import com.project.recipe.service.RecipeService;

import jakarta.transaction.Transactional;

@Controller
@CrossOrigin
@RequestMapping("/normal")
public class NormalUserRecipeController {
	
	
	
	
	public NormalUserRecipeController() {
		super();
		System.out.println("Normal User controller");
		// TODO Auto-generated constructor stub
	}

	@Autowired
	RecipeService recipeService;
	
	@Autowired
	UserRepository1 userRepo;
	
//	@Autowired 
//	 PasswordEncoder passwordEncoder;

   
// home page create
@GetMapping("/home")
public String homePage(RecipeUser1 recipeUser1) {
	
	return "index";
}


@GetMapping("/success")
public String successPage(RecipeUser1 recipeUser1) {
	
	return "success_page";
}


@GetMapping("/login")
public String loginPage(RecipeUser1 recipeUser1) {
	
	return "login_page";
}


@GetMapping("/registration")
public String registration(RecipeUser1 recipeUser1,Model m) {
	recipeUser1.setUserId(0);
	m.addAttribute("user" ,recipeUser1);
	
	return "registration_page"; 
}


@PostMapping("/save_page")
@Transactional
public String saveRecipeUserData(RecipeUser1 recipeUser1, Model model) {
	
	System.out.println("save data:"+ recipeUser1);
	
//	String userPass = recipeUser1.getUserPass();
//	recipeUser1.setUserPass(passwordEncoder.encode(userPass));
//	recipeUser1.setReadPass(userPass);
//	
	recipeService.saveRecipeUser(recipeUser1);
	return "redirect:/success";
}


@GetMapping("/getRecipeUserList")
public String listByRecipeUser( RecipeUser1 RecipeUser1, Model model){

	model.addAttribute("recipeUser",recipeService.recipeUserByList(RecipeUser1));
	return "list_recipe_user";
}


@GetMapping("/edit_recipeUser/{id}")
public String editUser(@PathVariable(value = "id") int id,Model m) {
	
	m.addAttribute("user" ,recipeService.getRecipeUserByIdJpa(id) );
	return "registration_page";
	
}


@GetMapping("/delete_recipeUser/{id}")
@Transactional
public String deleteUser(@PathVariable(value = "id") int id,Model m) {
	
	recipeService.deleteRecipeUser(id);
	return "redirect:/getRecipeUserList";
	
}

@GetMapping("/create_recipe")
public String createRecipe(CreateRecipe createRecipe,Model model) {
	createRecipe.setRecipeId(0);
	model.addAttribute("createRecipe" , createRecipe);
	return "create_recipe";
}


//save create recipe
@PostMapping("/save_CreateRecipe")
public String saveCreateRecipe(CreateRecipe createRecipe , Model model) {
	
	recipeService.saveCreateRecipe(createRecipe);
	
	return "redirect:/normal/success";
	
}

//get list create recipe
@GetMapping("/getRecipeList")
public String getRecipeList(CreateRecipe  createRecipe, Model model) {
	
	model.addAttribute("recipeList", recipeService.getAllrecipeList(createRecipe));	  
	return "recipe_all_list";
}

//delete recipe 
@GetMapping("/delete_recipe/{id}")
@Transactional
public String deleteRecipe(@PathVariable(value = "id") int id,Model m) {
	
	recipeService.deleteRecipe(id);
	return "redirect:/normal/getRecipeList";
	
}

//update recipe 

@GetMapping("/update_recipe/{id}")
public String updateRecipe(@PathVariable(value = "id") int id,Model m) {
	
	m.addAttribute("createRecipe" ,recipeService.getCreateRecipeByIdJpa(id) );
	return "create_recipe";
	
}



}	







