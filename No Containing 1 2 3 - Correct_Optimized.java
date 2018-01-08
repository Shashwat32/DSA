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
			int length = Integer.parseInt(br.readLine());
			String in[] = br.readLine().split(" ");
			List<Integer> output = new ArrayList<Integer>();
			for (int j = 0; j < length; j++) {
				if (in[j].matches("[1-3]+")) {
					output.add(Integer.parseInt(in[j]));
				}
			}
			if (output.size() == 0) {
				System.out.println("-1");
			} else {
				Collections.sort(output);
				StringBuilder sb = new StringBuilder();
                for(int k=0;k<output.size();k++){
                    sb.append(output.get(k) + " ");
                }
				System.out.println(sb);
			}

		}
	}
}
