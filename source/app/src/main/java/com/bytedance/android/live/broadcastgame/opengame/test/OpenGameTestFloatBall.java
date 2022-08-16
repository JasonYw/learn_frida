package com.bytedance.android.live.broadcastgame.opengame.test;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcastgame.api.openplatform.C3399e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C87010KQi;
import p003X.C88109Knf;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class OpenGameTestFloatBall extends FrameLayout {
    public static final C88109Knf Companion = new C88109Knf((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;

    static {
        Covode.recordClassIndex(21125);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onFloatBallClick() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C87010KQi.LIZ().LIZ(new C3399e(null, 1));
    }

    public final void release() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        setGone();
    }

    public final void setGone() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        LK1.LIZ((View) this);
    }

    public final void setVisible() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        LK1.LIZJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGameTestFloatBall(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1472);
        LK1.LIZ((View) this);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcastgame.opengame.test.OpenGameTestFloatBall.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21126);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                OpenGameTestFloatBall.this.onFloatBallClick();
            }
        });
        MethodCollector.m14707o(1472);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGameTestFloatBall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1473);
        LK1.LIZ((View) this);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcastgame.opengame.test.OpenGameTestFloatBall.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21126);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                OpenGameTestFloatBall.this.onFloatBallClick();
            }
        });
        MethodCollector.m14707o(1473);
    }

    private final int dp2px(Context context, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return (int) ((i * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGameTestFloatBall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1474);
        LK1.LIZ((View) this);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcastgame.opengame.test.OpenGameTestFloatBall.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21126);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                OpenGameTestFloatBall.this.onFloatBallClick();
            }
        });
        MethodCollector.m14707o(1474);
    }
}
