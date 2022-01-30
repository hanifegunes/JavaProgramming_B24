package office_hours.practice_11_30;

public abstract class SocialMedia {

    public String personalUrl;
    public int accountLength;
    public static String platform;

    public abstract void directMessage(String username, String message);
    public abstract void post(String body);
    public abstract void notification();







}

/*
 Create an abstract class for Social Media that has the following features:

 - Direct messaging(String username, String message)
 - Post(String body)
 - Notifications()

• The Social Media will also have the following fields:

 - Personal URl (String)
 - Account length (int)
 - Platform (static String)



 */
