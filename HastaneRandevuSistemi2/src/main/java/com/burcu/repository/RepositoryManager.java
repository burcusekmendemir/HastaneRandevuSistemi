package com.burcu.repository;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class RepositoryManager<T,ID> implements ICrud<T,ID>{

    private final EntityManagerFactory emf;
    private EntityManager em;
    private final T t;

    public RepositoryManager(T t){
        emf= Persistence.createEntityManagerFactory("CRM");
        em= emf.createEntityManager();
        this.t=t;
    }

    public void openSession(){
        em=emf.createEntityManager();
        em.getTransaction().begin();
    }

    public void closeSession(){
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public T save(T entity) {
        try {
            openSession();
            em.persist(entity);
            closeSession();
        }catch (Exception e){
            if (em.isOpen()){
                closeSession();
            }
        }
        return entity;
    }

    //İsmi verilen hastanın hangi branşlardan kaç randevu aldığını gösteren method
    public List<Object []> findCountNativeSql(String name){
        List<Object []> list= em.createNativeQuery("select h.ad, br.brans, count(br.id) from tblhasta as h\n" +
                "left join tblrandevu as r\n" +
                "on h.id=r.hasta_id\n" +
                "left join tbldoktor as d\n" +
                "on r.doktor_id=d.id\n" +
                "left join tblbrans as br\n" +
                "on br.id=d.brans_id\n" +
                "where h.ad='"+name+"'\n" +
                "group by h.ad,br.brans").getResultList();
        return list;
    }

    //Belli tarihler arasındaki randevuları listeleyen method
        public List<Object[]> findDateNativeSql(LocalDate startDate, LocalDate endDate){
            return em.createNativeQuery("select hasta_id,tarih from tblrandevu where tarih>='"+startDate+"' and tarih<='"+endDate+"'", Object.class).getResultList();
    }



    //Adı verilen doktorun kaç hasta baktığını gösteren method.
    public List<Object []> findCountPatientNativeSql(String name){
        List<Object []> list= em.createNativeQuery("select d.ad, count(h.id) from tbldoktor as d\n" +
                "left join tblrandevu as r\n" +
                "on d.id=r.doktor_id\n" +
                "left join tblhasta as h\n" +
                "on h.id=r.hasta_id\n" +
                "where d.ad='"+name+"'\n" +
                "group by d.ad").getResultList();
        return list;
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> entities) {
        try {
            openSession();
            entities.forEach(e-> {
                em.persist(e);
            });
            closeSession();
        }catch (Exception e){
            closeSession();
        }
        return entities;
    }

    @Override
    public Optional<T> findById(ID id) {
        CriteriaBuilder criteriaBuilder= emf.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root= (Root<T>) criteriaQuery.from(t.getClass());
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get("id"),id));
        T t1;
        try {
            t1=em.createQuery(criteriaQuery).getSingleResult();
            return Optional.of(t1);
        }catch (NoResultException e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<T> findByColumn(String column, String value) {
        CriteriaBuilder criteriaBuilder= emf.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root= (Root<T>) criteriaQuery.from(t.getClass());
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get(column),value));
        T t1;
        try {
            t1=em.createQuery(criteriaQuery).getSingleResult();
            return Optional.of(t1);
        }catch (NoResultException e){
            return Optional.empty();
        }
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder criteriaBuilder= emf.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root= (Root<T>) criteriaQuery.from(t.getClass());
        criteriaQuery.select(root);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public List<T> findByColumnAndValue(String columnName, Object value) {
        CriteriaBuilder criteriaBuilder= emf.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root= (Root<T>) criteriaQuery.from(t.getClass());
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get(columnName),value));

        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public List<T> findAllEntity(T entity) {
        return null;
    }
}
