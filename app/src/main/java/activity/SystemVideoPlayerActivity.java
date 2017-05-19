package activity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import svntest.mobileplayer.R;

/**
 * Created by Liutongda on 2017/5/19.
 */

public class SystemVideoPlayerActivity extends AppCompatActivity{
    private VideoView vv;
    private Uri uri;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_video_player);
        vv = (VideoView)findViewById(R.id.vv);
        //得到播放地址
        uri = getIntent().getData();
        //设置播放器三个监听：播放准备好的监听，播放完成的监听，播放出错的监听
        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            //底层准备播放完成的时候回调
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vv.start();//开始播放
            }
        });
        vv.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mediaPlayer, int i, int i1) {
                Toast.makeText(SystemVideoPlayerActivity.this, "播放出錯", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //设置监听播放完成
        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(SystemVideoPlayerActivity.this, "視頻播放完成", Toast.LENGTH_SHORT).show();
                finish();//退出当前页面
            }
        });
        //设置播放地址
        vv.setVideoURI(uri);
        //设置控制面板
        vv.setMediaController(new MediaController(this));
    }
}
