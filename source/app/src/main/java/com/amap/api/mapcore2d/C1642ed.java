package com.amap.api.mapcore2d;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ed */
/* loaded from: classes19.dex */
public class C1642ed implements AbstractC1626ds {

    /* renamed from: a */
    public static C1642ed f23444a;

    static {
        Covode.recordClassIndex(5190);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1626ds
    /* renamed from: a */
    public String mo17746a() {
        return "dafile.db";
    }

    @Override // com.amap.api.mapcore2d.AbstractC1626ds
    /* renamed from: a */
    public void mo17744a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // com.amap.api.mapcore2d.AbstractC1626ds
    /* renamed from: b */
    public int mo17743b() {
        return 1;
    }

    /* renamed from: c */
    public static synchronized C1642ed m17742c() {
        C1642ed c1642ed;
        synchronized (C1642ed.class) {
            if (f23444a == null) {
                f23444a = new C1642ed();
            }
            c1642ed = f23444a;
        }
        return c1642ed;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1626ds
    /* renamed from: a */
    public void mo17745a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS file (_id integer primary key autoincrement, sname  varchar(20), fname varchar(100),md varchar(20),version varchar(20),dversion varchar(20),status varchar(20),reservedfield varchar(20));");
        } catch (Throwable th) {
            C1650eh.m17694a(th, "DynamicFileDBCreator", "onCreate");
        }
    }
}
