package mobileplayer.startallvideoplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startAllVideoPlayer(View v) {
        Intent intent = new Intent();
        intent.setDataAndType(Uri.parse("http://192.168.31.168:8080/oppo.mp4"),"video/*");
        startActivity(intent);
    }
}
