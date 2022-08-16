package com.amap.api.services.p126a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.ci */
/* loaded from: classes18.dex */
public class C1917ci extends SQLiteOpenHelper {

    /* renamed from: b */
    public static boolean f24596b = true;

    /* renamed from: c */
    public static boolean f24597c;

    /* renamed from: a */
    public AbstractC1913ce f24598a;

    static {
        Covode.recordClassIndex(5528);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f24598a.mo16632a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f24598a.mo16631a(sQLiteDatabase, i, i2);
    }

    public C1917ci(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, AbstractC1913ce abstractC1913ce) {
        super(context, str, cursorFactory, i);
        this.f24598a = abstractC1913ce;
    }
}
