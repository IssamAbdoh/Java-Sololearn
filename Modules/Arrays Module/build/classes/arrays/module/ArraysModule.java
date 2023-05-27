/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.module;

/**

 @author GTS
 */
public class ArraysModule
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int[] a = new int[5];
        
        //If you already know what values to insert into the array, you can use an array literal. 
        String[] s = {"a","b","c","d"};
        
        int sa[]={1,2,3,4,5,6};
                
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        
        for(int i=0;i<sa.length;i++)
        {
            System.out.println(sa[i]);            
        }
        
        int[] primes = {2, 3, 5, 7};
        //Enhanced For Loop
        /*
        The advantages are that it eliminates the possibility of bugs and makes the code easier to read.
        The enhanced for loop declares a variable of a type compatible with the elements of the array being accessed. The variable will be available within the for block, and its value will be the same as the current array element.
        So, on each iteration of the loop, the variable t will be equal to the corresponding element in the array.
        Notice the colon after the variable in the syntax.
        */
        for (int t: primes) 
        {
            System.out.println(t); 
        }
        
        int[ ][ ] myArr = { {1, 2, 3} ,
                            {4} , 
                            {5, 6, 7} };
        
        {
            int[]koko[]=new int[1][2];
            
            int[][]koko2=new int[2][1];
            
            int koko3[][] =new int [5][6];
            
            int [][]arr = new int[3][];
            arr[0]= new int [5];
            arr[1]= new int [4];
            arr[2]= new int [6];
            
            int arro[][]=new int[][]{ {1, 2, 3}, {4}, {5, 6, 7} };
        
            int [][]arr2 =
            {
                {
                    1,2,3
                },
                {
                    4,5,6
                },
            };
            
            print(arr2);
        }
        //Error
        //System.out.print(myArr[1][1] + " Look over HERE !\n");
        //The second array has only one element in it
        
        for (int[] t: myArr) 
        {
            System.out.println(t); //prints the address of the arrays
        }

        for (int t: myArr[1]) 
        {
            System.out.println(t); //prints the elements in the second arrrays
        }
        
        for(int []r:myArr)
        {
            for(int c:r)
            {
                System.out.print(c);
            }
            System.out.println("");
        }

        {
            int b[]={123,456,789};
            print(b,new int[]{1,2,3});
            
            print(new int[]{1,2,3},b);//
            
            //new int[]{1,2,3}; anonymous ARRAY
            
            int x[]=getArray();
            
            print(x,b);
        }
    }
    
    static void print(int a[],int[] b)//
    {
        for(int y:a)
        {
            System.out.println(y);
        }
    }
    
    static int[] getArray()
    {
        return new int[]{1,2,3};// anonymous ARRAY
    }
    
    static void print(int a[][])
    {
        for(int []r:a)
        {
            for(int c:r)
            {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
    
    static int[][] get2dArray()
    {
        int ar[][]=new int[2][3];
        return ar;
    }
}
