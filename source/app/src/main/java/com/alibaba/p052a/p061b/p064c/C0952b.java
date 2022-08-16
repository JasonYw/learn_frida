package com.alibaba.p052a.p061b.p064c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.alibaba.p052a.p053a.p055b.C0887b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p066e.C0999b;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34068l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p002O.C0002O;

/* renamed from: com.alibaba.a.b.c.b */
/* loaded from: classes13.dex */
public class C0952b implements AbstractC0951a {

    /* renamed from: a */
    public String f21357a = "SELECT * FROM %s ORDER BY %s ASC LIMIT %s";

    /* renamed from: b */
    public String f21358b = "SELECT count(*) FROM %s";

    /* renamed from: c */
    public String f21359c = "DELETE FROM log where _id in ( select _id from log  ORDER BY _id ASC LIMIT %d )";

    /* renamed from: d */
    public C0953a f21360d;

    /* renamed from: com.alibaba.a.b.c.b$a */
    /* loaded from: classes13.dex */
    public class C0953a extends SQLiteOpenHelper {

        /* renamed from: b */
        public AtomicInteger f21362b = new AtomicInteger();

        /* renamed from: c */
        public SQLiteDatabase f21363c;

        static {
            Covode.recordClassIndex(4263);
        }

        public C0953a(Context context) {
            super(context, "ut.db", (SQLiteDatabase.CursorFactory) null, 2);
        }

