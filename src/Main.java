public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int a = 4;
        byte b = 12;
        short s = 24;
        long l = 641_123_345_564_789_123L;
        float f = 2.5f;
        double d = 1.711111111222222;

        System.out.println("Значение переменной а с типом int равно "+ a);
        System.out.println("Значение переменной b с типом byte равно "+ b);
        System.out.println("Значение переменной s с типом short равно "+ s);
        System.out.println("Значение переменной l с типом long равно "+ l);
        System.out.println("Значение переменной f с типом float равно "+ f);
        System.out.println("Значение переменной d с типом double равно "+ d);
        System.out.println();
System.out.println("Task2");
        double d1 = 2.786d;
        long l1 = 987_678_965_549L;
        float f1 = 27.12f;
        int a1= 569;
        short s1= -159;
        short i =27897;
        byte b1= 67;
        System.out.println( d1);
        System.out.println( l1);
        System.out.println( f1 );
        System.out.println( a1 );
        System.out.println( s1);
        System.out.println( i );
        System.out.println( b1 );
        System.out.println(  );
System.out.println("Task3");
        int lP = 23;
        int aS=27;
        int eA =30;
        int sum= lP+aS+eA;
        System.out.println("На каждого ученика рассчитано "+ (480/sum)+ " листов бумаги.");
        System.out.println();
        System.out.println("Task4");
        int bottlesPerMin = 16/2;
        int bottlesPer20min = bottlesPerMin * 20;
        int bottlesPerDay = bottlesPerMin * 60 *24;
        int bottlesPer3Day= bottlesPerDay * 3;
        int bottlesPer30Day= bottlesPerDay * 30;
            System.out.println ("За 20 минут машина произвела "+bottlesPer20min+ " штук бутылок.");
            System.out.println ("За день машина произвела "+bottlesPerDay+ " штук бутылок.");
            System.out.println ("За 3 дня машина произвела "+bottlesPer3Day+ " штук бутылок.");
            System.out.println ("За 30 дней машина произвела "+bottlesPer30Day+ " штук бутылок.");
            System.out.println();


System.out.println("Task5");
        int whole= 120;
        int white=2;
        int brown=4;
        int C = brown+white;
        int ClassAmount= whole/C;
        int CansPerClassWhite= ClassAmount*white;
        int CansPerClassBrown= ClassAmount*brown;
        System.out.println("В школе, где"+ ClassAmount+ " классов, нужно"+ CansPerClassWhite+" банок белой краски и "+
                CansPerClassBrown+ " банок коричневой краски.");
System.out.println("Task6");
        int Banana= 80*5;
        int Milk= (200/100)*105;
        int IceCream = 200;
        int Eggs= 70*4;
        int Weight= Banana+Milk+IceCream+Eggs;
        float Kg= Weight/1000f;
        System.out.println ("вес спортзавтрака в граммах равен "+ Weight);
        System.out.println("вес спортзавтрака в килограммах равен " + Kg);
        System.out.println();
System.out.println("Task7");
        double Days500PerDay= (7/0.5);
        double Days250PerDay= (7/0.25);
        double Avarage=((Days250PerDay+Days500PerDay)/2);
        System.out.println("в среднем может понадобиться"+Avarage+"дней, " +
                "если спортсмен сможет терять в весе от 500 до 250 грамм. ");
        System.out.println("Task8");

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        System.out.println();
        double MashaIncrease = Masha+ Masha*0.1;
        double DenisIncrease= Denis+(Denis*0.1);
        double KristinaIncrease= Kristina+ Kristina*0.1;
        System.out.println();
        double DifferanceMasha= ((MashaIncrease*12)-(Masha*12));
        double DifferanceDenis= ((DenisIncrease*12)-(Denis*12));
        double DifferanceKristina= ((KristinaIncrease*12)-(Kristina*12));
        System.out.println("Маша теперь получает "+MashaIncrease+" рублей. Годовой доход вырос на "+DifferanceMasha
                +" рублей.");
        System.out.println("Денис теперь получает "+DenisIncrease+" рублей. Годовой доход вырос на "+DifferanceDenis
                +" рублей.");
        System.out.println("Денис теперь получает "+KristinaIncrease+" рублей. Годовой доход вырос на "+DifferanceKristina
                +" рублей. ");
    }
}


