package fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Liutongda on 2017/5/19.
 */

public abstract class BaseFragment extends Fragment {
    public Context context;

    /**
     * 当Fragment被创建的时候回调
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
    }
    /**
     * 当创建视图的时候回调
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView();//得到视图
    }

    public abstract View initView();

    /**
     * 当依附的Activity被创建的时候回调
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();//在得到视图的基础上，设置数据
    }
    /**
     * 当子类需要绑定数据的时候，重写该方法
     */
    public void initData() {
    }


}
