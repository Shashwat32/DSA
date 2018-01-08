import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		// code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			String input = br.readLine();
			StringBuffer output = new StringBuffer();
			int k;
			int cur_max = 0;
			int last_ent = 0;
			for (int j = 0; j < input.length(); j++) {
				int noND = 0;
				switch (input.charAt(j)) {
				case 'I':
					k = j + 1;
					while (k < input.length() && input.charAt(k) == 'D') {
						noND++;
						k++;
					}

					if (j == 0) {
						cur_max = noND + 2;
						output.append(Integer.toString(++last_ent) + Integer.toString(cur_max));
						last_ent = cur_max;
					} else {
						cur_max = cur_max + noND + 1;
						last_ent = cur_max;
						output.append(Integer.toString(last_ent));

					}
					while (noND != 0) {
						output.append(Integer.toString(--last_ent));
						noND--;
						j++;
					}
					break;
				case 'D':
					k = j + 1;
					while (k < input.length() && input.charAt(k) == 'D') {
						noND++;
						k++;
					}
					if (j == 0) {
						cur_max = noND + 2;

						output.append(Integer.toString(cur_max) + Integer.toString(cur_max - 1));
						last_ent = cur_max - 1;
					} else {

						output.append(Integer.toString(--last_ent));

					}
					break;
				}
			}
			System.out.println(output.toString());

		}
	}
}
