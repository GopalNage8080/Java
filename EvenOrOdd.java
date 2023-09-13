//Check A number is even or odd without using a % sign
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.DataFormatException;

public class EvenOrOdd {
	public static void main(String[] args) throws DataFormatException, IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          int num = Integer.parseInt(br.readLine());
          
          String newNum = Integer.toBinaryString(num);
          String ch = "1";
          boolean end = newNum.endsWith(ch);
          
          if(end==true) {
        	  System.out.println("odd");
          }
          else {
        	  System.out.println("Even");
          }
	}
}
