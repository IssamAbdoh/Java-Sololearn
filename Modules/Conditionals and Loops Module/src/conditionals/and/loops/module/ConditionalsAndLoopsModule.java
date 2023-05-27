/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals.and.loops.module;

import java.util.Scanner;

/**

 @author GTS
 */
public class ConditionalsAndLoopsModule
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        int x = 1;
        int y = x==1? 2 : 3;
        System.out.println("y = "+y);
        
        String s = "KOKO";
        System.out.println(s instanceof String);// = is r an object of String ?
        
        Scanner in = new Scanner(System.in);
        System.out.println(in instanceof Scanner);// = is in an object of Scanner ?
        
        test:
        {
            int z=11;
            System.out.println("Enter the value of z :\n");
            z=in.nextInt();
            if(z>=0)
            {
                break test;
            }
            System.out.println("Hello from the BOTTOM OF THE OCIEN !");
        }
        
        aLabelu:
        {
            for(int i=1;i<=10;i++)
            {
                for(int j=1;j<=10;j++)
                {
                    if(i==5)
                    {
                        break aLabelu;
                    }
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
        
        aLabelu2:
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                if(i==5)
                {
                    break aLabelu2;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        nextu:
        for(int i=1;i<=5;i++)
        {
            System.out.println("");
            for(int j=1;j<=10;j++)
            {
                if(j>i)
                {
                    continue nextu;
                }
                System.out.print("* ");
            }
            System.out.println("lolo");
        }
        
        System.out.println("");

    } 
}
