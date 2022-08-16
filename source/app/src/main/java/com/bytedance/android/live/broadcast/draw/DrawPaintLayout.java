package com.bytedance.android.live.broadcast.draw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.C3159e;
import com.bytedance.android.livesdk.chatroom.p518ui.SSLinearLayoutManager;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C87080KTa;

/* loaded from: classes5.dex */
public final class DrawPaintLayout extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public C87080KTa LIZIZ;
    public List<C3159e> LIZJ;
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(15605);
    }

    public DrawPaintLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DrawPaintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        View view = (View) this.LIZLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (z) {
            ((ImageView) LIZ(2131172963)).setBackgroundResource(2130854318);
            UIUtils.setViewVisibility(LIZ(2131172960), 4);
            ImageView imageView = (ImageView) LIZ(2131172963);
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setTag(Boolean.TRUE);
            return;
        }
        ((ImageView) LIZ(2131172963)).setBackgroundResource(2130854315);
        UIUtils.setViewVisibility(LIZ(2131172960), 0);
        ImageView imageView2 = (ImageView) LIZ(2131172963);
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setTag(Boolean.FALSE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawPaintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1242);
        this.LIZJ = new ArrayList();
        View.inflate(context, 2131698406, this);
        SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager(getContext(), 0, false);
        RecyclerView recyclerView = (RecyclerView) LIZ(2131172960);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setLayoutManager(sSLinearLayoutManager);
        this.LIZIZ = new C87080KTa();
        RecyclerView recyclerView2 = (RecyclerView) LIZ(2131172960);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setAdapter(this.LIZIZ);
        C3159e c3159e = new C3159e();
        c3159e.LIZ = 2130857004;
        c3159e.LIZIZ = 4279638051L;
        C3159e c3159e2 = new C3159e();
        c3159e2.LIZ = 2130857009;
        c3159e2.LIZIZ = 4294847573L;
        C3159e c3159e3 = new C3159e();
        c3159e3.LIZ = 2130857010;
        c3159e3.LIZIZ = 4294950958L;
        C3159e c3159e4 = new C3159e();
        c3159e4.LIZ = 2130857007;
        c3159e4.LIZIZ = 4281125521L;
        C3159e c3159e5 = new C3159e();
        c3159e5.LIZ = 2130857005;
        c3159e5.LIZIZ = 4278224618L;
        C3159e c3159e6 = new C3159e();
        c3159e6.LIZ = 2130857008;
        c3159e6.LIZIZ = 4288105708L;
        C3159e c3159e7 = new C3159e();
        c3159e7.LIZ = 2130857006;
        c3159e7.LIZIZ = 4294967295L;
        c3159e7.LIZJ = 4;
        this.LIZJ.add(c3159e);
        this.LIZJ.add(c3159e2);
        this.LIZJ.add(c3159e3);
        this.LIZJ.add(c3159e4);
        this.LIZJ.add(c3159e5);
        this.LIZJ.add(c3159e6);
        this.LIZJ.add(c3159e7);
        MethodCollector.m14707o(1242);
    }

    public /* synthetic */ DrawPaintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
