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
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<reservierung> ResList = new ArrayList<>();
        Iterator it = ResList.iterator();
        
        //Demodaten: Kunden:
        kunde kunde_a = new kunde(1,"Andreas A.","Auf der Flucht 1");
        kunde kunde_b = new kunde(2,"Berta B.","Bauerngasse 2");
        kunde kunde_c = new kunde(3,"Christopher C.","Clausberger Allee 3");

        //Demodaten: Reservierungen
        ResList.add(new reservierung(1,LocalDate.of(2015, Month.JANUARY, 1),LocalDate.of(2015, Month.JANUARY, 15),1));
        ResList.add(new reservierung(2,LocalDate.of(2015, Month.JANUARY, 16),LocalDate.of(2015, Month.FEBRUARY, 1),1));
        ResList.add(new reservierung(3,LocalDate.of(2015, Month.JANUARY, 1),LocalDate.of(2015, Month.FEBRUARY, 2),2));
        
        anfrage a1 = new anfrage(LocalDate.of(2015,Month.FEBRUARY,1), LocalDate.of(2015,Month.FEBRUARY,15), 1);
        
        /*Das hier ist noch "suboptimal"... Man müsste durchgängig vorgenerierte
        anfrage-Objekte verwenden, sonst wären sie überflüssig. Ich lass erstmal
        beides drin... */
        if(kunde_a.anfrageZimmerFrei(LocalDate.of(2015,Month.FEBRUARY,1), LocalDate.of(2015,Month.FEBRUARY,15), 1, ResList))
            kunde_a.anfrageReservieren(a1,ResList);
        }
}
