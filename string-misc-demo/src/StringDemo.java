
public class StringDemo {
    public static void main(String[] args) {
        //using char array
        char[] ch={'t','h','e','c','o','d','e','s','c','h','o','o','l'};
        String s=new String(ch);
        System.out.println(s);


        //using string literal and new keyword
        String str1 = "Welcome";
        String str2 = "Welcome";
        String str3 = new String("Welcome");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));
        System.out.println(str2.compareTo(str3));

        //using concat() and join()
        String str4 = " Home #";
        System.out.println(str1.concat(str4));
        System.out.println(str1);
        System.out.println(String.join("-", str1, str4));
        System.out.println(str1);

        //lower/upper
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //format
        int number = 5;
        String formattedStr = String.format("formatted string is : %s%s%d",str1,str4,number);
        System.out.println(formattedStr);

        //substring
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(0,3));

        //indexOf charAt
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.charAt(3));

        //split
        String strSample = "This is string demo";
        String strArr[] = strSample.split(" ");
        for(String ss:strArr) {
            System.out.println("---> " + ss);
        }

        //trim
        String strWithSpaces = "     This string has leading and trailing spaces     ";
        System.out.println(strWithSpaces);
        System.out.println(strWithSpaces.trim());

        //startsWith endsWith
        System.out.println(str1.startsWith("We"));
        System.out.println(str1.endsWith("me"));

        //length
        System.out.println(str1.length());

        //valueOf
        System.out.println(String.valueOf(10));

        // + operation
        int a = 10;
        System.out.println(a + 10);
        System.out.println(a + String.valueOf(10));

        //replace replaceAll
        String strReplace = "My country is India. What is your country?";
        System.out.println(strReplace);
        System.out.println(strReplace.replace("India", "USA"));
        System.out.println(strReplace.replaceAll("country", "nation"));
    }
}
