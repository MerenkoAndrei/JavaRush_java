package nuancesWithVariables;

public class Task {
    //public static final String NAME = "Земля";
    //public static final double SQUARE = 510_100_000;
    //public static final long POPULATION = 7_594_000_000L;
    //public static final long EQUATOR_LENGTH = 40_075_696;
    public static final double PI = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Площадь круга равна: " + PI * radius * radius);
        System.out.println("Периметр круга равен: " + PI * diameter);
        System.out.println();
    }


    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
