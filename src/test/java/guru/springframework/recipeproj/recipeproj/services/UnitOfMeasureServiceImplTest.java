package guru.springframework.recipeproj.recipeproj.services;

import guru.springframework.recipeproj.recipeproj.commands.UnitOfMeasureCommand;
import guru.springframework.recipeproj.recipeproj.converters.UnitOfMeasureToUnitOfMeasureCommand;
import guru.springframework.recipeproj.recipeproj.domain.UnitOfMeasure;
import guru.springframework.recipeproj.recipeproj.repositories.UnitOfMeasureRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UnitOfMeasureServiceImplTest {

    UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand = new UnitOfMeasureToUnitOfMeasureCommand();
    UnitOfMeasureService unitOfMeasureService;

    @Mock
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        unitOfMeasureService = new UnitOfMeasureServiceImpl(unitOfMeasureRepository, unitOfMeasureToUnitOfMeasureCommand);
    }

//    @Test
//    @Ignore
//    public void listAllUoms() {
//        //given
//        Set<UnitOfMeasure> unitOfMeasures = new HashSet<>();
//        UnitOfMeasure uom1 = new UnitOfMeasure();
//        uom1.setId(1L);
//        unitOfMeasures.add(uom1);
//
//        UnitOfMeasure uom2 = new UnitOfMeasure();
//        uom2.setId(2L);
//        unitOfMeasures.add(uom2);
//
//        when(unitOfMeasureRepository.findAll()).thenReturn(unitOfMeasures);
//
//        //when
//        Set<UnitOfMeasureCommand> commands = unitOfMeasureService.listAllUoms();
//
//        //then
//        assertEquals(2, commands.size());
//        verify(unitOfMeasureRepository, times(1)).findAll();
//    }
}