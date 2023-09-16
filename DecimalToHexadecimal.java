 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToHexadecimal {
	public String toHex(int num) {
		String s = "";
		char ch = 0;
		long num1 = 0;
		if (num < 0) {
			num1 = 4294967296l + num;
		}
		else {
			num1 = num;
		}
		if (num1 > 0) {
			while (num1 > 0) {
				long mod = num1 % 16;
				if (mod > 9) {
					if (mod == 10) {
						ch = 'A';
					} else if (mod == 11) {
						ch = 'B';
					} else if (mod == 12) {
						ch = 'C';
					} else if (mod == 13) {
						ch = 'D';
					} else if (mod == 14) {
						ch = 'E';
					} else if (mod == 15) {
						ch = 'F';
					} else if (mod == 16) {
						ch = 'G';
					}
				} else {
					ch = (char) ('0' + mod);
				}
				num1 = num1 / 16;
				s = ch + s;
			}
		}
		return s;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalToHexadecimal dth = new DecimalToHexadecimal();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		System.out.println(dth.toHex(num));

	}
}

