package main;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // creating resident objects using streams
        Resident[] r = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Resident("R" + i))
                .toArray(Resident[]::new);
        // creating hospital items using streams
        Hospital[] h = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new Hospital("H" + i))
                .toArray(Hospital[]::new);
        h[0].setCapacity(4);
        h[1].setCapacity(3);
        h[2].setCapacity(3);

        // creating a list of residents using an ArrayList implementation
        List<Resident> residentList = new ArrayList<>();
        // adding elements to the list
        residentList.addAll(Arrays.asList(r));
        //sorting the residents using a comparator
        residentList.sort(new Comparator<Resident>() {
            @Override
            public int compare(Resident o1, Resident o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        // creating a set of hospitals using TreeSet
        TreeSet<Hospital> hospitalSet = new TreeSet<>();
        hospitalSet.addAll(Arrays.asList(h));
        // creating a map of every resident's preferences
        Map<Resident, List<Hospital>> resPrefMap = new HashMap<>();
        resPrefMap.put(r[0], Arrays.asList(h[0], h[1], h[2]));
        resPrefMap.put(r[1], Arrays.asList(h[0], h[1], h[2]));
        resPrefMap.put(r[2], Arrays.asList(h[0], h[1]));
        resPrefMap.put(r[3], Arrays.asList(h[0], h[2]));
        // creating a map of every hospital's preferences
        Map<Hospital, List<Resident>> hosPrefMap = new HashMap<>();
        hosPrefMap.put(h[0], Arrays.asList(r[3], r[0], r[1], r[2]));
        hosPrefMap.put(h[1], Arrays.asList(r[0], r[2], r[1]));
        hosPrefMap.put(h[2], Arrays.asList(r[0], r[1], r[3]));

        System.out.println(resPrefMap);
        System.out.println(hosPrefMap);
        // printing the residents who accept H0 and H2
        residentList.stream()
                .filter(res -> resPrefMap.get(res).contains(h[0]) && resPrefMap.get(res).contains(h[2]))
                .forEach(System.out::println);
        // printing the hospitals that have R0 as their top preference
        hospitalSet.stream()
                .filter(hos -> hosPrefMap.get(hos).indexOf(residentList.get(0)) == 0)
                .forEach(System.out::println);

    }
}
