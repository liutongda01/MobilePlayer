package pager;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import fragment.BaseFragment;

/**
 * Created by Liutongda on 2017/5/19.
 */

public class LocalAudioPager extends BaseFragment{
    private TextView textView;
    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }
    @Override
    public void initData() {
        super.initData();
        textView.setText("网络音频的内容");
    }

}
