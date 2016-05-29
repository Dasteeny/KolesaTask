package com.example.dust.kolesanews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dust on 30.05.2016.
 */
public class NewsListAdapter extends BaseAdapter {

    private Context ctx;
    private LayoutInflater lInflater;
    private ArrayList<Article> objects;

    public NewsListAdapter(Context context, ArrayList<Article> articles) {
        ctx = context;
        objects = articles;
        lInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.news_row, parent, false);
        }

        Article art = (Article) getItem(position);
        TextView title = (TextView) view.findViewById(R.id.newsTitle);
        TextView source = (TextView) view.findViewById(R.id.source);
        TextView date = (TextView) view.findViewById(R.id.date);
        TextView desc = (TextView) view.findViewById(R.id.desc);

        title.setText(art.getTitle());
        source.append(art.getSource());
        date.append(art.getDate());
        desc.setText(art.getDesc());

        return view;
    }
}
