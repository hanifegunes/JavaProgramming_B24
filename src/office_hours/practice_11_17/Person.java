package office_hours.practice_11_17;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name== null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws  Exception{
        if(age<0 || age>150){

            throw  new Exception();
        }
        this.age = age;
    }
}
