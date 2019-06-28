package guru.springframework.recipeproj.recipeproj.services;

import guru.springframework.recipeproj.recipeproj.commands.IngredientCommand;
import guru.springframework.recipeproj.recipeproj.domain.Ingredient;

import java.util.Set;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
