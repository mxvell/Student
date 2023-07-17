public class Student extends Person{
    private String course;

    public Student(String name, String lastName, String sex, int age, double weight, String course) {
        super(name, lastName, sex, age, weight);
        this.course = course;
    }



    public String getCourse() {
        return course;
    }



    @Override
    public String toString() {
        return this.getName() + this.getLastName() + this.getSex() + this.getAge() + " age  " + this.getWeight() + " weight " +this.getCourse();

    }



}
