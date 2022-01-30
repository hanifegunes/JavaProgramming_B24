package office_hours.practice_11_30;

import java.util.ArrayList;
import java.util.List;

public class FaceBookUser extends  SocialMedia{
    private String username;
    private String password;
    private String fullname;
    private  int age;
    private  int numberOfFriends;
    private List<Post> allPasts;


    static  {
        platform="facebook";
    }

    public  FaceBookUser(String username, String password){
        this.username= username;
        setPassword(password);
        personalUrl = "facebook.com/"+ username;
        allPasts = new ArrayList<>();

    }

    @Override
    public void directMessage(String username, String message) {

    }

    @Override
    public void post(String body) {

    }

    @Override
    public void notification() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains(username)){
            System.out.println("password should not contain the username,default password set");
            this.password = "default";
        } else{
        this.password = password;
    }  }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public List<Post> getAllPasts() {
        return allPasts;
    }

    public void setAllPasts(List<Post> allPasts) {
        this.allPasts = allPasts;
    }
}
