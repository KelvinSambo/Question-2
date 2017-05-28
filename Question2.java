/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.Scanner;
/**
 *
 * @author Kelvin
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int stat;
       
       boolean isPrime=true;
        System.out.println("Enter a number");
        Scanner w = new Scanner(System.in);
        int num = w.nextInt();
    for(int i=2;i<=num/2;i++){
        stat=num%i;
    if(stat==0)
    {
        isPrime=false;
        break;
    }}
    if(isPrime){System.out.println(num + "is prime number");}
    else{System.out.println(num + "is not prime number");
    }
    }
    
}
