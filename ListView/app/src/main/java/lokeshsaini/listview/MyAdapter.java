package lokeshsaini.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class MyAdapter extends ArrayAdapter<String> {

    MyAdapter(Context context, String[] names) {
        super(context, R.layout.cards_layout, names);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View view = myInflater.inflate(R.layout.cards_layout, parent, false);

        String singleName = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.card_content);

        textView.setText(singleName);

        return view;
    }
}
