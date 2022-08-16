package com.amap.api.services.p126a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.cj */
/* loaded from: classes19.dex */
public class C1918cj implements AbstractC1913ce {
    static {
        Covode.recordClassIndex(5529);
    }

    @Override // com.amap.api.services.p126a.AbstractC1913ce
    /* renamed from: a */
    public String mo16633a() {
        return "logdb.db";
    }

    @Override // com.amap.api.services.p126a.AbstractC1913ce
    /* renamed from: a */
    public void mo16631a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // com.amap.api.services.p126a.AbstractC1913ce
    /* renamed from: b */
    public int mo16630b() {
        return 1;
    }

    @Override // com.amap.api.services.p126a.AbstractC1913ce
    /* renamed from: a */
    public void mo16632a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS a (_id integer primary key autoincrement, a1  varchar(20), a2 varchar(10),a3 varchar(50),a4 varchar(100),a5 varchar(20),a6 integer);");
            sQLiteDatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id integer primary key autoincrement,b1 varchar(40), b2 integer,b3  integer,a1  varchar(20));", "b"));
            sQLiteDatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id integer primary key autoincrement,b1 varchar(40), b2 integer,b3  integer,a1  varchar(20));", "c"));
            sQLiteDatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id integer primary key autoincrement,b1 varchar(40), b2 integer,b3  integer,a1  varchar(20));", "d"));
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS e (_id integer primary key autoincrement,c1 integer,c2 integer,c3 integer);");
        } catch (Throwable th) {
            C1901by.m16742a(th, "DB", "onCreate");
        }
    }
}
