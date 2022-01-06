package com.maxtihon.tacocloud.repository;

import com.maxtihon.tacocloud.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
