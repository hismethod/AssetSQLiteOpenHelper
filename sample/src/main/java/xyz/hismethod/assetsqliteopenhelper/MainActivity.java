package xyz.hismethod.assetsqliteopenhelper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.fstyle.assetsqliteopenhelper.R;

import xyz.hismethod.assetsqliteopenhelper.database.entity.TestEntity;
import io.reactivex.functions.Consumer;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainApplication application = (MainApplication) getApplication();
        application.getDatabase().testDao().getAll().subscribe(new Consumer<List<TestEntity>>() {
            @Override
            public void accept(List<TestEntity> testEntities) throws Exception {
                Log.d(TAG, "" + testEntities.size());
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                Log.e(TAG, "accept: ", throwable);
            }
        });
    }
}
