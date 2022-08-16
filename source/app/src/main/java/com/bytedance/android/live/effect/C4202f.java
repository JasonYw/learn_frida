package com.bytedance.android.live.effect;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.common.utility.concurrent.TTExecutors;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.RunnableC88527KuP;

/* renamed from: com.bytedance.android.live.effect.f */
/* loaded from: classes5.dex */
public final class C4202f extends SQLiteOpenHelper {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;

    static {
        Covode.recordClassIndex(24514);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4202f(Context context) {
        super(context, "live_effect.db", (SQLiteDatabase.CursorFactory) null, 1);
        C106862S5w.LIZ(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m14708i(1673);
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1673);
            return;
        }
        LIZ(this, true, null, 2, null);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_effect_count (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ,effect_id TEXT,count INTEGER)");
        }
        LIZ(false, "onCreate");
        MethodCollector.m14707o(1673);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        TTExecutors.getNormalExecutor().submit(new RunnableC88527KuP(this, str));
    }

    public final int LIZIZ(String str) {
        int i;
        MethodCollector.m14708i(1674);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(1674);
            return intValue;
        }
        Cursor cursor = null;
        LIZ(this, true, null, 2, null);
        SQLiteDatabase readableDatabase = getReadableDatabase();
        try {
            cursor = readableDatabase.query("live_effect_count", null, "effect_id=?", new String[]{str}, null, null, null);
            if (cursor.moveToFirst()) {
                i = cursor.getInt(cursor.getColumnIndex("count"));
            } else {
                i = 0;
            }
            cursor.close();
        } catch (Throwable th) {
            try {
                ALogger.m15798e("LiveEffectSQLHelper", th);
                if (cursor != null) {
                    cursor.close();
                }
                i = 0;
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                MethodCollector.m14707o(1674);
                throw th2;
            }
        }
        readableDatabase.close();
        LIZ(false, "findEffectUseCount");
        MethodCollector.m14707o(1674);
        return i;
    }

    public final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (z) {
            this.LIZIZ = System.currentTimeMillis();
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LIZIZ);
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "");
        ALogger.m15801d("LiveUxTracer", C0002O.m25082C("effect sql, duration of ", str, ": ", valueOf, ", thread: ", currentThread.getName()));
    }

    public static /* synthetic */ void LIZ(C4202f c4202f, boolean z, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c4202f, (byte) 1, null, 2, null}, null, LIZ, true, 7).isSupported) {
            return;
        }
        c4202f.LIZ(true, "");
    }
}
