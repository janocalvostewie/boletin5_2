package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin5_2 {
    public static void main(String[] args) {
        Satelite primerSatelite= new Satelite();
        primerSatelite.verPosicion();
        
        Satelite segundoSatelite= new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Teclea el meridiano:")), Double.parseDouble(JOptionPane.showInputDialog("Teclea el paralelo:")),Double.parseDouble(JOptionPane.showInputDialog("Teclea la distancia:")));
        segundoSatelite.verPosicion();
    }
    
}
