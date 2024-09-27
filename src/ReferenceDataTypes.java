public class ReferenceDataTypes {
    public static void main(String[] args) {
        /*
          Strings are immutable in Java.
          Strings are created as String literal

          If the string literal with the same value is already created in the String Constant Pool, it will not create new
          String, Instead just make another reference to the memory location.

          But if we create a string with new String("Hello") it will create a new String literal in the SCP.
         */
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s2);

        String s3 = new String("hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
