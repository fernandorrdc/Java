/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorunario;

/**
 *
 * @author ferna
 */
public class OperadorUnario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int n1= 11;
        n++;
        n1--;
        System.out.println("(5 ++ ) dá :" + n);
        System.out.println("(11 --) dá :"+ n1);
        
        int nu = 5;
        int v = 5 + nu --;
        System.out.println(v);
        System.out.println(nu);
        
        int num = 5;
        int va = 5 + --num ;
        System.out.println(va);
        System.out.println(num);
        
        float x = 5.9f;
        int ar = (int)Math.ceil(x);
        System.out.println(ar);
        
        double ale = Math.random();
        int y = (int)(1 + ale *(10-1));
        System.out.println(n);   
        
        
    }
    
}
