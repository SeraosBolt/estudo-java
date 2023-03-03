/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.estudojava;
import helloword.HelloWorld;
import helloword.ControleFluxo;

/**
 *
 * @author Diego
 */
public class EstudoJava {
        
    //variaveis dentro de classes
    private static final float PI = 3.1416f;
    public int numeroClasse = 1;
    private String nomeClasse ="Nome classe";
    protected final double finalNumber = 2.5436;
    public static void main(String[] args) {
        //variaveis no Java
        int numero = 20;
        double decimal = 2.5;
        String nome = "Matheus";
        
        
       HelloWorld helloWorld = new HelloWorld(); 
       helloWorld.sayHello();
       ControleFluxo controleFluxo = new ControleFluxo();
       controleFluxo.main();
    }
}
