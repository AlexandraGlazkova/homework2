public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 2;
        System.out.println(number);
        byte g = 12;
        System.out.println(g);
        short x = 10000;
        System.out.println(x);
        long y =-20;
        System.out.println(y);
        float a = 4.88888888f;
        System.out.println(a);
        float b = (float) 4.88888888;
        System.out.println(b);
        double t = 4.88888888;
        System.out.println(t);
        double weightFirst = 78.2;
        double weightSecond = 82.7;
        double general = weightFirst + weightSecond;
        System.out.println ( "Общий вес " + general + " кг");
        double difference = weightSecond - weightFirst;
        System.out.println ("Разница между весом " + difference + " кг");
int bananas = 5;
int oneBananas = 80;
int bananaWeight = oneBananas * bananas;
System.out.println("вес бананов "+ bananaWeight + " г");
int milk = 200;
int oneHundredMilk = 105;
int milkweight = milk * oneHundredMilk / 100;
System.out.println("Вес молока "+ milkweight + " г");
int iceCream = 2;
int oneIceCream = 100;
int iceCreamWeight = iceCream * oneIceCream;
System.out.println( "Вес мороженного "+ iceCreamWeight+ " г");
int egg = 4;
int oneEgg = 70;
int eggWeidht = egg * oneEgg;
        System.out.println ("вес яиц " + eggWeidht + " г");
        float breakfastWeight = bananaWeight + milkweight + iceCreamWeight + eggWeidht;
        System.out.println ("Вес завтрака "+ breakfastWeight + " г");
float breakfastWeightInKg = breakfastWeight / 1000;
        System.out.println ("Вес затрака "+ breakfastWeightInKg + " кг");

    }
}