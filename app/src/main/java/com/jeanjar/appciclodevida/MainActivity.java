package com.jeanjar.appciclodevida;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.PersistableBundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String tag = "Main";
    private String[] itens;
    private int checkedItem;
    private boolean[] checkedItens;
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.itens = getResources().getStringArray(R.array.listaOpcoes);
        Log.i(this.tag, "onCreate");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(this.tag, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onStart();
        Log.i(this.tag, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onStart();
        Log.i(this.tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onStart();
        Log.i(this.tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStart();
        Log.i(this.tag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onStart();
        Log.i(this.tag, "onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(this.tag, "onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.i(this.tag, "onRestoreInstanceState");
    }


    public void btnAlertClick(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.app_name);
        builder.setPositiveButton("OK", null);
        builder.setMessage(R.string.textoDialogo);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private DialogInterface.OnClickListener listenerItemClick = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(MainActivity.this, itens[which], Toast.LENGTH_SHORT).show();
        }
    };

    public void btnItensClick(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.app_name);
        builder.setItems(this.itens, listenerItemClick);
        AlertDialog dialog =  builder.create();
        dialog.show();
    }

    public void btnDialog3Click(View v)
    {
        this.checkedItem = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.app_name);
        builder.setSingleChoiceItems(this.itens, checkedItem, listenerItemClick);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
