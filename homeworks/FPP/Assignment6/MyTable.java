package homeworks.FPP.Assignment6;

public class MyTable {
    private Entry[] entries = new Entry[26];

    // Used this method since chars already have a relative index in JAVA
    private int getIndex(char c) {
        return c - 'a';
    }

    public String get(char c) {
        int index = getIndex(c);

        // returning this directly gave me a null pointer exception for chars that are
        // not in the table
        if (entries[index] != null) {
            return entries[index].str;
        }
        return null;
    }

    public void add(char c, String s) {
        int index = getIndex(c);
        entries[index] = new Entry(c, s);
    }

    public String toString() {
        String adjoined = "";
        for (Entry entry : entries) {
            if (entry != null) {
                adjoined += entry + "\n";
            }
        }
        return adjoined;
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        public String toString() {
            return ch + "->" + str;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        // I'm verifying that same key will be overwritten
        t.add('b', "Bob");
        t.add('w', "Willie");
        System.out.println(t);
        System.out.println(t.get('a'));
        System.out.println(t.get('b'));
        System.out.println(t.get('w'));
        // Expecting null
        System.out.println(t.get('e'));
    }
}