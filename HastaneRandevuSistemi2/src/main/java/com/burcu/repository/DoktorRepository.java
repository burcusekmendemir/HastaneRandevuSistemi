package com.burcu.repository;

import com.burcu.entity.Doktor;

public class DoktorRepository extends RepositoryManager<Doktor,Long> {
    public DoktorRepository() {
        super(new Doktor());
    }
}
