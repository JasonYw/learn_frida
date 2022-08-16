package cn.ever.cloud.android.persistence;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import cn.ever.cloud.android.persistence.dao.AlbumDao_Impl;
import cn.ever.cloud.android.persistence.dao.AssetDao_Impl;
import cn.ever.cloud.android.persistence.dao.KeyValueDao_Impl;
import cn.ever.cloud.android.persistence.dao.TodoAssetDao_Impl;
import cn.ever.cloud.android.persistence.dao.UploadTaskDao_Impl;
import cn.ever.cloud.android.persistence.dao.UserDao_Impl;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p003X.AbstractC116287Vq5;
import p003X.AbstractC521346im;
import p003X.AbstractC522106k0;
import p003X.AbstractC522116k1;
import p003X.AbstractC522206kA;
import p003X.AbstractC529026vA;
import p003X.C109391T5d;

/* loaded from: classes13.dex */
public final class SdkDatabase_Impl extends SdkDatabase {
    public static ChangeQuickRedirect changeQuickRedirect;
    public volatile AbstractC522106k0 _albumDao;
    public volatile AbstractC522116k1 _assetDao;
    public volatile AbstractC116287Vq5 _keyValueDao;
    public volatile AbstractC529026vA _todoAssetDao;
    public volatile AbstractC521346im _uploadTaskDao;
    public volatile AbstractC522206kA _userDao;

    static {
        Covode.recordClassIndex(2892);
    }

