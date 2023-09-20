package StringVariables;

public class Stringsss {
    public static void main(String [] args) {
        String name = "Аня";
        String city = "New York";
        String message = "Hello!" + city + name + city;
        System.out.println(name);
        System.out.println(city);
        System.out.println(message);

        String str = "1234";
        int number = Integer.parseInt(str);
        System.out.println(number);

        String name1 = "Roma";
        int count = name1.length();
        System.out.println(count);

        String surname = "Vasilev";
        String surname1 = surname.toUpperCase();
        System.out.println(surname1);

        String surname2 = surname.toLowerCase();
        System.out.println(surname2);

        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";
        String tagline = s3 + s1 + s2;
        System.out.println(tagline);

        String emptiness = "пустота";
        String fullness = emptiness + " " + emptiness + " " + emptiness;
        System.out.println(fullness);

        int x = 2;
        int y = 4;
        int z = 0;
        String digits = x + y + "" + z; //напишите тут ваш код
        System.out.println(digits);

        // объявляем переменную bigAmount типа String и присваиваем ей значение
        String bigAmount = "500";
        // объявляем переменную greatAmount типа String и присваиваем ей значение
        String greatAmount = "100000";
        // объявляем переменную hugeAmount типа int и присваиваем ей значение
        // суммы чисел из переменных bigAmount и greatAmount предварительно
        // преобразованных из строк с помощью метода parseInt класса Integer
        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);
        // выводим на экран значение переменной hugeAmount
        System.out.println(hugeAmount);

        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";
        //напишите тут ваш код
        System.out.println("RESUME".toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: " + career).toLowerCase());
    }
}
