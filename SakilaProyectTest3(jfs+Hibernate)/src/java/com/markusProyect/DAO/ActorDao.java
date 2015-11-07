package com.markusProyect.DAO;

import com.markusProyect.Entities.Film;
import com.markusProyect.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ActorDao {
    public void addFullFilm(Film film) {        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trns = session.beginTransaction();
        
        try {  
            
            /*session.save(film);
            session.getTransaction().commit();*/
            session.saveOrUpdate(film);
            trns.commit();
            session.close();
        } catch (RuntimeException e) {
            /*if (trns == null) {
                trns.rollback();
            }*/
            System.out.println(e);
            e.printStackTrace();
        } /*finally {
            session.flush();
           
        }*/
    }
    
    
}
