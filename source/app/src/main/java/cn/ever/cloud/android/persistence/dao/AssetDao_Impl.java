package cn.ever.cloud.android.persistence.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import cn.ever.cloud.android.persistence.table.DbAlbumAssetRelation;
import cn.ever.cloud.android.persistence.table.DbCloudAsset;
import cn.ever.cloud.android.persistence.table.DbLocalAsset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC522116k1;
import p003X.C109391T5d;

/* loaded from: classes13.dex */
public final class AssetDao_Impl implements AbstractC522116k1 {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final RoomDatabase __db;
    public final EntityDeletionOrUpdateAdapter __deletionAdapterOfDbAlbumAssetRelation;
    public final EntityInsertionAdapter __insertionAdapterOfDbAlbumAssetRelation;
    public final EntityInsertionAdapter __insertionAdapterOfDbCloudAsset;
    public final EntityInsertionAdapter __insertionAdapterOfDbLocalAsset;

    static {
        Covode.recordClassIndex(2897);
    }

    public AssetDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDbCloudAsset = new EntityInsertionAdapter<DbCloudAsset>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.AssetDao_Impl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2898);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `CloudAsset`(`cloud_id`,`md5`,`taken_ms`,`duration_ms`,`type`,`sub_type`,`mime`,`width`,`height`,`status`,`preview_url`,`thumbnail_url`,`key`,`size`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbCloudAsset dbCloudAsset) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbCloudAsset}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteStatement.bindLong(1, dbCloudAsset.getCloudId());
                if (dbCloudAsset.getMd5() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dbCloudAsset.getMd5());
                }
                supportSQLiteStatement.bindLong(3, dbCloudAsset.getTakenMs());
                if (dbCloudAsset.getDurationMs() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindLong(4, dbCloudAsset.getDurationMs().longValue());
                }
                supportSQLiteStatement.bindLong(5, dbCloudAsset.getType());
                if (dbCloudAsset.getSubType() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, dbCloudAsset.getSubType());
                }
                if (dbCloudAsset.getMime() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, dbCloudAsset.getMime());
                }
                supportSQLiteStatement.bindLong(8, dbCloudAsset.getWidth());
                supportSQLiteStatement.bindLong(9, dbCloudAsset.getHeight());
                supportSQLiteStatement.bindLong(10, dbCloudAsset.getStatus());
                if (dbCloudAsset.getPreviewUrl() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, dbCloudAsset.getPreviewUrl());
                }
                if (dbCloudAsset.getThumbnailUrl() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, dbCloudAsset.getThumbnailUrl());
                }
                if (dbCloudAsset.getKey() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, dbCloudAsset.getKey());
                }
                if (dbCloudAsset.getSize() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindLong(14, dbCloudAsset.getSize().longValue());
                }
            }
        };
        this.__insertionAdapterOfDbLocalAsset = new EntityInsertionAdapter<DbLocalAsset>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.AssetDao_Impl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2899);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `LocalAsset`(`media_id`,`uri`,`path`,`taken_ms`,`duration_ms`,`mime`,`width`,`height`,`delete_on_upload_end`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbLocalAsset dbLocalAsset) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbLocalAsset}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteStatement.bindLong(1, dbLocalAsset.getMediaId());
                if (dbLocalAsset.getUri() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dbLocalAsset.getUri());
                }
                if (dbLocalAsset.getPath() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, dbLocalAsset.getPath());
                }
                supportSQLiteStatement.bindLong(4, dbLocalAsset.getTakenMs());
                if (dbLocalAsset.getDurationMs() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindLong(5, dbLocalAsset.getDurationMs().longValue());
                }
                if (dbLocalAsset.getMime() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, dbLocalAsset.getMime());
                }
                supportSQLiteStatement.bindLong(7, dbLocalAsset.getWidth());
                supportSQLiteStatement.bindLong(8, dbLocalAsset.getHeight());
                supportSQLiteStatement.bindLong(9, dbLocalAsset.getDeleteOnEnd() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfDbAlbumAssetRelation = new EntityInsertionAdapter<DbAlbumAssetRelation>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.AssetDao_Impl.3
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2900);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `AlbumAssetRelation`(`link_id`,`album_id`,`local_id`,`cloud_id`,`add_time`,`taken_time`,`status`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbAlbumAssetRelation dbAlbumAssetRelation) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbAlbumAssetRelation}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteStatement.bindLong(1, dbAlbumAssetRelation.getLinkId());
                supportSQLiteStatement.bindLong(2, dbAlbumAssetRelation.getAlbumId());
                supportSQLiteStatement.bindLong(3, dbAlbumAssetRelation.getLocalId());
                supportSQLiteStatement.bindLong(4, dbAlbumAssetRelation.getCloudId());
                supportSQLiteStatement.bindLong(5, dbAlbumAssetRelation.getAddTime());
                supportSQLiteStatement.bindLong(6, dbAlbumAssetRelation.getTakenTime());
                supportSQLiteStatement.bindLong(7, dbAlbumAssetRelation.getStatus());
            }
        };
        this.__deletionAdapterOfDbAlbumAssetRelation = new EntityDeletionOrUpdateAdapter<DbAlbumAssetRelation>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.AssetDao_Impl.4
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2901);
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `AlbumAssetRelation` WHERE `link_id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbAlbumAssetRelation dbAlbumAssetRelation) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbAlbumAssetRelation}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteStatement.bindLong(1, dbAlbumAssetRelation.getLinkId());
            }
        };
    }

    @Override // p003X.AbstractC522116k1
    public final void deleteAlbumAssetRelations(List<DbAlbumAssetRelation> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfDbAlbumAssetRelation.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<Long> upsertAlbumAssetRelation(List<DbAlbumAssetRelation> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDbAlbumAssetRelation.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<Long> upsertCloudAsset(List<DbCloudAsset> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDbCloudAsset.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<Long> upsertLocalAsset(List<DbLocalAsset> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDbLocalAsset.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<DbAlbumAssetRelation> getAlbumAssetRelation(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM AlbumAssetRelation WHERE album_id = ? ORDER BY add_time DESC, taken_time DESC, link_id ASC", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "link_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "local_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "cloud_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "add_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "taken_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "status");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new DbAlbumAssetRelation(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<DbAlbumAssetRelation> getAlbumAssetRelationsByCloudIds(List<Long> list) {
        int i = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM AlbumAssetRelation WHERE cloud_id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
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
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "link_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "local_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "cloud_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "add_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "taken_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "status");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new DbAlbumAssetRelation(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<DbAlbumAssetRelation> getAlbumAssetRelationsByLinkIds(List<Long> list) {
        int i = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM AlbumAssetRelation WHERE link_id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
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
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "link_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "local_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "cloud_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "add_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "taken_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "status");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new DbAlbumAssetRelation(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<DbLocalAsset> getLocalAssets(List<Long> list) {
        Long valueOf;
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM LocalAsset WHERE media_id in (");
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
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "media_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "uri");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "taken_ms");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "duration_ms");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "mime");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "width");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, C109391T5d.LJFF);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "delete_on_upload_end");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                long j = query.getLong(columnIndexOrThrow);
                String string = query.getString(columnIndexOrThrow2);
                String string2 = query.getString(columnIndexOrThrow3);
                long j2 = query.getLong(columnIndexOrThrow4);
                if (query.isNull(columnIndexOrThrow5)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(columnIndexOrThrow5));
                }
                String string3 = query.getString(columnIndexOrThrow6);
                int i2 = query.getInt(columnIndexOrThrow7);
                int i3 = query.getInt(columnIndexOrThrow8);
                if (query.getInt(columnIndexOrThrow9) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new DbLocalAsset(j, string, string2, j2, valueOf, string3, i2, i3, z));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<DbCloudAsset> getCloudAssets(List<Long> list) {
        Long valueOf;
        int i = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM CloudAsset WHERE cloud_id in (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
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
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "cloud_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "md5");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "taken_ms");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "duration_ms");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "type");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "sub_type");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "mime");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "width");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, C109391T5d.LJFF);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "preview_url");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "thumbnail_url");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "key");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "size");
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    String string = query.getString(columnIndexOrThrow2);
                    long j2 = query.getLong(columnIndexOrThrow3);
                    Long l2 = null;
                    if (query.isNull(columnIndexOrThrow4)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(query.getLong(columnIndexOrThrow4));
                    }
                    int i2 = query.getInt(columnIndexOrThrow5);
                    String string2 = query.getString(columnIndexOrThrow6);
                    String string3 = query.getString(columnIndexOrThrow7);
                    int i3 = query.getInt(columnIndexOrThrow8);
                    int i4 = query.getInt(columnIndexOrThrow9);
                    int i5 = query.getInt(columnIndexOrThrow10);
                    String string4 = query.getString(columnIndexOrThrow11);
                    String string5 = query.getString(columnIndexOrThrow12);
                    String string6 = query.getString(columnIndexOrThrow13);
                    if (!query.isNull(columnIndexOrThrow14)) {
                        l2 = Long.valueOf(query.getLong(columnIndexOrThrow14));
                    }
                    arrayList.add(new DbCloudAsset(j, string, j2, valueOf, i2, string2, string3, i3, i4, i5, string4, string5, string6, l2));
                }
                query.close();
                acquire.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                acquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p003X.AbstractC522116k1
    public final List<DbAlbumAssetRelation> getAlbumAssetRelations(long j, long j2, long j3, long j4, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i)}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM AlbumAssetRelation WHERE (album_id = ? AND add_time = ? AND taken_time = ? AND link_id > ?) OR (album_id = ? AND add_time = ? AND taken_time < ?) OR (album_id = ? AND add_time < ?) ORDER BY add_time DESC, taken_time DESC, link_id ASC LIMIT ?", 10);
        acquire.bindLong(1, j);
        acquire.bindLong(2, j2);
        acquire.bindLong(3, j3);
        acquire.bindLong(4, j4);
        acquire.bindLong(5, j);
        acquire.bindLong(6, j2);
        acquire.bindLong(7, j3);
        acquire.bindLong(8, j);
        acquire.bindLong(9, j2);
        acquire.bindLong(10, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "link_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "album_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "local_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "cloud_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "add_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "taken_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "status");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new DbAlbumAssetRelation(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
