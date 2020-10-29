import java.util.*;
public class task{
public static final Random random = new Random();
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    final int Size = 1000000;
    final int time = 2000;
    long startTime_add = System.currentTimeMillis();
    for (int i = 0; i < time; i++) {
        list.add((random.nextInt() * 1000 * 1000) + 1000 * 1000);
    }
    long endTime_add = System.currentTimeMillis();
    System.out.println("Code with add is run:" + (endTime_add - startTime_add) + "ms");

    long startTime_get = System.currentTimeMillis();
    for (int i = 0; i < time; i++) {
        list.get(random.nextInt(Size - 1));
    }
    long endTime_get = System.currentTimeMillis();
    System.out.println("Code with get is run:" + (endTime_get - startTime_get) + "ms");

    long startTime_remove = System.currentTimeMillis();//по значению
    for (int i = 0; i < time; i++) {
        list.remove((random.nextInt() * 1000 * 1000) + 1000 * 1000);
    }
    long endTime_remove = System.currentTimeMillis();
    System.out.println("Code with remove is run:" + (endTime_remove - startTime_remove) + "ms");

    long startTime_removeIn = System.currentTimeMillis();//по индексу?
    for (int i = 0; i < time; i++) {
        list.remove(0+(int)(Math.random()*(time-1)));
    }
    long endTime_removeIn = System.currentTimeMillis();
    System.out.println("Code with remove is run:" + (endTime_removeIn - startTime_removeIn) + "ms");
}
}
