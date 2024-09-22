public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача №1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("Задача №2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;

        System.out.println("Задача №3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println("Задача №4");
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog =3.5;
        System.out.println("Задача №5");
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var weightBox=78.2;
        var weightBox2=82.7;
        var sumWeight=weightBox+weightBox2;
        var diffWeight=weightBox2-weightBox;
        System.out.println("Задача №6");
        System.out.println(sumWeight);
        System.out.println(diffWeight);
        var remWeight=weightBox2%weightBox;
        System.out.println("Задача №7");
        System.out.println(remWeight);

        var numWorker=640/8;
        System.out.println("Задача №8");
        System.out.println("Всего работников в компании "+numWorker);
        numWorker=numWorker+94;
        var timeWork=numWorker*8;
        System.out.println("Если в компании работает "+numWorker+ " человека, то всего " + timeWork+ " часов работы может быть поделено между сотрудниками");
}


}

