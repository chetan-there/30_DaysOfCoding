package com.ct.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingAppStreamDemo {
    public static void main(String[] args) {

        // ● Creating Product List (SOURCE for the Stream Pipeline)
        List<Product> productList = Arrays.asList(
            new Product(1, "Laptop", 65000, "Electronics", 4.5),
            new Product(2, "Mobile", 20000, "Electronics", 4.1),
            new Product(3, "Shoes", 2500, "Fashion", 4.0),
            new Product(4, "T-shirt", 800, "Fashion", 4.3),
            new Product(5, "TV", 35000, "Electronics", 4.6),
            new Product(6, "Laptop", 65000, "Electronics", 4.5)
        );

        // ● filter() → Filter products where price > 10,000
        List<Product> expensiveProducts = productList.stream()
                .filter(p -> p.getPrice() > 10000)  // Takes Predicate FI: boolean test(T t)
                .collect(Collectors.toList());
        System.out.println("Expensive Products: " + expensiveProducts);

        // ● map() → Convert product names to uppercase
        List<String> productNames = productList.stream()
                .map(p -> p.getName().toUpperCase())  // Takes Function FI: R apply(T t)
                .collect(Collectors.toList());
        System.out.println("\nProduct Names Uppercase: " + productNames);

        // ● distinct() → Remove duplicate products (based on equals+hashcode)
        List<Product> uniqueProducts = productList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nUnique Products: " + uniqueProducts);

        // ● sorted() → Sort by price descending
        List<Product> sortedProducts = productList.stream()
                .sorted((a,b) -> Double.compare(b.getPrice(), a.getPrice()))  // Comparator FI
                .collect(Collectors.toList());
        System.out.println("\nSorted by Price Desc: " + sortedProducts);

        // ● limit() → Show only top 2 premium items
        List<Product> top2 = sortedProducts.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("\nTop 2 expensive products: " + top2);

        // ● skip() → Skip first 2 items
        List<Product> skip2 = sortedProducts.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("\nAfter Skipping 2 Products: " + skip2);

        // ● peek() → Debug / view intermediate values
        productList.stream()
                .peek(System.out::println)  // Consumer FI: void accept(T t)
                .collect(Collectors.toList());

        // ● count() → Count total products
        long count = productList.stream().count();
        System.out.println("\nTotal Product Count: " + count);

        // ● anyMatch(), allMatch(), noneMatch() → Check conditions
        boolean anyMobile = productList.stream()
                .anyMatch(p -> p.getCategory().equals("Electronics"));
        System.out.println("\nAny Electronics? : " + anyMobile);

        // ● findFirst() → First element from stream
        Product firstElement = productList.stream().findFirst().get();
        System.out.println("\nFirst Product: " + firstElement);

        // ● reduce() → Get total price of all products
        Double totalPrice = productList.stream()
                .map(Product::getPrice)
                .reduce(0.0, (a,b) -> a + b); // BinaryOperator FI
        System.out.println("\nTotal Price: ₹" + totalPrice);

        // ● max() → Find highest rated product
        Product maxRated = productList.stream()
                .max((a,b) -> Double.compare(a.getRating(), b.getRating()))
                .get();
        System.out.println("\nHighest Rated Product: " + maxRated);

        // ● groupingBy() → Group products by category
        Map<String, List<Product>> groupedProducts =
                productList.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("\nGrouped By Category: " + groupedProducts);
    }
}
