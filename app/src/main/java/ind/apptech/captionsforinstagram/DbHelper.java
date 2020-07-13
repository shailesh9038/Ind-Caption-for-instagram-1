package ind.apptech.captionsforinstagram;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "LikeJokes";

    // Contacts table name
    private static final String TABLE_CONTACTS = "Jokes";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private  static  final String Cat_Name = "Catname";
    private static final String  Sayari = "Sayari";
    private static final String Position = "Position";
    private static final String Like_da = "Like_da";


    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
                + Cat_Name + " TEXT," + Sayari + " TEXT," + Position + " INTEGER," + Like_da + " INTEGER" + ")";

        db.execSQL(CREATE_CONTACTS_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        // Create tables again
        onCreate(db);

    }


    public boolean adddetails(String catname, String sayari, int position, boolean like) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Cat_Name, catname);
        contentValues.put(Sayari, sayari);
        contentValues.put(Position, position);
        if (like==true) {
            contentValues.put(Like_da, 1);
        }else{
            contentValues.put(Like_da, 0);
        }

        long result=  db.insert(TABLE_CONTACTS, null, contentValues);
        if (result==-1){
            return false;
        }
        else {
            return true;
        }
    }





    public Cursor getalldetails() {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery(" SELECT * FROM " + TABLE_CONTACTS, null);
        return res;
    }


    public Cursor isExist(String strEmailAdd){

        SQLiteDatabase    db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_CONTACTS + " WHERE " + Cat_Name + " = ?";
        Log.e("classname", query);
        return null;
    }

    public boolean deleteLike(int rowId)

    {
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(TABLE_CONTACTS, KEY_ID + "=" + rowId, null) > 0;
    }

    public void deleteTitle(String name)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_CONTACTS+ " WHERE "+Sayari+"='"+name+"' and "+Like_da+"=" );
        db.close();
    }
}