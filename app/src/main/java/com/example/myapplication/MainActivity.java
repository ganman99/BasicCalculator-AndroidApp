package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.RemoteInput;

import java.util.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button one;
    public Button two;
    public Button three;
    public Button four;

    public Button five;
    public Button six;
    public Button seven;
    public Button eight;

    public Button nine;
    public Button divide;
    public Button multiplication;
    public Button addition;

    public Button subtraction;
    public Button delete;
    public Button virgule;
    public Button equal;

    public EditText textCalculation;
    public int calculation;
    public boolean complicatedBoolType = true;
    public boolean afterEquation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        divide = (Button) findViewById(R.id.bolme);
        multiplication = (Button) findViewById(R.id.carpma);
        addition = (Button) findViewById(R.id.toplama);
        subtraction = (Button) findViewById(R.id.cıkarma);
        delete = (Button) findViewById(R.id.sil);
        virgule = (Button) findViewById(R.id.cokSil);
        equal = (Button) findViewById(R.id.esittir);
        textCalculation = (EditText) findViewById(R.id.textCalculation);
        textCalculation.setClickable(false);
        textCalculation.setText("");


        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                afterEquations();
                textCalculation.setText(textCalculation.getText() + "1");
                checkingParameters();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "2");
                checkingParameters();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "3");
                checkingParameters();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "4");
                checkingParameters();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "5");
                checkingParameters();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "6");
                checkingParameters();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "7");
                checkingParameters();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "8");
                checkingParameters();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                afterEquations();
                textCalculation.setText(textCalculation.getText() + "9");
                checkingParameters();
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (complicatedBoolType) {

                } else {
                    textCalculation.setText(textCalculation.getText() + "*");
                }
                checkingParameters();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (complicatedBoolType) {

                } else {
                    textCalculation.setText(textCalculation.getText() + "/");
                }
                checkingParameters();
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (complicatedBoolType) {

                } else {
                    textCalculation.setText(textCalculation.getText() + "-");
                }
                checkingParameters();
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (complicatedBoolType) {

                } else {
                    textCalculation.setText(textCalculation.getText() + "+");
                }
                checkingParameters();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (textCalculation.getText().length() - 1 == -1) {

                } else {
                    textCalculation.setText(textCalculation.getText().subSequence(0, (textCalculation.getText().length()) - 1));
                }
                checkingParameters();
            }
        });
        virgule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (complicatedBoolType) {

                } else {
                    textCalculation.setText(textCalculation.getText()+".");
                }
                checkingParameters();
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                calculating();
                checkingParameters();
            }
        });
        textCalculation.setText("98-31*262/2");


    }

    public void checkingParameters() {
        if (this.textCalculation.getText().length() == 0) {
            this.complicatedBoolType = true;
        } else if (this.textCalculation.getText().charAt(this.textCalculation.length() - 1) == '.' ||this.textCalculation.getText().charAt(this.textCalculation.length() - 1) == '*' || this.textCalculation.getText().charAt(this.textCalculation.length() - 1) == '+' || this.textCalculation.getText().charAt(this.textCalculation.length() - 1) == '-' || this.textCalculation.getText().charAt(this.textCalculation.length() - 1) == '/') {
            this.complicatedBoolType = true;
        } else {
            this.complicatedBoolType = false;
        }
    }

    public void calculating() {

        String tempFirstHalfOfTextCalculation;
        String tempSecondHalfOfTextCalculation;
        double tempNumberBetweenTwoString;
        double numberOfFirstString;
        double numberOfSecondString;



        /*To control calculation text`s first or last letter is not symbol
        if(){

        }
        if(){

        }*/



        for(int i = 0 ; i<1 ; i=i) {
            if(this.textCalculation.getText().toString().charAt(0)=='-' && !(this.textCalculation.getText().toString().contains("*")) && !(this.textCalculation.getText().toString().contains("/")) && !(this.textCalculation.getText().toString().contains("+"))) {
                afterEquation = true;
                multiplication.setClickable(false);
                addition.setClickable(false);
                subtraction.setClickable(false);
                divide.setClickable(false);
                break;
            }




            if (this.textCalculation.getText().toString().contains("*") || this.textCalculation.getText().toString().contains("/")){


                if(this.textCalculation.getText().toString().contains("*") && this.textCalculation.getText().toString().contains("/")){

                    if(this.textCalculation.getText().toString().indexOf("*")<this.textCalculation.getText().toString().indexOf("/")){

                        tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('*'));
                        tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('*')+1,this.textCalculation.getText().toString().length());

                        numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                        numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                        tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                        tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                        tempNumberBetweenTwoString=numberOfFirstString * numberOfSecondString;

                        textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);


                    }else{
                        tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('/'));
                        tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('/')+1,this.textCalculation.getText().toString().length());

                        numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                        numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                        tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                        tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                        tempNumberBetweenTwoString=numberOfFirstString / numberOfSecondString;

                        textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);

                    }
                }else if(this.textCalculation.getText().toString().contains("*")){
                    tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('*'));
                    tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('*')+1,this.textCalculation.getText().toString().length());

                    numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                    numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                    tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                    tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                    tempNumberBetweenTwoString=numberOfFirstString * numberOfSecondString;

                    textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);
                }else if(this.textCalculation.getText().toString().contains("/")){
                    tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('/'));
                    tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('/')+1,this.textCalculation.getText().toString().length());

                    numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                    numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                    tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                    tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                    tempNumberBetweenTwoString=numberOfFirstString / numberOfSecondString;

                    textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);

                    System.out.println("SFGNSFGSFIAGJSĞAIGJSAĞPIGJSAĞPGJSAĞPIGJSARPIGJASRĞPIGJ");

                }





            }else if (this.textCalculation.getText().toString().contains("+") || this.textCalculation.getText().toString().contains("-")) {
                if(this.textCalculation.getText().toString().contains("+") && this.textCalculation.getText().toString().contains("-")){
                    if(this.textCalculation.getText().toString().indexOf("+")<this.textCalculation.getText().toString().indexOf("-")){
                        tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('+'));
                        tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('+')+1,this.textCalculation.getText().toString().length());

                        numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                        numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                        tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                        tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                        tempNumberBetweenTwoString=numberOfFirstString + numberOfSecondString;

                        textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);
                    }else{
                        tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('-'));
                        tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('-')+1,this.textCalculation.getText().toString().length());

                        numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                        numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                        tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                        tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                        tempNumberBetweenTwoString=numberOfFirstString - numberOfSecondString;

                        textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);
                    }

                }else if(this.textCalculation.getText().toString().contains("+")){
                    tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('+'));
                    tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('+')+1,this.textCalculation.getText().toString().length());

                    numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                    numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                    tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                    tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                    tempNumberBetweenTwoString=numberOfFirstString + numberOfSecondString;

                    textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);

                }else{
                    tempFirstHalfOfTextCalculation = this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().indexOf('-'));
                    tempSecondHalfOfTextCalculation = this.textCalculation.getText().toString().substring(this.textCalculation.getText().toString().indexOf('-')+1,this.textCalculation.getText().toString().length());

                    numberOfFirstString=Double.parseDouble(tempFirstHalfOfTextCalculation.substring(firstStringsIndex(tempFirstHalfOfTextCalculation)+1,tempFirstHalfOfTextCalculation.length()));
                    numberOfSecondString=Double.parseDouble(tempSecondHalfOfTextCalculation.substring(0,secondStringsIndex(tempSecondHalfOfTextCalculation)));

                    tempFirstHalfOfTextCalculation=tempFirstHalfOfTextCalculation.substring(0,firstStringsIndex((tempFirstHalfOfTextCalculation))+1);
                    tempSecondHalfOfTextCalculation=tempSecondHalfOfTextCalculation.substring(secondStringsIndex(tempSecondHalfOfTextCalculation),tempSecondHalfOfTextCalculation.length());

                    tempNumberBetweenTwoString=numberOfFirstString - numberOfSecondString;

                    textCalculation.setText(tempFirstHalfOfTextCalculation+tempNumberBetweenTwoString+tempSecondHalfOfTextCalculation);
                }

            }else {
                fixingPoints();
                afterEquation = true;
                multiplication.setClickable(false);
                addition.setClickable(false);
                subtraction.setClickable(false);
                divide.setClickable(false);
                i=2;
            }



        }
    }

    public int secondStringsIndex(String s){
        int i = 0;
        for(i=0;i<s.length();i++) {
            if (s.charAt(i)==',' || s.charAt(i)=='.' || s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' ) {
                continue;
            } else {

                break;
            }
        }
        return i;
    }
    public int firstStringsIndex(String s){
        int i = 0;
        for(i = s.length()-1 ; i>-1;i--){
            if(s.charAt(i)=='.' || s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'){
                continue;
            }else{

                break;
            }
        }
        return i;
    }
    public int numberOfChar(String s,char c){
        int num =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==c){
                num++;
            }
        }
        return num;
    }
    public void fixingPoints(){
        while((numberOfChar(this.textCalculation.getText().toString(),'.')>1)){
            textCalculation.setText(this.textCalculation.getText().toString().substring(0,this.textCalculation.getText().toString().lastIndexOf('.')));
        }
    }
    public void afterEquations(){
        if(afterEquation==true){
            textCalculation.setText("");
            afterEquation=false;
            multiplication.setClickable(true);
            addition.setClickable(true);
            subtraction.setClickable(true);
            divide.setClickable(true);
        }

    }

}





