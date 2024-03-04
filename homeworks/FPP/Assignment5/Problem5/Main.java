package homeworks.FPP.Assignment5.Problem5;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Intel Core i7", 16, 3.4);
        Computer computer2 = new Computer("Apple", "Apple Sillicon M2", 8, 2.8);

        System.out.println(computer.equals(computer2));
        System.out.println(computer.hashCode() == computer2.hashCode());
    }
}
