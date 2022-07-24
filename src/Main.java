public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    //задание 1
    public static void task1() {
        int i = 10;
        int j = 1;
        while ( j <= 10)
            System.out.print( j++);
            System.out.println();
            for (; i > 0; i = i - 1){
                System.out.print( i );
          }
    }
    // Задание 2
    public static void task2() {
        System.out.println("\n");
        int friyday = 2;
        for (; friyday <= 31; friyday = friyday + 7){
           System.out.println("Сегодня пятница " + friyday  + " - число. Необходимо подготовить отчет.");
                continue;
            }
        }

    }
