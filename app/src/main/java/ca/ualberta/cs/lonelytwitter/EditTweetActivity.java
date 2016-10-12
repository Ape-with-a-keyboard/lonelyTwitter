package ca.ualberta.cs.lonelytwitter;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

/**
 * Created by vinsonlai on 2016-10-11.
 */
public class EditTweetActivity extends Activity{
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        String message = intent.getStringExtra("tweet");
        TextView textView = (TextView) findViewById(R.id.edititweet_title);
        textView.setText(message);


    }
}
