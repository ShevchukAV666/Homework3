public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int i = 35000;
        byte b = 10;
        short s = 20000;
        long l = 250L;
        float f = 2.35F;
        double d = 4.45612346;

        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float f = 27.12F;
        long l = 987678965549L;
        double d = 2.786;
        short sS = 569;
        short s = -159;
        int i = 27897;
        byte b = 67;

    }


    public static void task3() {
        System.out.println("Задача 3");
        byte teacherL = 23;
        byte teacherA = 27;
        byte teacherE = 30;
        short paper = 480;
        int ollStudent = teacherL + teacherA + teacherE;
        int studentPaper = paper / ollStudent;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

    }


    public static void task4() {
        System.out.println("Задача 4");
        byte bottlesTwoMinutes = 16;
        byte minutes = 2;
        int bottlesOneMinutes = bottlesTwoMinutes / minutes;
        int bottlesTwentyMinutes = bottlesOneMinutes * 20;
        int bottlesOneHour = bottlesTwentyMinutes * 3;
        int bottlesOneDay = bottlesOneHour * 24;
        int bottlesThreeDay = bottlesOneDay * 3;
        int bottlesOneMonth = bottlesOneDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesOneDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottlesThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesOneMonth + " штук бутылок");

    }


    public static void task5() {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte oneClassWhiteCans = 2;
        byte oneClassBrownCans = 4;
        int oneClassCans = oneClassWhiteCans + oneClassBrownCans;
        int totalClass = totalCans / oneClassCans;
        int totalWhiteCans = oneClassWhiteCans * totalClass;
        int totalBrownCans = oneClassBrownCans * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

    }


    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 5;
        byte weightBanana = 80;
        byte milk = 2;
        byte weightMilk = 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte egg = 4;
        byte weightEggs = 70;
        int weightCocktailG = banana * weightBanana + milk * weightMilk + iceCream * weightIceCream + egg * weightEggs;
        System.out.println("Вес коктейля составляет " + weightCocktailG + " грамм");
        float weightCocktailK = weightCocktailG / 1000F;
        System.out.println("Вес коктейля составляет " + weightCocktailK + " килограмм");

    }


    public static void task7() {
        System.out.println("Задача 7");
        byte weightKg = 7;
        int weightGm = weightKg * 1000;
        int weightLossA = weightGm / 250;
        int weightLossB = weightGm / 500;
        int lossAverages = (weightLossA + weightLossB) / 2;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то это займет " + weightLossA + " дней");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то это займет " + weightLossB + " дней");
        System.out.println("В среднем, похудеение займет " + lossAverages + " дней");

    }


    public static void task8() {
        System.out.println("Задача 8");
        int M = 67760;
        int D = 83690;
        int K = 76230;
        float up = 0.1F;
        float upM = M * up;
        float upD = D * up;
        float upK = K * up;
        float newDifferenceM = M + upM;
        float newDifferenceD = D + upD;
        float newDifferenceK = K + upK;
        float differenceM = (newDifferenceM * 12) - (M * 12);
        float differenceD = (newDifferenceD * 12) - (D * 12);
        float differenceK = (newDifferenceK * 12) - (K * 12);
        System.out.println("Маша теперь получает "+ newDifferenceM + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает "+ newDifferenceD + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает "+ newDifferenceK + " рублей. Годовой доход вырос на " + differenceK + " рублей");



    }
}
