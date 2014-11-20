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
public class reservierung {
    byte ResNr,znr;
    java.util.Date bisDatum, vonDatum;
    int kdnr;
    
    public reservierung(){
        /* todo */
    }
    
    public reservierung(int kdn, java.util.Date vD, java.util.Date bD, byte zn){
        kdnr = kdn;
        vonDatum = vD;
        bisDatum = bD;
        znr = zn;
    }
}
