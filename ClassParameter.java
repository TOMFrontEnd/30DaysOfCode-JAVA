public class ClassParameter {
    public static void main(String[] args) {
        Person p = new Person();
        String[] fullname = { "Homer", "Simpson" };
        p.setName(fullname);
        System.out.println(p.getName());
        fullname[0] = "Bart";
        System.out.println(p.getName());
    }
}

class Person {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    } 
}
