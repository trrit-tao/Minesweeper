
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String p3 = p1.name;
        int p4 = p1.age;
        p1.age = p2.age;
        p1.name = p2.name;
        p2.name = p3;
        p2.age = p4;

    }
}
