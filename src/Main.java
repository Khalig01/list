import java.util.*;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            List<Integer> nums = (List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            for (Integer num : nums) {
                if (num % 2 == 1) {
                    System.out.println(num);
                }
            }
        }
        System.out.println("Задача 2");
        List<Integer> nums = (List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer i : set) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        {
            System.out.println("Задача 3");
            List<String> words = Arrays.asList("bmw", "toyota", "bmw", "skyline", "ford", "toyota");
            Set<String> uniqueWords = new HashSet<>(words);
            for (String word : uniqueWords) {
                System.out.println(word);
            }
        }
        {
            System.out.println("Задача 4");
            List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
            Map<String,Integer> map= new  HashMap<>();
          for (String word :strings){
            var num= map.get(word);
            if(num == null){
                map.put(word, 1);
            }else {
                map.put(word,num+1);
            }
            }
          for(Map.Entry<String,Integer> pair : map.entrySet()){
              System.out.println(pair.getKey() + " = " + pair.getValue());

          }
        }
    }
}