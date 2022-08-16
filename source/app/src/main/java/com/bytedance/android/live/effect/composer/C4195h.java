package com.bytedance.android.live.effect.composer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.RunnableC88526KuO;

/* renamed from: com.bytedance.android.live.effect.composer.h */
/* loaded from: classes5.dex */
public final class C4195h extends SQLiteOpenHelper {
    public static ChangeQuickRedirect LIZ;
    public List<C4196a> LIZIZ = new ArrayList();
    public final Handler LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final Runnable f26223LJ;
    public long LJFF;

    static {
        Covode.recordClassIndex(24483);
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && !this.LIZLLL) {
            this.LIZJ.postDelayed(this.f26223LJ, 2000L);
            this.LIZLLL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133 A[Catch: all -> 0x013a, SQLiteException -> 0x013c, TRY_ENTER, TryCatch #12 {SQLiteException -> 0x013c, all -> 0x013a, blocks: (B:42:0x0125, B:65:0x0133, B:66:0x0136, B:67:0x0139), top: B:41:0x0125 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList<com.bytedance.android.live.effect.composer.C4193d> LIZIZ() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.composer.C4195h.LIZIZ():java.util.ArrayList");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m14708i(1662);
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1662);
            return;
        }
        LIZ(this, true, null, 2, null);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_node (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,panel TEXT,effect_id TEXT,resource_id TEXT,path TEXT,update_time INTEGER,use INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_tag_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,tag TEXT,value REAL,node_id INTEGER)");
        }
        LIZ(false, "onCreate");
        MethodCollector.m14707o(1662);
    }

    public final void LIZIZ(C4193d c4193d) {
        C4196a c4196a;
        if (PatchProxy.proxy(new Object[]{c4193d}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4193d);
        LIZ();
        List<C4196a> list = this.LIZIZ;
        ListIterator<C4196a> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c4196a = listIterator.previous();
                C4196a c4196a2 = c4196a;
                if (Intrinsics.areEqual(c4196a2.LIZIZ.LIZJ, c4193d.LIZJ) && c4196a2.LIZJ == 10003) {
                    break;
                }
            } else {
                c4196a = null;
                break;
            }
        }
        if (c4196a != null) {
            this.LIZIZ.remove(c4196a);
        }
        this.LIZIZ.add(new C4196a(c4193d, 10003));
    }

    public final void LIZ(C4193d c4193d) {
        C4196a c4196a;
        C4196a c4196a2;
        if (PatchProxy.proxy(new Object[]{c4193d}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4193d);
        LIZ();
        List<C4196a> list = this.LIZIZ;
        ListIterator<C4196a> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c4196a = listIterator.previous();
                C4196a c4196a3 = c4196a;
                if (Intrinsics.areEqual(c4196a3.LIZIZ.LIZJ, c4193d.LIZJ) && c4196a3.LIZJ == 10001) {
                    break;
                }
            } else {
                c4196a = null;
                break;
            }
        }
        if (c4196a == null) {
            this.LIZIZ.add(new C4196a(c4193d, 10002));
        } else {
            this.LIZIZ.remove(c4196a);
        }
        List<C4196a> list2 = this.LIZIZ;
        ListIterator<C4196a> listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (listIterator2.hasPrevious()) {
                c4196a2 = listIterator2.previous();
                C4196a c4196a4 = c4196a2;
                if (Intrinsics.areEqual(c4196a4.LIZIZ.LIZJ, c4193d.LIZJ) && c4196a4.LIZJ == 10003) {
                    break;
                }
            } else {
                c4196a2 = null;
                break;
            }
        }
        if (c4196a2 != null) {
            this.LIZIZ.remove(c4196a2);
        }
    }

    /* renamed from: com.bytedance.android.live.effect.composer.h$a */
    /* loaded from: classes5.dex */
    public static final class C4196a {
        public static ChangeQuickRedirect LIZ;
        public final C4193d LIZIZ;
        public final int LIZJ;

        static {
            Covode.recordClassIndex(24484);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Integer.valueOf(this.LIZJ)};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4196a) {
                return C106862S5w.LIZ(((C4196a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LiveComposerSQLiteHelperB$ChangInfo:%s,%s", LIZ());
        }

        public C4196a(C4193d c4193d, int i) {
            C106862S5w.LIZ(c4193d);
            this.LIZIZ = c4193d;
            this.LIZJ = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4195h(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        Handler handler;
        C106862S5w.LIZ(context, str);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            handler = (Handler) proxy.result;
        } else {
            HandlerThread handlerThread = new HandlerThread("ComposerSQLiteHelperThread");
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        this.LIZJ = handler;
        this.f26223LJ = new RunnableC88526KuO(this);
    }

    public final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 18).isSupported) {
            return;
        }
        if (z) {
            this.LJFF = System.currentTimeMillis();
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LJFF);
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "");
        ALogger.m15801d("LiveUxTracer", C0002O.m25082C("compose sql, duration of ", str, ": ", valueOf, ", thread: ", currentThread.getName()));
    }

    public final void LIZIZ(C4193d c4193d, SQLiteDatabase sQLiteDatabase) {
        int i;
        MethodCollector.m14708i(1664);
        if (PatchProxy.proxy(new Object[]{c4193d, sQLiteDatabase}, this, LIZ, false, 10).isSupported) {
            MethodCollector.m14707o(1664);
            return;
        }
        LIZ(this, true, null, 2, null);
        try {
            Cursor query = sQLiteDatabase.query("live_composer_node", new String[]{C33968a.f42937f}, "effect_id = ?", new String[]{c4193d.LIZJ}, null, null, null);
            if (query.moveToFirst()) {
                i = query.getInt(query.getColumnIndex(C33968a.f42937f));
            } else {
                i = -1;
            }
            query.close();
            sQLiteDatabase.delete("live_composer_node", "effect_id = ?", new String[]{c4193d.LIZJ});
            if (i != -1) {
                sQLiteDatabase.delete("live_composer_tag_node", "node_id = ?", new String[]{String.valueOf(i)});
            }
        } catch (SQLiteException e) {
            ALogger.m15798e("LiveComposerSQLiteHelper", e);
        }
        LIZ(false, "deleteComposerNode");
        MethodCollector.m14707o(1664);
    }

    public final void LIZJ(C4193d c4193d, SQLiteDatabase sQLiteDatabase) {
        int i;
        MethodCollector.m14708i(1665);
        if (PatchProxy.proxy(new Object[]{c4193d, sQLiteDatabase}, this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(1665);
            return;
        }
        LIZ(this, true, null, 2, null);
        try {
            Cursor query = sQLiteDatabase.query("live_composer_node", new String[]{C33968a.f42937f}, "effect_id = ?", new String[]{c4193d.LIZJ}, null, null, null);
            if (query.moveToFirst()) {
                i = query.getInt(query.getColumnIndex(C33968a.f42937f));
            } else {
                i = -1;
            }
            query.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_time", Long.valueOf(c4193d.LJI));
            sQLiteDatabase.update("live_composer_node", contentValues, "effect_id = ?", new String[]{c4193d.LIZJ});
            if (i != -1) {
                for (C4197i c4197i : new ArrayList(c4193d.LJIIIIZZ)) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("value", c4197i.LIZIZ);
                    sQLiteDatabase.update("live_composer_tag_node", contentValues2, "node_id = ? and tag = ?", new String[]{String.valueOf(i), c4197i.LIZJ});
                }
            }
        } catch (SQLiteException e) {
            ALogger.m15798e("LiveComposerSQLiteHelper", e);
        }
        LIZ(false, "updateComposerNode");
        MethodCollector.m14707o(1665);
    }

    public final void LIZ(C4193d c4193d, SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m14708i(1663);
        int i = 1;
        if (PatchProxy.proxy(new Object[]{c4193d, sQLiteDatabase}, this, LIZ, false, 9).isSupported) {
            MethodCollector.m14707o(1663);
            return;
        }
        LIZ(this, true, null, 2, null);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("panel", c4193d.LIZIZ);
            contentValues.put("effect_id", c4193d.LIZJ);
            contentValues.put("resource_id", c4193d.LIZLLL);
            contentValues.put("path", c4193d.f26222LJ);
            contentValues.put("update_time", Long.valueOf(c4193d.LJI));
            if (!c4193d.LJIIIZ) {
                i = 0;
            }
            contentValues.put("use", Integer.valueOf(i));
            long insert = sQLiteDatabase.insert("live_composer_node", null, contentValues);
            for (C4197i c4197i : c4193d.LJIIIIZZ) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("tag", c4197i.LIZJ);
                contentValues2.put("value", c4197i.LIZIZ);
                contentValues2.put("node_id", Long.valueOf(insert));
                sQLiteDatabase.insert("live_composer_tag_node", null, contentValues2);
            }
        } catch (SQLiteException e) {
            ALogger.m15798e("LiveComposerSQLiteHelper", e);
        }
        LIZ(false, "saveComposerNode");
        MethodCollector.m14707o(1663);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m14708i(1668);
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 20).isSupported) {
            MethodCollector.m14707o(1668);
        } else if (sQLiteDatabase == null) {
            MethodCollector.m14707o(1668);
        } else {
            sQLiteDatabase.execSQL("Drop Table if exists live_composer_node");
            sQLiteDatabase.execSQL("Drop Table if exists live_composer_tag_node");
            onCreate(sQLiteDatabase);
            MethodCollector.m14707o(1668);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m14708i(1667);
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 17).isSupported) {
            MethodCollector.m14707o(1667);
        } else if (i < 2 && sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("ALTER TABLE live_composer_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
            MethodCollector.m14707o(1667);
        } else {
            MethodCollector.m14707o(1667);
        }
    }

    public static /* synthetic */ void LIZ(C4195h c4195h, boolean z, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c4195h, (byte) 1, null, 2, null}, null, LIZ, true, 19).isSupported) {
            return;
        }
        c4195h.LIZ(true, "");
    }
}
