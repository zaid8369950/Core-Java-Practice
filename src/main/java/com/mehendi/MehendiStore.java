package com.mehendi;

import java.util.Scanner;

public class MehendiStore {
	int feed_rate;
    char con;
	String name,feedback,y;
	int  n,i,choice,p;
	int price[]=new  int[10];
	int digit[][]= new int[30][30];
	int quantity[]=new int[30];
	Scanner sc=new Scanner(System.in);
   void title()
 {
  int choice;
  System.out.println("\t\t\t\t   Welcome to Mehndi Store   \t\t\t\t");
	System.out.println("  \t\t\t   * * * * Menu of Designs * * * *    \t\t\t");
	System.out.println("  \t       1.Simple      Rs.100   \t  ");
	System.out.println("  \t       2.Arabic      Rs.300    \t  ");
	System.out.println("  \t       3.Turkey      Rs.350    \t  ");
	System.out.println("  \t       4.Dubai       Rs.450    \t  ");
	System.out.println("  \t       5.One Hand    Rs.200   \t  ");
	System.out.println("  \t       6.Two Hand    Rs.500    \t  ");
	System.out.println("      \n   ");
  
	System.out.println("Enter how many designs you want to apply? ");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
		{
		System.out.println("Enter the Mehendi Design you want to Select ");
		digit[i][i]=sc.nextInt();
		quantity[i]=sc.nextInt();
        }
        System.out.println(" \n");

        System.out.println(" \t\t\t\t   BILL   \t\t\t\t");
        System.out.println(" \n");
        System.out.println(" \t\t\t Mehendi Name  \t\t\t Quantity  \t\t\t Total Price");

         for(i=1;i<=n;i++)
         {
         	switch(digit[i][i])
         	{
         case 1:
        {
            price[i]=100*quantity[i];
            System.out.println("\t\t\t  Simple"+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
            break;
        }
        case 2:
        {
            price[i]=300*quantity[i];
            System.out.println("\t\t\t  Arabic"+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
            break;
        }
        case 3:
        {
        	
            price[i]=350*quantity[i];
            System.out.println("\t\t\t  Turkey"+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
            break;
        }
        case 4:
        {
            price[i]=450*quantity[i];
            System.out.println("\t\t\t Dubai "+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
            break;
        }
        case 5:
        {
            price[i]=200*quantity[i];
            System.out.println("\t\t\t  One Hand   "+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
            break;
        }
        case 6:
        {
            price[i]=500*quantity[i];
            System.out.println("\t\t\t Two  Hand   "+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
            break;
        }
       
        default:
        {
            System.out.println("\t\t\t Wrong Choice !!! \t\t\t");
             break;
        }
            
          }
         }
         
         System.out.println(" \t  CONTINUE? (Y/N)");
          char con=sc.next().charAt(0);

         if(con=='Y' || con=='y')
         {
         	title();
         }
         else
         {
         	System.out.println(" \n");
         	System.out.println(" \t\t\t  THANK YOU FOR VISITING - VISIT AGAIN \t\t\t ");

         }

   

        }

     }


