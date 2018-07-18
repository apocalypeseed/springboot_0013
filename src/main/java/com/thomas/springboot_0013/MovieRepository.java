package com.thomas.springboot_0013;

import com.thomas.springboot_0013.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>
{
}
