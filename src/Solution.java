import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(reader.readLine());
            if (b == 1) {
                int o = Integer.parseInt(reader.readLine());
                if (m.containsKey(o)) {
                    for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                        if (entry.getKey() == o) {
                            m.put(o, entry.getValue() + 1);
                        }
                    }
                } else {
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

        }
    }
}
