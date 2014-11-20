/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import org.joda.time.*;

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
    
    public kunde(String n, String adr){
        name = n;
        adresse = adr;
    }
    
    public boolean anfrageZimmerFrei(DateTime vd, DateTime bd, byte cb){
        anfrage a = new anfrage(vd,bd,cb);
        /* TODO: Wir müssen hier mit allen bereits vorhandenen Reservierungen
        vergleichen, um Doppelbelegungen auszuschließen.
        
        Prüfen ob überhaupt reservierungen vorliegen? Wenn nein return true
        
        Siehe hierzu checkdate_obj(), allerdings wird da JodaTime benutzt.
        http://www.joda.org/joda-time/
        */
        //return checklist_obj(a,r);
        return true;
    }
    
    public boolean anfrageReservieren(){
        /*todo*/
        return true;
    }
    
    public boolean anfrageStorno(){
        /* todo */
        return true;
    }
    
    public boolean checkdate_obj(anfrage a, reservierung r){
        if (a.vonDatum.isBefore(r.vonDatum)){
            if (r.vonDatum.isBefore(a.bisDatum)) return false; // Startdatum liegt innerhalb einer Reservierung
            else return true; // Startdatum liegt hinter der Reservierung.
        }
        else{
            if(a.vonDatum.isBefore(r.bisDatum)) return false; //Enddatum der Reservierung liegt innerhalb unseres Anfragezeitraums
            else return true;
        }
    }
    
    public boolean checkdate_dates(DateTime vd_a, DateTime bd_a, DateTime vd_b, DateTime bd_b){
        if (vd_a.compareTo(vd_b) <= 0){
            if (vd_b.compareTo(bd_a) <= 0) return false; // Startdatum liegt innerhalb einer Reservierung
            else return true; // Startdatum liegt hinter der Reservierung.
        }
        else{
            if(vd_a.compareTo(bd_b) <= 0) return false; //Enddatum der Reservierung liegt innerhalb unseres Anfragezeitraums
            else return true;
        }
    }
}
