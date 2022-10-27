import java.awt.List;
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
//        First level: Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
//        Вывести их на экран через пробел. Закрыть поток ввода-вывода.

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String name = bufferedReader.readLine();
            byte[] bytes = name.getBytes();
            HashMap<Byte, Integer> hashMap = new HashMap<>();
            int val = 1;

            for (byte aByte : bytes) {
                if (!hashMap.containsKey(aByte))
                    hashMap.put(aByte, val);
                else hashMap.put(aByte, val++);
            }
            System.out.println(hashMap);

        } catch (IOException e) { e.getStackTrace(); }
    }
}
