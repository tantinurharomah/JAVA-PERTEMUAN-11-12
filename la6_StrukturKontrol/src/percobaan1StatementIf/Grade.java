/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1StatementIf;

/**
 *
 * @author USER
 */
public class Grade {
    public static void main( String[] args ) 
 
    {  
 
        double grade = 92.0;  
 
 
 
        if( grade >= 90 )
 
               System.out.println( "Excellent!" );  
        

   
else if ( (grade < 90) && (grade >= 80 )){

System.out.println("good job!" );

 if ( (grade < 80 ) && (grade >= 60 )) 
 
 System.out.println("study harder!" );
else 
    System.out.println("sorry, you failed." );
}
} 
}
