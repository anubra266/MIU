package homeworks.FPP.Assignment8.Prob1;

import java.util.Arrays;

public class PersonList {

    public static void main(String[] args) {
        PersonList pl = new PersonList();
        pl.add(new Person("Doe", "John", 25));
        pl.add(new Person("Smith", "Alice", 30));
        pl.add(new Person("Johnson", "Bob", 22));
        pl.insert(new Person("Brown", "Eva", 28), 2);
        pl.insert(new Person("Garcia", "Carlos", 35), 3);
        System.out.println("Find: " + pl.find("Johnson")); // Searching using lastName
        System.out.println("At index 3: " + pl.get(3));
        pl.remove("Smith");
        pl.remove("Eva");

        System.out.println(pl);
    }

    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public PersonList() {
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    public void add(Person p) {
        if (p == null)
            return;
        if (numOfElements == currentArray.length) {
            resize();
        }
        // Decided to simplify this part 😁
        currentArray[numOfElements++] = p;
    }

    public boolean remove(String lastName) {
        int index = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].getLast().equals(lastName))
                index = i;
        }
        if (index == -1)
            return false;

        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    public void insert(Person p, int pos) {
        if (p == null)
            return;
        if (pos > numOfElements || pos < 0)
            return;
        if (numOfElements == currentArray.length)
            resize();
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = p;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
        ++numOfElements;
    }

    public Person get(int i) {
        if (i < 0 || i >= numOfElements)
            return null;
        return currentArray[i];
    }

    private void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean isEmpty() {
        return numOfElements == 0;
    }

    public boolean find(String lastName) {
        if (lastName == null)
            return false;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].getLast().equals(lastName))
                return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements - 1; ++i) {
            sb.append(currentArray[i] + ",\n\n");
        }
        sb.append(currentArray[numOfElements - 1] + "]");
        return sb.toString();
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(currentArray, numOfElements);
        return temp;
    }
}
