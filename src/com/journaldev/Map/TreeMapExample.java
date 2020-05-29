package com.journaldev.Map;

import java.time.LocalDate;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-19
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
class PersonDeatail {
    private String Occupation;
    private LocalDate birthOfDate;
    private String City;

    public PersonDeatail(String Occupation, LocalDate date, String city) {
        this.Occupation=Occupation;
        this.birthOfDate=date;
        this.City=city;
    }

    @Override
    public String toString() {
        return "PersonDeatail{" +
                "Occupation='" + Occupation + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", City='" + City + '\'' +
                '}';
    }
}
public class TreeMapExample {
    public static void main(String[] args) {
        SortedMap<String, PersonDeatail> map=new TreeMap<>();
        map.put("Dan Brown",new PersonDeatail("Writer", LocalDate.of(1964, 6, 22), "New Hampshire"));
        map.put("Ayn Ryan", new PersonDeatail("Writer", LocalDate.of(1905, 2, 2), "Saint Petersburg"));
        map.put("Devdutt", new PersonDeatail("Mythologist", LocalDate.of(1970, 12, 11), "Mumbai"));

        map.keySet().forEach(key->{
            System.out.println(key + "->" + map.get(key));
        });

        Map<String,PersonDeatail> personDeatailMap=new TreeMap<>(map);

        personDeatailMap.keySet().forEach(key->{
            System.out.println(key + "->" + personDeatailMap.get(key));
        });


        System.out.println("\nSorted Map constructed using another sorted map:");
        SortedMap<String, PersonDeatail> copiedMap = new TreeMap<>(map);
        copiedMap.keySet().forEach(key -> {
            System.out.println(key + " -> " + copiedMap.get(key));
        });
    }
}
