package edu.hrbeu.xiaox.textview_liftandrightslide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author 编写人： xiaox
 * @date 创建时间： 2017/1/10
 * @Description 功能描述： 该类
 */

public class myAdapter extends BaseAdapter {
    Context context;

    public myAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.textview, parent, false);


        } else {
            view = convertView;

        }
//        convertView.findViewById(R.id.textview1).setSelected(true);
        return view;
    }
}
