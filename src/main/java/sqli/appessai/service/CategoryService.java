package sqli.appessai.service;

import org.springframework.stereotype.Service;
import sqli.appessai.repository.CategoryRepository;

@Service
public class CategoryService {
    static CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        CategoryService.categoryRepository = categoryRepository;
    }
   public  static boolean isCategoryExist(String id)
    {
        return categoryRepository.findById(id).isPresent();
    }
}
