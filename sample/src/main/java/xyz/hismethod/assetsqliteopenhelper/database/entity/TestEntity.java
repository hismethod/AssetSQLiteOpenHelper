package xyz.hismethod.assetsqliteopenhelper.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by daolq on 11/15/17.
 */

@Entity(tableName = "test")
public class TestEntity {
    @PrimaryKey
    public int id;
    @ColumnInfo(name = "name")
    public String name;
}
