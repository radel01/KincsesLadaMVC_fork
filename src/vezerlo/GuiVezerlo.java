/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.JatekModell;
import nezet.CuiNezet;
import nezet.GuiNezet;

/**
 *
 * @author roszkopf.a.lena
 */
public class GuiVezerlo {

    private JatekModell modell;
    private GuiNezet nezet;

    public GuiVezerlo(JatekModell modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        guiBeallitas();
        start();
        valasztas();
    }

    private void start() {
        nezet.megjelenit(modell.kezdes());
    }

    private void valasztas() {
        JButton gomb = nezet.getBtnValasztas();
        gomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v;
                v = nezet.bekeres();
                modell.setValasztas(v);
                String s = "Nincs láda kiválasztva!";
                s = v > -1 ? modell.ellenorzes() : s;
                nezet.visszajelzes(s);
            }
        });

//        modell.setValasztas(nezet.bekeres());
    }

    private void guiBeallitas() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nezet.setVisible(true);
            }
        });
    }

}
