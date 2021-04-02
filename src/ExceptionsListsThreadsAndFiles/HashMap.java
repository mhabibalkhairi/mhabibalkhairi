
package ExceptionsListsThreadsAndFiles;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, String> m = new java.util.HashMap<String, String>();
        m.put("A", "First");
        m.put("B", "Second");
        m.put("C", "Third");
        System.out.println(m.get("B"));
    }
}