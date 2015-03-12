/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.Date;

/**
 *
 * @author btssio
 */
public class RapportVisite {

    private Visiteur visiteur;
    private int num;
    private Praticien praticien;
    private Date date;
    private String bilan;
    private String motif;

    public RapportVisite() {
    }

    public RapportVisite(Visiteur visiteur, int num, Praticien praticien, Date date, String bilan, String motif) {
        this.visiteur = visiteur;
        this.num = num;
        this.praticien = praticien;
        this.date = date;
        this.bilan = bilan;
        this.motif = motif;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Praticien getPraticien() {
        return praticien;
    }

    public void setPraticien(Praticien praticien) {
        this.praticien = praticien;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBilan() {
        return bilan;
    }

    public void setBilan(String bilan) {
        this.bilan = bilan;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return "RapportVisite{" + "visiteur=" + visiteur + ", num=" + num + ", praticien=" + praticien + ", date=" + date + ", bilan=" + bilan + ", motif=" + motif + '}';
    }

}
