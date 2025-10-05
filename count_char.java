
public class count_char {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String str = "Aadi and Java";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'A') {
                count++;
            }

        }

        System.out.println(count);
    }
}
