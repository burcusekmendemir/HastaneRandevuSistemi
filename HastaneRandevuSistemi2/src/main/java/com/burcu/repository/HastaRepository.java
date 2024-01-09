package com.burcu.repository;

import com.burcu.entity.Hasta;

public class HastaRepository extends RepositoryManager<Hasta,Long>{
    public HastaRepository() {
        super(new Hasta());
    }


}
