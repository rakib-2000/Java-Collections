import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();

        /*
         * Put(key, value) operation adds elements to the hash map.
         * It doesn't maintain insertion order.
         * Time complexity - O(1)
         */
         hashMap.put("Name", "Md Rakib");
        hashMap.put("Age", 26);
        hashMap.put("Years of Experience", 5.5);

        printHashMap(hashMap);

        /*
         * Get(key) operation gets a particular element's value via a key.
         * It returns null if key not found.
         * Time complexity - O(1)
         */
        Object value = hashMap.get("Age");
        System.out.println("\nThe value of Age is " + value);

        /*
         * ContainsKey(key) operation checks if a particular key is present in the hash map or not.
         * It returns true if key found. Else returns false;
         * Time complexity - O(1)
         */
        boolean isPresent = hashMap.containsKey("Age");
        System.out.println("\nThe key Age is present: " + isPresent);

        /*
         * Remove(key) operation removed a particular key if it is present in the hash map.
         * After successful removal, it returns the value of the key.
         * Time complexity - O(1)
         */
        Object removeValue = hashMap.remove("Age");
        System.out.println("\nThe key Age is removed. And the value was " + removeValue);

        /*
         * It returns the size of the hash map.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        System.out.println("Hash Map size " + hashMap.size());

        HashMap<String, Object> anotherHashMap = new HashMap<>();
        anotherHashMap.put("Technologies", "Java, Angular");
        anotherHashMap.put("Databases", "MySql, Postgres");

        /*
         * PutAll(Map<k, v>) operation adds an entire hash map to the existing hash map.
         * Time complexity - O(n)
         */
        hashMap.putAll(anotherHashMap);
        printHashMap(hashMap);

        /*
         * Clear() operation deletes all the elements from the hash map.
         * Time complexity - O(n)
         */
        hashMap.clear();
        printHashMap(hashMap);    }
    private static void printHashMap(HashMap<String, Object> hashMap) {
        System.out.println("\n\nPrinting the hash map");

        for (Map.Entry<String, Object> element: hashMap.entrySet()) {
            System.out.println("Key: " + element.getKey() + " | Value: " + element.getValue());
        }
    }
}
