package edu.hrbeu.xiaox.textview_liftandrightslide;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author 编写人： xiaox
 * @date 创建时间： 2017/1/10
 * @Description 功能描述： 该类
 */

public class MyTextView extends TextView{


    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context) {
        super(context);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
