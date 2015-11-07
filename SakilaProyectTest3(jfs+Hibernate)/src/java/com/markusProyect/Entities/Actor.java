package com.markusProyect.Entities;

import com.markusProyect.DAO.ActorDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name="actor")
@SessionScoped
public class Actor  implements java.io.Serializable {
    private int actorId;
    private String firstName;
    private String lastName;
    
    @ManagedProperty("#{film}")
    private Film film;
    
    //private Film movie;   
    
    private List<Actor> actorList = new ArrayList();
    
     
    ActorDao dao = new ActorDao();
    Actor act;
    Film f = new Film();
    
    public Actor() {
    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Actor(int actorId,String firstName, String lastName, Film film) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.film = film;
    }
   
    public int getActorId() {
        return this.actorId;
    }
    
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Film getFilm() {
        return this.film;
    }
    
    public void setFilm(Film film) {
        this.film = film;
    }
    
    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    //Metodos para el DAO
    public List<Actor> getCreaActor(){
        f = film.addFilm();
        act = new Actor(actorId,firstName,lastName,f);        
        actorList.add(act);
        //f = new Film();
        f.setActores(actorList);
        return actorList;        
    }
    
    public void getCreaTodo(){ 
       /* Film f = new Film();
        f = film.addFilm();*/
        /*Film film = act.film.addFilm();
        film.setActores(actorList); */
       // f.setActores(actorList);
        dao.addFullFilm(f);
    }

    
}


