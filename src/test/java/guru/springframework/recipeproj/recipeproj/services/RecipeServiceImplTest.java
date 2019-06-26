package guru.springframework.recipeproj.recipeproj.services;

import guru.springframework.recipeproj.recipeproj.domain.Recipe;
import guru.springframework.recipeproj.recipeproj.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static com.sun.javaws.JnlpxArgs.verify;

public class RecipeServiceImplTest {

    RecipeService recipeService;
    @Mock
    RecipeRepository recipeRepository;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() throws Exception {
        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);
        /// if set to times 3 for example, it will fail
        Mockito.verify(recipeRepository, times(1)).findAll();
    }

}