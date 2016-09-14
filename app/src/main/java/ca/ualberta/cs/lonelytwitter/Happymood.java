package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by vinsonlai on 2016-09-13.
 */
public class Happymood extends Mood{

    public Happymood(Date date){
        super(date);
    }

    public String checkmood() {
        return "Happy";
    }

}
