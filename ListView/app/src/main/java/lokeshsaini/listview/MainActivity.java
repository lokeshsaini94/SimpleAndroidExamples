package lokeshsaini.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Get a reference to the recyclerView
        ListView mListView = (ListView) findViewById(R.id.listView);
        // 2. Create an adapter
        final FriendsAdapter friendsAdapter = new FriendsAdapter(this, setFriends());
        // 3. Set the adapter
        mListView.setAdapter(friendsAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), friendsAdapter.getFriend(position) + " is a friend", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public List<Friend> setFriends() {
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

        List<Friend> friends = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            friends.add(new Friend(names[i], iconID[i]));
        }

        return friends;
    }
}
