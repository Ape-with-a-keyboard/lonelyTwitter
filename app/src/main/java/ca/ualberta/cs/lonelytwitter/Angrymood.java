package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by vinsonlai on 2016-09-13.
 */
public class Angrymood extends Mood {


        public Angrymood(Date date){
            super(date);
        }

        @Override
        public String checkmood() {
            return "angry";
        }

}
