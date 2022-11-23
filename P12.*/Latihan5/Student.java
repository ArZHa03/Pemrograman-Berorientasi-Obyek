public class Student extends BaseModel {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
