package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.List;

import java.util.Date;

/**
 * Created by vinsonlai on 2016-09-27.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }
    //done addtweet
    public void testaddTweet(){
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        assertTrue(list.addTweet(tweet));
    }


    public void testhasTweet(){
        TweetList list = new TweetList();

        Tweet b = new NormalTweet("Hello");
        Tweet a = new NormalTweet("Hello");

        list.addTweet(a);
        assertTrue(list.hasTweet(b));
    }
    //done gettweets
    public void testGetTweets(){
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hi");
        Tweet b = new NormalTweet("Hello");
        Tweet c = new NormalTweet("seioth",new Date(0));
        list.addTweet(a);
        list.addTweet(b);
        list.addTweet(c);
        List<Tweet> TimedList = list.getTweets();
        assertTrue(TimedList != null);
        assertTrue(TimedList.get(0)==a);


    }
    //done RemoveTweet
    public void testRemoveTweet(){
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        list.addTweet(a);
        assertTrue(list.HasTweet(a));

        list.removeTweet(a);
        assertFalse(list.HasTweet(a));
    }
    //done Getcount
    public void testgetCount(){
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hello1!");
        Tweet c = new NormalTweet("Hello2!");
        list.addTweet(a);
        list.addTweet(b);
        list.addTweet(c);
        assertTrue(list.getCount(3));

    }



}
