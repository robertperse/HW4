public class Main {
    public static void main(String[] args) {

        int age = 12;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен " +age +", то он совершеннолетний");
        } else {
                System.out.println("Если возраст человека равен " +age +", то он не достиг совершеннолетия, нужно немного подождать");
            }

        int temp = 6;
        if (temp >= 5) {
            System.out.println("На улице " +temp +" градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " +temp +" градусов, нужно надеть шапку");
        }

        int speed = 30;
        if (speed >= 60) {
            System.out.println("Если скорость " +speed +" км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " +speed +" км/ч, то можно ездить спокойно");
        }

        int age1 = 10;
        if (age1>=2 && age1<=6) {
            System.out.println("Если возраст человека равен " +age1 +", то ему нужно ходить в детский сад");
        } if (age1>=7 && age1<=17){
            System.out.println("Если возраст человека равен " +age1 +", то ему нужно ходить в школу");
        } if (age1>=18 && age1<=24) {
            System.out.println("Если возраст человека равен " +age1 +", то ему нужно ходить в университет");
        } if (age1>24) {
            System.out.println("Если возраст человека равен " +age1 +", то ему нужно ходить на работу");
        }

        int age2 = 3;
        if (age2<5) {
            System.out.println("Если возраст ребенка равен " +age2 +", то ему нельзя кататься на аттракционе");
        } if (age2>=5 && age2<14) {
            System.out.println("Если возраст ребенка равен " +age2 +", то ему можно кататься на аттракицоне в сопровождении");
        } if (age2>=14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракицоне без сопровождения");
        }

        int seat = 0;
        if (seat>=0 && seat<60){
            System.out.println("Если в вагоне " +seat +" человек, то еще остались сидячие места");
        } if (seat>=60 && seat<102) {
            System.out.println("Если в вагоне " +seat +" человек, то остались только стоячие места");
        } if (seat==102) {
            System.out.println("Если в вагоне " +seat +" человек, то вагон переполнен");
        }

        int one = 1;
        int two = 2 ;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}