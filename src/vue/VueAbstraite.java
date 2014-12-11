package vue;

import controleur.CtrlAbstrait;
import javax.swing.JFrame;


public abstract class VueAbstraite extends JFrame{
//association
    protected CtrlAbstrait controleur=null;
    
    public VueAbstraite(CtrlAbstrait ctrl) {
        this.controleur = ctrl;
    }       
    
}