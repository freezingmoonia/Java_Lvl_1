public class Lesson_2 {

    public static boolean sum_from10to20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

    public static String even_or_odd(int a) {
         if (a % 2 == 0)
             return "Четное";
         else
             return "Нечетное";
    }

    public static boolean is_negative(int a) {
        if (a < 0)
            return true;
        else
            return false;
    }

    public static String multi_string(int a, String b) {
        String c = b;
        for (int i = 0; i<(a-1); i++)
            c += b;
        return c;
    }

    public static boolean is_leap_year(int a) {
        if (a % 400 == 0)
            return true;
        else if (a % 100 == 0)
            return false;
        else if (a % 4 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        //1 задание
        System.out.println(sum_from10to20(4, 7));
        //2 задание
        System.out.println(even_or_odd(4));
        //3 задание
        System.out.println(is_negative(6));
        //4 задание
        System.out.println(multi_string(5, "abc"));
        //5* задание
        System.out.println(is_leap_year(2000));
    }
}