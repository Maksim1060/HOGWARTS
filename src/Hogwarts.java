public abstract class Hogwarts {
    String name;
    int magicPower;
    int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }

    public void compare(Hogwarts hogwarts) {
        // ученики одного факультета
        if (this.getClass().equals(hogwarts.getClass())) {
            compareSpicificScore(hogwarts);
        } else {
            comparisonOfStudents(hogwarts);
        }
    }
    abstract public int calculeteSpicificScore();
    public  void compareSpicificScore(Hogwarts hogwarts){
        System.out.println("Сравнение учеников одного факультета");
        int student1 = this.calculeteSpicificScore();
        int student2 = hogwarts.calculeteSpicificScore();
        if (student1 > student2) {
            System.out.println(this.getName() + " Сильнее чем " + hogwarts.getName());

        } else if (student2 > student1) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println("Силы равны");
        }
    }



    public void comparisonOfStudents(Hogwarts hogwarts) {
        System.out.println("Сравнение учеников разных факультетов");
        int student1 = this.getMagicPower() + this.getTransgression();
        int student2 = hogwarts.getMagicPower() + hogwarts.getTransgression();
        if (student1 > student2) {
            System.out.println(this.getName() + " Сильнее чем " + hogwarts.getName());

        } else if (student2 > student1) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println("Силы равны");
        }
    }



    }



