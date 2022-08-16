package com.bytedance.android.live.effect.composer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.effect.composer.g */
/* loaded from: classes5.dex */
public final class C4194g extends SQLiteOpenHelper {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;

    static {
        Covode.recordClassIndex(24482);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0148, code lost:
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bytedance.android.live.effect.composer.C4193d> LIZ() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.composer.C4194g.LIZ():java.util.List");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m14708i(1657);
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1657);
            return;
        }
        LIZ(this, true, null, 2, null);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_node (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,panel TEXT,effect_id TEXT,resource_id TEXT,path TEXT,update_time INTEGER,use INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_tag_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,tag TEXT,value REAL,node_id INTEGER)");
        }
        LIZ(false, "onCreate");
        MethodCollector.m14707o(1657);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4194g(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        C106862S5w.LIZ(context, str);
    }

    public final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (z) {
            this.LIZIZ = System.currentTimeMillis();
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LIZIZ);
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "");
        ALogger.m15801d("LiveUxTracer", C0002O.m25082C("compose sql, duration of ", str, ": ", valueOf, ", thread: ", currentThread.getName()));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m14708i(1660);
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(1660);
        } else if (sQLiteDatabase == null) {
            MethodCollector.m14707o(1660);
        } else {
            sQLiteDatabase.execSQL("Drop Table if exists live_composer_node");
            sQLiteDatabase.execSQL("Drop Table if exists live_composer_tag_node");
            onCreate(sQLiteDatabase);
            MethodCollector.m14707o(1660);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m14708i(1659);
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1659);
        } else if (i < 2 && sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("ALTER TABLE live_composer_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
            MethodCollector.m14707o(1659);
        } else {
            MethodCollector.m14707o(1659);
        }
    }

    public static /* synthetic */ void LIZ(C4194g c4194g, boolean z, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c4194g, (byte) 1, null, 2, null}, null, LIZ, true, 6).isSupported) {
            return;
        }
        c4194g.LIZ(true, "");
    }
}
