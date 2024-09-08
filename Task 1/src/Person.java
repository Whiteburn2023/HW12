public class Person {
    private String name;
    private String position;
    private String placeOfWork;
    private int age;
    private int salary;

    public Person() {
    }

    public Person(String name, String position, String placeOfWork, int age, int salary) {
        this.name = name;
        this.position = position;
        this.placeOfWork = placeOfWork;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
