package string;
public class Main {
    public static void main(String[] args) {
        String str = " Hello World ";
        System.out.println("Length: " + str.length());

        String str1 = "apple";
        String str2 = "banana";
        System.out.println("Comparison: " + str1.compareTo(str2));

        String str3 = "Hello";
        String str4 = " Java";
        System.out.println("Concatenated String: " + str3.concat(str4));

        System.out.println("Trimmed String: " + str.trim());

        System.out.println("Replaced String: " + str.replace("World", "Java"));

        int number = 100;
        String strNumber = String.valueOf(number);
        System.out.println("String value of number: " + strNumber);

        Integer intObj = Integer.valueOf(50);
        Double doubleObj = Double.valueOf(10.5);
        Boolean boolObj = Boolean.valueOf(true);
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + boolObj);
    }
}
