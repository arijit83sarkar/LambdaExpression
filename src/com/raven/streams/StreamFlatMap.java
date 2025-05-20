package com.raven.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFlatMap {

    public static void main(String[] args) {
        List<List<Integer>> testList = Arrays.asList(Arrays.asList(2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7));
        // System.out.println(testList);

        List<Integer> integers = testList
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(integers);

//		System.out.println("------------------------------");
//		List<ProductDetails> productSet = ProductList.getProductList().stream().map(obj -> {
//			return new ProductDetails(obj.getTitle(), obj.getDescription(), obj.getPrice());
//		}).collect(Collectors.toList());
//		System.out.println(productSet);

//		List<String> strings=productSet.stream().flatMap(list->list.str)

        System.out.println("------------------------------");
        List<List<String>> stringList = List.of(List.of("Brian Baker", "Mona Lott", "Ivana Tinkle"),
                List.of("Anita Bath", "Eileen Dover", "Ann Chovey"),
                List.of("Chris P. Bacon", "Justin Time", "Al B. Zider"));
        // System.out.println(stringList);

        System.out.println("------------------------------");
        List<String> strings = stringList
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(strings);

        // System.out.println("------------------------------");
        // List<List<String>> strings= stringList.stream().map(arg0 -> arg0).collect(Collectors.toList());
        // System.out.println(strings);
        System.out.println("------------------------------");

        stringList.forEach(System.out::println);

        System.out.println("------------------------------");
        Function<String, String> uppercaseFunction = String::toUpperCase;
        // List<String> strings2 = stringList.stream().flatMap(Collection::stream).map(uppercaseFunction)
        //         .collect(Collectors.toList());
        List<String> strings2 = stringList
                .stream()
                .flatMap(Collection::stream)
                .map(uppercaseFunction)
                .collect(Collectors.toList());
        System.out.println(strings2);
        // [BRIAN BAKER, MONA LOTT, IVANA TINKLE, ANITA BATH, EILEEN DOVER, ANN CHOVEY, CHRIS P. BACON, JUSTIN TIME, AL B. ZIDER]

        System.out.println("------------------------------");
        List<List<String>> countryList = ProductListV2.getProductList()
                .stream()
                .map(ProductV2::getAvailableIn)
                .collect(Collectors.toList());
        System.out.println(countryList);
        // [[USA, Japan, United Kingdom, France, Italy, Canada, Germany, Sweden, New Zealand], [USA, Netherlands, Brasil, United Kingdom, France, South Korea, Australia, Hong Kong], [USA, Japan, Indonesia, Brazil, Italy, Canada, Saudi Arabia, Malaysia], [USA, Japan, Hong Kong, Netherlands, United Kingdom, France, Taiwan, Canada, New Zealand], [USA, Thailand, England, France, Italy, Canada, Malaysia], [USA, Japan, Switzerland, Netherlands, France, Italy, Canada], [Singapore, Japan, Thailand, France, Poland, Canada, Belgium, Malaysia], [USA, Japan, Hong Kong, England, France, Italy, Canada, Belgium, Sweden], [Netherlands, Japan, Thailand, England, France, Italy, Canada, Sweden], [USA, Singapore, England, France, Italy, Canada, Malaysia], [Netherlands, Japan, England, France, Thailand, Italy, Singapore, Sweden], [USA, Japan, England, Thailand, France, Italy, Canada, Singapore], [New Zealand, Hong Kong, Netherlands, Singapore, France, Italy, Canada, Sweden, Malaysia], [USA, Japan, England, France, Italy, Canada], [USA, Japan, Thailand, England, Netherlands, Italy, Poland, Canada], [USA, New Zealand, England, France, Italy, Canada, Sweden], [South Korea, USA, Netherlands, England, France, Singapore, Canada, Poland, Malaysia], [Hong Kong, Japan, England, France, Italy, Canada], [South Korea, Japan, Netherlands, France, Italy, Canada, Sweden, Malaysia], [Poland, Japan, Singapore, France, Italy, Hong Kong], [Thailand, Japan, England, Netherlands, Italy, Canada, New Zealand], [Thailand, South Korea, Japan, England, France, Italy, Singapore, Sweden, Malaysia], [USA, South Korea, England, France, Italy, Canada, Sweden, New Zealand], [Netherlands, Japan, England, Singapore, Italy, Canada], [Singapore, Hong Kong, England, France, South Korea, Canada, Sweden, New Zealand, Malaysia]]

        System.out.println("------------------------------");
        List<String> countryList1 = countryList
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(countryList1);
        // [USA, Japan, United Kingdom, France, Italy, Canada, Germany, Sweden, New Zealand, USA, Netherlands, Brazil, United Kingdom, France, South Korea, Australia, Hong Kong, USA, Japan, Indonesia, Brazil, Italy, Canada, Saudi Arabia, Malaysia, USA, Japan, Hong Kong, Netherlands, United Kingdom, France, Taiwan, Canada, New Zealand, USA, Thailand, England, France, Italy, Canada, Malaysia, USA, Japan, Switzerland, Netherlands, France, Italy, Canada, Singapore, Japan, Thailand, France, Poland, Canada, Belgium, Malaysia, USA, Japan, Hong Kong, England, France, Italy, Canada, Belgium, Sweden, Netherlands, Japan, Thailand, England, France, Italy, Canada, Sweden, USA, Singapore, England, France, Italy, Canada, Malaysia, Netherlands, Japan, England, France, Thailand, Italy, Singapore, Sweden, USA, Japan, England, Thailand, France, Italy, Canada, Singapore, New Zealand, Hong Kong, Netherlands, Singapore, France, Italy, Canada, Sweden, Malaysia, USA, Japan, England, France, Italy, Canada, USA, Japan, Thailand, England, Netherlands, Italy, Poland, Canada, USA, New Zealand, England, France, Italy, Canada, Sweden, South Korea, USA, Netherlands, England, France, Singapore, Canada, Poland, Malaysia, Hong Kong, Japan, England, France, Italy, Canada, South Korea, Japan, Netherlands, France, Italy, Canada, Sweden, Malaysia, Poland, Japan, Singapore, France, Italy, Hong Kong, Thailand, Japan, England, Netherlands, Italy, Canada, New Zealand, Thailand, South Korea, Japan, England, France, Italy, Singapore, Sweden, Malaysia, USA, South Korea, England, France, Italy, Canada, Sweden, New Zealand, Netherlands, Japan, England, Singapore, Italy, Canada, Singapore, Hong Kong, England, France, South Korea, Canada, Sweden, New Zealand, Malaysia]

        System.out.println("------------------------------");
        List<String> countryList2 = ProductListV2.getProductList()
                .stream()
                .map(ProductV2::getAvailableIn)
                .flatMap(Collection::stream)
                .sorted().distinct()
                .collect(Collectors.toList());
        System.out.println(countryList2);
        // [Australia, Belgium, Brazil, Canada, England, France, Germany, Hong Kong, Indonesia, Italy, Japan, Malaysia, Netherlands, New Zealand, Poland, Saudi Arabia, Singapore, South Korea, Sweden, Switzerland, Taiwan, Thailand, USA, United Kingdom]

        System.out.println("------------------------------");
        Set<String> countrySet = ProductListV2.getProductList()
                .stream()
                .map(ProductV2::getAvailableIn)
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(countrySet);
        // [Australia, Belgium, Brazil, Canada, England, France, Germany, Hong Kong, Indonesia, Italy, Japan, Malaysia, Netherlands, New Zealand, Poland, Saudi Arabia, Singapore, South Korea, Sweden, Switzerland, Taiwan, Thailand, USA, United Kingdom]
    }
}
