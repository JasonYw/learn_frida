package cn.ever.cloud.android.persistence.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import cn.ever.cloud.android.persistence.table.DbUserStorage;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC522206kA;

/* loaded from: classes13.dex */
public final class UserDao_Impl implements AbstractC522206kA {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final RoomDatabase __db;
    public final EntityInsertionAdapter __insertionAdapterOfDbUserStorage;

    static {
        Covode.recordClassIndex(2910);
    }

    @Override // p003X.AbstractC522206kA
    public final DbUserStorage getUserStorage() {
        DbUserStorage dbUserStorage;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (DbUserStorage) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM UserStorage", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "user_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "quota");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "usage");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "media_num");
            if (query.moveToFirst()) {
                dbUserStorage = new DbUserStorage(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4));
            } else {
                dbUserStorage = null;
            }
            return dbUserStorage;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public UserDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDbUserStorage = new EntityInsertionAdapter<DbUserStorage>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.UserDao_Impl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2911);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `UserStorage`(`user_id`,`quota`,`usage`,`media_num`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbUserStorage dbUserStorage) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbUserStorage}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteStatement.bindLong(1, dbUserStorage.getUserId());
                supportSQLiteStatement.bindLong(2, dbUserStorage.getQuota());
                supportSQLiteStatement.bindLong(3, dbUserStorage.getUsage());
                supportSQLiteStatement.bindLong(4, dbUserStorage.getMediaNum());
            }
        };
    }

    @Override // p003X.AbstractC522206kA
    public final long upsertUserStorage(DbUserStorage dbUserStorage) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbUserStorage}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfDbUserStorage.insertAndReturnId(dbUserStorage);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
