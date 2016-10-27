package lokeshsaini.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FriendsAdapter extends BaseAdapter {
    private final Context mContext;
    private final Friend[] mFriends;

    public FriendsAdapter(Context mContext, Friend[] mFriends) {
        this.mContext = mContext;
        this.mFriends = mFriends;
    }

    @Override
    public int getCount() {
        if (mFriends == null || mFriends.length == 0) {
            return -1;
        }
        return mFriends.length;
    }

    @Override
    public Object getItem(int position) {
        if (mFriends == null || mFriends.length == 0) {
            return null;
        }
        return mFriends[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater myInflater = LayoutInflater.from(mContext);
            view = myInflater.inflate(R.layout.cards_layout, parent, false);

            ImageView imageView = (ImageView) view.findViewById(R.id.iconID);
            TextView textView = (TextView) view.findViewById(R.id.name);

            textView.setText(mFriends[position].getName());
            imageView.setImageResource(mFriends[position].getIconID());
        }

        return view;
    }
}
