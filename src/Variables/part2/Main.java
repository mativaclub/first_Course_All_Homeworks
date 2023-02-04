package Variables.part2;

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
        task9();
        task10();
        task11();

    }


    public static void task1() {
        System.out.println("Задача 1");
        byte mercury = 100;
        short venus = 1000;
        int earth = 1_000_000;
        long solarSystem = 10_000_000L;
        float asteroid = 1.5F;
        double meteorite = 155.199;
        System.out.println("Значение переменной mercury с типом byte равно " + mercury);
        System.out.println("Значение переменной venus с типом short равно " + venus);
        System.out.println("Значение переменной earth с типом int равно " + earth);
        System.out.println("Значение переменной solarSystem с типом long равно " + solarSystem);
        System.out.println("Значение переменной asteroid с типом float равно " + asteroid);
        System.out.println("Значение переменной meteorite с типом double равно " + meteorite);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        float floatNum = 27.12f;
        long longNum = 987_678_965_549L;
        double doubleNum = 2.786;
        short shortNum = 569;
        int intNum2 = -159;
        int intNum3 = 27897;
        byte byteNum = 67;
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int totalPapers = 480;
        int totalPupils = pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass;
        int papersForEachPupil = totalPapers / totalPupils;
        System.out.println("На каждого ученика рассчитано " + papersForEachPupil + " листов бумаги");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 Minutes машина произвела " + bottlesPer20Minutes + " штук бутылок");
        int minutesPerOneHour = bottlesPer20Minutes * 3;
        int bottlesPer24Hours = minutesPerOneHour * 24;
        System.out.println("За 24 Hours машина произвела " + bottlesPer24Hours + " штук бутылок");
        int bottlesPer3Days = bottlesPer24Hours * 3;
        System.out.println("За 3 Days машина произвела " + bottlesPer3Days + " штук бутылок");
        int bottlesPer1Month = bottlesPer3Days * 10;
        System.out.println("За 1 Month машина произвела " + bottlesPer1Month + " штук бутылок");
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalCans = 120;
        int whitePaintCansForEachClass = 2;
        int brownPaintCansForEachClass = 4;
        int totalClasses = totalCans / (whitePaintCansForEachClass + brownPaintCansForEachClass);
        int whitePaintCans = totalClasses * whitePaintCansForEachClass;
        int brownPaintCans = totalClasses * brownPaintCansForEachClass;
        System.out.println("В школе где " + totalClasses +
                " классов, нужно " + whitePaintCans +
                " банок белой краски и " + brownPaintCans + " банок коричневой краски».");
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananaWeight = 80;
        int bananasQty = 5;
        int totalBananaWeight = bananaWeight * bananasQty;
        int milkGramPer100Ml = 105;
        int milkQtyMl = 200;
        int totalMilkWeight = milkGramPer100Ml * milkQtyMl / 100;
        int iceCream1PcsInGr = 100;
        int iceCreamQty = 2;
        int totalIceCreamWeight = iceCream1PcsInGr * iceCreamQty;
        int eggsWeightInGram = 70;
        int eggsQty = 4;
        int totalEggsWeight = eggsWeightInGram * eggsQty;
        float totalBreakfastWeightInGram = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        float totalBreakfastWeightInKg = totalBreakfastWeightInGram / 1000;
        System.out.println("Breakfast weight in grams is " + totalBreakfastWeightInGram);
        System.out.println("Breakfast weight in kg is " + totalBreakfastWeightInKg);
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightToLoseInKg = 7;
        double weightToLoseInGr = weightToLoseInKg * 1000;
        int weightToLosePerDay250Gram = 250;
        int weightToLosePerDay500Gram = 500;
        double daysNecessaryIfLosing250GrPerDay = weightToLoseInGr / weightToLosePerDay250Gram;
        double daysNecessaryIfLosing500GrPerDay = weightToLoseInGr / weightToLosePerDay500Gram;
        double averageDaysForGetResult = (daysNecessaryIfLosing250GrPerDay + daysNecessaryIfLosing500GrPerDay)/2;
        System.out.println("Total days needed if losing 250 grams per Day " + daysNecessaryIfLosing250GrPerDay);
        System.out.println("Total days needed if losing 500 grams per Day " + daysNecessaryIfLosing500GrPerDay);
        System.out.println("Average days needed for both options " + averageDaysForGetResult);
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int percent = 10;
        int monthsInYear = 12;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaNewSalary = mashaSalary + (mashaSalary * percent / 100);
        int denisNewSalary = denisSalary + (denisSalary * percent / 100);
        int kristinaNewSalary= kristinaSalary + (kristinaSalary * percent / 100);
        int annulSalaryMasha = mashaSalary * monthsInYear;
        int annulSalaryDenis = denisSalary * monthsInYear;
        int annulSalaryKristina = kristinaSalary * monthsInYear;
        int annulMashaNewSalary = mashaNewSalary * monthsInYear;
        int annulDenisNewSalary = denisNewSalary * monthsInYear;
        int annulKristinaNewSalary = kristinaNewSalary * monthsInYear;
        int salaryDifferenceMasha = annulMashaNewSalary - annulSalaryMasha;
        int salaryDifferenceDenis = annulDenisNewSalary - annulSalaryDenis;
        int salaryDifferenceKristina = annulKristinaNewSalary - annulSalaryKristina;
        System.out.println("Маша теперь получает " + mashaNewSalary
                + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Denis теперь получает " + denisNewSalary
                + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Kristina теперь получает " + kristinaNewSalary
                + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей");
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 9");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = result * (-1);
        System.out.println(result);
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 10");
        int a = 5;
        int b = 7;
        a = a + b; //  5 + 7 = 12
        b = a - b; // 12 - 7 = 5
        a = a - b; // 12 - 5 = 7
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    public static void task11() {
        System.out.println("Задача 11");
        int a = 256;
        int b = (a % 100) / 10;
        System.out.println(b);

    }

}