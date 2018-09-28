package xyz.hismethod.assetsqliteopenhelper.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;
import xyz.hismethod.assetsqliteopenhelper.database.dao.TestDao;
import xyz.hismethod.assetsqliteopenhelper.database.entity.TestEntity;
import com.fstyle.library.helper.AssetSQLiteOpenHelperFactory;

/**
 * Created by daolq on 11/15/17.
 */

@Database(entities = {TestEntity.class},version = 1)
public abstract class TestDatabase extends RoomDatabase {

    private static final String DB_NAME = "test.db";


    public abstract TestDao testDao();

    public static TestDatabase createPersistentDatabase(Context context) {
        return Room.databaseBuilder(context, TestDatabase.class, DB_NAME)
                .openHelperFactory(new AssetSQLiteOpenHelperFactory())
                .build();
    }
}
