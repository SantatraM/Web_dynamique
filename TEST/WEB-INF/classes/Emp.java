package modele;

import etu1787.framework.annotation.Urls;

import java.sql.Date;


public class Emp {
    private int id;
    private String nom;
    private Date date_naissance;

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    // constructeur
    public Emp() {
    }

    
    public Emp(int id, String nom) {
        setId(id);
        setNom(nom);

    }
    @Urls("emp-all")
    public void hello(){
        System.out.println("hello");
    }
}