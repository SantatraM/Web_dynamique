package modele;

import etu1787.framework.annotation.Urls;
import etu1787.framework.*;
import java.util.*;
import java.sql.Date;


public class Emp {
    int id;
    String nom;
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

    @Urls("emp-list")
    public ModelView List(){
        ModelView mv = new ModelView();
        mv.setView("emp-list.jsp");
        List<Emp> listEmp = new ArrayList<>();
        Emp a = new Emp(1,"Santatra");
        Emp b = new Emp(2,"Fifa");
        listEmp.add(a);
        listEmp.add(b);
        mv.addItem("lst",listEmp);
        return mv;
    }

    @Urls("emp_add")
    public ModelView Add() {
        ModelView mv = new ModelView();
        mv.setView("emp-add.jsp");
        return mv;
    }

    @Urls("save_emp")
    public ModelView save(){
        ModelView mv = new ModelView();
        System.out.println(" id :  "+getId()); 
        System.out.println(" nom :  "+getNom()); 
        mv.setView("save.jsp");
        mv.addItem("employe", this);
        return mv;
    }
    
    //  public ModelView2 save(){
    //     ModelView2 view = new ModelView2( "save.jsp" );
    //     System.out.println(" nom :  "+getNom()); 
    //     System.out.println(" fichier : "+getFichier().toString());
    //     // System.out.println(" prenom :  "+getPrenom()); 
    //     // System.out.println(" data :  "+getData().toString()); 
    //     System.out.println(" check : "+Arrays.toString( check  ));
    //     view.addItem("fichier",  getFichier().getName() );
    //     try{
    //         saveByte( getFichier().getName() , getFichier().getBytes() );
    //     }catch( Exception e ){
    //         e.printStackTrace();
    //     }
    //     view.addItem("nom",  getNom() );
    //     return view;
    // }
}