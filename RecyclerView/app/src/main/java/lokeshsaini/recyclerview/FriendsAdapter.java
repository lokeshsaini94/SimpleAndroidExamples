package lokeshsaini.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {

    private LayoutInflater layoutInflater;
    private Friend[] friends;

    public FriendsAdapter(Context context, Friend[] friends) {
        this.friends = friends;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.cards_layout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {
        viewHolder.textView.setText(friends[position].getName());
        viewHolder.imageView.setImageResource(friends[position].getIconID());
    }

    @Override
    public int getItemCount() {
        return friends.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.name);
            imageView = (ImageView) itemView.findViewById(R.id.iconID);
        }
    }
}
