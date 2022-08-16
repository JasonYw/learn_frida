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
import cn.ever.cloud.android.persistence.table.DbUploadTaskItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC521346im;

/* loaded from: classes13.dex */
public final class UploadTaskDao_Impl implements AbstractC521346im {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final RoomDatabase __db;
    public final EntityInsertionAdapter __insertionAdapterOfDbUploadTaskItem;
    public final SharedSQLiteStatement __preparedStmtOfUpdateStateAndRelativeExtras;

    static {
        Covode.recordClassIndex(2907);
    }

    public UploadTaskDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDbUploadTaskItem = new EntityInsertionAdapter<DbUploadTaskItem>(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.UploadTaskDao_Impl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2908);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `UploadTaskItem`(`id`,`asset_id`,`path`,`uri`,`tag_id`,`link_id`,`item_key`,`group_id`,`group_key`,`state`,`cloud_id`,`error_code`,`error_message`,`pause_reason`,`predefine_album_edit`,`delete_on_upload_end`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, DbUploadTaskItem dbUploadTaskItem) {
                if (PatchProxy.proxy(new Object[]{supportSQLiteStatement, dbUploadTaskItem}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                supportSQLiteStatement.bindLong(1, dbUploadTaskItem.getId());
                if (dbUploadTaskItem.getAssetId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dbUploadTaskItem.getAssetId());
                }
                if (dbUploadTaskItem.getPath() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, dbUploadTaskItem.getPath());
                }
                if (dbUploadTaskItem.getUri() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, dbUploadTaskItem.getUri());
                }
                supportSQLiteStatement.bindLong(5, dbUploadTaskItem.getTagId());
                supportSQLiteStatement.bindLong(6, dbUploadTaskItem.getLinkId());
                if (dbUploadTaskItem.getItemKey() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, dbUploadTaskItem.getItemKey());
                }
                supportSQLiteStatement.bindLong(8, dbUploadTaskItem.getGroupId());
                if (dbUploadTaskItem.getGroupKey() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, dbUploadTaskItem.getGroupKey());
                }
                supportSQLiteStatement.bindLong(10, dbUploadTaskItem.getState());
                if (dbUploadTaskItem.getCloudId() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindLong(11, dbUploadTaskItem.getCloudId().longValue());
                }
                if (dbUploadTaskItem.getErrorCode() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindLong(12, dbUploadTaskItem.getErrorCode().intValue());
                }
                if (dbUploadTaskItem.getErrorMessage() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, dbUploadTaskItem.getErrorMessage());
                }
                if (dbUploadTaskItem.getPauseReason() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindLong(14, dbUploadTaskItem.getPauseReason().intValue());
                }
                supportSQLiteStatement.bindLong(15, dbUploadTaskItem.getPredefineAlbumEdit() ? 1L : 0L);
                supportSQLiteStatement.bindLong(16, dbUploadTaskItem.getDeleteOnEnd() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfUpdateStateAndRelativeExtras = new SharedSQLiteStatement(roomDatabase) { // from class: cn.ever.cloud.android.persistence.dao.UploadTaskDao_Impl.2
            static {
                Covode.recordClassIndex(2909);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE UploadTaskItem SET state=?, error_code=?, error_message=?, pause_reason=? WHERE id=?";
            }
        };
    }

    @Override // p003X.AbstractC521346im
    public final List<Long> batchInsert(List<DbUploadTaskItem> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDbUploadTaskItem.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // p003X.AbstractC521346im
    public final DbUploadTaskItem queryTaskItem(long j) {
        DbUploadTaskItem dbUploadTaskItem;
        Long valueOf;
        Integer valueOf2;
        boolean z;
        boolean z2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (DbUploadTaskItem) proxy.result;
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM UploadTaskItem WHERE id=?", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, C33968a.f42937f);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "asset_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "uri");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "tag_id");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "link_id");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "item_key");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "group_id");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "group_key");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "cloud_id");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "error_code");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, PushMessageHelper.ERROR_MESSAGE);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "pause_reason");
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "predefine_album_edit");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "delete_on_upload_end");
                Integer num = null;
                if (query.moveToFirst()) {
                    long j2 = query.getLong(columnIndexOrThrow);
                    String string = query.getString(columnIndexOrThrow2);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    long j3 = query.getLong(columnIndexOrThrow5);
                    long j4 = query.getLong(columnIndexOrThrow6);
                    String string4 = query.getString(columnIndexOrThrow7);
                    long j5 = query.getLong(columnIndexOrThrow8);
                    String string5 = query.getString(columnIndexOrThrow9);
                    int i = query.getInt(columnIndexOrThrow10);
                    if (query.isNull(columnIndexOrThrow11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(query.getLong(columnIndexOrThrow11));
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(query.getInt(columnIndexOrThrow12));
                    }
                    String string6 = query.getString(columnIndexOrThrow13);
                    if (!query.isNull(columnIndexOrThrow14)) {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow14));
                    }
                    if (query.getInt(columnIndexOrThrow15) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(columnIndexOrThrow16) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dbUploadTaskItem = new DbUploadTaskItem(j2, string, string2, string3, j3, j4, string4, j5, string5, i, valueOf, valueOf2, string6, num, z, z2);
                } else {
                    dbUploadTaskItem = null;
                }
                query.close();
                acquire.release();
                return dbUploadTaskItem;
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

    @Override // p003X.AbstractC521346im
    public final List<DbUploadTaskItem> queryTasksByState(List<Integer> list) {
        Long valueOf;
        Integer valueOf2;
        boolean z;
        boolean z2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM UploadTaskItem WHERE state in (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (Integer num : list) {
            if (num == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindLong(i, num.intValue());
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, C33968a.f42937f);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "asset_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "path");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "uri");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "tag_id");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "link_id");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "item_key");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "group_id");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "group_key");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "cloud_id");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "error_code");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, PushMessageHelper.ERROR_MESSAGE);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "pause_reason");
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "predefine_album_edit");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "delete_on_upload_end");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    String string = query.getString(columnIndexOrThrow2);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    long j2 = query.getLong(columnIndexOrThrow5);
                    long j3 = query.getLong(columnIndexOrThrow6);
                    String string4 = query.getString(columnIndexOrThrow7);
                    long j4 = query.getLong(columnIndexOrThrow8);
                    String string5 = query.getString(columnIndexOrThrow9);
                    int i2 = query.getInt(columnIndexOrThrow10);
                    Integer num2 = null;
                    if (query.isNull(columnIndexOrThrow11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(query.getLong(columnIndexOrThrow11));
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(query.getInt(columnIndexOrThrow12));
                    }
                    String string6 = query.getString(columnIndexOrThrow13);
                    if (!query.isNull(columnIndexOrThrow14)) {
                        num2 = Integer.valueOf(query.getInt(columnIndexOrThrow14));
                    }
                    if (query.getInt(columnIndexOrThrow15) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(columnIndexOrThrow16) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new DbUploadTaskItem(j, string, string2, string3, j2, j3, string4, j4, string5, i2, valueOf, valueOf2, string6, num2, z, z2));
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

    @Override // p003X.AbstractC521346im
    public final void updateStateAndRelativeExtras(long j, int i, Integer num, String str, Integer num2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), num, str, num2}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateStateAndRelativeExtras.acquire();
        acquire.bindLong(1, i);
        if (num == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindLong(2, num.intValue());
        }
        if (str == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, str);
        }
        if (num2 == null) {
            acquire.bindNull(4);
        } else {
            acquire.bindLong(4, num2.intValue());
        }
        acquire.bindLong(5, j);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateStateAndRelativeExtras.release(acquire);
        }
    }
}
