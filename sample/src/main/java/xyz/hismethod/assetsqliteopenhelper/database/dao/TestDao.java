package xyz.hismethod.assetsqliteopenhelper.database.dao;

import androidx.room.Dao;
import androidx.room.Query;
import xyz.hismethod.assetsqliteopenhelper.database.entity.TestEntity;
import io.reactivex.Flowable;
import java.util.List;

/**
 * Created by daolq on 11/15/17.
 */

@Dao
public interface TestDao {

    @Query("SELECT * FROM test")
    Flowable<List<TestEntity>> getAll();
}
