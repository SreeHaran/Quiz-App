package com.example.doraemonquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void analyseAnswers(View view) {

        int numberOfCorrectAnswers = 0;

        RadioButton firstQuestion = (RadioButton) findViewById(R.id.firstQuestion_Option3);
        boolean isFirstQuestionCorrect = firstQuestion.isChecked();
        if(isFirstQuestionCorrect){
            numberOfCorrectAnswers ++;
        }


        RadioButton secondQuestion = (RadioButton) findViewById(R.id.SecondQuestion_Option4);
        boolean isSecondQuestionCorrect = secondQuestion.isChecked();
        if(isSecondQuestionCorrect){
            numberOfCorrectAnswers ++;
        }

        EditText thirdQuestion = (EditText) findViewById(R.id.thirdQuestion_answer);
        String thirdQuestionAnswer = thirdQuestion.getText().toString().trim();
        if(thirdQuestionAnswer.equals("horcrux")){
            numberOfCorrectAnswers ++;
        }

        CheckBox Spell1 = (CheckBox) findViewById(R.id.checkbox1);
        boolean isCheckBox1Checked = Spell1.isChecked();
        CheckBox Spell2 = (CheckBox) findViewById(R.id.checkbox2);
        boolean isCheckBox2Checked = Spell2.isChecked();
        CheckBox Spell3 = (CheckBox) findViewById(R.id.checkbox3);
        boolean isCheckBox3Checked = Spell3.isChecked();
        CheckBox Spell4 = (CheckBox) findViewById(R.id.checkbox4);
        boolean isCheckBox4Checked = Spell4.isChecked();
        CheckBox Spell5 = (CheckBox) findViewById(R.id.checkbox5);
        boolean isCheckBox5Checked = Spell5.isChecked();


        if(isCheckBox1Checked && !isCheckBox2Checked && isCheckBox3Checked && isCheckBox4Checked && !isCheckBox5Checked ){
            numberOfCorrectAnswers ++;
        }

        Toast.makeText(getApplicationContext(),"Your Score is " + numberOfCorrectAnswers +"/4" , Toast. LENGTH_SHORT).show();

    }
}


