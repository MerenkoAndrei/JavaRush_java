package primitiveTypes;

public class Task {
    public static char char1 = 101; //2
    public static char char2 = 'H'; //1
    public static char char3 = 114; //10
    public static char char4 = '\u006F';//5
    public static char char5 = 108; // 3
    public static char char6 = 'h';//8
    public static char char7 = 0x0063; //7
    public static char char8 = ' ';//6
    public static char char9 = 'l'; //4
    public static char char10 = 0x61; //9

    byte a = 2;
    short b = 3;
    int I = 15;
    long l = 254L;
    char c = '$';
    double d = 55.3;
    float f = 671.2f;
    boolean bb = true;

    //максимальные значения
    byte a1 = Byte.MAX_VALUE;
    short s1 = Short.MAX_VALUE;
    int i1 = Integer.MAX_VALUE;
    long l1 = Long.MAX_VALUE;

    //минимальные значения
    byte b2 = Byte.MIN_VALUE;
    short c2 = Short.MIN_VALUE;
    int a2 = Integer.MIN_VALUE;
    long d2 = Long.MIN_VALUE;

    //Экспонентная запись числа
    double earthDiameter = 1.2742E+4;
    double lightSpeed = 2.99792458E+8;
    double uraniumAtomicMass = 2.380289E+2;
    double averageBeeWeight = 8.5E-2;
    double javaDeveloperSalary = 1.E+4;

    //бесконечность не предел
    public static void main(String[] args) {
        div(0.0, 10);
        div(0.0, -10);

        System.out.println();
        System.out.print(char2);
        System.out.print(char1);
        System.out.print(char5);
        System.out.print(char9);
        System.out.print(char4);
        System.out.print(char8);
        System.out.print(char7);
        System.out.print(char6);
        System.out.print(char10);
        System.out.print(char3);
        System.out.println();
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }


}
