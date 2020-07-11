
package provaq9;

/**
 *
 * @author yasmi
 */
public class ProvaQ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
         int ValoresPositivos, cont , x;

        cont = 1;
        ValoresPositivos = 0;


        while(cont <= 10){
            cont++;
            x = Integer.parseInt(JOptionPane.showInputDialog("Insira qualquer valor, por gentileza: "));

            if(x >=0){
                ValoresPositivos++;
            }

      }

        JOptionPane.showMessageDialog(null , "A totalidade de valores positivos inseridos foi de: "+ValoresPositivos);
    }

}
