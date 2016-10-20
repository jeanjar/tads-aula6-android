package com.jeanjar.appciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SlaveActivity extends AppCompatActivity {

    private final String tag = "Slave";

    public void btnActivityClick(View v)
    {
        Intent i = new Intent(this, SlaveActivity.class);
        Log.i(this.tag, this.getClass().getEnclosingMethod().getName());
        startActivityForResult(i, 0);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == 0)
        {
            if(resultCode == RESULT_OK)
            {
                Log.i(this.tag, "onActivityResult");
                Toast.makeText(this, data.getCharSequenceExtra("ret").toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slave);
    }
}
