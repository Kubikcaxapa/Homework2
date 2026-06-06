public class Main {
    public static void main(String [] args) {
        //Задача 1
        var dog = 8.0;
        double cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача 4
        var fried = 19;
        System.out.println(fried);
        fried = fried + 2;
        System.out.println(fried);
        fried = fried / 7;
        System.out.println(fried);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var box1 = 78.2;
        var box2 = 82.7;
        var x = box1 + box2;
        System.out.println(x);
        var y = box2 - box1;
        System.out.println(y);

        //Задача 7
        var z = box2 % box1;
        System.out.println(z);

        //Задача 8
        //Подзадача 1
        var t = 640;
        var r = 8;
        var result = t / r;
        System.out.println("Всего работников в компании " + result + " человек." );

        //Подзадача 2
        result = result + 94;
        t =  result * 8;
        System.out.println("Если в комании работает " + result + " человек то всего " + t + " часов работы может быть поделено между сотрудниками.");


    }
}