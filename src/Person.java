public class Person {
    private String name;
    private String lastName;
    private String sex;
    private int age;
    private double weight;

    public Person(String name, String lastName, String sex, int age, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String showInfo() {
        return getName() + " " + getLastName() + " " + getSex() + " " + getWeight() + " " + getAge();
    }
}
