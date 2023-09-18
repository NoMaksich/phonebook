import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;



public class dz {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        phoneBook.computeIfAbsent("Иванов", k -> new ArrayList<>()).add("11111");
        phoneBook.computeIfAbsent("Иванов", k -> new ArrayList<>()).add("22222");
        
        phoneBook.computeIfAbsent("Петров", k -> new ArrayList<>()).add("353535");

        printPhoneBook(phoneBook);
    }

    private static void printPhoneBook(HashMap<String, List<String>> phoneBook) {
        phoneBook.entrySet().stream().sorted((one, two) -> Integer.compare(two.getValue().size(), one.getValue().size())).forEach(param -> {
                System.out.println(param.getKey() + ": " + param.getValue());
            });
    }
}