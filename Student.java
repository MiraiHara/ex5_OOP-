public class Student {
    // required
    private String name;
    private String university;
    
    // optional
    private int age;

    private Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.university = studentBuilder.university;
        this.age = studentBuilder.age;
    }

    public static class StudentBuilder {
        // requied
        private final String name;
        private final String university;

        // optional
        private int age;

        public StudentBuilder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: " + name + "\n");
        sb.append("university: " + university + "\n");
        if (age != 0 && age > 0) sb.append("age: " + age + "\n");
        return sb.toString();
    }
}