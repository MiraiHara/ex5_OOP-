public class App {
    public static void main(String[] args) {
        Student john = new Student.StudentBuilder("John", "AAA University").age(20).build();
        System.out.println(john);

        Student jane = new Student.StudentBuilder("Jane", "BBB University").build();
        System.out.println(jane);
    }    
}
