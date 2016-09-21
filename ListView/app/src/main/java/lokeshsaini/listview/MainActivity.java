package lokeshsaini.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = {"Lokesh", "Sudhir", "Piyush", "Mumukshoo", "Harsh", "Shubham", "Balvinder", "Deepanshu"};

        ListAdapter adapter = new MyAdapter(this, names);
        ListView mListView = (ListView)findViewById(R.id.listView);
        mListView.setAdapter(adapter);
    }
}
