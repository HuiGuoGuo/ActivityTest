package stone.com.controller;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stone on 2016/9/5.
 */
public class ActivityController  {

    public  static List<Activity> activities = new ArrayList<>();

    /**
     *
     * @param activity
     */
    public  static  void  addActivity(Activity activity){
        activities.add(activity);
    }

    /**
     *
     * @param activity
     */

    public static void  removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     *
     */

    public static void finishAll(){
        for (Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
