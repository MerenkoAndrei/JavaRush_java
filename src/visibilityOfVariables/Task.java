package visibilityOfVariables;

public class Task {
    public static String city = "Токио";
    public static double population = 34.5;

    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);

        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printSqrt(int[] array) {
        String elementSqrtString = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtString + element + " равен " + elementSqrt);
        }
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println();
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
        System.out.println("В то время как в самом густонаселенном городе " + Task.city + " население составляет " + Task.population + " млн человек.");
    }
}
