public class StringExample {

    public static void main(String[] args) {

        String str = "hello";
        str = str + " ";
        str = str + "world";

        String str2 = "hello world";
        //String str2 = new String("hello world");

        System.out.println("Addresses: " + (str == str2));
        System.out.println("By values: " + str.equals(str2));

        String str3 = str2.intern();
        String str4 = str3.intern();

        System.out.println("After intern: " + (str3 == str4));

        str4 = "Some other string";

        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);

        str3 = str4; // by reference

        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
    }
}
