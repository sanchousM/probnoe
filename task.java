import java.util.*;

public class task {
    List <Integer>list = new ArrayList<>();
    final int Size = 1000000;
    final int time = 2000;
    long startTime_add = System.currentTimeMillis();
    for(int i=0; i< time; i++) {
        list.add((random.nextInt() * 1000*1000) +1000*1000);
    }
    long endTime_add = System.currentTimeMillis();
    System.out.println("Code is run:" + (endTime_add - startTime_add) + "ms");
    long startTime_get = System.currentTimeMillis();
    for(int i=0; i< time; i++) {
        list.get(random.nextInt(Size-1));
    }
    long endTime_get = System.currentTimeMillis();
    System.out.println("Code is run:" + (endTime_get - startTime_get) + "ms");


}
