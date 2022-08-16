package com.bytedance.android.debug;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdk.gift.platform.business.effect.assets.AbstractC7398m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C440083b0;
import p003X.C90719Lof;
import p003X.C90805Lq3;
import p003X.C90809Lq7;
import p003X.C90908Lri;
import p003X.C90909Lrj;
import p003X.C90910Lrk;
import p003X.C90911Lrl;
import p003X.View$OnClickListenerC90907Lrh;
import p003X.View$OnClickListenerC90916Lrq;

/* loaded from: classes5.dex */
public final class DebugGiftPreviewDebugWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public RadioGroup LIZIZ;
    public EditText LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f25640LJ;
    public RecyclerView LJFF;
    public C90911Lrl LJI;
    public LinearLayoutManager LJII;
    public FrameLayout LJIIIIZZ;
    public C90809Lq7 LJIIIZ;
    public Context LJIIJ;
    public final AbstractC7398m.AbstractC7399a LJIIJJI = new C90908Lri(this);

    static {
        Covode.recordClassIndex(11590);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699353;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    public final C440083b0 LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C440083b0) proxy.result;
        }
        return new C90805Lq3(this);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        AbstractC7398m LIZ2 = C90719Lof.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(3);
        }
        AbstractC7398m LIZ3 = C90719Lof.LIZ();
        if (LIZ3 != null) {
            LIZ3.LIZ(this.LJIIJJI);
        }
        this.LJIIIZ = new C90809Lq7();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LJIIJ = context;
        this.LIZIZ = (RadioGroup) findViewById(2131187063);
        this.LJIIIIZZ = (FrameLayout) findViewById(2131172095);
        findViewById(2131176528);
        findViewById(2131176529);
        findViewById(2131176530);
        this.LIZJ = (EditText) findViewById(2131167051);
        this.LIZLLL = (TextView) findViewById(2131176087);
        this.f25640LJ = (TextView) findViewById(2131172093);
        this.LJFF = (RecyclerView) findViewById(2131167055);
        this.LJI = new C90911Lrl();
        this.LJII = new LinearLayoutManager(getContext());
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.LJII);
        }
        RecyclerView recyclerView2 = this.LJFF;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJI);
        }
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), 1);
        Context context2 = this.LJIIJ;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        dividerItemDecoration.setDrawable(new ColorDrawable(C116971W2r.LIZ(context2, 2131626090)));
        RecyclerView recyclerView3 = this.LJFF;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(dividerItemDecoration);
        }
        TextView textView = this.f25640LJ;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC90916Lrq(this));
        }
        EditText editText = this.LIZJ;
        if (editText != null && !PatchProxy.proxy(new Object[]{editText, "请输入资源id", 10}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(editText);
            SpannableString spannableString = new SpannableString("请输入资源id");
            C116971W2r.LIZ(spannableString, new AbsoluteSizeSpan(10, true), 0, spannableString.length(), 33);
            editText.setHint(new SpannableString(spannableString));
        }
        TextView textView2 = this.LIZLLL;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC90907Lrh(this));
        }
        C90911Lrl c90911Lrl = this.LJI;
        if (c90911Lrl != null) {
            C90909Lrj c90909Lrj = new C90909Lrj(this);
            if (!PatchProxy.proxy(new Object[]{c90909Lrj}, c90911Lrl, C90911Lrl.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(c90909Lrj);
                c90911Lrl.LIZLLL = c90909Lrj;
            }
        }
        EditText editText2 = this.LIZJ;
        if (editText2 != null) {
            editText2.addTextChangedListener(new C90910Lrk(this));
        }
    }
}
