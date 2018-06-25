package com.example.abhinay.tic_tac_toe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import static com.example.abhinay.tic_tac_toe.R.drawable.*;
import static com.example.abhinay.tic_tac_toe.R.drawable.multiply;

public class OneOnOne extends Activity {

    int count = 0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;

    String imageName1, imageName2, imageName3, imageName4, imageName5, imageName6, imageName7, imageName8, imageName9;

    int[] imageArray = {R.drawable.multiply, R.drawable.zero};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityone);

         imageView1 = (ImageView) findViewById(R.id.imageView);
         imageView2 = (ImageView) findViewById(R.id.imageView2);
         imageView3 = (ImageView) findViewById(R.id.imageView3);
         imageView4 = (ImageView) findViewById(R.id.imageView4);
         imageView5 = (ImageView) findViewById(R.id.imageView5);
         imageView6 = (ImageView) findViewById(R.id.imageView6);
         imageView7 = (ImageView) findViewById(R.id.imageView7);
         imageView8 = (ImageView) findViewById(R.id.imageView8);
         imageView9 = (ImageView) findViewById(R.id.imageView9);


    }
    public void changeImage1(View v){
        if((count == 0) && (imageName1 != "multiply") && (imageName1 != "zero")) {
            imageView1.setImageResource(imageArray[count]);
            imageName1 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName1 != "multiply") && (imageName1 != "zero")){
            imageView1.setImageResource(imageArray[count]);
            imageName1 = "zero";
            count = count - 1;
            checkResult();
        }

    }
    public void changeImage2(View v){
        if((count == 0) && (imageName2 != "multiply") && (imageName2 != "zero")) {
            imageView2.setImageResource(imageArray[count]);
            imageName2 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName2 != "multiply") && (imageName2 != "zero")){
            imageView2.setImageResource(imageArray[count]);
            imageName2 = "zero";
            count = count - 1;
            checkResult();
        }
    }
    public void changeImage3(View v){
        if((count == 0) && (imageName3 != "multiply") && (imageName3 != "zero")) {
            imageView3.setImageResource(imageArray[count]);
            imageName3 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName3 != "multiply") && (imageName3 != "zero")){
            imageView3.setImageResource(imageArray[count]);
            imageName3 = "zero";
            count = count - 1;
            checkResult();
        }
    }
    public void changeImage4(View v){
        if((count == 0) && (imageName4 != "multiply") && (imageName4 != "zero")) {
            imageView4.setImageResource(imageArray[count]);
            imageName4 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName4 != "multiply") && (imageName4 != "zero")){
            imageView4.setImageResource(imageArray[count]);
            imageName4 = "zero";
            count = count - 1;
            checkResult();
        }
    }
    public void changeImage5(View v){
        if((count == 0) && (imageName5 != "multiply") && (imageName5 != "zero")) {
            imageView5.setImageResource(imageArray[count]);
            imageName5 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName5 != "multiply") && (imageName5 != "zero")){
            imageView5.setImageResource(imageArray[count]);
            imageName5 = "zero";
            count = count - 1;
            checkResult();
        }
    }
    public void changeImage6(View v){
        if((count == 0) && (imageName6 != "multiply") && (imageName6 != "zero")) {
            imageView6.setImageResource(imageArray[count]);
            imageName6 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName6 != "multiply") && (imageName6 != "zero")){
            imageView6.setImageResource(imageArray[count]);
            imageName6 = "zero";
            count = count - 1;
            checkResult();
        }
    }
    public void changeImage7(View v){
        if((count == 0) && (imageName7 != "multiply") && (imageName7 != "zero")) {
            imageView7.setImageResource(imageArray[count]);
            imageName7 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName7 != "multiply") && (imageName7 != "zero")){
            imageView7.setImageResource(imageArray[count]);
            imageName7 = "zero";
            count = count - 1;
            checkResult();
        }
    }
    public void changeImage8(View v){
        if((count == 0) && (imageName8 != "multiply") && (imageName8 != "zero")) {
            imageView8.setImageResource(imageArray[count]);
            imageName8 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName8 != "multiply") && (imageName8 != "zero")){
            imageView8.setImageResource(imageArray[count]);
            imageName8 = "zero";
            count = count - 1;
            checkResult();
        }
    }
    public void changeImage9(View v){
        if((count == 0) && (imageName9 != "multiply") && (imageName9 != "zero")) {
            imageView9.setImageResource(imageArray[count]);
            imageName9 = "multiply";
            count = count + 1;
            checkResult();
        }
        else if((count == 1) && (imageName9 != "multiply") && (imageName9 != "zero")){
            imageView9.setImageResource(imageArray[count]);
            imageName9 = "zero";
            count = count - 1;
            checkResult();
        }
    }

    private void checkResult(){
        if(((imageName1 == "multiply") && (imageName2 == "multiply") && (imageName3 == "multiply"))||
                ((imageName4 == "multiply") && (imageName5 == "multiply") && (imageName6 == "multiply")) ||
                ((imageName7 == "multiply") && (imageName8 == "multiply") && (imageName9 == "multiply")) ||
                ((imageName1 == "multiply") && (imageName4 == "multiply") && (imageName7 == "multiply")) ||
                ((imageName2 == "multiply") && (imageName5 == "multiply") && (imageName8 == "multiply")) ||
                ((imageName3 == "multiply") && (imageName6 == "multiply") && (imageName9 == "multiply")) ||
                ((imageName1 == "multiply") && (imageName5 == "multiply") && (imageName9 == "multiply")) ||
                ((imageName3 == "multiply") && (imageName5 == "multiply") && (imageName7 == "multiply"))){
            popup("One");
        }
        else if(((imageName1 == "zero") && (imageName2 == "zero") && (imageName3 == "zero"))||
                ((imageName4 == "zero") && (imageName5 == "zero") && (imageName6 == "zero")) ||
                ((imageName7 == "zero") && (imageName8 == "zero") && (imageName9 == "zero")) ||
                ((imageName1 == "zero") && (imageName4 == "zero") && (imageName7 == "zero")) ||
                ((imageName2 == "zero") && (imageName5 == "zero") && (imageName8 == "zero")) ||
                ((imageName3 == "zero") && (imageName6 == "zero") && (imageName9 == "zero")) ||
                ((imageName1 == "zero") && (imageName5 == "zero") && (imageName9 == "zero")) ||
                ((imageName3 == "zero") && (imageName5 == "zero") && (imageName7 == "zero"))){
            popup("Two");
        }
        else if(((imageName1 == "multiply") || (imageName1 == "zero")) &&
                ((imageName2 == "multiply") || (imageName2 == "zero")) &&
                ((imageName3 == "multiply") || (imageName3 == "zero")) &&
                ((imageName4 == "multiply") || (imageName4 == "zero")) &&
                ((imageName5 == "multiply") || (imageName5 == "zero")) &&
                ((imageName6 == "multiply") || (imageName6 == "zero")) &&
                ((imageName7 == "multiply") || (imageName7 == "zero")) &&
                ((imageName8 == "multiply") || (imageName8 == "zero")) &&
                ((imageName9 == "multiply") || (imageName9 == "zero"))){
            popup("none");
        }

    }

    public void popup(String name){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        if(name == "One" || name == "Two")
        alert.setTitle("Player "+name+" Win");
        else if(name == "none")
            alert.setTitle("It is a draw");
        alert.setCancelable(true);
        alert.setMessage("Want to play again!");
        alert.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(getIntent());
            }
        });
        alert.show();
    }

}


