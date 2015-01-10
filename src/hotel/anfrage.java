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
public class anfrage {
    
    LocalDate vonDatum;
    LocalDate bisDatum;
    int cBetten;
    
    public anfrage(){
        /* todo */
    }
    
    /**
     *
     * @param vd
     * @param bd
     * @param cb
     */
    public anfrage(LocalDate  vd, LocalDate bd, int cb){
        vonDatum = vd;
        bisDatum = bd;
        cBetten = cb;
    }
}