package com.markusProyect.DAO;

import com.markusProyect.Entities.Film;
import com.markusProyect.Util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FilmDao {
    public void addFilm(Film film) {        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trns = session.beginTransaction();
        try {
            
            session.save(film);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
    
}
