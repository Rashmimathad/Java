package com.xworkz.countryapp;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.streams.NamStream;
import com.xworkz.countryapp.streams.NamStreamImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountryRunner {
    public static void main(String[] args) {
        List<CountryDto> countryDtoList=new ArrayList<>();

        countryDtoList.add(new CountryDto(1,"India",145328595L,"Narendra Modi",28,3287469.00,"Asia",true,"Kannada"));
        countryDtoList.add(new CountryDto(5,"Sri Lanka",794455L,"Amith Shah",10,11590469.00,"Asia",true,"Tamil"));
        countryDtoList.add(new CountryDto(3,"Nepal", 42432145L,"Murmu",5,155469.00,"Asia",true,"Hindi"));
        countryDtoList.add(new CountryDto(6,"Australia",62485635L,"Watson",12,2574469.00,"Australia",true,"English"));
        countryDtoList.add(new CountryDto(2,"Canada",7986454L,"Sam Curran",21,4587469.00,"Europe",true,"Telugu"));
        countryDtoList.add(new CountryDto(7,"Germany",9746545L,"Hitler",27,5287469.00,"Europe",false,"English"));
        countryDtoList.add(new CountryDto(4,"Bangladesh",41749652L,"Kejriwal",15,587469.00,"Asia",true,"Bengali"));
        countryDtoList.add(new CountryDto(10,"South Korea",67874855L,"Don lee",10,6287469.00,"Korea",false,"Korean"));
        countryDtoList.add(new CountryDto(9,"China",6416352L,"Kim jun hee",27,9878462.00,"Asia",false,"Chinese"));
        countryDtoList.add(new CountryDto(8,"West Indies",87464154L,"Chris Gayle",27,875454.00,"Africa",false,"English"));

        System.out.println("Countries List :");
        countryDtoList.forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by country id : ");
        countryDtoList.stream()
                .sorted((o1,o2)-> o1.getCountryId()-o2.getCountryId())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by country name : ");
        countryDtoList.stream()
                .sorted((o1,o2)-> o1.getCountryName().compareTo(o2.getCountryName()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by population : ");
        countryDtoList.stream()
                .sorted((o1,o2)->(int)(o1.getPopulation()-o2.getPopulation()))
                .forEach(System.out::println);


        System.out.println();
        System.out.println("Countries list sorted by country area : ");
        countryDtoList.stream()
                .sorted((o1,o2)-> (int)(o1.getArea()-o2.getArea()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by  language : ");
        countryDtoList.stream()
                .sorted((o1,o2)-> o1.getLanguage().compareTo(o2.getLanguage()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by  noOfStates : ");
        countryDtoList.stream()
                .sorted(Comparator.comparing(CountryDto::getNoOfStates))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by  primeMinisterName : ");
        countryDtoList.stream()
                .sorted(Comparator.comparing(CountryDto::getPrimeMinisterName))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by  continent : ");
        countryDtoList.stream()
                .sorted(Comparator.comparing(CountryDto::getContinent))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Countries list sorted by isDemocratic : ");
        countryDtoList.stream()
                .sorted(Comparator.comparing(CountryDto::isDemocratic))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("List of countries in Asia continent and country name ends with 'a' : ");
        countryDtoList.stream()
                .filter(c->c.getContinent().equalsIgnoreCase("asia"))
                .filter(c->c.getCountryName().endsWith("a"))
                .sorted((o1,o2)-> o1.getCountryName().compareTo(o2.getCountryName()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("country with highest population in asia: ");
        System.out.println( countryDtoList.stream()
                .filter(c->c.getContinent().equalsIgnoreCase("asia"))
                .max((o1,o2)->(int)(o1.getPopulation()-o2.getPopulation()))
                .get());


        System.out.println();
        System.out.println("country with highest population in asia using comparator: ");
        System.out.println(countryDtoList.stream()
                .sorted(Comparator.comparing(CountryDto::getPopulation).reversed())
                .findFirst()
                .get());

        System.out.println();
        System.out.println("country with 3rd highest population in asia using comparator: ");
        System.out.println(countryDtoList.stream()
                .sorted(Comparator.comparing(CountryDto::getPopulation).reversed())
                .skip(2)
                .findFirst()
                .get());

        System.out.println();
        System.out.println("List of countries whose language is English : ");
        countryDtoList.stream()
                .filter(c->c.getLanguage().equalsIgnoreCase("english"))
                .sorted((o1,o2)-> o1.getCountryName().compareTo(o2.getCountryName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("No of countries belong to each continent : ");
        System.out.println(countryDtoList.stream().collect(Collectors.groupingBy(CountryDto::getContinent,Collectors.counting())));


        System.out.println();
        System.out.println("Distinct continent names : ");
        System.out.println(countryDtoList
                .stream()
                .map(CountryDto::getContinent)
                .distinct()
                .collect(Collectors.toList()));




    }
}
