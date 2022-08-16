package com.bytedance.android.live.broadcast.view;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.L4B;
import p003X.L4C;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class b$a {
    public static ChangeQuickRedirect LIZ;
    public final Context LIZIZ;
    public final L4B LIZJ = new L4B(null, new ArrayList(), null, 0, 0.0f, 0, 0, false, 248);

    static {
        Covode.recordClassIndex(18093);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        C116971W2r.LIZJ(new L4C(this.LIZIZ, this.LIZJ));
    }

    public final b$a LIZ(int i) {
        this.LIZJ.LIZLLL = i;
        return this;
    }

    public final b$a LIZ(boolean z) {
        this.LIZJ.LJII = z;
        return this;
    }

    public b$a(Context context) {
        C106862S5w.LIZ(context);
        this.LIZIZ = context;
    }

    public final b$a LIZ(Function2<? super Dialog, ? super View, Unit> function2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{function2}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (b$a) proxy.result;
        }
        C106862S5w.LIZ(function2);
        this.LIZJ.LIZJ = new b$b(new SpannableString(LK5.LIZ(2131582393)), function2);
        return this;
    }

    private b$a LIZ(CharSequence charSequence, Function2<? super Dialog, ? super View, Unit> function2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{charSequence, function2}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (b$a) proxy.result;
        }
        C106862S5w.LIZ(charSequence, function2);
        this.LIZJ.LIZIZ.add(new b$b(charSequence, function2));
        return this;
    }

    public final b$a LIZ(int i, Function2<? super Dialog, ? super View, Unit> function2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{2131583531, function2}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (b$a) proxy.result;
        }
        C106862S5w.LIZ(function2);
        String LIZ2 = LK5.LIZ(2131583531);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return LIZ(LIZ2, function2);
    }
}
