package cn.ever.cloud.android.persistence.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import cn.ever.cloud.android.persistence.table.DbKeyValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC116287Vq5;

/* loaded from: classes13.dex */
public final class KeyValueDao_Impl implements AbstractC116287Vq5 {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final RoomDatabase __db;
    public final EntityInsertionAdapter __insertionAdapterOfDbKeyValue;

    static {
        Covode.recordClassIndex(2902);
    }

    public KeyValueDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDbKeyValue = new EntityInsertionAdapter<DbKeyValue>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.KeyValueDao_Impl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2903);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `KeyValue`(`key`,`value`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbKeyValue dbKeyValue) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbKeyValue}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                if (dbKeyValue.getKey() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, dbKeyValue.getKey());
                }
                if (dbKeyValue.getValue() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dbKeyValue.getValue());
                }
            }
        };
    }

    @Override // p003X.AbstractC116287Vq5
    public final long upsert(DbKeyValue dbKeyValue) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbKeyValue}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfDbKeyValue.insertAndReturnId(dbKeyValue);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC116287Vq5
    public final DbKeyValue query(String str) {
        DbKeyValue dbKeyValue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (DbKeyValue) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM KeyValue WHERE `key`=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "key");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "value");
            if (query.moveToFirst()) {
                dbKeyValue = new DbKeyValue(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2));
            } else {
                dbKeyValue = null;
            }
            return dbKeyValue;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
