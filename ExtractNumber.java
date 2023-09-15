import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExtractNumber {
    String s;
    String ns;
    public int myAtoi(String s) {
         
    	  //String Tokenizer for create string tokens 
          StringTokenizer st = new StringTokenizer(s);
          
          while(st.hasMoreElements()){    //loop to check it has more elements
        	  
            ns = st.nextToken();       //give the token value to the variable
            if((ns.startsWith("0")) || (ns.startsWith("1")) || (ns.startsWith("2")) ||(ns.startsWith("3")) ||(ns.startsWith("4")) ||(ns.startsWith("5")) ||(ns.startsWith("6")) ||(ns.startsWith("7")) ||(ns.startsWith("8")) ||(ns.startsWith("9")) ||(ns.startsWith("-")) ){
                break;     //break if it starts with a any number 
            }
               else{
                 ns = "";
            } 
          }
          int num = Integer.parseInt(ns);    //convert string to integer 
          return num;          //it return the number
          
    }
    public static void main(String args[]) throws IOException{
    	ExtractNumber so = new ExtractNumber();    //object create
    	
    	//Buffered Reader and Input Stream for the read line entered from keyboard
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//only message
    	System.out.println("Warning Enter String Must Having A One Numeber If You Enter \n Two Numbers It will Only Print The Frist Number");
    	
    	//only message
    	System.out.println("Enter A String With Number : ");
    	
    	//Take input from the user
    	String enter = br.readLine();
    	
    	//Call The method called myAtoi and print the return value by method 
       System.out.println("Number : "+so.myAtoi(enter)); 
    }
}