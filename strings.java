public class strings {
    public static void main(String args[]){
        //declaration of the string
        String name = "prasad";
        System.out.println("My name is " + name);


        // length of the String
        int length = name.length();
        System.out.println("The length of the String is : " + length);


        // joining two strings
        String a = "stranger ";
        System.out.println("The first string is : " + a);
        String b = "things";
        System.out.println("The second string is : " + b);


        //using concat method
        String c = a.concat(b);
        System.out.println("joining of first and the second strings is : " + c);

        //comparing two strings 
        String language1 = "java";
        String language2 = "javascript";
        String language3 = "java";

        System.out.println("The first language is " + language1);
        System.out.println("The second language is " + language2);
        System.out.println("The third language is " + language3);

        boolean x = language1.equals(language2);
        boolean y = language1.equals(language3);

        System.out.println("Both the language1 and language2 are equal : " + x);
        System.out.println("Both the language1 and language3 are equal : " + y);

        //contains function of strings
        String str = "java is an programming language";
        System.out.println(str);
        boolean verify = str.contains("java");

        System.out.println("Does the str contains the word java ? : " + verify);

        //replace function of strings
        String str1 = "batman bike";
        String str2 = str1.replace('b', 'l');

        System.out.println("The str1 is : " + str1);
        System.out.println("The str2 is : " + str2);


        //toLowercase and toUppercase function of strings
        String str3 = "PRASAD";
        System.out.println(str3.toLowerCase());
        System.out.println(str.toUpperCase());


        // trim function in java
        String str4 = "   my name is prasad     ";
        int length1 = str4.length();
        System.out.println(length1);
        String str5 = str4.trim();
        int length2 = str5.length();
        System.out.println(length2);
        System.out.println(str4);
        System.out.println(str5);


        //empty string in java
        String str6 = "javaa";
        String str7 = "";

        System.out.println(str6.isEmpty());
        System.out.println(str7.isEmpty());


        //another method of declaring string

        String str8 = new String("My name is Prasad");
        System.out.println(str8);
    
    }
}
