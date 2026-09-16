//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Задача 1");
    int age = 17;
    if (age >= 18) {
        System.out.println("он совершеннолетний");
    }  else  {
        System.out.println("возраст совершеннолетия еще не наступил, нужно немного подождать.");
    }
    System.out.println("Задача 2");
    int temperature = 10;
    if (temperature >= 5) {
        System.out.println("Сегодня" + temperature + "можно идти без шапки");
    } else {
        System.out.println("На улице " + temperature + " нужно надеть шапку");
    }
    System.out.println("Задача 3");
    int speed = 59;
    if (speed >= 60) {
        System.out.println("скорость " + speed + " придется заплатить штраф");
    } else {
        System.out.println("скорость " + speed + " превышения скорости нет, можно ездить спокойно");
    }
    System.out.println("Задача 4");
    int humanAge = 2;
    if (humanAge >= 2 && humanAge <= 6) {
        System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
    }
    if (humanAge >= 7 && humanAge <= 17) {
        System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
    }
    if (humanAge >= 18 && humanAge <= 24) {
        System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет");
    }
    if (humanAge > 24) {
        System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить на работу");
    }
    System.out.println("Задача 5");
    int childrenAge = 15;
    if (childrenAge <= 5) {
        System.out.println("Если возраст ребенка равен " + childrenAge + ", нельзя кататься на аттракционе.");
    }
    if (childrenAge > 5 && childrenAge <= 14) {
        System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
    }
    if (childrenAge > 14) {
        System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься без сопровождения взрослого.");
    }
    System.out.println("Задача 6");
    int capacity = 102;
    int sitPlaces = 60;
    int standingPlaces = capacity - sitPlaces;
    int human = 102;
    if (human <= sitPlaces) {
        System.out.println("Сидячие места есть.");
    } else if (human <= capacity) {
        System.out.println("Сидячие места заняты, остались стоячие места");
    } else if (human > capacity) {
        System.out.println("Вагон забит");
    }
    System.out.println("Задача 7");
    int one = 1;
    int two = 2;
    int three = 3;
    if (one > two) {
        if (one > three) {
            System.out.println(one);
        } else {
            System.out.println(three);
        }
    }else {
        if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
    //F

}