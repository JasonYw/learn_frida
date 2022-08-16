package com.bytedance.android.live.broadcast.anchorshow;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.broadcast.anchorshow.b */
/* loaded from: classes5.dex */
public final class C2870b {
    public static ChangeQuickRedirect LIZ;
    public final List<C2871a> LIZIZ = new ArrayList();
    public final View LIZJ;
    public final FlowLayout LIZLLL;

    /* renamed from: LJ */
    public Function1<? super Integer, Unit> f25770LJ;

    static {
        Covode.recordClassIndex(14372);
    }

    public final void LIZ() {
        View view;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (view = this.LIZJ) != null) {
            LK1.LIZ(view, !this.LIZIZ.isEmpty());
        }
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            this.LIZIZ.get(i).LIZ(i);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.anchorshow.b$a */
    /* loaded from: classes5.dex */
    public static final class C2871a {
        public static ChangeQuickRedirect LIZ;
        public int LIZIZ;
        public final View LJFF;
        public String LIZJ = "";
        public final Lazy LJI = C77347GeT.LIZ(new AnchorShowFlowController$AnchorShowFlowItem$mTvAnchorShowIndex$2(this));
        public final Lazy LIZLLL = C77347GeT.LIZ(new AnchorShowFlowController$AnchorShowFlowItem$mTvAnchorShowName$2(this));

        /* renamed from: LJ */
        public final Lazy f25771LJ = C77347GeT.LIZ(new C2869xa74f57a3(this));

        static {
            Covode.recordClassIndex(14373);
        }

        private final TextView LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            return (TextView) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
        }

        public C2871a(View view) {
            C106862S5w.LIZ(view);
            this.LJFF = view;
        }

        public final void LIZ(int i) {
            if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
                return;
            }
            this.LIZIZ = i;
            LIZ().setText(String.valueOf(this.LIZIZ + 1));
        }
    }

    public final int LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            try {
                C2871a remove = this.LIZIZ.remove(i);
                FlowLayout flowLayout = this.LIZLLL;
                if (flowLayout != null) {
                    flowLayout.removeView(remove.LJFF);
                }
            } catch (Exception e) {
                ALogger.m15800e("AddAnchorShowDialog", "remove item for index:" + i + " error," + e);
            }
            LIZIZ();
            LIZ();
            return this.LIZIZ.size();
        } catch (Throwable th) {
            LIZIZ();
            LIZ();
            throw th;
        }
    }

    public C2870b(View view, FlowLayout flowLayout, Function1<? super Integer, Unit> function1) {
        this.LIZJ = view;
        this.LIZLLL = flowLayout;
        this.f25770LJ = function1;
        this.LIZIZ.clear();
    }
}
