public class Lesson_7 {

    public static void main(String[] args) {
        Cat_2 cat = new Cat_2("Барсик", 15, true);
        Plate plate = new Plate(50);
        plate.info();
        cat.eat(plate, cat);
        plate.info();
        Cat_2[] catArray = new Cat_2[3];
        catArray[0] = new Cat_2("Мурчик", 10, true);
        catArray[1] = new Cat_2("Малыш", 14, true);
        catArray[2] = new Cat_2("Васька", 12, true);
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate, catArray[i]);
            plate.info();
        }
        Plate.addEat(plate, 30);
        plate.info();
    }

    public static class Cat_2 {    // почему Cat_2, а не Cat?
        private String name;       // Cat уже занято предыдущим ДЗ ...
        private int appetite;
        private boolean hungry;

        public Cat_2(String name, int appetite, boolean hungry) {
            this.name = name;
            this.appetite = appetite;
            this.hungry = hungry;
        }

        public void eat(Plate p, Cat_2 c) {
            if (p.food == 0) {
                System.out.println("Так как миска была пуста, кот по имени " + c.name
                        + " только облизнул ее и ушел по своим делам");
                c.hungry = true;

                System.out.println("Сытость, кота по имени " + c.name
                        + " - " + !c.hungry);
            } else if (p.food < c.appetite) {
                System.out.println("Из миски было доедено всё, но кот по имени " + c.name
                        + " всё еще голоден и просит добавки");  //я понимаю что в условии было немного другое задание
                c.hungry = true;                                 //но мне кажется, что кот бы съел бы все и все равно
                p.food = 0;                                      //был бы голоден
                System.out.println("Сытость, кота по имени " + c.name
                        + " - " + !c.hungry);
            } else {
                p.food -= c.appetite;
                System.out.println("Из миски было съедено " + c.appetite
                        + " еды котом по имени " + c.name);
                c.hungry = false;
                System.out.println("Сытость, кота по имени " + c.name
                        + " - " + !c.hungry);
            }
        }
    }

    public static class Plate {
        private int food;

        public Plate(int food) {
            this.food = food;
            if (this.food < 0)
                this.food = 0;
            else
                this.food = food;
        }

        public void info() {
            System.out.println("Еды в миске: " + food);
        }

        public static void addEat(Plate p, int n) {
            p.food += n;
            System.out.println("В миску добавили " + n + " еды");
        }
    }
}


