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
public class reservierung {
    byte ResNr,znr;
    DateTime bisDatum, vonDatum;
    int kdnr;
    
    public reservierung(){
        /* todo */
    }
    
    public reservierung(int kdn, DateTime vd, DateTime bd, byte zn){
        kdnr = kdn;
        vonDatum = vd;
        bisDatum = bd;
        znr = zn;
    }
}
