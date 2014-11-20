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
public class anfrage {
    
    DateTime vonDatum;
    DateTime bisDatum;
    byte cBetten;
    
    public anfrage(){
        /* todo */
    }
    
    public anfrage(DateTime  vd, DateTime bd, byte cb){
        vonDatum = vd;
        bisDatum = bd;
        cBetten = cb;
    }
}