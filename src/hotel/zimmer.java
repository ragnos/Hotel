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
public class zimmer {
    
    boolean avail = true;
    byte cBetten;
    byte znr;
        
    public zimmer(){
        /* todo*/
    }
    
    public zimmer(byte nZnr, byte nBetten){
        cBetten = nBetten;
        znr = nZnr;
    }
}
