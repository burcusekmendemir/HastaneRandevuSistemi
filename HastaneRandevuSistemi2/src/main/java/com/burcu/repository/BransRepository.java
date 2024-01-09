package com.burcu.repository;

import com.burcu.entity.Brans;

public class BransRepository extends RepositoryManager<Brans,Long>{
    public BransRepository() {
        super(new Brans());
    }
}
