package basic.concept;

import java.util.Scanner;
//Import the Scanner class to use the Scanner object, as seen here:

public class BasicConcept
{
    public static void main(String[] args)
    {
        //single line comment
        /*
        multi line comment
        */
        /** This is a documentation comment*/
        /**
        This is also a documentation comment
        */
        
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());  
        /*
        You can now read in different kinds of input data that the user enters. 
        Here are some methods that are available through the Scanner class:
            Read a byte - nextByte()
            Read a short - nextShort()
            Read an int - nextInt()
            Read a long - nextLong()
            Read a float - nextFloat()
            Read a double - nextDouble()
            Read a boolean - nextBoolean()
            Read a complete line - nextLine()
            Read a word - next()
        */
        StringBuilder w = new StringBuilder("");
        String s="Issam ",s2="Abdoh";
        System.out.println(s+s2);
        System.out.println("Enetr a number :");//sout and tab
        int f = myVar.nextInt();
        System.out.println("Number = " + f);
        
        double n1,n2;
        System.out.println("Enter two real number to show the result of multiplication of them :");
        n1=myVar.nextDouble();
        n2=myVar.nextDouble();
        System.out.println(n1 + " * " + n2 + " = " + n1*n2);
        System.out.printf("%f * %f = %.3f\n", n1,n2,n1*n2);
        /**
            %c	character
            %d	decimal (integer) number (base 10)
            %e	exponential floating-point number
            %f	floating-point number
            %i	integer (base 10)
            %o	octal number (base 8)
            %s	a string of characters //when s is used it turns all letters into lower case , but when S is used all letters will become upper case in printing
            %u	unsigned decimal (integer) number
            %x	number in hexadecimal (base 16)
            %%	print a percent sign
            \%	print a percent sign
        */
        System.out.println("Enter one character only :\n");
        char c ;
        c = myVar.next().charAt(0);//Will take only one character in input
        System.out.printf("The letter is %c\n" ,c);
    }    
}