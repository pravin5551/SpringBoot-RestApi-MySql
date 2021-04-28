package com.springboot.revision.repo;

import com.springboot.revision.entities.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends CrudRepository<Books,Integer> {

    public Books findById(int id);

    public Books findByName(String name);

    public Books findByTitle(String title);
}

