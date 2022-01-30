package day58_exceptions.animal;

public class Panda extends  Animal{
  @Override
  public  Animal getAnimal(){
      return  new Panda();
  }

}
