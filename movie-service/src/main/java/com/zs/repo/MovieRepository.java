package com.zs.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zs.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	List<Movie> findByGenre(String genre);
	
	List<Movie> findByLanguage(String language);
	
	List<Movie> findByReleaseBetween(LocalDate begin, LocalDate end);
}
