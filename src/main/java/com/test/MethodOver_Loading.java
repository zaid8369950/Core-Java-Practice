package com.test;

public class MethodOver_Loading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int l=20;
      int w=8;
      float r=5.5f;
      
      int rectangle_area= area(20,8);
      
      float circle_area = area(r);
      
         System.out.println("Area of rectanle is"+ rectangle_area);
         System.out.println("Area of circle is"+   circle_area);
      
	}
  public static int area(int n1,int n2){
    	
	  int result=n1*n2;
	  
	  return result;
	  	   
    }
  public static float area(float n) {
	  
	  float result=3.14f*n*n;
	  
	  return result;
  }  	   
  }
  
  


