## AssetSQLiteOpenHelper
[![License: CC BY 4.0](https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by/4.0/)
[![](https://jitpack.io/v/hismethod/AssetSQLiteOpenHelper.svg)](https://jitpack.io/#hismethod/AssetSQLiteOpenHelper)

This module supports migrating SQLite to Room Persistence Library, loads pre-populated SQLite database base on [daolq3012/AssetSQLiteOpenHelper](https://github.com/hismethod/AssetSQLiteOpenHelper)

### How to config:

Step 1. Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.hismethod:AssetSQLiteOpenHelper:1.0.1'
    implementation 'androidx.room:room-runtime:x.x.x'
}
```

### How to use:
1. Put your SQLite DB database_name.db into the ``assets/databases`` folder
2. in your ``AppDatabase`` class, modify your Room's DB creation code accordingly:
```java
    Room.databaseBuilder(context.getApplicationContext(),
                         AppDatabase.class,
                         "database_name.db")
    .openHelperFactory(new AssetSQLiteOpenHelperFactory())
    .build();
```
- See samples in this project to show more

## 👬 Contribution

The Example are built using [Android studio](https://developer.android.com/studio/index.html)

- Open pull request with improvements
- Discuss ideas in issues
- Spread the word
- Reach out to me directly at his.methods@gmail.com

## License

The content of this project itself is licensed under the Creative Commons Attribution 4.0 International (CC BY 4.0)
