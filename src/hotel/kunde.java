/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.util.*;
import java.time.*;

/**
 *
 * @author Ragnos
 */
public class kunde {
    
    int kdnr;
    String name, adresse;
    
    public kunde(){
        /* todo */
    }
    
    public kunde(int kd, String n, String adr){
        kdnr = kd;
        name = n;
        adresse = adr;
    }
    
    public boolean anfrageZimmerFrei(LocalDate vd, LocalDate bd, int cb, List<reservierung> ResList){
        anfrage a = new anfrage(vd,bd,cb);
        Iterator<reservierung> it = ResList.iterator();
        boolean weiter = true;
        
        while(it.hasNext() && weiter){
            weiter = this.checkdate_obj(a, it.next());
        }
        if(weiter) { System.out.println("Buchung ist möglich!"); return true;}
        else { System.out.println("Buchung ist nicht möglich!"); return false;}
    }
    
    public boolean anfrageReservieren(anfrage a, List<reservierung> ResList){
        ResList.add(new reservierung(this.kdnr, a.vonDatum, a.bisDatum, a.cBetten));
        System.out.println("Buchung erfolgt!");
        System.out.print("KdNr: ");
        System.out.println(this.kdnr);
        System.out.print("Von: ");
        System.out.println(a.vonDatum);
        System.out.print("Bis: ");
        System.out.println(a.bisDatum);
        System.out.print("Bettenzahl: ");
        System.out.println(a.cBetten);
        return true;
    }
    
    public boolean anfrageStorno(List<reservierung> ResList){
        //Der Storno sollte mittels RechnungsNummer erfolgen, also Manuell.
        //In dieser Beispielaufgabe steht dem Kunden kein Interface zur einsicht
        //seiner bestehenden Reservierungen zur Verfügung, also steht kein Objekt
        //zum Übergeben bereit. (Pointer?)
        return true;
    }
    
    private boolean checkdate_obj(anfrage a, reservierung r){
        if (a.vonDatum.isBefore(r.vonDatum)){
            if (r.vonDatum.isBefore(a.bisDatum)) return false; // Startdatum liegt innerhalb einer Reservierung
            else return true; // Startdatum liegt hinter der Reservierung.
        }
        else{
            if(a.vonDatum.isBefore(r.bisDatum)) return false; //Enddatum der Reservierung liegt innerhalb unseres Anfragezeitraums
            else return true;
        }
    }
}