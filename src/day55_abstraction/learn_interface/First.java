package day55_abstraction.learn_interface;

public interface First {

    public  abstract  void write();// public abstract part is grey, because you do not need it, all methods are public abstract by default

    void  read();


}

class Book implements First{    // must override , otherwise it does not work, we already made methods in First, so we must call override them

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }
}
