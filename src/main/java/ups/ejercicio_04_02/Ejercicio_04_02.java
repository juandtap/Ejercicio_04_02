/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.ejercicio_04_02;
import ups.ejercicio_04_02.Service.DataManager;
import ups.ejercicio_04_02.View.VentanaPrincipal;
/**
 *
 * @author Diego
 */
public class Ejercicio_04_02 {

    public static void main(String[] args) {
        System.out.println("Ruta del proyecto: "+DataManager.getProjectPath());
        System.out.println("Ruta para guardar los objetos : "+DataManager.getPackagePath());
        var ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
    }
}
