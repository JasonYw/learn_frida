package cn.ever.cloud.android.persistence.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import cn.ever.cloud.android.persistence.table.DbToDelAsset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC529026vA;

/* loaded from: classes13.dex */
public final class TodoAssetDao_Impl implements AbstractC529026vA {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final RoomDatabase __db;
    public final EntityDeletionOrUpdateAdapter __deletionAdapterOfDbToDelAsset;
    public final EntityInsertionAdapter __insertionAdapterOfDbToDelAsset;

    static {
        Covode.recordClassIndex(2904);
    }

    @Override // p003X.AbstractC529026vA
    public final List<DbToDelAsset> get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM ToDelAsset", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "asset_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "uri");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new DbToDelAsset(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public TodoAssetDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDbToDelAsset = new EntityInsertionAdapter<DbToDelAsset>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.TodoAssetDao_Impl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2905);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ToDelAsset`(`asset_id`,`path`,`uri`) VALUES (?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbToDelAsset dbToDelAsset) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbToDelAsset}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                if (dbToDelAsset.getAssetId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, dbToDelAsset.getAssetId());
                }
                if (dbToDelAsset.getPath() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dbToDelAsset.getPath());
                }
                if (dbToDelAsset.getUri() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, dbToDelAsset.getUri());
                }
            }
        };
        this.__deletionAdapterOfDbToDelAsset = new EntityDeletionOrUpdateAdapter<DbToDelAsset>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.TodoAssetDao_Impl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2906);
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `ToDelAsset` WHERE `asset_id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbToDelAsset dbToDelAsset) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbToDelAsset}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                if (dbToDelAsset.getAssetId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, dbToDelAsset.getAssetId());
                }
            }
        };
    }

    @Override // p003X.AbstractC529026vA
    public final void delete(DbToDelAsset[] dbToDelAssetArr) {
        if (PatchProxy.proxy(new Object[]{dbToDelAssetArr}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfDbToDelAsset.handleMultiple(dbToDelAssetArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC529026vA
    public final void insert(DbToDelAsset dbToDelAsset) {
        if (PatchProxy.proxy(new Object[]{dbToDelAsset}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDbToDelAsset.insert((EntityInsertionAdapter) dbToDelAsset);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
