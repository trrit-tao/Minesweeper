class Cat {
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        String nameCat;
        int ageCat;
        ++counter;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }


    public static int getNumberOfCats() {
        return counter;
    }
}