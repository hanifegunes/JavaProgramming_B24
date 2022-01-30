package homework_5arrays;

public class WebsiteChecker {
    public static void main(String[] args) {
        String [] website = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        int count = 0;
        for(int i = 0; i < website.length; i++){
            System.out.println(website[i]);

        }for (int i = 0; i< website.length; i++){
            if(website[i].contains(".")){
                count++;
            }
           // System.out.println(count);
        }

        System.out.println(count);

    }
}
