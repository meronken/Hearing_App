package jp.Ken.hearingApp;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

public class SoundPlayer {
    private static SoundPool soundPool;
    private static int a_hz,b_hz,c_hz,d_hz,e_hz,f_hz;
    private AudioAttributes audioAttributes;

    public SoundPlayer( Context context ) {

        //SoundPool非推奨解決
        if ( Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP ) {

            audioAttributes = new AudioAttributes.Builder ( )
                    .setUsage ( AudioAttributes.USAGE_GAME )
                    .setContentType ( AudioAttributes.CONTENT_TYPE_MUSIC )
                    .build ( );

            soundPool = new SoundPool.Builder ( )
                    .setAudioAttributes ( audioAttributes )
                    .setMaxStreams ( 2 )
                    .build ( );

        } else {
            soundPool = new SoundPool ( 2 , AudioManager.STREAM_MUSIC , 0 );

        }

        //メディアファイル読み込み　1は再生品質 デフォルト値
        a_hz = soundPool.load ( context,R.raw.a,1 );
        b_hz = soundPool.load ( context,R.raw.b_hz,1 );
        c_hz = soundPool.load ( context,R.raw.c_hz,1 );
        d_hz = soundPool.load ( context,R.raw.d_hz,1 );
        e_hz = soundPool.load ( context,R.raw.e_hz,1 );
        f_hz = soundPool.load ( context,R.raw.f_hz,1 );
    }

    public void play_a_hz(){
        soundPool.play ( a_hz,1.0f, 1.0f, 1, 0, 1.0f );
    }

    public void play_b_hz(){
        soundPool.play ( b_hz,1.0f, 1.0f, 1, 0, 1.0f );
    }

    public void play_c_hz(){
        soundPool.play ( c_hz,1.0f, 1.0f, 1, 0, 1.0f );
    }

    public void play_d_hz(){
        soundPool.play ( d_hz,1.0f, 1.0f, 1, 0, 1.0f );
    }

    public void play_e_hz(){
        soundPool.play ( e_hz,1.0f, 1.0f, 1, 0, 1.0f );
    }

    public void play_f_hz(){
        soundPool.play ( f_hz,1.0f, 1.0f, 1, 0, 1.0f );
    }

}
