package test.androidcours.chatappginfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class ChatsFragment extends Fragment {

    View view;
    RecyclerView recyclerview;
    ArrayList<ChatsModel> mModelArrayList;
    ChatsRecyclerView adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerview = view.findViewById(R.id.chats_recycler_view);
        mModelArrayList = new ArrayList<>();

        mModelArrayList.add(new ChatsModel("Kevin Mbitkebeyo", R.drawable.mrk, "Salut comment vas tu ?", "19:10"));
        mModelArrayList.add(new ChatsModel("Kevin Mbitkebeyo", R.drawable.mrk, "Salut comment vas tu ?", "19:10"));
        mModelArrayList.add(new ChatsModel("Kevin Mbitkebeyo", R.drawable.mrk, "Salut comment vas tu ?", "19:10"));
        mModelArrayList.add(new ChatsModel("Kevin Mbitkebeyo", R.drawable.mrk, "Salut comment vas tu ?", "19:10"));

        adapter = new ChatsRecyclerView(getContext(), mModelArrayList);
        LinearLayoutManager llm = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerview.setLayoutManager(llm);
        recyclerview.setAdapter(adapter);




        return view;
    }
}