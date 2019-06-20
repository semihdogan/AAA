package com.iamer.lenovo.tabletdeneme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }





    public void birincises(View view) {
        mediaPlayer=MediaPlayer.create(this,R.raw.sesdeneme);
        mediaPlayer.start();
          /*
         Not:normal sanal emülatörde çalıştırdıgımda birinci ve ikinci ses de sorunsuz çalıyor.
         ama tableti geliştirici olarak android studio bağladıgımda
         1.ses çalıyor hiç bir sıkıntı yok ama 2.ses tıklayınca uygulama durduruldu hatası veriyor


           */
    }



    public void durdur(View view) {
        mediaPlayer.stop();

    }

    public void ikincises(View view) {
        mediaPlayer=MediaPlayer.create(this,R.raw.adanaliyim);
        mediaPlayer.start();
    }
}
