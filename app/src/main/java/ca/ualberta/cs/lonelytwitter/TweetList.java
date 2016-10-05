/**
 * Copyright (c) 2016 team 20, CMPUT301. University of Alberta. All Rights Reserved.
 * You may use distribute and copy all parts of this code under terms and condition of
 * University of Alberta and the Code of Student Behavior
 * You can find the copy of licence at http://www.github.com/team20/...
 * For further information, contact me at wankinvi@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Created by vinsonlai on 2016-09-27.
 */
public class TweetList {
    List<Tweet> tweets = new ArrayList<Tweet>();
    public boolean addTweet(Tweet tweet) {
        if (tweets.contains(tweet)) {
            return false;
        }
        else {
            tweets.add(tweet);
            return true;
        }

    }

    public boolean hasTweet(Tweet tweet) {

        return tweets.get(0).getMessage() == tweet.getMessage();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void removeTweet(Tweet a) {
        tweets.remove(a);
    }

    public boolean getCount(int i) {
        int sizeOfList=tweets.size();
        return sizeOfList == i;
    }

    public boolean sortdate(Tweet tweet) {
        return tweet.getDate().getTime() >
                (tweets.get(0).getDate().getTime()) ;
    }

    public boolean HasTweet(Tweet a) {
        return tweets.contains(a);
    }
}
