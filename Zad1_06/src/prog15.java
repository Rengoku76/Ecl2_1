public class prog15{ 
 public static void main(String[] args)  { 
        int y=0, x, tempNumber; 
        int qurentNumber=371;
        tempNumber = qurentNumber; 
        while(qurentNumber >0) 
        { 
        x= qurentNumber %10; 
        qurentNumber = qurentNumber /10; 
         y=y+(x*x*x); 
        } 
        if(tempNumber ==y) 
        System.out.println("Данное число является числом Армстронга");  
        else 
               System.out.println("Данное число не является числом Армстронга");  
   } 
}