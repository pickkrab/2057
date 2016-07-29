import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if (b == 1) {
                int o = scanner.nextInt();
                if (m.containsKey(o)) {
                    for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                        if (entry.getKey() == o) {
                            m.put(o, entry.getValue() + 1);
                        }
                    }
                }
                if (!(m.containsKey(o))) {
                    m.put(o, 1);
                }
            }

            if (b == 2) {

                int k = Integer.MAX_VALUE;
                for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                    if (k > entry.getKey()) {
                        k = entry.getKey();
                    }
                }
                Iterator<Map.Entry<Integer, Integer>> iterator = m.entrySet().iterator();
                while(iterator.hasNext()) {
                    Map.Entry<Integer, Integer> pair = iterator.next();
                    if ((k == pair.getKey()) & (pair.getValue() == 1)) {
                        System.out.println(pair.getKey());
                        iterator.remove();
                    }
                    if ((k == pair.getKey()) & (pair.getValue() != 1)) {
                        System.out.println(pair.getKey());
                        m.put(k, pair.getValue() - 1);
                    }

                }
            }
            if (b != 1 && b!= 2) {
                break;
            }
        }
    }
}
