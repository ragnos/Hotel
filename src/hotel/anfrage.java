/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Ragnos
 */
public class anfrage {
    java.util.Date  vonDatum, bisDatum;
    byte cBetten;
    
    public anfrage(){
        /* todo */
    }
    
    public anfrage(java.util.Date  vD, java.util.Date  bD, byte cB){
        vonDatum = vD;
        bisDatum = bD;
        cBetten = cB;
    }
}
