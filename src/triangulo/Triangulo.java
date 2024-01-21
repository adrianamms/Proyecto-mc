/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author salda
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int M = 5; // Puedes cambiar el valor de M según tus necesidades

        // Triángulo a)
        System.out.println("Triángulo a):");
        TrianguloA trianguloA = new TrianguloA(M);
        trianguloA.imprimir();
        
        System.out.println("Triángulo B):");
        TrianguloB trianguloB = new TrianguloB(M);
        trianguloB.imprimir();

       
    }
    
}



class TrianguloA {
    private int M;

    public TrianguloA(int M) {
        this.M = M;
    }

    public void imprimir() {
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




class TrianguloB {
    private int M;

    public TrianguloB(int M) {
        this.M = M;
    }

    public void imprimir() {
        for (int i = M; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
             System.out.print("* ");
            }
            System.out.println();
        }
    }
}

    
