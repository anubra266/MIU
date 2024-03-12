package homeworks.FPP.Assignment8.Prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList for Marketing
        List<Marketing> marketingList = new ArrayList<>();

        // a. add() method
        Marketing a = new Marketing("Abraham", "Product A", 1200.0);
        Marketing b = new Marketing("Erik", "Product B", 800.0);
        Marketing c = new Marketing("Bob", "Product C", 1500.0);
        Marketing d = new Marketing("Sarah", "Product D", 3000.0);
        Marketing e = new Marketing("Natalie", "Product E", 2600.0);

        marketingList.add(a);
        marketingList.add(b);
        marketingList.add(c);
        marketingList.add(d);
        marketingList.add(e);

        // b. remove() method
        marketingList.remove(c);

        // c. Print the size of the list
        System.out.println("Size of the list: " + marketingList.size());

        // d. Override toString() method to display the contents in the list
        System.out.println("Contents of the list: ");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing);
        }

        // e. Override equals() method

        // a. Sort the list in natural order for the field salesamount using comparator
        // Your Comparator should be consistent with equals.
        Collections.sort(marketingList, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing marketing1, Marketing marketing2) {
                // Compare based on sales amount
                return Double.compare(marketing1.getSalesAmount(), marketing2.getSalesAmount());
            }
        });

        // b. Sort the list in natural order using employeename with the criteria of
        // the employee who achieves more than $1000 of salesamount.
        // Write a method to retrieve the result of getting a list of employees have
        // more than $1000 sales.
        // Then do the sorting on this result list.
        List<Marketing> result = listMoreThan1000(marketingList);
        Collections.sort(result, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing marketing1, Marketing marketing2) {
                return marketing1.getEmployeeName().compareTo(marketing2.getEmployeeName());
            }
        });

        System.out.println("Sorted result list:");
        for (Marketing marketing : result) {
            System.out.println(marketing);
        }
    }

    // b. Method to retrieve the result of getting a list of employees have more
    // than $1000 sales
    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000.0) {
                result.add(marketing);
            }
        }
        return result;
    }

}
