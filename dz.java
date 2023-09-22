import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;



public class dz {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        phoneBook.computeIfAbsent("Иванов", k -> new ArrayList<>()).add("11111");
        phoneBook.computeIfAbsent("Иванов", k -> new ArrayList<>()).add("22222");
        
        phoneBook.computeIfAbsent("Петров", k -> new ArrayList<>()).add("353535");
        phoneBook.computeIfAbsent("Петров", k -> new ArrayList<>()).add("353535");
        phoneBook.computeIfAbsent("Петров", k -> new ArrayList<>()).add("353535");
        phoneBook.computeIfAbsent("Петров", k -> new ArrayList<>()).add("353535");
        phoneBook.computeIfAbsent("Петров", k -> new ArrayList<>()).add("353535");
        phoneBook.computeIfAbsent("Петров", k -> new ArrayList<>()).add("353535");
        phoneBook.computeIfAbsent("Сом", k -> new ArrayList<>()).add("777");
        phoneBook.computeIfAbsent("Аа", k -> new ArrayList<>()).add("342");
        phoneBook.computeIfAbsent("Аа", k -> new ArrayList<>()).add("3425523");
        phoneBook.computeIfAbsent("вв", k -> new ArrayList<>()).add("234234");
        phoneBook.computeIfAbsent("вв", k -> new ArrayList<>()).add("76456747577");
        phoneBook.computeIfAbsent("вв", k -> new ArrayList<>()).add("214234");

        printPhoneBook(phoneBook);
    }

    private static void printPhoneBook(HashMap<String, List<String>> phoneBook) {
        phoneBook.entrySet().stream().sorted((one, two) -> Integer.compare(two.getValue().size(), one.getValue().size())).forEach(param -> {
                System.out.println(param.getKey() + ": " + param.getValue());
            });
    }
}