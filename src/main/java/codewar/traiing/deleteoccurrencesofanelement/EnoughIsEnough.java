package codewar.traiing.deleteoccurrencesofanelement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronal
 */
public class EnoughIsEnough {
//EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int result[] = null;
        int count = 0;
        List<Integer> store = new ArrayList();

        //run the whole elements[] cycle
        for (int i = 0; elements.length > i; i++) {
            store.add(elements[i]);
            for (int j = 0; store.size() > j; j++) {
                if (elements[i] == store.get(j)) {
                    count++;

                }
            }
            if (count > maxOccurrences) {
                store.remove(store.size() - 1); //remove the last element
            }
            count = 0;
        }
        result = new int[store.size()];
        for (int i = 0; store.size() > i; i++) {
            result[i] = store.get(i);
            System.out.println(store.get(i));
        }
        return result;
    }
}
