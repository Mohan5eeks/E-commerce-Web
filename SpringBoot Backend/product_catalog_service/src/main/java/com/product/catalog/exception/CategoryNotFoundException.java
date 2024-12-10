package com.product.catalog.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException() {
        super("Category not found");
    }
}
