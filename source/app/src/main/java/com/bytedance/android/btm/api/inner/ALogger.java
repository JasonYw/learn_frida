package com.bytedance.android.btm.api.inner;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class ALogger {
    public static final ALogger INSTANCE = new ALogger();
    public static IALogWriter aLogWriter;
    public static ChangeQuickRedirect changeQuickRedirect;

    public final IALogWriter getALogWriter() {
        return aLogWriter;
    }

    static {
        Covode.recordClassIndex(11302);
    }

    public final void setALogWriter(IALogWriter iALogWriter) {
        aLogWriter = iALogWriter;
    }

    /* renamed from: d */
    public final void m15979d(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15980d("", function0);
    }

    /* renamed from: e */
    public final void m15977e(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15978e("", function0);
    }

    public final String getTag(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str != null && str.length() != 0) {
            return C0002O.m25086C("BtmSDK-", str);
        }
        return "BtmSDK";
    }

    /* renamed from: i */
    public final void m15975i(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15976i("", function0);
    }

    /* renamed from: v */
    public final void m15973v(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15974v("", function0);
    }

    /* renamed from: w */
    public final void m15971w(Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        m15972w("", function0);
    }

    /* renamed from: d */
    public final void m15980d(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        IALogWriter iALogWriter = aLogWriter;
        if (iALogWriter != null) {
            iALogWriter.mo15970d(str, function0);
        }
    }

    /* renamed from: e */
    public final void m15978e(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        IALogWriter iALogWriter = aLogWriter;
        if (iALogWriter != null) {
            iALogWriter.mo15969e(str, function0);
        }
    }

    /* renamed from: i */
    public final void m15976i(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        IALogWriter iALogWriter = aLogWriter;
        if (iALogWriter != null) {
            iALogWriter.mo15968i(str, function0);
        }
    }

    /* renamed from: v */
    public final void m15974v(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        IALogWriter iALogWriter = aLogWriter;
        if (iALogWriter != null) {
            iALogWriter.mo15967v(str, function0);
        }
    }

    /* renamed from: w */
    public final void m15972w(String str, Function0<? extends Object> function0) {
        if (PatchProxy.proxy(new Object[]{str, function0}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function0);
        IALogWriter iALogWriter = aLogWriter;
        if (iALogWriter != null) {
            iALogWriter.mo15966w(str, function0);
        }
    }

    public static /* synthetic */ String getTag$default(ALogger aLogger, String str, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{aLogger, str, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return aLogger.getTag(str);
    }
}
