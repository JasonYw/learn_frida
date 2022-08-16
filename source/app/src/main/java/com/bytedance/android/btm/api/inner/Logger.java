package com.bytedance.android.btm.api.inner;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class Logger {
    public static final Logger INSTANCE = new Logger();
    public static ChangeQuickRedirect changeQuickRedirect;
    public static ILogWriter logWriter;

    public final ILogWriter getLogWriter() {
        return logWriter;
    }

    static {
        Covode.recordClassIndex(11314);
    }

    public final void setLogWriter(ILogWriter iLogWriter) {
        logWriter = iLogWriter;
    }

    /* renamed from: d */
    public final void m15959d(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15960d("btm_debug", function0);
    }

    /* renamed from: e */
    public final void m15957e(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15958e("btm_error", function0);
    }

    /* renamed from: i */
    public final void m15955i(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15956i("btm_info", function0);
    }

    /* renamed from: v */
    public final void m15953v(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15954v("btm_verbose", function0);
    }

    /* renamed from: w */
    public final void m15951w(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15952w("btm_warning", function0);
    }

    public final void api(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        ILogWriter iLogWriter = logWriter;
        if (iLogWriter != null) {
            iLogWriter.api(str, function0);
        }
    }

    /* renamed from: d */
    public final void m15960d(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        ILogWriter iLogWriter = logWriter;
        if (iLogWriter != null) {
            iLogWriter.mo15965d(str, function0);
        }
    }

    /* renamed from: e */
    public final void m15958e(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        ILogWriter iLogWriter = logWriter;
        if (iLogWriter != null) {
            iLogWriter.mo15964e(str, function0);
        }
    }

    /* renamed from: i */
    public final void m15956i(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        ILogWriter iLogWriter = logWriter;
        if (iLogWriter != null) {
            iLogWriter.mo15963i(str, function0);
        }
    }

    /* renamed from: v */
    public final void m15954v(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        ILogWriter iLogWriter = logWriter;
        if (iLogWriter != null) {
            iLogWriter.mo15962v(str, function0);
        }
    }

    /* renamed from: w */
    public final void m15952w(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        ILogWriter iLogWriter = logWriter;
        if (iLogWriter != null) {
            iLogWriter.mo15961w(str, function0);
        }
    }
}
