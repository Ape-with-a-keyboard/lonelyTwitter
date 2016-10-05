package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 */

/**
 * This is the ImportantTweet of LonelyTwitter project. <p>It handles checking
 * if a input message is important or not</p>
 * @since 1.0
 * @see Tweet
 * @author vinsonlai
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
