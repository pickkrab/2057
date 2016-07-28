/**
 * Created by alexander on 28.07.16.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        int a1 = Integer.parseInt(c);

        List<Integer> list = new ArrayList<Integer>();
        for (int k = 0; k < a1; k++) {
            int a2 = Integer.parseInt(reader.readLine());
            if (a2 == 1) {
                list.add(0, Integer.parseInt(reader.readLine()));
                for (int a = 0; a < list.size() - 1; ++a) {
                    for (int b = a + 1; b < list.size(); b++) {
                        if ((list.get(b)).compareTo(list.get(a)) < 0) {
                            int temp = list.get(a);
                            list.set(a, list.get(b));
                            list.set(b, temp);
                        } else {
                            continue;
                        }
                    }
                }
            }

            if (a2 == 2) {
                int p = list.get(0);
                list.remove(0);
                System.out.println(p);
            }
        }

    }
}
