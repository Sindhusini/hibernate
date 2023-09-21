package com.Trio;
import com.Trio.Student;
import javax.persistence.*;  
public class Main {
	public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
        Student s1=new Student();  
        s1.setS_id(101);  
        s1.setS_name("Ganga");  
        s1.setS_age(24);  
          
        Student s2=new Student();  
        s2.setS_id(102);  
        s2.setS_name("Ranju");  
        s2.setS_age(22);  
          
        Student s3=new Student();  
        s3.setS_id(103);  
        s3.setS_name("Roja");  
        s3.setS_age(26);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  

}
