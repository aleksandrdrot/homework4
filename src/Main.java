
public class Main {
    public static void main(String[] args) {

//----------- Задачи 1-3 -------------------------------------//
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }

//----------- Задачи 4-7 -------------------------------------//
        //"age" у нас уже объявлена, с ней и будем работать
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
        }

//------------ Задача 5 ----------------------------------------------//
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " ему нельзя кататься на аттракционе.");
        }

        boolean parents = true;
        if (age >= 5 && age < 14) {
            if (parents) {
                System.out.println("Если возраст ребенка равен " + age + " ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + age + " ему нельзя кататься на аттракционе без сопровождения взрослого.");
            }
        }

        if (age > 14) {
            System.out.println("Если ребёнок старше " + age + " то он может кататься без сопровождения взрослого.");
        }

//------------ Задача 6 ----------------------------------------------//
        int people = 80;
        if (people <= 102) {
            System.out.println("В вагоне есть сидячее или стоячее место.");
        } else {
            System.out.println("Вагон забит.");
        }

//------------ Задача 7 ----------------------------------------------//
        int one = 51;
        int two = 60;
        int three = 8;
        if (one > two && one > three) {
            System.out.println("Число one больше.");
        } else {
            if (two > one && two > three) {
                System.out.println("Число two больше.");
            } else {
                System.out.println("Число three больше.");
            }
        }

//        if (one > two && one > three){
//            System.out.println("Число one больше.");
//        }
//        if (two > one && two > three){
//            System.out.println("Число two больше.");
//        }
//        if (three > one && three > two){
//            System.out.println("Число three больше.");
//        }

    }
}
