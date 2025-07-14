
package pkgswitch.but.as.calculator;

import java.util.Scanner;
public class SWITCHBUTASCALCULATOR {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        double y;
        boolean valid = true;
        System.out.print("Enter the first number: ");
         x = s.nextDouble();
         System.out.print("Enter the second number: ");
         y = s.nextDouble();
         System.out.print("Enter operator (+, -, *, /): ");
         
         char op = s.next().charAt(0);
         double result = 0;
         switch (op){
             case '+':
                 result = x+y;
                 break; 
             case '-':
                 result = x-y;
                 break;
             case '*':
                 result = x*y;
                 break;
                 case '/':
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid Operation");
                valid = false;
                
                 }
                        
              if (valid){
                      System.out.println("Result: " + x + " " + op + " " + y + " = " + result);    
                    
                 
         }
         
         
        
        
        
        
    }
    
}
