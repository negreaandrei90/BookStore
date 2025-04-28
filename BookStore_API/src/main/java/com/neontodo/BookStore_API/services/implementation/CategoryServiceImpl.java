package com.neontodo.BookStore_API.services.implementation;

import com.neontodo.BookStore_API.model.Category;
import com.neontodo.BookStore_API.repositories.CategoryRepository;
import com.neontodo.BookStore_API.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepo;

    @Override
    public Category findCategoryByUuid(UUID uuid) {
        return null;
    }
}
