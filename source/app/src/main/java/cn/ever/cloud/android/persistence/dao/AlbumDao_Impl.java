package cn.ever.cloud.android.persistence.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import cn.ever.cloud.android.persistence.table.DbAlbum;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC522106k0;

/* loaded from: classes13.dex */
public final class AlbumDao_Impl implements AbstractC522106k0 {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final RoomDatabase __db;
    public final EntityInsertionAdapter __insertionAdapterOfDbAlbum;
    public final SharedSQLiteStatement __preparedStmtOfUpdateAlbumCover;

    static {
        Covode.recordClassIndex(2894);
    }

    @Override // p003X.AbstractC522106k0
    public final List<DbAlbum> getAlbums() {
        boolean z;
        Long valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM Album", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "create_at");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "update_at");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "is_deleted");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "cover_link");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "cover_md5");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                long j = query.getLong(columnIndexOrThrow);
                String string = query.getString(columnIndexOrThrow2);
                long j2 = query.getLong(columnIndexOrThrow3);
                long j3 = query.getLong(columnIndexOrThrow4);
                if (query.getInt(columnIndexOrThrow5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (query.isNull(columnIndexOrThrow6)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(columnIndexOrThrow6));
                }
                arrayList.add(new DbAlbum(j, string, j2, j3, z, valueOf, query.getString(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public AlbumDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDbAlbum = new EntityInsertionAdapter<DbAlbum>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.AlbumDao_Impl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2895);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Album`(`album_id`,`name`,`create_at`,`update_at`,`is_deleted`,`cover_link`,`cover_md5`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbAlbum dbAlbum) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbAlbum}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteStatement.bindLong(1, dbAlbum.getAlbumId());
                if (dbAlbum.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dbAlbum.getName());
                }
                supportSQLiteStatement.bindLong(3, dbAlbum.getCreateAt());
                supportSQLiteStatement.bindLong(4, dbAlbum.getUpdateAt());
                supportSQLiteStatement.bindLong(5, dbAlbum.isDeleted() ? 1L : 0L);
                if (dbAlbum.getCoverLink() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, dbAlbum.getCoverLink().longValue());
                }
                if (dbAlbum.getCoverMd5() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, dbAlbum.getCoverMd5());
                }
            }
        };
        this.__preparedStmtOfUpdateAlbumCover = new SharedSQLiteStatement(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.AlbumDao_Impl.2
            static {
                Covode.recordClassIndex(2896);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE Album SET cover_link= ? WHERE album_id = ?";
            }
        };
    }

    @Override // p003X.AbstractC522106k0
    public final List<Long> upsertAlbums(List<DbAlbum> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDbAlbum.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC522106k0
    public final DbAlbum getAlbum(long j) {
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (DbAlbum) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM Album WHERE album_id = ?", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "create_at");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "update_at");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "is_deleted");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "cover_link");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "cover_md5");
            DbAlbum dbAlbum = null;
            Long l = null;
            if (query.moveToFirst()) {
                long j2 = query.getLong(columnIndexOrThrow);
                String string = query.getString(columnIndexOrThrow2);
                long j3 = query.getLong(columnIndexOrThrow3);
                long j4 = query.getLong(columnIndexOrThrow4);
                if (query.getInt(columnIndexOrThrow5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!query.isNull(columnIndexOrThrow6)) {
                    l = Long.valueOf(query.getLong(columnIndexOrThrow6));
                }
                dbAlbum = new DbAlbum(j2, string, j3, j4, z, l, query.getString(columnIndexOrThrow7));
            }
            return dbAlbum;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // p003X.AbstractC522106k0
    public final List<DbAlbum> getAlbums(List<Long> list) {
        boolean z;
        Long valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM ALBUM WHERE album_id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (Long l : list) {
            if (l == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindLong(i, l.longValue());
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "create_at");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "update_at");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "is_deleted");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "cover_link");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "cover_md5");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                long j = query.getLong(columnIndexOrThrow);
                String string = query.getString(columnIndexOrThrow2);
                long j2 = query.getLong(columnIndexOrThrow3);
                long j3 = query.getLong(columnIndexOrThrow4);
                if (query.getInt(columnIndexOrThrow5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (query.isNull(columnIndexOrThrow6)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(columnIndexOrThrow6));
                }
                arrayList.add(new DbAlbum(j, string, j2, j3, z, valueOf, query.getString(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // p003X.AbstractC522106k0
    public final int updateAlbumCover(long j, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateAlbumCover.acquire();
        acquire.bindLong(1, j2);
        acquire.bindLong(2, j);
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateAlbumCover.release(acquire);
        }
    }
}
