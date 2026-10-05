package com.example.radiobutton;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kotlin.contracts.Returns;

public class MainActivity extends AppCompatActivity {
   RadioGroup rcourse,department,year;
   Button Btn;
   TextView Tvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       rcourse=findViewById(R.id.RG1);
        department=findViewById(R.id.RG2);
        year=findViewById(R.id.RG3);
        Btn=findViewById(R.id.Bs);
        Tvs=findViewById(R.id.PRE);
        Btn.setOnClickListener(v -> {
            int CourseId=rcourse.getCheckedRadioButtonId();
            int DepartmentId=department.getCheckedRadioButtonId();
            int YearId=year.getCheckedRadioButtonId();
            if (CourseId==-1 ||
            DepartmentId==-1 ||
            YearId==-1) {
               Toast.makeText(MainActivity.this,"please select all option",Toast.LENGTH_SHORT).show();
            }
            RadioButton Course=findViewById(CourseId);
            RadioButton Department=findViewById(DepartmentId);
            RadioButton Year=findViewById(YearId);
            String Selectedcourse=Course.getText().toString();
            String Selecteddepartment=Department.getText().toString();
            String Selectedyear=Year.getText().toString();
            String Result="Selected Details\n\n"+
                    "Course:"+Selectedcourse+"\n"+
                    "Department:"+Selecteddepartment+"\n"+
                    "Year:"+Selectedyear;
            Tvs.setText(Result);
        });

    }
}