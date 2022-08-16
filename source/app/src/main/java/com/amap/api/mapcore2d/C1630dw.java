package com.amap.api.mapcore2d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.dw */
/* loaded from: classes18.dex */
public class C1630dw extends SQLiteOpenHelper {

    /* renamed from: b */
    public static boolean f23403b = true;

    /* renamed from: c */
    public static boolean f23404c;

    /* renamed from: a */
    public AbstractC1626ds f23405a;

    static {
        Covode.recordClassIndex(5178);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f23405a.mo17745a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f23405a.mo17744a(sQLiteDatabase, i, i2);
    }

    public C1630dw(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, AbstractC1626ds abstractC1626ds) {
        super(context, str, cursorFactory, i);
        this.f23405a = abstractC1626ds;
    }
}
