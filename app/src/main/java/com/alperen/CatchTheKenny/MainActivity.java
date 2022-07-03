package com.alperen.CatchTheKenny;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;

    TextView textView2;     // timer
    TextView textView3;
    Runnable runnable;
    Handler handler;
    int count = 1;
    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);


        textView2 = findViewById(R.id.textView2); // timer
        textView3 = findViewById(R.id.textView3);

        textView3.setText("Score: "+(count-1));

        generate_random();
        hideImage();

        new CountDownTimer(11000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                textView2.setText("Time: "+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                textView2.setText("Time's off");

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

                alert.setTitle("Restart?");
                alert.setMessage("Are you sure to restart game?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Restarting...",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Closed",Toast.LENGTH_LONG).show();

                    }
                });

                alert.show();
            }
        }.start();

    }

    public void hideImage() {

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                if(x==0){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.VISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }

                else if(x==1){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==2){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==3){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.VISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==4){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.VISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==5){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.VISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==6){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.VISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==7){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.VISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==8){
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.VISIBLE);
                    imageView8.setVisibility(View.INVISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }
                else if(x==9) {
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView6.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    imageView8.setVisibility(View.VISIBLE);
                    imageView9.setVisibility(View.INVISIBLE);
                    imageView10.setVisibility(View.INVISIBLE);
                    //x++;
                    generate_random();
                }
                handler.postDelayed(runnable,1000);
            }
        };
        handler.post(runnable);
    }

    public void generate_random(){
        Random random = new Random();
        x = random.nextInt(10);
    }

    public void kennyCaught (View view){

        if(textView2.getText().toString().matches("Time's off")){
            textView3.setEnabled(false);
        }
        else{
            textView3.setText("Score: "+count);
            count++;
        }
    }
}