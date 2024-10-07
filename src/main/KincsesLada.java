package main;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.FelugroNezet;
import nezet.GuiNezet;
import nezet.KonzolNezet;
import vezerlo.CuiVezerlo;
import vezerlo.GuiVezerlo;

public class KincsesLada {

    public static void main(String[] args) {
        /* Nem MVC */
        //new JatekModell();
        
        /* MVC */
        JatekModell modell = new JatekModell();
        /* konzol */
        //KonzolNezet nezet = new KonzolNezet();
        //new KonzolVezerlo(modell, nezet);
        
        /* felugro */
        //FelugroNezet nezet = new FelugroNezet();
        //new FelugroVezerlo(modell, nezet);
        
        /* közös őssel */
//        CuiNezet nezet;
//        
//        nezet = new KonzolNezet();
//        new CuiVezerlo(modell, nezet);
//                
//        
//        nezet = new FelugroNezet();
//        new CuiVezerlo(modell, nezet);
//        
        //GUI
        GuiNezet nezet = new GuiNezet();
        new GuiVezerlo(modell, nezet);
    }
    
}
