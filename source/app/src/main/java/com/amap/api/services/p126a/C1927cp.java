package com.amap.api.services.p126a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.cp */
/* loaded from: classes19.dex */
public class C1927cp implements AbstractC1913ce {

    /* renamed from: a */
    public static C1927cp f24629a;

    static {
        Covode.recordClassIndex(5538);
    }

    @Override // com.amap.api.services.p126a.AbstractC1913ce
    /* renamed from: a */
    public String mo16633a() {
        return "dafile.db";
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

    /* renamed from: c */
    public static synchronized C1927cp m16629c() {
        C1927cp c1927cp;
        synchronized (C1927cp.class) {
            if (f24629a == null) {
                f24629a = new C1927cp();
            }
            c1927cp = f24629a;
        }
        return c1927cp;
    }

    @Override // com.amap.api.services.p126a.AbstractC1913ce
    /* renamed from: a */
    public void mo16632a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS file (_id integer primary key autoincrement, sname  varchar(20), fname varchar(100),md varchar(20),version varchar(20),dversion varchar(20),status varchar(20),reservedfield varchar(20));");
        } catch (Throwable th) {
            C1935ct.m16581a(th, "DynamicFileDBCreator", "onCreate");
        }
    }
}
