package office_hours.practice_10_27;

public class File {
    /*
    create a class File

  instance variables:
   - name (String)
   - size (double)

  constructor:
   - initialize all variables

  methods:
   - toString: print all the quiz information
   - openFile(): print: Opening $fileName
     */
        String name;
        double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }
    public  void openFile(){
        System.out.println("opening "+ name);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
