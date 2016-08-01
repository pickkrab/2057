import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if (b == 1) {
                int o = scanner.nextInt();
                if (!(m.containsKey(o))) {
                    m.put(o, 1);
                }
                else {
                    for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                        if (entry.getKey() == o) {
                            m.put(o, entry.getValue() + 1);
                            break;
                        }
                    }
                }
            }

            if (b == 2) {

                Iterator<Map.Entry<Integer, Integer>> iterator1 = m.entrySet().iterator();
                Map.Entry<Integer, Integer> pair2 = iterator1.next();
                if (pair2.getValue() == 1) {
                    System.out.println(pair2.getKey());
                    iterator1.remove();
                }
                else {
                    System.out.println(pair2.getKey());
                    m.put(pair2.getKey(), pair2.getValue() - 1);
                }
            }
        }
    }
}
