import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public class pattern {
    public static void main(String[] args) {

                // print output O

        // int n = 5;
        // for(int i=0; i<n ; i++)
        // {
        //     for(int j=0 ; j<n ; j++ )
        //     {
        //         if(i==0 || j==0|| i==(n-1) || j==(n-1) )
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

                // print output A

        // int n = 5;
        // for (int i=0 ; i<n ; i++)
        // {
        //     for (int j=0 ; j<n ; j++)
        //     {
        //         if ( i==0 || j ==0 || i==(n-1)/2 || j==(n-1))
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }        

                // print output H

        // int n=5;
        // for(int i=0 ; i<n ; i++)
        // {
        //     for(int j=0 ; j<n ; j++)
        //     {
        //         if( i==(n-1)/2 || j==0 || j==(n-1))
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }        

                    // print output I

        // int a = 5;
        // for(int b=0 ; b<a ; b++)
        // {
        //     for (int c=0; c<a ; c++)
        //     {
        //         if ( b==0 || b==(a-1) || c==(a-1)/2)
        //         {
        //             System.out.print("*");
        //         }
        //         else 
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }            

                    // print output E
          
        // int a = 5; 
        // for(int d =0; d<a ; d++)
        // {
        //     for(int e =0 ; e<a ; e++)
        //     {
        //         if ( e==0 || d==0 || d==(a-1)/2 || d==(a-1) )
        //         {
        //             System.out.print("*");
        //         }
        //         else 
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }            

                    // print output F
        
        //  int a = 5; 
        // for(int d =0; d<a ; d++)
        // {
        //     for(int e =0 ; e<a ; e++)
        //     {
        //         if ( e==0 || d==0 || d==(a-1)/2 )
        //         {
        //             System.out.print("*");
        //         }
        //         else 
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }                       

                    // print output T

        //  int p = 5 ;
        //  for(int q =0; q<p ; q++)
        //  {
        //         for (int r = 0; r<p ; r++)
        //         {
        //                 if (q==0 || r==(p-1)/2)
        //                 {
        //                         System.out.print("*");
        //                 }
        //                 else
        //                 {
        //                         System.out.print(" ");
        //                 }
        //         }
        //         System.out.println();
        //  }

                //  no.9
         
        //  int n = 9;
        //  for (int i=0 ; i<n ; i++)
        //  {
        //         for(int j=0 ; j<n ; j++)
        //         {
        //                 if ( j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2)
        //                 {
        //                         System.out.print("*");
        //                 }
        //                 else
        //                 {
        //                         System.out.print(" ");
        //                 }
        //         }
        //         System.out.println();
        //  }       

                // complex pattern proggrmming
        
        int n = 21;
        for (int i =0 ; i<n ; i++)
        {
                for (int j=0 ; j<n ; j++)
                {
                        if ( i==0 || j==0 || i==(n-1) || j==(n-1) || i==j || i+j==(n-1) || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2 )
                        {
                                System.out.print(" * ");
                        }
                        else
                        {
                                System.out.print("   ");
                        }
                }
                System.out.println();
        }        
    }
    
}
