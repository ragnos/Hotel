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
        //Zimmer:
        zimmer[][] zarray = new zimmer[2][10];
        zarray[0][0] = new zimmer(1,1);
        zarray[0][1] = new zimmer(1,2);
        zarray[0][2] = new zimmer(1,3);
        zarray[0][3] = new zimmer(1,4);
        zarray[0][4] = new zimmer(1,5);
        zarray[0][5] = new zimmer(1,6);
        zarray[0][6] = new zimmer(1,7);
        zarray[0][7] = new zimmer(1,8);
        zarray[0][8] = new zimmer(1,9);
        zarray[0][9] = new zimmer(1,10);
        zarray[1][0] = new zimmer(2,11);
        zarray[1][1] = new zimmer(2,12);
        zarray[1][2] = new zimmer(2,13);
        zarray[1][3] = new zimmer(2,14);
        zarray[1][4] = new zimmer(2,15);
        zarray[1][5] = new zimmer(2,16);
        zarray[1][6] = new zimmer(2,17);
        zarray[1][7] = new zimmer(2,18);
        zarray[1][8] = new zimmer(2,19);
        zarray[1][9] = new zimmer(2,20);
        
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
