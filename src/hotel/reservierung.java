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
public class reservierung {
    int kdnr,ResNr,znr;
    LocalDate bisDatum, vonDatum;
        
    public reservierung(){
        /* todo */
    }
    
    public reservierung(int kdn, LocalDate vd, LocalDate bd, int zn){
        kdnr = kdn;
        vonDatum = vd;
        bisDatum = bd;
        znr = zn;
        //ResNr = 
    }
}
