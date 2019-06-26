package guru.springframework.recipeproj.recipeproj.controllers;

import guru.springframework.recipeproj.recipeproj.domain.Category;
import guru.springframework.recipeproj.recipeproj.domain.UnitOfMeasure;
import guru.springframework.recipeproj.recipeproj.repositories.CategoryRepository;
import guru.springframework.recipeproj.recipeproj.repositories.UnitOfMeasureRepository;
import guru.springframework.recipeproj.recipeproj.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model)
    {
        log.debug("I'm in the Index Controller");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
