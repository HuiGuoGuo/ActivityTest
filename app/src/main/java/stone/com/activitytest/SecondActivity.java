package stone.com.activitytest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

/**
 * Created by 王辉 on 2016/9/1.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);

//        Button button2 = (Button) findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra("response_data","result Hello");
//                setResult(RESULT_OK,intent);
//                finish();
//            }
//        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main,menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.add_item:
//                Log.i("Firstactivity", "add");
//                Toast.makeText(this, "add button", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.remove_item:
//               Log.i("Firstactivity", "remove");
//                Toast.makeText(this, "remove button", Toast.LENGTH_SHORT).show();
//                break;
//
//        }
//        return true;
//    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("response_data","result Hello");
        setResult(RESULT_OK, intent);
        finish();
    }


    /**
     *
     * @param context
     * @param data
     */
    public  void  actionStart(Context context,String data){
        Intent intent = new Intent(context,SecondActivity.class );
        intent.putExtra("data",data);
        startActivity(intent);
    }
}
