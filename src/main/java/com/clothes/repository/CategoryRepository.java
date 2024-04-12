package com.clothes.repository;

import java.util.Optional;
import com.clothes.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByName(String name);

	boolean existsByName(String name);

	Optional<Category> findById(Long id);
}