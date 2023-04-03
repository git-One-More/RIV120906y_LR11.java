package lr11.RIV_120906y_LR11.ex6;

import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for(int i = 0; i<10; i++){
            map.put(i, getRandomString());
        }

        for (Integer key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        int multi = 0;
        System.out.println();
        System.out.println("Строки, ключ которых > 5:");
        for (Integer key: map.keySet()) {
            String value = map.get(key);
            if(key > 5) {
                System.out.println(key + ": " + value);
            }
            if(value.length() > 5) multi = (multi == 0 ? key : multi*key);
        }

        System.out.println("Перемножили ключи строк, длина которых > 5 и получили: " + multi);
    }

    public static String getRandomString(){
        StringBuilder ret = new StringBuilder();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int chars = random.nextInt(1, 10);

        for(int i=0; i<chars; i++){
            ret.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        return ret.toString();
    }
}
