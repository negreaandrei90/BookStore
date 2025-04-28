package com.neontodo.BookStore_API.services;

import com.neontodo.BookStore_API.model.Category;

import java.util.UUID;

public interface CategoryService {
    Category findCategoryByUuid(UUID uuid);
}
