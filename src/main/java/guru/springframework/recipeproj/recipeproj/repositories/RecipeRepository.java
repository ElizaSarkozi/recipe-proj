package guru.springframework.recipeproj.recipeproj.repositories;

import guru.springframework.recipeproj.recipeproj.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
