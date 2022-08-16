package cn.everphoto.core.cvinfo.cache;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.util.TableInfo;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.HashSet;
import p003X.AbstractC116295VqD;
import p003X.AbstractC116349Vr5;
import p003X.AbstractC116356VrC;
import p003X.C116293VqB;
import p003X.C116346Vr2;
import p003X.C116352Vr8;

/* loaded from: classes13.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static ChangeQuickRedirect LIZIZ;
    public volatile AbstractC116356VrC LIZJ;
    public volatile AbstractC116349Vr5 LIZLLL;

    /* renamed from: LJ */
    public volatile AbstractC116295VqD f21067LJ;

    static {
        Covode.recordClassIndex(3536);
    }

    @Override // cn.everphoto.core.cvinfo.cache.AppDatabase
    public final AbstractC116356VrC LIZ() {
        AbstractC116356VrC abstractC116356VrC;
        MethodCollector.m14708i(231);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            AbstractC116356VrC abstractC116356VrC2 = (AbstractC116356VrC) proxy.result;
            MethodCollector.m14707o(231);
            return abstractC116356VrC2;
        } else if (this.LIZJ != null) {
            AbstractC116356VrC abstractC116356VrC3 = this.LIZJ;
            MethodCollector.m14707o(231);
            return abstractC116356VrC3;
        } else {
            synchronized (this) {
                try {
                    if (this.LIZJ == null) {
                        this.LIZJ = new C116352Vr8(this);
                    }
                    abstractC116356VrC = this.LIZJ;
                } catch (Throwable th) {
                    MethodCollector.m14707o(231);
                    throw th;
                }
            }
            MethodCollector.m14707o(231);
            return abstractC116356VrC;
        }
    }

    @Override // cn.everphoto.core.cvinfo.cache.AppDatabase
    public final AbstractC116349Vr5 LIZIZ() {
        AbstractC116349Vr5 abstractC116349Vr5;
        MethodCollector.m14708i(232);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5);
        if (proxy.isSupported) {
            AbstractC116349Vr5 abstractC116349Vr52 = (AbstractC116349Vr5) proxy.result;
            MethodCollector.m14707o(232);
            return abstractC116349Vr52;
        } else if (this.LIZLLL != null) {
            AbstractC116349Vr5 abstractC116349Vr53 = this.LIZLLL;
            MethodCollector.m14707o(232);
            return abstractC116349Vr53;
        } else {
            synchronized (this) {
                try {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new C116346Vr2(this);
                    }
                    abstractC116349Vr5 = this.LIZLLL;
                } catch (Throwable th) {
                    MethodCollector.m14707o(232);
                    throw th;
                }
            }
            MethodCollector.m14707o(232);
            return abstractC116349Vr5;
        }
    }

    @Override // cn.everphoto.core.cvinfo.cache.AppDatabase
    public final AbstractC116295VqD LIZJ() {
        AbstractC116295VqD abstractC116295VqD;
        MethodCollector.m14708i(233);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6);
        if (proxy.isSupported) {
            AbstractC116295VqD abstractC116295VqD2 = (AbstractC116295VqD) proxy.result;
            MethodCollector.m14707o(233);
            return abstractC116295VqD2;
        } else if (this.f21067LJ != null) {
            AbstractC116295VqD abstractC116295VqD3 = this.f21067LJ;
            MethodCollector.m14707o(233);
            return abstractC116295VqD3;
        } else {
            synchronized (this) {
                try {
                    if (this.f21067LJ == null) {
                        this.f21067LJ = new C116293VqB(this);
                    }
                    abstractC116295VqD = this.f21067LJ;
                } catch (Throwable th) {
                    MethodCollector.m14707o(233);
                    throw th;
                }
            }
            MethodCollector.m14707o(233);
            return abstractC116295VqD;
        }
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return (InvalidationTracker) proxy.result;
        }
        return new InvalidationTracker(this, "DbAssetCVInfo", "DbMoment", "DbLocation");
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
            return;
        }
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `DbAssetCVInfo`");
            writableDatabase.execSQL("DELETE FROM `DbMoment`");
            writableDatabase.execSQL("DELETE FROM `DbLocation`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{databaseConfiguration}, this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return (SupportSQLiteOpenHelper) proxy.result;
        }
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(10000009) { // from class: cn.everphoto.core.cvinfo.cache.AppDatabase_Impl.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(3537);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `DbAssetCVInfo` (`assetId` TEXT NOT NULL, `localPath` TEXT, `faceVerifyFeatures` TEXT, `reFrameInfos` TEXT, `isPorn` INTEGER NOT NULL, `isLeader` INTEGER NOT NULL, `momentTags` TEXT, `faceFeatures` TEXT, `totalScoreInfo` TEXT, `scoreInfos` TEXT, `similarityFeature` BLOB, `c3Feature` BLOB, `similarityId` INTEGER NOT NULL, `peopleIds` TEXT, `takenTime` INTEGER NOT NULL, PRIMARY KEY(`assetId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `DbMoment` (`momentId` TEXT NOT NULL, `type` TEXT, `title` TEXT, `effectId` TEXT, `extra` TEXT, `version` INTEGER NOT NULL, `materialIds` TEXT, `templateId` INTEGER NOT NULL, `momentSource` INTEGER NOT NULL, `coverResourcePath` TEXT, `coverWidth` INTEGER NOT NULL, `coverHeight` INTEGER NOT NULL, `coverOrientation` INTEGER NOT NULL, `coverReFrameInfos` TEXT, PRIMARY KEY(`momentId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `DbLocation` (`uid` TEXT NOT NULL, `place` TEXT NOT NULL, PRIMARY KEY(`uid`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"fb7652811181331bf3bd2ec4d0a5ba6c\")");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `DbAssetCVInfo`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `DbMoment`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `DbLocation`");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (!PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, LIZ, false, 3).isSupported && AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        AppDatabase_Impl.this.mCallbacks.get(i).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, LIZ, false, 4).isSupported) {
                    return;
                }
                AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
                appDatabase_Impl.mDatabase = supportSQLiteDatabase;
                appDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        AppDatabase_Impl.this.mCallbacks.get(i).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, LIZ, false, 5).isSupported) {
                    return;
                }
                HashMap hashMap = new HashMap(15);
                hashMap.put("assetId", new TableInfo.Column("assetId", "TEXT", true, 1));
                hashMap.put("localPath", new TableInfo.Column("localPath", "TEXT", false, 0));
                hashMap.put("faceVerifyFeatures", new TableInfo.Column("faceVerifyFeatures", "TEXT", false, 0));
                hashMap.put("reFrameInfos", new TableInfo.Column("reFrameInfos", "TEXT", false, 0));
                hashMap.put("isPorn", new TableInfo.Column("isPorn", "INTEGER", true, 0));
                hashMap.put("isLeader", new TableInfo.Column("isLeader", "INTEGER", true, 0));
                hashMap.put("momentTags", new TableInfo.Column("momentTags", "TEXT", false, 0));
                hashMap.put("faceFeatures", new TableInfo.Column("faceFeatures", "TEXT", false, 0));
                hashMap.put("totalScoreInfo", new TableInfo.Column("totalScoreInfo", "TEXT", false, 0));
                hashMap.put("scoreInfos", new TableInfo.Column("scoreInfos", "TEXT", false, 0));
                hashMap.put("similarityFeature", new TableInfo.Column("similarityFeature", "BLOB", false, 0));
                hashMap.put("c3Feature", new TableInfo.Column("c3Feature", "BLOB", false, 0));
                hashMap.put("similarityId", new TableInfo.Column("similarityId", "INTEGER", true, 0));
                hashMap.put("peopleIds", new TableInfo.Column("peopleIds", "TEXT", false, 0));
                hashMap.put("takenTime", new TableInfo.Column("takenTime", "INTEGER", true, 0));
                TableInfo tableInfo = new TableInfo("DbAssetCVInfo", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "DbAssetCVInfo");
                if (tableInfo.equals(read)) {
                    HashMap hashMap2 = new HashMap(14);
                    hashMap2.put("momentId", new TableInfo.Column("momentId", "TEXT", true, 1));
                    hashMap2.put("type", new TableInfo.Column("type", "TEXT", false, 0));
                    hashMap2.put("title", new TableInfo.Column("title", "TEXT", false, 0));
                    hashMap2.put("effectId", new TableInfo.Column("effectId", "TEXT", false, 0));
                    hashMap2.put("extra", new TableInfo.Column("extra", "TEXT", false, 0));
                    hashMap2.put("version", new TableInfo.Column("version", "INTEGER", true, 0));
                    hashMap2.put("materialIds", new TableInfo.Column("materialIds", "TEXT", false, 0));
                    hashMap2.put("templateId", new TableInfo.Column("templateId", "INTEGER", true, 0));
                    hashMap2.put("momentSource", new TableInfo.Column("momentSource", "INTEGER", true, 0));
                    hashMap2.put("coverResourcePath", new TableInfo.Column("coverResourcePath", "TEXT", false, 0));
                    hashMap2.put("coverWidth", new TableInfo.Column("coverWidth", "INTEGER", true, 0));
                    hashMap2.put("coverHeight", new TableInfo.Column("coverHeight", "INTEGER", true, 0));
                    hashMap2.put("coverOrientation", new TableInfo.Column("coverOrientation", "INTEGER", true, 0));
                    hashMap2.put("coverReFrameInfos", new TableInfo.Column("coverReFrameInfos", "TEXT", false, 0));
                    TableInfo tableInfo2 = new TableInfo("DbMoment", hashMap2, new HashSet(0), new HashSet(0));
                    TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "DbMoment");
                    if (tableInfo2.equals(read2)) {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("uid", new TableInfo.Column("uid", "TEXT", true, 1));
                        hashMap3.put("place", new TableInfo.Column("place", "TEXT", true, 0));
                        TableInfo tableInfo3 = new TableInfo("DbLocation", hashMap3, new HashSet(0), new HashSet(0));
                        TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "DbLocation");
                        if (tableInfo3.equals(read3)) {
                            return;
                        }
                        throw new IllegalStateException("Migration didn't properly handle DbLocation(cn.everphoto.core.location.DbLocation).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                    }
                    throw new IllegalStateException("Migration didn't properly handle DbMoment(cn.everphoto.core.cvinfo.cache.DbMoment).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                throw new IllegalStateException("Migration didn't properly handle DbAssetCVInfo(cn.everphoto.core.cvinfo.cache.DbAssetCVInfo).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }

            {
                super(10000009);
            }
        }, "fb7652811181331bf3bd2ec4d0a5ba6c", "def0bef7c915b248466bc675a8c45168");
        SupportSQLiteOpenHelper.Configuration.Builder builder = SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context);
        builder.name(databaseConfiguration.name);
        builder.callback(roomOpenHelper);
        return databaseConfiguration.sqliteOpenHelperFactory.create(builder.build());
    }
}
