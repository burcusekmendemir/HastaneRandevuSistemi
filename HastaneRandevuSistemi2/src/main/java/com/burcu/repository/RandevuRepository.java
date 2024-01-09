package com.burcu.repository;

import com.burcu.entity.Randevu;

public class RandevuRepository extends RepositoryManager<Randevu,Long>{
    public RandevuRepository() {
        super(new Randevu());
    }
}
