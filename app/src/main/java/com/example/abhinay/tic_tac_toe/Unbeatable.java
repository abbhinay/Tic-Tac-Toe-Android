package com.example.abhinay.tic_tac_toe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Unbeatable extends Activity {

    int count = 1;
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
        setContentView(R.layout.unbeatable);

        imageView1 = (ImageView) findViewById(R.id.UimageView);
        imageView2 = (ImageView) findViewById(R.id.UimageView2);
        imageView3 = (ImageView) findViewById(R.id.UimageView3);
        imageView4 = (ImageView) findViewById(R.id.UimageView4);
        imageView5 = (ImageView) findViewById(R.id.UimageView5);
        imageView6 = (ImageView) findViewById(R.id.UimageView6);
        imageView7 = (ImageView) findViewById(R.id.UimageView7);
        imageView8 = (ImageView) findViewById(R.id.UimageView8);
        imageView9 = (ImageView) findViewById(R.id.UimageView9);

    }

    public void ChangeImage1(View v){
        if(imageName1 != "multiply" && imageName1 != "zero"){
            imageView1.setImageResource(imageArray[0]);
            imageName1 = "multiply";
            CheckResult();
            secondTurn();
        }
    }
    public void ChangeImage2(View v){
        if(imageName2 != "multiply" && imageName2 != "zero"){
            imageView2.setImageResource(imageArray[0]);
            imageName2 = "multiply";
            Log.d("log", "level1");
            CheckResult();
            Log.d("log", "level2");
            secondTurn();
            Log.d("log", "level3");
        }
    }
    public void ChangeImage3(View v){
        if(imageName3 != "multiply" && imageName3 != "zero"){
            imageView3.setImageResource(imageArray[0]);
            imageName3 = "multiply";
            CheckResult();
            secondTurn();
        }
    }
    public void ChangeImage4(View v){
        if(imageName4 != "multiply" && imageName4 != "zero"){
            imageView4.setImageResource(imageArray[0]);
            imageName4 = "multiply";
            CheckResult();
            secondTurn();
        }
    }
    public void ChangeImage5(View v){
        if(imageName5 != "multiply" && imageName5 != "zero"){
            imageView5.setImageResource(imageArray[0]);
            imageName5 = "multiply";
            CheckResult();
            secondTurn();
        }
    }
    public void ChangeImage6(View v){
        if(imageName6 != "multiply" && imageName6 != "zero"){
            imageView6.setImageResource(imageArray[0]);
            imageName6 = "multiply";
            CheckResult();
            secondTurn();
        }
    }
    public void ChangeImage7(View v){
        if(imageName7 != "multiply" && imageName7 != "zero"){
            imageView7.setImageResource(imageArray[0]);
            imageName7 = "multiply";
            CheckResult();
            secondTurn();
        }
    }
    public void ChangeImage8(View v){
        if(imageName8 != "multiply" && imageName8 != "zero"){
            imageView8.setImageResource(imageArray[0]);
            imageName8 = "multiply";
            CheckResult();
            secondTurn();
        }
    }
    public void ChangeImage9(View v){
        if(imageName9 != "multiply" && imageName9 != "zero"){
            imageView9.setImageResource(imageArray[0]);
            imageName9 = "multiply";
            CheckResult();
            secondTurn();
        }
    }

    public void secondTurn(){
        if(imageName5 != "multiply" && imageName5 != "zero"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            count = 2;
        }
        else if(imageName1 == "multiply" && count == 1){
            imageView1.setImageResource(imageArray[1]);
            count = 2;
            imageName1 = "zero";
        }
        else if(imageName1 == "zero" && imageName2 == "zero" && imageName3 != "zero" && imageName3 != "multiply"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }
        else if(imageName1 == "zero" && imageName3 == "zero" && imageName2 != "zero" && imageName2 != "multiply"){
            imageView2.setImageResource(imageArray[1]);
            imageName2 = "zero";
            CheckResult();
        }
        else if(imageName3 == "zero" && imageName2 == "zero" && imageName1 != "zero" && imageName1 != "multiply"){
            imageView1.setImageResource(imageArray[1]);
            imageName1 = "zero";
            CheckResult();
        }
        else if(imageName4 == "zero" && imageName5 == "zero" && imageName6 != "zero" && imageName6 != "multiply"){
            imageView6.setImageResource(imageArray[1]);
            imageName6 = "zero";
            CheckResult();
        }
        else if(imageName4 == "zero" && imageName6 == "zero" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName5 == "zero" && imageName6 == "zero" && imageName4 != "zero" && imageName4 != "multiply"){
            imageView4.setImageResource(imageArray[1]);
            imageName4 = "zero";
            CheckResult();
        }
        else if(imageName7 == "zero" && imageName8 == "zero" && imageName9 != "zero" && imageName9 != "multiply"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }
        else if(imageName7 == "zero" && imageName9 == "zero" && imageName8 != "zero" && imageName8 != "multiply"){
            imageView8.setImageResource(imageArray[1]);
            imageName8 = "zero";
            CheckResult();
        }
        else if(imageName8 == "zero" && imageName9 == "zero" && imageName7 != "zero" && imageName7 != "multiply"){
            imageView7.setImageResource(imageArray[1]);
            imageName7 = "zero";
            CheckResult();
        }
        else if(imageName1 == "zero" && imageName4 == "zero" && imageName7 != "zero" && imageName7 != "multiply"){
            imageView7.setImageResource(imageArray[1]);
            imageName7 = "zero";
            CheckResult();
        }
        else if(imageName1 == "zero" && imageName7 == "zero" && imageName4 != "zero" && imageName4 != "multiply"){
            imageView4.setImageResource(imageArray[1]);
            imageName4 = "zero";
            CheckResult();
        }
        else if(imageName4 == "zero" && imageName7 == "zero" && imageName1 != "zero" && imageName1 != "multiply"){
            imageView1.setImageResource(imageArray[1]);
            imageName1 = "zero";
            CheckResult();
        }
        else if(imageName2 == "zero" && imageName5 == "zero" && imageName8 != "zero" && imageName8 != "multiply"){
            imageView8.setImageResource(imageArray[1]);
            imageName8 = "zero";
            CheckResult();
        }
        else if(imageName2 == "zero" && imageName8 == "zero" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName8 == "zero" && imageName5 == "zero" && imageName2 != "zero" && imageName2 != "multiply"){
            imageView2.setImageResource(imageArray[1]);
            imageName2 = "zero";
            CheckResult();
        }
        else if(imageName3 == "zero" && imageName6 == "zero" && imageName9 != "zero" && imageName9 != "multiply"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }
        else if(imageName9 == "zero" && imageName3 == "zero" && imageName6 != "zero" && imageName6 != "multiply"){
            imageView6.setImageResource(imageArray[1]);
            imageName6 = "zero";
            CheckResult();
        }
        else if(imageName6 == "zero" && imageName9 == "zero" && imageName3 != "zero" && imageName3 != "multiply"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }
        else if(imageName1 == "zero" && imageName5 == "zero" && imageName9 != "zero" && imageName9 != "multiply"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }
        else if(imageName1 == "zero" && imageName9 == "zero" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName5 == "zero" && imageName9 == "zero" && imageName1 != "zero" && imageName1 != "multiply"){
            imageView1.setImageResource(imageArray[1]);
            imageName1 = "zero";
            CheckResult();
        }
        else if(imageName3 == "zero" && imageName5 == "zero" && imageName7 != "zero" && imageName7 != "multiply"){
            imageView7.setImageResource(imageArray[1]);
            imageName7 = "zero";
            CheckResult();
        }
        else if(imageName3 == "zero" && imageName7 == "zero" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName5 == "zero" && imageName7 == "zero" && imageName3 != "zero" && imageName3 != "multiply"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }


        else if(imageName1 == "multiply" && imageName2 == "multiply" && imageName3 != "zero" && imageName3 != "multiply"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }
        else if(imageName1 == "multiply" && imageName3 == "multiply" && imageName2 != "zero" && imageName2 != "multiply"){
            imageView2.setImageResource(imageArray[1]);
            imageName2 = "zero";
            CheckResult();
        }
        else if(imageName3 == "multiply" && imageName2 == "multiply" && imageName1 != "zero" && imageName1 != "multiply"){
            imageView1.setImageResource(imageArray[1]);
            imageName1 = "zero";
            CheckResult();
        }
        else if(imageName4 == "multiply" && imageName5 == "multiply" && imageName6 != "zero" && imageName6 != "multiply"){
            imageView6.setImageResource(imageArray[1]);
            imageName6 = "zero";
            CheckResult();
        }
        else if(imageName4 == "multiply" && imageName6 == "multiply" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName5 == "multiply" && imageName6 == "multiply" && imageName4 != "zero" && imageName4 != "multiply"){
            imageView4.setImageResource(imageArray[1]);
            imageName4 = "zero";
            CheckResult();
        }
        else if(imageName7 == "multiply" && imageName8 == "multiply" && imageName9 != "zero" && imageName9 != "multiply"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }
        else if(imageName7 == "multiply" && imageName9 == "multiply" && imageName8 != "zero" && imageName8 != "multiply"){
            imageView8.setImageResource(imageArray[1]);
            imageName8 = "zero";
            CheckResult();
        }
        else if(imageName8 == "multiply" && imageName9 == "multiply" && imageName7 != "zero" && imageName7 != "multiply"){
            imageView7.setImageResource(imageArray[1]);
            imageName7 = "zero";
            CheckResult();
        }
        else if(imageName1 == "multiply" && imageName4 == "multiply" && imageName7 != "zero" && imageName7 != "multiply"){
            imageView7.setImageResource(imageArray[1]);
            imageName7 = "zero";
            CheckResult();
        }
        else if(imageName1 == "multiply" && imageName7 == "multiply" && imageName4 != "zero" && imageName4 != "multiply"){
            imageView4.setImageResource(imageArray[1]);
            imageName4 = "zero";
            CheckResult();
        }
        else if(imageName4 == "multiply" && imageName7 == "multiply" && imageName1 != "zero" && imageName1 != "multiply"){
            imageView1.setImageResource(imageArray[1]);
            imageName1 = "zero";
            CheckResult();
        }
        else if(imageName2 == "multiply" && imageName5 == "multiply" && imageName8 != "zero" && imageName8 != "multiply"){
            imageView8.setImageResource(imageArray[1]);
            imageName8 = "zero";
            CheckResult();
        }
        else if(imageName2 == "multiply" && imageName8 == "multiply" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName8 == "multiply" && imageName5 == "multiply" && imageName2 != "zero" && imageName2 != "multiply"){
            imageView2.setImageResource(imageArray[1]);
            imageName2 = "zero";
            CheckResult();
        }
        else if(imageName3 == "multiply" && imageName6 == "multiply" && imageName9 != "zero" && imageName9 != "multiply"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }
        else if(imageName9 == "multiply" && imageName3 == "multiply" && imageName6 != "zero" && imageName6 != "multiply"){
            imageView6.setImageResource(imageArray[1]);
            imageName6 = "zero";
            CheckResult();
        }
        else if(imageName6 == "multiply" && imageName9 == "multiply" && imageName3 != "zero" && imageName3 != "multiply"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }
        else if(imageName1 == "multiply" && imageName5 == "multiply" && imageName9 != "zero" && imageName9 != "multiply"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }
        else if(imageName1 == "multiply" && imageName9 == "multiply" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName5 == "multiply" && imageName9 == "multiply" && imageName1 != "zero" && imageName1 != "multiply"){
            imageView1.setImageResource(imageArray[1]);
            imageName1 = "zero";
            CheckResult();
        }
        else if(imageName3 == "multiply" && imageName5 == "multiply" && imageName7 != "zero" && imageName7 != "multiply"){
            imageView7.setImageResource(imageArray[1]);
            imageName7 = "zero";
            CheckResult();
        }
        else if(imageName3 == "multiply" && imageName7 == "multiply" && imageName5 != "zero" && imageName5 != "multiply"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName5 == "multiply" && imageName7 == "multiply" && imageName3 != "zero" && imageName3 != "multiply"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }


        else if(((imageName1 == "multiply") || (imageName3 == "multiply")) && imageName2 != "multiply" && imageName2 != "zero"){
            imageView2.setImageResource(imageArray[1]);
            imageName2 = "zero";
            CheckResult();
        }
        else if(((imageName1 == "multiply") || (imageName2 == "multiply")) && imageName3 != "multiply" && imageName3 != "zero"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }


        else if(((imageName7 == "multiply") || (imageName9 == "multiply")) && imageName8 != "multiply" && imageName8 != "zero"){
            imageView8.setImageResource(imageArray[1]);
            imageName8 = "zero";
            CheckResult();
        }
        else if(((imageName7 == "multiply") || (imageName8 == "multiply")) && imageName9 != "multiply" && imageName9 != "zero"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }


        else if(imageName1 != "multiply" && imageName1 != "zero"){
            imageView1.setImageResource(imageArray[1]);
            imageName1 = "zero";
            CheckResult();
        }
        else if(imageName2 != "multiply" && imageName2 != "zero"){
            imageView2.setImageResource(imageArray[1]);
            imageName2 = "zero";
            CheckResult();
        }
        else if(imageName3 != "multiply" && imageName3 != "zero"){
            imageView3.setImageResource(imageArray[1]);
            imageName3 = "zero";
            CheckResult();
        }
        else if(imageName4 != "multiply" && imageName4 != "zero"){
            imageView4.setImageResource(imageArray[1]);
            imageName4 = "zero";
            CheckResult();
        }
        else if(imageName5 != "multiply" && imageName5 != "zero"){
            imageView5.setImageResource(imageArray[1]);
            imageName5 = "zero";
            CheckResult();
        }
        else if(imageName6 != "multiply" && imageName6 != "zero"){
            imageView6.setImageResource(imageArray[1]);
            imageName6 = "zero";
            CheckResult();
        }
        else if(imageName7 != "multiply" && imageName7 != "zero"){
            imageView7.setImageResource(imageArray[1]);
            imageName7 = "zero";
            CheckResult();
        }
        else if(imageName8 != "multiply" && imageName8 != "zero"){
            imageView8.setImageResource(imageArray[1]);
            imageName8 = "zero";
            CheckResult();
        }
        else if(imageName9 != "multiply" && imageName9 != "zero"){
            imageView9.setImageResource(imageArray[1]);
            imageName9 = "zero";
            CheckResult();
        }
    }

    private void CheckResult(){
        Log.d("log", "inside check result method");
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
        if(name == "One")
            alert.setTitle("You Win!!!!");
        else if(name == "Two")
            alert.setTitle("You Lose");
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