    @Override // cn.ever.cloud.android.persistence.SdkDatabase
    public final AbstractC522106k0 albumDao() {
        AbstractC522106k0 abstractC522106k0;
        MethodCollector.m14708i(199);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            AbstractC522106k0 abstractC522106k02 = (AbstractC522106k0) proxy.result;
            MethodCollector.m14707o(199);
            return abstractC522106k02;
        } else if (this._albumDao != null) {
            AbstractC522106k0 abstractC522106k03 = this._albumDao;
            MethodCollector.m14707o(199);
            return abstractC522106k03;
        } else {
            synchronized (this) {
                try {
                    if (this._albumDao == null) {
                        this._albumDao = new AlbumDao_Impl(this);
                    }
                    abstractC522106k0 = this._albumDao;
                } catch (Throwable th) {
                    MethodCollector.m14707o(199);
                    throw th;
                }
            }
            MethodCollector.m14707o(199);
            return abstractC522106k0;
        }
    }

    @Override // cn.ever.cloud.android.persistence.SdkDatabase
    public final AbstractC522116k1 assetDao() {
        AbstractC522116k1 abstractC522116k1;
        MethodCollector.m14708i(198);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            AbstractC522116k1 abstractC522116k12 = (AbstractC522116k1) proxy.result;
            MethodCollector.m14707o(198);
            return abstractC522116k12;
        } else if (this._assetDao != null) {
            AbstractC522116k1 abstractC522116k13 = this._assetDao;
            MethodCollector.m14707o(198);
            return abstractC522116k13;
        } else {
            synchronized (this) {
                try {
                    if (this._assetDao == null) {
                        this._assetDao = new AssetDao_Impl(this);
                    }
                    abstractC522116k1 = this._assetDao;
                } catch (Throwable th) {
                    MethodCollector.m14707o(198);
                    throw th;
                }
            }
            MethodCollector.m14707o(198);
            return abstractC522116k1;
        }
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (InvalidationTracker) proxy.result;
        }
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "LocalAsset", "CloudAsset", "Album", "AlbumAssetRelation", "KeyValue", "UploadTaskItem", "UserStorage", "ToDelAsset");
    }

    @Override // cn.ever.cloud.android.persistence.SdkDatabase
    public final AbstractC116287Vq5 keyValueDao() {
        AbstractC116287Vq5 abstractC116287Vq5;
        MethodCollector.m14708i(200);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            AbstractC116287Vq5 abstractC116287Vq52 = (AbstractC116287Vq5) proxy.result;
            MethodCollector.m14707o(200);
            return abstractC116287Vq52;
        } else if (this._keyValueDao != null) {
            AbstractC116287Vq5 abstractC116287Vq53 = this._keyValueDao;
            MethodCollector.m14707o(200);
            return abstractC116287Vq53;
        } else {
            synchronized (this) {
                try {
                    if (this._keyValueDao == null) {
                        this._keyValueDao = new KeyValueDao_Impl(this);
                    }
                    abstractC116287Vq5 = this._keyValueDao;
                } catch (Throwable th) {
                    MethodCollector.m14707o(200);
                    throw th;
                }
            }
            MethodCollector.m14707o(200);
            return abstractC116287Vq5;
        }
    }

    @Override // cn.ever.cloud.android.persistence.SdkDatabase
    public final AbstractC529026vA todoAssetDao() {
        AbstractC529026vA abstractC529026vA;
        MethodCollector.m14708i(203);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            AbstractC529026vA abstractC529026vA2 = (AbstractC529026vA) proxy.result;
            MethodCollector.m14707o(203);
            return abstractC529026vA2;
        } else if (this._todoAssetDao != null) {
            AbstractC529026vA abstractC529026vA3 = this._todoAssetDao;
            MethodCollector.m14707o(203);
            return abstractC529026vA3;
        } else {
            synchronized (this) {
                try {
                    if (this._todoAssetDao == null) {
                        this._todoAssetDao = new TodoAssetDao_Impl(this);
                    }
                    abstractC529026vA = this._todoAssetDao;
                } catch (Throwable th) {
                    MethodCollector.m14707o(203);
                    throw th;
                }
            }
            MethodCollector.m14707o(203);
            return abstractC529026vA;
        }
    }

    @Override // cn.ever.cloud.android.persistence.SdkDatabase
    public final AbstractC521346im uploadTaskDao() {
        AbstractC521346im abstractC521346im;
        MethodCollector.m14708i(201);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            AbstractC521346im abstractC521346im2 = (AbstractC521346im) proxy.result;
            MethodCollector.m14707o(201);
            return abstractC521346im2;
        } else if (this._uploadTaskDao != null) {
            AbstractC521346im abstractC521346im3 = this._uploadTaskDao;
            MethodCollector.m14707o(201);
            return abstractC521346im3;
        } else {
            synchronized (this) {
                try {
                    if (this._uploadTaskDao == null) {
                        this._uploadTaskDao = new UploadTaskDao_Impl(this);
                    }
                    abstractC521346im = this._uploadTaskDao;
                } catch (Throwable th) {
                    MethodCollector.m14707o(201);
                    throw th;
                }
            }
            MethodCollector.m14707o(201);
            return abstractC521346im;
        }
    }

    @Override // cn.ever.cloud.android.persistence.SdkDatabase
    public final AbstractC522206kA userDao() {
        AbstractC522206kA abstractC522206kA;
        MethodCollector.m14708i(202);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            AbstractC522206kA abstractC522206kA2 = (AbstractC522206kA) proxy.result;
            MethodCollector.m14707o(202);
            return abstractC522206kA2;
        } else if (this._userDao != null) {
            AbstractC522206kA abstractC522206kA3 = this._userDao;
            MethodCollector.m14707o(202);
            return abstractC522206kA3;
        } else {
            synchronized (this) {
                try {
                    if (this._userDao == null) {
                        this._userDao = new UserDao_Impl(this);
                    }
                    abstractC522206kA = this._userDao;
                } catch (Throwable th) {
                    MethodCollector.m14707o(202);
                    throw th;
                }
            }
            MethodCollector.m14707o(202);
            return abstractC522206kA;
        }
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `LocalAsset`");
            writableDatabase.execSQL("DELETE FROM `CloudAsset`");
            writableDatabase.execSQL("DELETE FROM `Album`");
            writableDatabase.execSQL("DELETE FROM `AlbumAssetRelation`");
            writableDatabase.execSQL("DELETE FROM `KeyValue`");
            writableDatabase.execSQL("DELETE FROM `UploadTaskItem`");
            writableDatabase.execSQL("DELETE FROM `UserStorage`");
            writableDatabase.execSQL("DELETE FROM `ToDelAsset`");
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
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{databaseConfiguration}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (SupportSQLiteOpenHelper) proxy.result;
        }
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(2) { // from class: cn.ever.cloud.android.persistence.SdkDatabase_Impl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2893);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 5).isSupported) {
                    return;
                }
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 2).isSupported) {
                    return;
                }
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `LocalAsset`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `CloudAsset`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Album`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `AlbumAssetRelation`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `KeyValue`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `UploadTaskItem`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `UserStorage`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ToDelAsset`");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (!PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 3).isSupported && SdkDatabase_Impl.this.mCallbacks != null) {
                    int size = SdkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        SdkDatabase_Impl.this.mCallbacks.get(i).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 4).isSupported) {
                    return;
                }
                SdkDatabase_Impl sdkDatabase_Impl = SdkDatabase_Impl.this;
                sdkDatabase_Impl.mDatabase = supportSQLiteDatabase;
                sdkDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (SdkDatabase_Impl.this.mCallbacks != null) {
                    int size = SdkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        SdkDatabase_Impl.this.mCallbacks.get(i).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `LocalAsset` (`media_id` INTEGER NOT NULL, `uri` TEXT, `path` TEXT, `taken_ms` INTEGER NOT NULL, `duration_ms` INTEGER, `mime` TEXT NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `delete_on_upload_end` INTEGER NOT NULL, PRIMARY KEY(`media_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `CloudAsset` (`cloud_id` INTEGER NOT NULL, `md5` TEXT NOT NULL, `taken_ms` INTEGER NOT NULL, `duration_ms` INTEGER, `type` INTEGER NOT NULL, `sub_type` TEXT, `mime` TEXT NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `status` INTEGER NOT NULL, `preview_url` TEXT, `thumbnail_url` TEXT, `key` TEXT, `size` INTEGER, PRIMARY KEY(`cloud_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Album` (`album_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `create_at` INTEGER NOT NULL, `update_at` INTEGER NOT NULL, `is_deleted` INTEGER NOT NULL, `cover_link` INTEGER, `cover_md5` TEXT, PRIMARY KEY(`album_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `AlbumAssetRelation` (`link_id` INTEGER NOT NULL, `album_id` INTEGER NOT NULL, `local_id` INTEGER NOT NULL, `cloud_id` INTEGER NOT NULL, `add_time` INTEGER NOT NULL, `taken_time` INTEGER NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`link_id`))");
                supportSQLiteDatabase.execSQL("CREATE  INDEX `QueryIndex` ON `AlbumAssetRelation` (`album_id`, `add_time`, `taken_time`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `KeyValue` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `UploadTaskItem` (`id` INTEGER NOT NULL, `asset_id` TEXT NOT NULL, `path` TEXT, `uri` TEXT, `tag_id` INTEGER NOT NULL, `link_id` INTEGER NOT NULL, `item_key` TEXT NOT NULL, `group_id` INTEGER NOT NULL, `group_key` TEXT NOT NULL, `state` INTEGER NOT NULL, `cloud_id` INTEGER, `error_code` INTEGER, `error_message` TEXT, `pause_reason` INTEGER, `predefine_album_edit` INTEGER NOT NULL, `delete_on_upload_end` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                supportSQLiteDatabase.execSQL("CREATE  INDEX `index_UploadTaskItem_state` ON `UploadTaskItem` (`state`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `UserStorage` (`user_id` INTEGER NOT NULL, `quota` INTEGER NOT NULL, `usage` INTEGER NOT NULL, `media_num` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ToDelAsset` (`asset_id` TEXT NOT NULL, `path` TEXT, `uri` TEXT, PRIMARY KEY(`asset_id`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd9a809c20ed9a409efe729a431ed696f')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 6).isSupported) {
                    return;
                }
                HashMap hashMap = new HashMap(9);
                hashMap.put("media_id", new TableInfo.Column("media_id", "INTEGER", true, 1));
                hashMap.put("uri", new TableInfo.Column("uri", "TEXT", false, 0));
                hashMap.put("path", new TableInfo.Column("path", "TEXT", false, 0));
                hashMap.put("taken_ms", new TableInfo.Column("taken_ms", "INTEGER", true, 0));
                hashMap.put("duration_ms", new TableInfo.Column("duration_ms", "INTEGER", false, 0));
                hashMap.put("mime", new TableInfo.Column("mime", "TEXT", true, 0));
                hashMap.put("width", new TableInfo.Column("width", "INTEGER", true, 0));
                hashMap.put(C109391T5d.LJFF, new TableInfo.Column(C109391T5d.LJFF, "INTEGER", true, 0));
                hashMap.put("delete_on_upload_end", new TableInfo.Column("delete_on_upload_end", "INTEGER", true, 0));
                TableInfo tableInfo = new TableInfo("LocalAsset", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "LocalAsset");
                if (tableInfo.equals(read)) {
                    HashMap hashMap2 = new HashMap(14);
                    hashMap2.put("cloud_id", new TableInfo.Column("cloud_id", "INTEGER", true, 1));
                    hashMap2.put("md5", new TableInfo.Column("md5", "TEXT", true, 0));
                    hashMap2.put("taken_ms", new TableInfo.Column("taken_ms", "INTEGER", true, 0));
                    hashMap2.put("duration_ms", new TableInfo.Column("duration_ms", "INTEGER", false, 0));
                    hashMap2.put("type", new TableInfo.Column("type", "INTEGER", true, 0));
                    hashMap2.put("sub_type", new TableInfo.Column("sub_type", "TEXT", false, 0));
                    hashMap2.put("mime", new TableInfo.Column("mime", "TEXT", true, 0));
                    hashMap2.put("width", new TableInfo.Column("width", "INTEGER", true, 0));
                    hashMap2.put(C109391T5d.LJFF, new TableInfo.Column(C109391T5d.LJFF, "INTEGER", true, 0));
                    hashMap2.put("status", new TableInfo.Column("status", "INTEGER", true, 0));
                    hashMap2.put("preview_url", new TableInfo.Column("preview_url", "TEXT", false, 0));
                    hashMap2.put("thumbnail_url", new TableInfo.Column("thumbnail_url", "TEXT", false, 0));
                    hashMap2.put("key", new TableInfo.Column("key", "TEXT", false, 0));
                    hashMap2.put("size", new TableInfo.Column("size", "INTEGER", false, 0));
                    TableInfo tableInfo2 = new TableInfo("CloudAsset", hashMap2, new HashSet(0), new HashSet(0));
                    TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "CloudAsset");
                    if (tableInfo2.equals(read2)) {
                        HashMap hashMap3 = new HashMap(7);
                        hashMap3.put("album_id", new TableInfo.Column("album_id", "INTEGER", true, 1));
                        hashMap3.put("name", new TableInfo.Column("name", "TEXT", true, 0));
                        hashMap3.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0));
                        hashMap3.put("update_at", new TableInfo.Column("update_at", "INTEGER", true, 0));
                        hashMap3.put("is_deleted", new TableInfo.Column("is_deleted", "INTEGER", true, 0));
                        hashMap3.put("cover_link", new TableInfo.Column("cover_link", "INTEGER", false, 0));
                        hashMap3.put("cover_md5", new TableInfo.Column("cover_md5", "TEXT", false, 0));
                        TableInfo tableInfo3 = new TableInfo("Album", hashMap3, new HashSet(0), new HashSet(0));
                        TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "Album");
                        if (tableInfo3.equals(read3)) {
                            HashMap hashMap4 = new HashMap(7);
                            hashMap4.put("link_id", new TableInfo.Column("link_id", "INTEGER", true, 1));
                            hashMap4.put("album_id", new TableInfo.Column("album_id", "INTEGER", true, 0));
                            hashMap4.put("local_id", new TableInfo.Column("local_id", "INTEGER", true, 0));
                            hashMap4.put("cloud_id", new TableInfo.Column("cloud_id", "INTEGER", true, 0));
                            hashMap4.put("add_time", new TableInfo.Column("add_time", "INTEGER", true, 0));
                            hashMap4.put("taken_time", new TableInfo.Column("taken_time", "INTEGER", true, 0));
                            hashMap4.put("status", new TableInfo.Column("status", "INTEGER", true, 0));
                            HashSet hashSet = new HashSet(0);
                            HashSet hashSet2 = new HashSet(1);
                            hashSet2.add(new TableInfo.Index("QueryIndex", false, Arrays.asList("album_id", "add_time", "taken_time")));
                            TableInfo tableInfo4 = new TableInfo("AlbumAssetRelation", hashMap4, hashSet, hashSet2);
                            TableInfo read4 = TableInfo.read(supportSQLiteDatabase, "AlbumAssetRelation");
                            if (tableInfo4.equals(read4)) {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put("key", new TableInfo.Column("key", "TEXT", true, 1));
                                hashMap5.put("value", new TableInfo.Column("value", "TEXT", true, 0));
                                TableInfo tableInfo5 = new TableInfo("KeyValue", hashMap5, new HashSet(0), new HashSet(0));
                                TableInfo read5 = TableInfo.read(supportSQLiteDatabase, "KeyValue");
                                if (tableInfo5.equals(read5)) {
                                    HashMap hashMap6 = new HashMap(16);
                                    hashMap6.put(C33968a.f42937f, new TableInfo.Column(C33968a.f42937f, "INTEGER", true, 1));
                                    hashMap6.put("asset_id", new TableInfo.Column("asset_id", "TEXT", true, 0));
                                    hashMap6.put("path", new TableInfo.Column("path", "TEXT", false, 0));
                                    hashMap6.put("uri", new TableInfo.Column("uri", "TEXT", false, 0));
                                    hashMap6.put("tag_id", new TableInfo.Column("tag_id", "INTEGER", true, 0));
                                    hashMap6.put("link_id", new TableInfo.Column("link_id", "INTEGER", true, 0));
                                    hashMap6.put("item_key", new TableInfo.Column("item_key", "TEXT", true, 0));
                                    hashMap6.put("group_id", new TableInfo.Column("group_id", "INTEGER", true, 0));
                                    hashMap6.put("group_key", new TableInfo.Column("group_key", "TEXT", true, 0));
                                    hashMap6.put("state", new TableInfo.Column("state", "INTEGER", true, 0));
                                    hashMap6.put("cloud_id", new TableInfo.Column("cloud_id", "INTEGER", false, 0));
                                    hashMap6.put("error_code", new TableInfo.Column("error_code", "INTEGER", false, 0));
                                    hashMap6.put(PushMessageHelper.ERROR_MESSAGE, new TableInfo.Column(PushMessageHelper.ERROR_MESSAGE, "TEXT", false, 0));
                                    hashMap6.put("pause_reason", new TableInfo.Column("pause_reason", "INTEGER", false, 0));
                                    hashMap6.put("predefine_album_edit", new TableInfo.Column("predefine_album_edit", "INTEGER", true, 0));
                                    hashMap6.put("delete_on_upload_end", new TableInfo.Column("delete_on_upload_end", "INTEGER", true, 0));
                                    HashSet hashSet3 = new HashSet(0);
                                    HashSet hashSet4 = new HashSet(1);
                                    hashSet4.add(new TableInfo.Index("index_UploadTaskItem_state", false, Arrays.asList("state")));
                                    TableInfo tableInfo6 = new TableInfo("UploadTaskItem", hashMap6, hashSet3, hashSet4);
                                    TableInfo read6 = TableInfo.read(supportSQLiteDatabase, "UploadTaskItem");
                                    if (tableInfo6.equals(read6)) {
                                        HashMap hashMap7 = new HashMap(4);
                                        hashMap7.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 1));
                                        hashMap7.put("quota", new TableInfo.Column("quota", "INTEGER", true, 0));
                                        hashMap7.put("usage", new TableInfo.Column("usage", "INTEGER", true, 0));
                                        hashMap7.put("media_num", new TableInfo.Column("media_num", "INTEGER", true, 0));
                                        TableInfo tableInfo7 = new TableInfo("UserStorage", hashMap7, new HashSet(0), new HashSet(0));
                                        TableInfo read7 = TableInfo.read(supportSQLiteDatabase, "UserStorage");
                                        if (tableInfo7.equals(read7)) {
                                            HashMap hashMap8 = new HashMap(3);
                                            hashMap8.put("asset_id", new TableInfo.Column("asset_id", "TEXT", true, 1));
                                            hashMap8.put("path", new TableInfo.Column("path", "TEXT", false, 0));
                                            hashMap8.put("uri", new TableInfo.Column("uri", "TEXT", false, 0));
                                            TableInfo tableInfo8 = new TableInfo("ToDelAsset", hashMap8, new HashSet(0), new HashSet(0));
                                            TableInfo read8 = TableInfo.read(supportSQLiteDatabase, "ToDelAsset");
                                            if (tableInfo8.equals(read8)) {
                                                return;
                                            }
                                            throw new IllegalStateException("Migration didn't properly handle ToDelAsset(cn.ever.cloud.android.persistence.table.DbToDelAsset).\n Expected:\n" + tableInfo8 + "\n Found:\n" + read8);
                                        }
                                        throw new IllegalStateException("Migration didn't properly handle UserStorage(cn.ever.cloud.android.persistence.table.DbUserStorage).\n Expected:\n" + tableInfo7 + "\n Found:\n" + read7);
                                    }
                                    throw new IllegalStateException("Migration didn't properly handle UploadTaskItem(cn.ever.cloud.android.persistence.table.DbUploadTaskItem).\n Expected:\n" + tableInfo6 + "\n Found:\n" + read6);
                                }
                                throw new IllegalStateException("Migration didn't properly handle KeyValue(cn.ever.cloud.android.persistence.table.DbKeyValue).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                            }
                            throw new IllegalStateException("Migration didn't properly handle AlbumAssetRelation(cn.ever.cloud.android.persistence.table.DbAlbumAssetRelation).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                        }
                        throw new IllegalStateException("Migration didn't properly handle Album(cn.ever.cloud.android.persistence.table.DbAlbum).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                    }
                    throw new IllegalStateException("Migration didn't properly handle CloudAsset(cn.ever.cloud.android.persistence.table.DbCloudAsset).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                throw new IllegalStateException("Migration didn't properly handle LocalAsset(cn.ever.cloud.android.persistence.table.DbLocalAsset).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
        }, "d9a809c20ed9a409efe729a431ed696f", "4fc7c0de0b77f73d712acbfe97c72644");
        SupportSQLiteOpenHelper.Configuration.Builder builder = SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context);
        builder.name(databaseConfiguration.name);
        builder.callback(roomOpenHelper);
        return databaseConfiguration.sqliteOpenHelperFactory.create(builder.build());
    }
}
