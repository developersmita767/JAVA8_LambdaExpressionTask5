//Write a Java program to implement a lambda expression to convert the string into uppercase.

package Java8_Task;

import java.util.function.Function;
public class LambdaExpressionTask5 {
    public static void main(String[] args) {
        
        Function<String, String> toUpperCase =  (s) -> s.toUpperCase();

       
        String input = "hello, world!";
        String result = toUpperCase.apply(input);

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("Uppercase String: " + result);
    }
}




	
	


