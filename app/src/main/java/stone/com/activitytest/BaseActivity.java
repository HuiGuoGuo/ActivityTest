package stone.com.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import stone.com.controller.ActivityController;

/**
 * Created by stone on 2016/9/5.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("BaseActivity", getClass().getSimpleName());
        ActivityController.addActivity(this);
    }
}
