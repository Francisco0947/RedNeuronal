/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redneuronaland;

import javax.swing.JOptionPane;

/**
 *
 * @author FRK
 */
public class RedNeuronalAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null,"Ingresa el peso W1 , el W2, el umbral y alpha", JOptionPane.WARNING_MESSAGE);
        String [] array = aux.split(",");
        double w1 = Double.parseDouble(array[0]);
        double w2 = Double.parseDouble(array[1]);
        double umbral = Double.parseDouble(array[2]);
        double alpha = Double.parseDouble(array[3]);
        
        Neurona neuro = new Neurona(w1,w2,umbral, alpha);
        Tabla tabla = new Tabla();
  
        int epoca = 0;
        double [] results = new double [12];

        
       for(int i=0;i<2;i++)
        {
            neuro.epoca(0, 0, 0);
            results[0] = neuro.getW1();
            results[1] = neuro.getW2();
            results[2] = neuro.getUmbral();
            results[3] = 0;
            results[4] = 0;
            results[5] = neuro.getA();
            results[6] = neuro.getY();
            results[7] = neuro.getTarget();
            results[8] = neuro.getAlphaTY();
            results[9] = neuro.getIncrementoW1();
            results[10] = neuro.getIncrementoW2();
            results[11] = neuro.getIncrementoUmbral();
            tabla.fillTable(results, epoca);
                        epoca++;
            neuro.epoca(0, 1, 0);
            results[0] = neuro.getW1();
            results[1] = neuro.getW2();
            results[2] = neuro.getUmbral();
            results[3] = 0;
            results[4] = 1;
            results[5] = neuro.getA();
            results[6] = neuro.getY();
            results[7] = neuro.getTarget();
            results[8] = neuro.getAlphaTY();
            results[9] = neuro.getIncrementoW1();
            results[10] = neuro.getIncrementoW2();
            results[11] = neuro.getIncrementoUmbral();
            tabla.fillTable(results, epoca);
                        epoca++;
            neuro.epoca(1, 0, 0);
            results[0] = neuro.getW1();
            results[1] = neuro.getW2();
            results[2] = neuro.getUmbral();
            results[3] = 1;
            results[4] = 0;
            results[5] = neuro.getA();
            results[6] = neuro.getY();
            results[7] = neuro.getTarget();
            results[8] = neuro.getAlphaTY();
            results[9] = neuro.getIncrementoW1();
            results[10] = neuro.getIncrementoW2();
            results[11] = neuro.getIncrementoUmbral();
            tabla.fillTable(results, epoca);
                        epoca++;
            neuro.epoca(1, 1, 1);
            results[0] = neuro.getW1();
            results[1] = neuro.getW2();
            results[2] = neuro.getUmbral();
            results[3] = 1;
            results[4] = 1;
            results[5] = neuro.getA();
            results[6] = neuro.getY();
            results[7] = neuro.getTarget();
            results[8] = neuro.getAlphaTY();
            results[9] = neuro.getIncrementoW1();
            results[10] = neuro.getIncrementoW2();
            results[11] = neuro.getIncrementoUmbral();
            tabla.fillTable(results, epoca);
                        epoca++;
        }
        tabla.setVisible(true);
    }
}
