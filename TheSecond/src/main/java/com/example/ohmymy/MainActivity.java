package com.example.ohmymy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//隐藏标题栏
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
        //打印日志
        Log.d("MainActivity", "onCreate execute");
        //定义按钮动作
        Button button1 = (Button) findViewById(R.id.button);
		button1.setOnClickListener(new View.OnClickListener() {
            //按钮的点击动作
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "你点到我了！",Toast.LENGTH_SHORT).show();
//              Toast toast = Toast.makeText(MainActivity.this, R.string.user_defined_location, Toast.LENGTH_LONG);
//              toast.setGravity(Gravity.CENTER_VERTICAL, 0, -50);
//              //CENTER_VERTICAL（垂直居中）、CENTER_HORIZONTAL（水平居中）、TOP（顶部）
//              toast.show();
			}
		});
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

