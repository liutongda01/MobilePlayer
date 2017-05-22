package view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;


/**
 * Created by Liutongda on 2017/5/22.
 */

public class VitamVideoView extends io.vov.vitamio.widget.VideoView {

    public VitamVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }
    public void setVideSize(int width,int height){
        ViewGroup.LayoutParams l = getLayoutParams();
        l.width = width;
        l.height = height;
        setLayoutParams(l);
    }


}
