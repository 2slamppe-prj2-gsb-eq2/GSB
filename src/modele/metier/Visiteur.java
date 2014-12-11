/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.*;

/**
 *
 * @author btssio
 */
public class Visiteur {

    private String matricule;
    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;
    private Date dateEmbauche;
    private Secteur leSecteur;
    private Labo leLabo;

    public Visiteur(String matricule, String nom, String prenom, String adresse, String cp, String ville, Date dateEmbauche, Secteur leSecteur, Labo leLabo) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.dateEmbauche = dateEmbauche;
        this.leSecteur = leSecteur;
        this.leLabo = leLabo;
    }

    public Visiteur() {
        super();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Secteur getLeSecteur() {
        return leSecteur;
    }

    public void setLeSecteur(Secteur leSecteur) {
        this.leSecteur = leSecteur;
    }

    public Labo getLeLabo() {
        return leLabo;
    }

    public void setLeLabo(Labo leLabo) {
        this.leLabo = leLabo;
    }

    @Override
    public String toString() {
        return "Visiteur{" + "matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", cp=" + cp + ", ville=" + ville + ", dateEmbauche=" + dateEmbauche + ", leSecteur=" + leSecteur + ", leLabo=" + leLabo + '}';
    }

}
