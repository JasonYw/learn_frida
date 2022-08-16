package com.alibaba.sdk.android.httpdns.p071b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.b.d */
/* loaded from: classes19.dex */
public class C1037d extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final Object f21538a = new Object();

    static {
        Covode.recordClassIndex(4443);
    }

    public C1037d(Context context) {
        super(context, "aliclound_httpdns.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private long m19963a(SQLiteDatabase sQLiteDatabase, C1040g c1040g) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(c1040g.f21546i));
        contentValues.put("ip", c1040g.f21548o);
        contentValues.put("ttl", c1040g.f21549p);
        try {
            return sQLiteDatabase.insert("ip", null, contentValues);
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.alibaba.sdk.android.httpdns.p071b.C1040g> m19965a(long r15) {
        /*
            r14 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r6 = r14.getWritableDatabase()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L82
            java.lang.String r7 = "ip"
            r8 = 0
            java.lang.String r9 = "host_id=?"
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r3 = 0
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r10[r3] = r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            if (r1 == 0) goto L6b
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            if (r0 <= 0) goto L6b
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
        L2b:
            com.alibaba.sdk.android.httpdns.b.g r5 = new com.alibaba.sdk.android.httpdns.b.g     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "id"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21547id = r3     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "host_id"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21546i = r3     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "ip"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21548o = r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "ttl"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21549p = r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r2.add(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            if (r0 != 0) goto L2b
        L6b:
            if (r1 == 0) goto L70
            r1.close()
        L70:
            if (r6 == 0) goto L8d
            goto L8a
        L73:
            r0 = move-exception
            goto L77
        L75:
            r0 = move-exception
            r6 = r1
        L77:
            if (r1 == 0) goto L7c
            r1.close()
        L7c:
            if (r6 == 0) goto L81
            r6.close()
        L81:
            throw r0
        L82:
            r6 = r1
        L83:
            if (r1 == 0) goto L88
            r1.close()
        L88:
            if (r6 == 0) goto L8d
        L8a:
            r6.close()
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p071b.C1037d.m19965a(long):java.util.List");
    }

    /* renamed from: a */
    private List<C1040g> m19961a(C1038e c1038e) {
        return m19965a(c1038e.f21543id);
    }

    /* renamed from: a */
    private void m19964a(long j) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete(C1315c.f22208f, "id = ?", new String[]{String.valueOf(j)});
            sQLiteDatabase.close();
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m19960a(C1040g c1040g) {
        m19956b(c1040g.f21547id);
    }

    /* renamed from: b */
    private long m19955b(SQLiteDatabase sQLiteDatabase, C1040g c1040g) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(c1040g.f21546i));
        contentValues.put("ip", c1040g.f21548o);
        contentValues.put("ttl", c1040g.f21549p);
        try {
            return sQLiteDatabase.insert("ipv6", null, contentValues);
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.alibaba.sdk.android.httpdns.p071b.C1040g> m19957b(long r15) {
        /*
            r14 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r6 = r14.getWritableDatabase()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L82
            java.lang.String r7 = "ipv6"
            r8 = 0
            java.lang.String r9 = "host_id=?"
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r3 = 0
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r10[r3] = r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            if (r1 == 0) goto L6b
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            if (r0 <= 0) goto L6b
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
        L2b:
            com.alibaba.sdk.android.httpdns.b.g r5 = new com.alibaba.sdk.android.httpdns.b.g     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "id"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21547id = r3     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "host_id"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21546i = r3     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "ip"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21548o = r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = "ttl"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r5.f21549p = r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            r2.add(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L83
            if (r0 != 0) goto L2b
        L6b:
            if (r1 == 0) goto L70
            r1.close()
        L70:
            if (r6 == 0) goto L8d
            goto L8a
        L73:
            r0 = move-exception
            goto L77
        L75:
            r0 = move-exception
            r6 = r1
        L77:
            if (r1 == 0) goto L7c
            r1.close()
        L7c:
            if (r6 == 0) goto L81
            r6.close()
        L81:
            throw r0
        L82:
            r6 = r1
        L83:
            if (r1 == 0) goto L88
            r1.close()
        L88:
            if (r6 == 0) goto L8d
        L8a:
            r6.close()
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p071b.C1037d.m19957b(long):java.util.List");
    }

    /* renamed from: b */
    private List<C1040g> m19954b(C1038e c1038e) {
        return m19957b(c1038e.f21543id);
    }

    /* renamed from: b */
    private void m19956b(long j) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("ip", "id = ?", new String[]{String.valueOf(j)});
            sQLiteDatabase.close();
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private void m19953b(C1040g c1040g) {
        m19951c(c1040g.f21547id);
    }

    /* renamed from: c */
    private void m19951c(long j) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("ipv6", "id = ?", new String[]{String.valueOf(j)});
            sQLiteDatabase.close();
        } catch (Exception unused) {
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private void m19950c(C1038e c1038e) {
        m19964a(c1038e.f21543id);
    }

    /* renamed from: a */
    public long m19962a(C1038e c1038e) {
        SQLiteDatabase writableDatabase;
        synchronized (f21538a) {
            m19952b(c1038e.f21544m, c1038e.host);
            ContentValues contentValues = new ContentValues();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception unused) {
            } catch (Throwable th) {
                throw th;
            }
            try {
                writableDatabase.beginTransaction();
                contentValues.put(C1315c.f22208f, c1038e.host);
                contentValues.put("sp", c1038e.f21544m);
                contentValues.put("time", C1036c.m19967c(c1038e.f21545n));
                contentValues.put("extra", c1038e.f21539a);
                contentValues.put("cache_key", c1038e.f21541b);
                long insert = writableDatabase.insert(C1315c.f22208f, null, contentValues);
                c1038e.f21543id = insert;
                if (c1038e.f21540a != null) {
                    Iterator<C1040g> it = c1038e.f21540a.iterator();
                    while (it.hasNext()) {
                        C1040g next = it.next();
                        next.f21546i = insert;
                        next.f21547id = m19963a(writableDatabase, next);
                    }
                }
                if (c1038e.f21542b != null) {
                    Iterator<C1040g> it2 = c1038e.f21542b.iterator();
                    while (it2.hasNext()) {
                        C1040g next2 = it2.next();
                        next2.f21546i = insert;
                        next2.f21547id = m19955b(writableDatabase, next2);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
                return insert;
            } catch (Exception unused2) {
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                return 0L;
            } catch (Throwable th2) {
                if (writableDatabase == null) {
                    throw th2;
                }
                writableDatabase.endTransaction();
                writableDatabase.close();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0099, code lost:
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r6 == null) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.sdk.android.httpdns.p071b.C1038e m19959a(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            java.lang.Object r5 = com.alibaba.sdk.android.httpdns.p071b.C1037d.f21538a
            monitor-enter(r5)
            r3 = 0
            android.database.sqlite.SQLiteDatabase r6 = r14.getReadableDatabase()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Laf
            java.lang.String r7 = "host"
            r8 = 0
            java.lang.String r9 = "sp=? AND host=?"
            r0 = 2
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La5
            r0 = 0
            r10[r0] = r15     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La5
            r0 = 1
            r10[r0] = r16     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La5
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La5
            if (r1 == 0) goto L98
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            if (r0 <= 0) goto L98
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            com.alibaba.sdk.android.httpdns.b.e r2 = new com.alibaba.sdk.android.httpdns.b.e     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            r2.<init>()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            java.lang.String r0 = "id"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            int r0 = r1.getInt(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            long r3 = (long) r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.f21543id = r3     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = "host"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.host = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = "sp"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.f21544m = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = "time"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = com.alibaba.sdk.android.httpdns.p071b.C1036c.m19966d(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.f21545n = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.util.List r0 = r14.m19961a(r2)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.f21540a = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.util.List r0 = r14.m19954b(r2)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.f21542b = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = "extra"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.f21539a = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = "cache_key"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            r2.f21541b = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L8e
            goto L9b
        L8b:
            if (r1 == 0) goto La6
            goto L94
        L8e:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lb6
            goto La2
        L93:
            r2 = r3
        L94:
            r1.close()     // Catch: java.lang.Throwable -> Lb6
            goto La6
        L98:
            r2 = r3
            if (r1 == 0) goto L9e
        L9b:
            r1.close()     // Catch: java.lang.Throwable -> Lb6
        L9e:
            if (r6 == 0) goto Lb4
            goto Lb1
        La1:
            r0 = move-exception
        La2:
            if (r6 == 0) goto Lae
            goto Lab
        La5:
            r2 = r3
        La6:
            if (r6 == 0) goto Lb4
            goto Lb1
        La9:
            r0 = move-exception
            goto Lae
        Lab:
            r6.close()     // Catch: java.lang.Throwable -> Lb6
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Lb6
        Laf:
            r2 = r3
            goto Lb4
        Lb1:
            r6.close()     // Catch: java.lang.Throwable -> Lb6
        Lb4:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb6
            return r2
        Lb6:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p071b.C1037d.m19959a(java.lang.String, java.lang.String):com.alibaba.sdk.android.httpdns.b.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        if (r7 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091 A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:18:0x0091, B:21:0x00ae, B:22:0x00b1, B:31:0x009d, B:33:0x00a2, B:34:0x00a5, B:27:0x00a9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.alibaba.sdk.android.httpdns.p071b.C1038e> m19958b() {
        /*
            r15 = this;
            java.lang.Object r6 = com.alibaba.sdk.android.httpdns.p071b.C1037d.f21538a
            monitor-enter(r6)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb3
            r2.<init>()     // Catch: java.lang.Throwable -> Lb3
            r1 = 0
            android.database.sqlite.SQLiteDatabase r7 = r15.getReadableDatabase()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La6
            java.lang.String r8 = "host"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            android.database.Cursor r1 = r7.query(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            if (r1 == 0) goto L8f
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            if (r0 <= 0) goto L8f
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
        L24:
            com.alibaba.sdk.android.httpdns.b.e r3 = new com.alibaba.sdk.android.httpdns.b.e     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = "id"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.f21543id = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = "host"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.host = r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = "sp"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.f21544m = r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = "time"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = com.alibaba.sdk.android.httpdns.p071b.C1036c.m19966d(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.f21545n = r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.util.List r0 = r15.m19961a(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.f21540a = r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.util.List r0 = r15.m19954b(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.f21542b = r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = "extra"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.f21539a = r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = "cache_key"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r3.f21541b = r0     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            r2.add(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La7
            if (r0 != 0) goto L24
        L8f:
            if (r1 == 0) goto L94
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        L94:
            if (r7 == 0) goto Lb1
            goto Lae
        L97:
            r0 = move-exception
            goto L9b
        L99:
            r0 = move-exception
            r7 = r1
        L9b:
            if (r1 == 0) goto La0
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        La0:
            if (r7 == 0) goto La5
            r7.close()     // Catch: java.lang.Throwable -> Lb3
        La5:
            throw r0     // Catch: java.lang.Throwable -> Lb3
        La6:
            r7 = r1
        La7:
            if (r1 == 0) goto Lac
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        Lac:
            if (r7 == 0) goto Lb1
        Lae:
            r7.close()     // Catch: java.lang.Throwable -> Lb3
        Lb1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb3
            return r2
        Lb3:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.p071b.C1037d.m19958b():java.util.List");
    }

    /* renamed from: b */
    public void m19952b(String str, String str2) {
        synchronized (f21538a) {
            C1038e m19959a = m19959a(str, str2);
            if (m19959a != null) {
                m19950c(m19959a);
                if (m19959a.f21540a != null) {
                    Iterator<C1040g> it = m19959a.f21540a.iterator();
                    while (it.hasNext()) {
                        m19960a(it.next());
                    }
                }
                if (m19959a.f21542b != null) {
                    Iterator<C1040g> it2 = m19959a.f21542b.iterator();
                    while (it2.hasNext()) {
                        m19953b(it2.next());
                    }
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE host (id INTEGER PRIMARY KEY,host TEXT,sp TEXT,time TEXT,extra TEXT,cache_key TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ip (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ipv6 (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS host;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ip;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ipv6;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                onCreate(sQLiteDatabase);
            } catch (Exception unused) {
            }
        }
    }
}
