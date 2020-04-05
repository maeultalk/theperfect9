package com.warrenjo.theperfect9.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.warrenjo.theperfect9.R;
import com.warrenjo.theperfect9.model.LineupPlayer;

import java.util.ArrayList;

public class LineupAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<LineupPlayer> itemList = new ArrayList<LineupPlayer>() ;

    // LineupAdapter의 생성자
    public LineupAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return itemList.size() ;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "item_lineup_player" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_lineup_player, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView textView_order = (TextView) convertView.findViewById(R.id.textView_order) ;
        ImageView imageView_face = (ImageView) convertView.findViewById(R.id.imageView_face) ;
        TextView textView_position = (TextView) convertView.findViewById(R.id.textView_position) ;
        TextView textView_name = (TextView) convertView.findViewById(R.id.textView_name) ;
        TextView textView_hand = (TextView) convertView.findViewById(R.id.textView_hand) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        LineupPlayer item = itemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        textView_order.setText(String.valueOf(position + 1));
        imageView_face.setImageDrawable(item.getFace());
        textView_position.setText(item.getPosition());
        textView_name.setText(item.getName());
        textView_hand.setText(item.getHand());

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return itemList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(Drawable face, String name, String position, String hand) {
        LineupPlayer item = new LineupPlayer();

        item.setFace(face);
        item.setName(name);
        item.setPosition(position);
        item.setHand(hand);

        itemList.add(item);
    }
}