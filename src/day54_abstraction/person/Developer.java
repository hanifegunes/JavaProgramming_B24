package day54_abstraction.person;

public class Developer extends Employee{
    @Override
    public void work() {
        System.out.println("Developer makes code");

    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Loosing sleep because of bug");

    }
}
