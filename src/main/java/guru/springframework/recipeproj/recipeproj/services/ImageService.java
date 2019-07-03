package guru.springframework.recipeproj.recipeproj.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
