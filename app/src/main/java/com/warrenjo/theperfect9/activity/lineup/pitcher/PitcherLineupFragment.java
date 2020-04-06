package com.warrenjo.theperfect9.activity.lineup.pitcher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.warrenjo.theperfect9.R;
import com.warrenjo.theperfect9.activity.lineup.batter.BatterLineupAdapter;

import androidx.fragment.app.Fragment;

public class PitcherLineupFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_batter_lineup, container, false);

        ListView listview ;
        BatterLineupAdapter adapter;

        // Adapter 생성
        adapter = new BatterLineupAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) root.findViewById(R.id.listView);
        listview.setAdapter(adapter);

        /*// 1
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "이태양", "CF") ;
        // 2
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "정은원", "2B") ;
        // 3
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "호잉", "RF") ;
        // 4
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "이성열", "LF") ;
        // 5
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "김태균", "DH") ;
        // 6
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "송광민", "3B") ;
        // 7
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "최재훈", "C") ;
        // 8
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "노시환", "1B") ;
        // 9
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ic_account_box_black_24dp),
                "하주석", "SS") ;*/

        return root;
    }
}
