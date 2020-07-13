package ind.apptech.captionsforinstagram;

import android.content.Context;
import android.content.SharedPreferences;

public class SecuredPref {

    public static void setStringPref(Context context,String tagname,String value){
        SharedPreferences sharedPref = context.getSharedPreferences("secure",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(tagname, value);
        editor.commit();

    }

    public static void setIntPref(Context context,String tagname,int value){
        SharedPreferences sharedPref = context.getSharedPreferences("secure",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(tagname, value);
        editor.commit();

    }

    public static void setBooleanPref(Context context,String tagname,Boolean value){
        SharedPreferences sharedPref = context.getSharedPreferences("secure",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(tagname, value);
        editor.commit();

    }

    public static String getStringPref(Context context,String tagname){
        SharedPreferences sharedPref = context.getSharedPreferences("secure",Context.MODE_PRIVATE);
        String returnval=sharedPref.getString(tagname,"null");
        return returnval;
    }

    public static int getIntPref(Context context,String tagname){
        SharedPreferences sharedPref = context.getSharedPreferences("secure",Context.MODE_PRIVATE);
        int returnval=sharedPref.getInt(tagname,0);
        return returnval;
    }

    public static Boolean getBooleanPref(Context context,String tagname){
        SharedPreferences sharedPref = context.getSharedPreferences("secure",Context.MODE_PRIVATE);
        Boolean returnval=sharedPref.getBoolean(tagname,false);
        return returnval;
    }

    public static void clearPref(Context context){
        SharedPreferences sharedPref= context.getSharedPreferences("secure", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.clear();
        editor.commit();
    }
}