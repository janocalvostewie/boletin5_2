package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Satelite {
    //ATRIBUTOS
    private double meridiano ;
    private double paralelo;
    private double distanciaTerra ;
    
    //CONSTRUCTORES
    public Satelite ( ) {
        meridiano = paralelo = distanciaTerra = 0 ;
    }

    public Satelite ( double m, double p , double d )  {
        meridiano = m ;
        paralelo = p;
        distanciaTerra = d ;
    }
    
    //GETTERS
    public double getMeridiano(){
        return meridiano;
    }
    public double getParalelo(){
        return paralelo;
    }
    public double getDistancia(){
        return distanciaTerra;
    }
    
    //MÉTODOS
    public void verPosicion ( ) {
        JOptionPane.showMessageDialog(null,"o satelite atopase  no paralelo "+ paralelo + ", meridiano " + meridiano+  ", a unha distancia da terra " + distanciaTerra );
    }
}
