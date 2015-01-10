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
    int cBetten;
    int znr;
        
    public zimmer(){
        /* todo*/
    }
    
    public zimmer(int nZnr, int nBetten){
        cBetten = nBetten;
        znr = nZnr;
    }
}
