package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by vinsonlai on 2016-09-13.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
    }

        public Tweet(String message, Date date){
            this.message = message;
            this.date = date;
        }

    public abstract Boolean isImportant();




    public void setMessage(String message) throws Tweettoolongexception {
        if (message.length() > 140){
            //do something
            throw new Tweettoolongexception();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
