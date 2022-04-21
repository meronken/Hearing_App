package jp.Ken.hearingApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPlayer soundPlayer;



    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        soundPlayer = new SoundPlayer ( this );
    }


    //19歳以下　20000Hz
    public void button24( View v){
        //音声再生
        soundPlayer.play_a_hz ();
        try {
            Thread.sleep ( 5500 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }

    //24歳以下  18000Hz
    public void button30( View v){
        //音声再生
        soundPlayer.play_b_hz ();
        try {
            Thread.sleep ( 7000 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }

    //29歳以下  16000Hz
    public void button39( View v){
        //音声再生
        soundPlayer.play_c_hz ();
        try {
            Thread.sleep ( 5500 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }
    //39歳以下  14000Hz
    public void button49( View v){
        //音声再生
        soundPlayer.play_d_hz ();
        try {
            Thread.sleep ( 5500 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }
    //49歳以下  12000Hz
    public void button50( View v){
        //音声再生
        soundPlayer.play_e_hz ();
        try {
            Thread.sleep ( 5500 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }

    //59歳以下  11000Hz
    public void button60( View v){
        //音声再生
        soundPlayer.play_f_hz ();
        try {
            Thread.sleep ( 5500 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }

    //ダイヤログ　加齢性難聴について
    public void Hint( View v ){
        DialogFragment dialogFragment = new myDialogFragment ();
        dialogFragment.show (getSupportFragmentManager (),"my_dialog");
    }

}