/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.anycart.repository;

import com.github.bysrhq.anycart.domain.Category;
import java.util.List;

/**
 *
 * @author bysrhq
 */
public interface CategoryRepository {
    Category getCategory(String id);
    List<Category> getCategories();
}
