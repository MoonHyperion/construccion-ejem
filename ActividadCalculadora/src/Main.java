/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivanj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 5;
        double n=10;

        //suma
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();

        //resta
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();
 
        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();

        //division
        Division div = new Division(n1,n2);
        div.mostrarResultado();
    }
    
}
