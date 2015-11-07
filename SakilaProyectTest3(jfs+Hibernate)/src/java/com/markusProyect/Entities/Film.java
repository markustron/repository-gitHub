package com.markusProyect.Entities;

import com.markusProyect.DAO.FilmDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;


@ManagedBean(name="film")
@SessionScoped
public class Film  implements java.io.Serializable {
    private int filmId;
    private String title;
    private String releaseYear;
    private String lastUpdate;
    private List<Actor> actores = new  ArrayList();
    
    //Asi establezco conexion con el otro BackBean
    /*@ManagedProperty("#{actor}")
    private Actor actor;*/
    
    FilmDao dao = new FilmDao();

    public Film() {
    }
    
    public Film(int filmId, String title, String releaseYear, String lastUpdate) {
       this.filmId = filmId;
       this.title = title;
       this.releaseYear = releaseYear;
       this.lastUpdate = lastUpdate;
    }
    
    public Film(int filmId, String title, String releaseYear, String lastUpdate,List<Actor> actores) {
       this.filmId = filmId;
       this.title = title;
       this.releaseYear = releaseYear;
       this.lastUpdate = lastUpdate;
       this.actores = actores;
    }
    
   
    public int getFilmId() {
        return this.filmId;
    }
    
    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReleaseYear() {
        return this.releaseYear;
    }
    
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }
    
    /*public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    
    public List<Actor> getRecogeDatosActor(){
       List<Actor> actorList = new ArrayList();
       actorList = actor.getActorList();        
       return actorList;
    }*/
    
    
    /*public FilmDao getDao(){
         FilmDao filmDao = new FilmDao();
         return filmDao;
    }*/

    //Metodos para el DAO
    public Film addFilm(){ 
        Film film = new Film(filmId,title,releaseYear,lastUpdate); 
        return film;
    }

    
    
   

}


