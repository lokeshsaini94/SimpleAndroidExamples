package lokeshsaini.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is data for the recycler view
        Friend[] friends = setFriends();

        // 1. Get a reference to the recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // 2. Set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. Create an adapter
        FriendsAdapter mAdapter = new FriendsAdapter(this, friends);
        // 4. Set the adapter
        recyclerView.setAdapter(mAdapter);
        // 5. Set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    public Friend[] setFriends() {
        String[] names = {
                "Sudhir",
                "Piyush",
                "Mumukshoo",
                "Harsh",
                "Shubham",
                "Balvinder",
                "Deepanshu"
        };
        int[] icons = {
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
            friends[i] = new Friend(names[i], icons[i]);
        }

        return friends;
    }
}