        /* renamed from: a */
        public synchronized void m20157a(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase == null) {
                return;
            }
            try {
                if (this.f21362b.decrementAndGet() == 0 && this.f21363c != null) {
                    this.f21363c.close();
                    this.f21363c = null;
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public synchronized SQLiteDatabase getWritableDatabase() {
            try {
                if (this.f21362b.incrementAndGet() == 1) {
                    this.f21363c = super.getWritableDatabase();
                }
            }
            return this.f21363c;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS log (_id INTEGER PRIMARY KEY AUTOINCREMENT, eventId TEXT,priority TEXT, streamId TEXT, time TEXT, content TEXT, _index TEXT )");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=DELETE", null);
            } catch (Throwable unused) {
            }
            C0952b.this.m20165a(cursor);
            super.onOpen(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i == 1 && i2 == 2) {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE log ADD COLUMN _index TEXT ");
                } catch (Throwable th) {
                    C0974i.m20099a("UTSqliteLogStore", "DB Upgrade Error", th);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(4262);
    }

    public C0952b(Context context) {
        this.f21360d = new C0953a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m20165a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.alibaba.p052a.p061b.p064c.AbstractC0951a
    /* renamed from: a */
    public synchronized int mo20167a() {
        int i;
        SQLiteDatabase writableDatabase = this.f21360d.getWritableDatabase();
        i = 0;
        if (writableDatabase != null) {
            Cursor rawQuery = writableDatabase.rawQuery(String.format(this.f21358b, "log"), null);
            if (rawQuery != null) {
                rawQuery.moveToFirst();
                i = rawQuery.getInt(0);
            }
            m20165a(rawQuery);
            this.f21360d.m20157a(writableDatabase);
        } else {
            C0974i.m20098a("UTSqliteLogStore", "db is null");
        }
        return i;
    }

    @Override // com.alibaba.p052a.p061b.p064c.AbstractC0951a
    /* renamed from: a */
    public void mo20166a(int i) {
        if (i <= 0) {
            return;
        }
        SQLiteDatabase writableDatabase = this.f21360d.getWritableDatabase();
        if (writableDatabase == null) {
            C0974i.m20098a("UTSqliteLogStore", "db is null");
            return;
        }
        try {
            writableDatabase.execSQL(String.format(this.f21359c, Integer.valueOf(i)));
        } catch (Throwable unused) {
        }
        this.f21360d.m20157a(writableDatabase);
    }

    @Override // com.alibaba.p052a.p061b.p064c.AbstractC0951a
    /* renamed from: a */
    public synchronized void mo20162a(String str, String str2) {
        SQLiteDatabase writableDatabase = this.f21360d.getWritableDatabase();
        if (writableDatabase != null) {
            new StringBuilder();
            writableDatabase.delete("log", C0002O.m25086C(str, " < ?"), new String[]{String.valueOf(str2)});
            this.f21360d.m20157a(writableDatabase);
        } else {
            C0974i.m20098a("UTSqliteLogStore", "db is null");
        }
    }

    @Override // com.alibaba.p052a.p061b.p064c.AbstractC0951a
    /* renamed from: a */
    public synchronized boolean mo20161a(List<C0999b> list) {
        C0953a c0953a;
        if (list != null) {
            if (list.size() != 0) {
                SQLiteDatabase sQLiteDatabase = null;
                boolean z = false;
                try {
                    sQLiteDatabase = this.f21360d.getWritableDatabase();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.beginTransaction();
                        try {
                            for (int i = 0; i < list.size(); i++) {
                                try {
                                    C0999b c0999b = list.get(i);
                                    if (c0999b != null) {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("eventId", c0999b.f21474b);
                                        contentValues.put("priority", c0999b.f21475c);
                                        contentValues.put("content", c0999b.m20043b());
                                        contentValues.put("time", c0999b.f21476d);
                                        contentValues.put("_index", c0999b.f21477e);
                                        long insert = sQLiteDatabase.insert("log", "", contentValues);
                                        if (insert != -1) {
                                            C0974i.m20098a("UTSqliteLogStore", "[insert] ", c0999b.f21477e, " isSuccess:", Boolean.TRUE, "ret", Long.valueOf(insert));
                                        }
                                        break;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = true;
                                    C0974i.m20099a("UTSqliteLogStore", "insert error", th);
                                    C0887b.m20436a(th);
                                    if (sQLiteDatabase != null) {
                                        try {
                                            sQLiteDatabase.setTransactionSuccessful();
                                        } catch (Throwable unused) {
                                        }
                                        try {
                                            sQLiteDatabase.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    c0953a = this.f21360d;
                                    c0953a.m20157a(sQLiteDatabase);
                                    return z;
                                }
                            }
                            break;
                            sQLiteDatabase.setTransactionSuccessful();
                        } catch (Throwable unused3) {
                        }
                        z = true;
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    } else {
                        C0974i.m20098a("UTSqliteLogStore", "db is null");
                    }
                    c0953a = this.f21360d;
                } catch (Throwable th2) {
                    th = th2;
                }
                c0953a.m20157a(sQLiteDatabase);
                return z;
            }
        }
        return true;
    }

    @Override // com.alibaba.p052a.p061b.p064c.AbstractC0951a
    /* renamed from: b */
    public synchronized int mo20158b(List<C0999b> list) {
        boolean z;
        int i;
        if (list != null) {
            if (list.size() != 0) {
                SQLiteDatabase writableDatabase = this.f21360d.getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.beginTransaction();
                    z = true;
                    i = 0;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(list.get(i2).f21473a);
                        long delete = writableDatabase.delete("log", "_id=?", new String[]{sb.toString()});
                        if (delete <= 0) {
                            C0974i.m20098a("UTSqliteLogStore", "[delete]  ", Integer.valueOf(list.get(i2).f21473a), " ret:", Long.valueOf(delete));
                            z = false;
                        } else if (!"6005".equalsIgnoreCase(list.get(i2).f21474b)) {
                            i++;
                        }
                    }
                    try {
                        writableDatabase.setTransactionSuccessful();
                    } catch (Throwable unused) {
                    }
                    try {
                        writableDatabase.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    this.f21360d.m20157a(writableDatabase);
                } else {
                    C0974i.m20098a("UTSqliteLogStore", "db is null");
                    z = false;
                    i = 0;
                }
                C0974i.m20098a("UTSqliteLogStore", "delete ", Integer.valueOf(list.size()), " isSuccess:", Boolean.valueOf(z));
                return i;
            }
        }
        return 0;
    }

    @Override // com.alibaba.p052a.p061b.p064c.AbstractC0951a
    /* renamed from: b */
    public synchronized ArrayList<C0999b> mo20163a(String str, int i) {
        ArrayList<C0999b> arrayList;
        try {
        } catch (Throwable unused) {
            arrayList = null;
        }
        if (i <= 0) {
            return (ArrayList) Collections.EMPTY_LIST;
        }
        arrayList = new ArrayList<>(i);
        try {
            SQLiteDatabase writableDatabase = this.f21360d.getWritableDatabase();
            if (writableDatabase != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM log");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(" WHERE ");
                    sb.append(str);
                }
                sb.append(" ORDER BY time");
                sb.append(" ASC ");
                sb.append(" LIMIT ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb.append(sb2.toString());
                String sb3 = sb.toString();
                C0974i.m20098a("UTSqliteLogStore", "sql:" + sb3);
                Cursor rawQuery = writableDatabase.rawQuery(sb3, null);
                while (rawQuery != null && rawQuery.moveToNext()) {
                    C0999b c0999b = new C0999b();
                    C0974i.m20098a("UTSqliteLogStore", "pos", Integer.valueOf(rawQuery.getPosition()), "count", Integer.valueOf(rawQuery.getCount()));
                    c0999b.f21473a = rawQuery.getInt(rawQuery.getColumnIndex(C34068l.f43339g));
                    c0999b.f21474b = rawQuery.getString(rawQuery.getColumnIndex("eventId"));
                    c0999b.f21475c = rawQuery.getString(rawQuery.getColumnIndex("priority"));
                    c0999b.m20042b(rawQuery.getString(rawQuery.getColumnIndex("content")));
                    c0999b.f21476d = rawQuery.getString(rawQuery.getColumnIndex("time"));
                    try {
                        c0999b.f21477e = rawQuery.getString(rawQuery.getColumnIndex("_index"));
                    } catch (Throwable unused2) {
                    }
                    arrayList.add(c0999b);
                }
                m20165a(rawQuery);
                this.f21360d.m20157a(writableDatabase);
            } else {
                C0974i.m20098a("UTSqliteLogStore", "db is null");
            }
        } catch (Throwable unused3) {
        }
        return arrayList;
    }

    @Override // com.alibaba.p052a.p061b.p064c.AbstractC0951a
    /* renamed from: b */
    public synchronized void mo20160b() {
        SQLiteDatabase writableDatabase = this.f21360d.getWritableDatabase();
        if (writableDatabase != null) {
            writableDatabase.delete("log", null, null);
            this.f21360d.m20157a(writableDatabase);
        }
    }
}
