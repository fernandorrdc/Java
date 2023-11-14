/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       
        System.out.print("Digite O nome do Funcionario");
        String nome = entrada.nextLine();
        
        System.out.print("Informe seu Salario");
        float sal = entrada.nextFloat();
        
        float valet = sal*6/100;
        float sb = sal - valet;
        
        System.out.printf("Sr(a)%s salario bruto é %.2f \n" ,nome,sb);
        
        
    }
    
}
