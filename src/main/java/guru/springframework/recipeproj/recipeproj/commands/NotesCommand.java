package guru.springframework.recipeproj.recipeproj.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private String recipeNotes;
}