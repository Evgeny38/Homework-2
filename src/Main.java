public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte b = 125 ;
        short s = 30000 ;
        int i = 1000000 ;
        long l = 3333333L ;
        float f = 3.14f ;
        double d = 5.5555555555 ;
        char c = 33 ;
        boolean x = 3 >= 1 ;
        System.out.println (x);
        System.out.println (c);

        // Задание 2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float comonWeigth = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + comonWeigth + " кг");
        float deferenceWeight = secondBoxer %firstBoxer;
        System.out.println("Разница веса боксеров " + deferenceWeight + " кг");

        // Задание 3
        int banana = 80;
        int milk = 105;
        int icecreame = 100;
        int egg = 70;
        int brekfastWeight = 5 * banana + 2 * milk + 2 * icecreame + 4 * egg;
        System.out.println("вес завтрака " + brekfastWeight + " грамм");

        // Задание 4
        int excessWeight = 7000;
        int minReset = 250;
        int maxReset = 500;
        int maxDays = excessWeight / minReset;
        int minDays = excessWeight / maxReset;
        int medianDays = (maxDays + minDays) / 2;
        System.out.println("Минимальное количество дней - " + minDays);
        System.out.println("Максимальное количество дней - " + maxDays);
        System.out.println("В среднем потребуется " + medianDays + " день");

        // Задание 5
        double masha = 67_760;
        double denis = 83_690;
        double kristina = 76_230;
        double newmasha = 1.1 * masha;
        double newdenis = 1.1 * denis;
        double newkristina = 1.1 * kristina;
        double rostDohodaMasha = 12 * newmasha - 12 * masha ;
        double rostDohodaDenis = 12 * newdenis - 12 * denis ;
        double rostDohodaKristina = 12 * newkristina - 12 * kristina;
        System.out.println("Маша теперь получает " + newmasha + " рублей." + "Годовой доход Маши вырос на " + rostDohodaMasha + " рублей");
        System.out.println("Денис теперь получает " + newdenis + " рублей." + "Годовой доход Дениса вырос на " + rostDohodaDenis + " рублей");
        System.out.println("Кристина теперь получает " + newkristina + " рублей." + "Годовой доход Кристины вырос на " + rostDohodaKristina + " рублей");



    }
}