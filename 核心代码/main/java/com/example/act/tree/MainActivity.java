package com.example.act.tree;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements View.OnLongClickListener,View.OnClickListener
{

    EditText editText1,editText2,editText3;

    Button button;
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] texID = {
                R.id.textView1,R.id.textView2,R.id.textView3,
                R.id.textView4,R.id.textView5,R.id.textView6,
                R.id.textView7,R.id.textView8,R.id.textView9,
                R.id.textView10,R.id.textView11,R.id.textView12,
                R.id.textView13,R.id.textView14,R.id.textView15,
                R.id.textView16,R.id.textView17,R.id.textView18,
                R.id.textView19,R.id.textView20,R.id.textView21,
                R.id.textView22,R.id.textView23,R.id.textView24,
                R.id.textView25,R.id.textView26,R.id.textView27,
                R.id.textView28,R.id.textView29,R.id.textView30,
                R.id.textView31,R.id.textView32,R.id.textView33,
                R.id.textView34,R.id.textView35,R.id.textView36,
                R.id.textView37,R.id.textView38,R.id.textView39,
                R.id.textView40,R.id.textView41,R.id.textView42,
                R.id.textView43,R.id.textView44,R.id.textView45,
                R.id.textView46,R.id.textView47,R.id.textView48,
                R.id.textView49,R.id.textView50,R.id.textView51,
                R.id.textView52,R.id.textView53,R.id.textView54,
                R.id.textView55,R.id.textView56,R.id.textView57,
                R.id.textView58,R.id.textView59,R.id.textView60,
                R.id.textView61,R.id.textView62,R.id.textView63,
                R.id.textView64,R.id.textView65,R.id.textView66,
                R.id.textView67,R.id.textView68,R.id.textView69,
                R.id.textView70,R.id.textView71,R.id.textView72
        };

        for(int id: texID)
        {
            TextView temp = findViewById(id);
            temp.setOnClickListener(this);
        }

        editText1= findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);


        button = (Button)findViewById(R.id.button);

        editText1.setOnLongClickListener(this);
        editText2.setOnLongClickListener(this);
        editText3.setOnLongClickListener(this);
    }


    @Override
    public boolean onLongClick(View v)
    {
        str = ((EditText)v).getText().toString();
        return true;
    }

    @Override
    public void onClick(View v)
    {
        ((TextView)v).setText(str);
    }

    public String makeString()
    {
        int[] id = {
                R.id.textView1,R.id.textView2,R.id.textView3,
                R.id.textView4,R.id.textView5,R.id.textView6,
                R.id.textView7,R.id.textView8,R.id.textView9,
                R.id.textView10,R.id.textView11,R.id.textView12,
                R.id.textView13,R.id.textView14,R.id.textView15,
                R.id.textView16,R.id.textView17,R.id.textView18,
                R.id.textView19,R.id.textView20,R.id.textView21,
                R.id.textView22,R.id.textView23,R.id.textView24,
                R.id.textView25,R.id.textView26,R.id.textView27,
                R.id.textView28,R.id.textView29,R.id.textView30,
                R.id.textView31,R.id.textView32,R.id.textView33,
                R.id.textView34,R.id.textView35,R.id.textView36,
                R.id.textView37,R.id.textView38,R.id.textView39,
                R.id.textView40,R.id.textView41,R.id.textView42,
                R.id.textView43,R.id.textView44,R.id.textView45,
                R.id.textView46,R.id.textView47,R.id.textView48,
                R.id.textView49,R.id.textView50,R.id.textView51,
                R.id.textView52,R.id.textView53,R.id.textView54,
                R.id.textView55,R.id.textView56,R.id.textView57,
                R.id.textView58,R.id.textView59,R.id.textView60,
                R.id.textView61,R.id.textView62,R.id.textView63,
                R.id.textView64,R.id.textView65,R.id.textView66,
                R.id.textView67,R.id.textView68,R.id.textView69,
                R.id.textView70,R.id.textView71,R.id.textView72
        };
        String str_F = "";
       for(int i = 1; i <= 72;i++)
       {
           str_F += ((TextView)findViewById(id[i-1])).getText().toString();
           if(i%8 == 0)
           {
               str_F += "\n";
           }
       }
        return str_F;
    }
    public void Copy(View v)
    {
        String str_M = makeString();
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData mClipData = ClipData.newPlainText("Label", str_M);
        cm.setPrimaryClip(mClipData);

        Toast tos = Toast.makeText(this, "Finish copying.", Toast.LENGTH_SHORT);
        tos.show();
    }

    public void Delete(View v)
    {
        int[] id = {
                R.id.textView1,R.id.textView2,R.id.textView3,
                R.id.textView4,R.id.textView5,R.id.textView6,
                R.id.textView7,R.id.textView8,R.id.textView9,
                R.id.textView10,R.id.textView11,R.id.textView12,
                R.id.textView13,R.id.textView14,R.id.textView15,
                R.id.textView16,R.id.textView17,R.id.textView18,
                R.id.textView19,R.id.textView20,R.id.textView21,
                R.id.textView22,R.id.textView23,R.id.textView24,
                R.id.textView25,R.id.textView26,R.id.textView27,
                R.id.textView28,R.id.textView29,R.id.textView30,
                R.id.textView31,R.id.textView32,R.id.textView33,
                R.id.textView34,R.id.textView35,R.id.textView36,
                R.id.textView37,R.id.textView38,R.id.textView39,
                R.id.textView40,R.id.textView41,R.id.textView42,
                R.id.textView43,R.id.textView44,R.id.textView45,
                R.id.textView46,R.id.textView47,R.id.textView48,
                R.id.textView49,R.id.textView50,R.id.textView51,
                R.id.textView52,R.id.textView53,R.id.textView54,
                R.id.textView55,R.id.textView56,R.id.textView57,
                R.id.textView58,R.id.textView59,R.id.textView60,
                R.id.textView61,R.id.textView62,R.id.textView63,
                R.id.textView64,R.id.textView65,R.id.textView66,
                R.id.textView67,R.id.textView68,R.id.textView69,
                R.id.textView70,R.id.textView71,R.id.textView72
        };
        String str_Delete = getResources().getString(R.string.TextView_blank);
        for(int temp : id)
        {
            ((TextView)findViewById(temp)).setText(str_Delete );
        }
    }
}
