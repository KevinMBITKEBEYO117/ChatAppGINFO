package test.androidcours.chatappginfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatsRecyclerView extends RecyclerView.Adapter<ChatsRecyclerView.ViewHolder> {

    private Context context;

    private ArrayList<ChatsModel> arrayList;

    public ChatsRecyclerView(Context context, ArrayList<ChatsModel> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ChatsRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.chats_recyclerview_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsRecyclerView.ViewHolder holder, int position) {
        holder.profile.setImageResource(arrayList.get(position).getChatImage());
        holder.name.setText(arrayList.get(position).getChatName());
        holder.lastmsg.setText(arrayList.get(position).getLastMsg());
        holder.time.setText(arrayList.get(position).getLastMsgTime());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView name, lastmsg,time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile_picture);
            name = itemView.findViewById(R.id.chat_person_name);
            lastmsg = itemView.findViewById(R.id.last_messsage);
            time = itemView.findViewById(R.id.chat_time);
        }
    }
}
