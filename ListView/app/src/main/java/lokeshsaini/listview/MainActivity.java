package lokeshsaini.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is data for the list view
        Friend[] friends = setFriends();

        // 1. Get a reference to the recyclerView
        ListView mListView = (ListView) findViewById(R.id.listView);
        // 2. Create an adapter
        FriendsAdapter friendsAdapter = new FriendsAdapter(this, friends);
        // 3. Set the adapter
        mListView.setAdapter(friendsAdapter);
    }

    public Friend[] setFriends() {
        String[] names = getResources().getStringArray(R.array.friends);
        int[] iconID = {
                R.drawable.ic_mood_white_24dp,
                R.drawable.ic_mood_bad_white_24dp,
                R.drawable.ic_sentiment_neutral_white_24dp,
                R.drawable.ic_sentiment_dissatisfied_white_24dp,
                R.drawable.ic_sentiment_satisfied_white_24dp,
                R.drawable.ic_sentiment_very_dissatisfied_white_24dp,
                R.drawable.ic_sentiment_very_satisfied_white_24dp,
        };

        Friend[] friends = new Friend[names.length];

        for (int i = 0; i < names.length; i++) {
            friends[i] = new Friend(names[i], iconID[i]);
        }

        return friends;
    }
}
