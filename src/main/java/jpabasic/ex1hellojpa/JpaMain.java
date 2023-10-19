package jpabasic.ex1hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = emf.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        try {
            /*Member member = new Member();
            member.setId(2L);
            member.setName("june2");*/
            Member findMember = entityManager.find(Member.class, 1L);
            findMember.setName("Hello1111");
//            entityManager.persist(member);
            tx.commit();
        } catch (Exception e) {
            entityManager.close();
        } finally {
            entityManager.close();
        }
        emf.close();

    }
}
