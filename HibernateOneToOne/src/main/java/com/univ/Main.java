package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Prog Start........." );
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        //creating questions
        Question q1 = new Question();
        q1.setQid(101);
        q1.setQuestion("What is java");
        
        Question q2 = new Question();
        q2.setQid(102);
        q2.setQuestion("What is Collection in java");
        
        //creating answer
        Answer a1 = new Answer();
        a1.setAid(11);
        a1.setAnswer("high level programing langauge");
        
        Answer a2 = new Answer();
        a2.setAid(12);
        a2.setAnswer("framework in java");

        //setting answer in related question
        q1.setAnswer(a1);
        q2.setAnswer(a2);
        
        //creating session object
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        //to save data
        s.save(q1);
        s.save(q2);
        s.save(a1);
        s.save(a2);
        
        tx.commit();
        s.close();
        factory.close();
        System.out.println("Prog ends.........");
        
    }
}
