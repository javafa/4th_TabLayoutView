package com.veryworks.android.tablayout;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by pc on 9/28/2017.
 */

public class One extends FrameLayout {

    public One(Context context) {
        super(context);
        initView();
    }

    public One(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    // 여기서 내가 만든 레이아웃을 inflate하고
    // 나 자신에게 add한다.
    private void initView(){
        // 1. 레이아웃 파일로 뷰를 만들고
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_one, null);

        // 로직작성
        process();

        addView(view);
    }

    private void process(){

    }
}
