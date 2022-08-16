package com.bytedance.android.live.liveinteract.voicechat.ktv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C81020Hwc;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class KtvLinkSeatListView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public HashMap LJI;
    public static final C81020Hwc LJFF = new C81020Hwc((byte) 0);
    public static final int LIZIZ = LK5.LIZ(76.5f);
    public static final int LIZJ = LK5.LIZ(48.0f);
    public static final int LIZLLL = LK5.LIZ(32.0f);

    /* renamed from: LJ */
    public static final int f26490LJ = LK5.LIZ(52.0f);

    public KtvLinkSeatListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public KtvLinkSeatListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        View view = (View) this.LJI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    static {
        Covode.recordClassIndex(31417);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvLinkSeatListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2086);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699828, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(LIZ(2131179918), "");
        Intrinsics.checkNotNullExpressionValue(LIZ(2131179919), "");
        Intrinsics.checkNotNullExpressionValue(LIZ(2131179923), "");
        MethodCollector.m14707o(2086);
    }

    public /* synthetic */ KtvLinkSeatListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
