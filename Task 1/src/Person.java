public class Person {
    protected String name;
    protected String post;
    protected String placeOfWork;
    protected int age;
    protected int salary;

    public Person() {
    }

    public Person(String name, String post, String placeOfWork, int age, int salary) {
        this.name = name;
        this.post = post;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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
