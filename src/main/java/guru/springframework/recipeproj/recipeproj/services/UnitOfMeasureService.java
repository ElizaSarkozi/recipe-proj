package guru.springframework.recipeproj.recipeproj.services;

import guru.springframework.recipeproj.recipeproj.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
