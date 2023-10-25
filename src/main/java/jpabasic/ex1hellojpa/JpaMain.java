package jpabasic.ex1hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // * 비영속
            /*Member member = new Member();
            member.setId(3L);
            member.setName("testMemberr");

            System.out.println("=== before ===");
            em.persist(member);
            System.out.println("=== after ===");

            Member member1 = em.find(Member.class, 3L);
            System.out.println("member1 = " + member1.getName());*/
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("Hello1111");
//            em.persist(member);
//            tx.commit();

            new Member();
        } catch (Exception e) {
            em.close();
        } finally {
            em.close();
        }
        emf.close();

    }
}
