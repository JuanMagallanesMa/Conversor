/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package divisas.divisas;
import Controlador.controladorPrincipal;
import Vista.Paginaprincipal;

/**
 *
 * @author luis magallanes
 */
public class Divisas {

    public static void main(String[] args) {
        Paginaprincipal princ = new Paginaprincipal();
        
        controladorPrincipal crtl = new controladorPrincipal(princ);

        crtl.IniciarPrincipal();
        princ.setVisible(true);
       
    }
}
