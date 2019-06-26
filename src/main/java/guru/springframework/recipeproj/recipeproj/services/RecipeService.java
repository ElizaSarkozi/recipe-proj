package guru.springframework.recipeproj.recipeproj.services;

import guru.springframework.recipeproj.recipeproj.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
