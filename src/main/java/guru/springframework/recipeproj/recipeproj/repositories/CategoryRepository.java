package guru.springframework.recipeproj.recipeproj.repositories;

import guru.springframework.recipeproj.recipeproj.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription( String description) ;
}
