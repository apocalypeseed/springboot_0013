package com.thomas.springboot_0013;

import org.springframework.data.repository.CrudRepository;
import com.thomas.springboot_0013.Actor;

public interface ActorRepository extends CrudRepository<Actor, Long>
{
}