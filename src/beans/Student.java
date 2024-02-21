package beans;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;

    public Student(){

    }
    public Student(String name, String surname, int age, String className){
        this.name = name;
        this.surname = surname;
        this.className = className;
        this.age = age;

    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getSurname() {
        return surname;
    }

    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String getFullInfo(){
        return this.getName()+" "+this.getSurname()+" "+this.getAge()+" "+this.getClassName();

    }
}

