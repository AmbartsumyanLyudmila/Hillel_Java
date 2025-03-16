package Task9;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //task1
        List<Integer> collectionNumbers = new ArrayList<>();
        collectionNumbers.add(3);
        collectionNumbers.add(14);
        collectionNumbers.add(15);
        collectionNumbers.add(92);
        collectionNumbers.add(6);
        System.out.println("Collection1 using ArrayList: " + collectionNumbers);

        //task2 example1
        List<String> identity = new ArrayList<>();
        identity.add("Liudmyla");
        identity.add("Ambartsumian");
        identity.add("Viktorovna");
        System.out.println("Collection2.1 using ArrayList: " + identity);

        //task2 example2
        List<String> personalInfo = List.of("Liudmyla", "Ambartsumian", "Viktorovna");
        System.out.println("Collection2.2 using List.of: " + personalInfo);

        //task3 example1
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        uniqueNumbers.add(0);
        uniqueNumbers.add(5);
        uniqueNumbers.add(1);
        uniqueNumbers.add(5);
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);
        uniqueNumbers.add(4);
        System.out.println("Collection3.1 using LinkedHashSet: " + uniqueNumbers);

        //task3 example2
        Set<Integer> uniqueNumbers2 = new TreeSet<>();
        uniqueNumbers2.add(0);
        uniqueNumbers2.add(5);
        uniqueNumbers2.add(1);
        uniqueNumbers2.add(5);
        uniqueNumbers2.add(1);
        uniqueNumbers2.add(2);
        uniqueNumbers2.add(3);
        uniqueNumbers2.add(4);
        System.out.println("Collection3.2 using TreeSet with auto order: " + uniqueNumbers2);

        //task4 example1
        Map<String, String> mapCode = new TreeMap<>();
        mapCode.put("Kharkiv", "+38057");
        mapCode.put("Kyiv", "+38044");
        mapCode.put("Odessa", "+38048");
        mapCode.put("Dnipro", "+38056");
        mapCode.put("Lviv", "+38032");
        mapCode.put("Zaporizhzhia", "+38061");
        mapCode.put("Vinnytsia", "+380432");
        mapCode.put("Poltava", "+380532");
        mapCode.put("Cherkasy", "+380472");
        mapCode.put("Chernihiv", "+380462");
        mapCode.put("Sumy", "+380542");
        mapCode.put("Ivano-Frankivsk", "+380342");
        mapCode.put("Kamen-Kashirskyi", "+3803342");
        System.out.println("Collection4.1 using TreeMap: " + mapCode);

        //task4 example2
        Map<String, String> mapCode2 = new HashMap<>();
        mapCode2.put("Kharkiv", "+38057");
        mapCode2.put("Kyiv", "+38044");
        mapCode2.put("Odessa", "+38048");
        mapCode2.put("Dnipro", "+38056");
        mapCode2.put("Lviv", "+38032");
        mapCode2.put("Zaporizhzhia", "+38061");
        mapCode2.put("Vinnytsia", "+380432");
        mapCode2.put("Poltava", "+380532");
        mapCode2.put("Cherkasy", "+380472");
        mapCode2.put("Chernihiv", "+380462");
        mapCode2.put("Sumy", "+380542");
        mapCode2.put("Ivano-Frankivsk", "+380342");
        mapCode2.put("Kamen-Kashirskyi", "+3803342");
        System.out.println("Collection4.2 using HashMap:");
        mapCode2.forEach((city, code) -> System.out.println(city + "=> (" + code + ")"));

    }

}
