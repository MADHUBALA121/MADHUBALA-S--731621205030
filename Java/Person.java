public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Check if the same instance
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); 
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
    }
}
