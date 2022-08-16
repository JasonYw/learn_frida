package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3177c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.IQV;
import p003X.KJV;

/* loaded from: classes3.dex */
public final class StartLiveFragment$startLiveViewModel$2 extends Lambda implements Function0<C3199v> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17190);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$startLiveViewModel$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcast.preview.base.c, com.bytedance.android.live.broadcast.preview.v] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.live.broadcast.preview.v] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3199v mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.getContext();
        if (context != null) {
            ?? r0 = (AbstractC3177c) PatchProxy.proxy(new Object[]{(FragmentActivity) context, null, 2, null}, null, IQV.LIZ, true, 6).LIZ(C3199v.class);
            r0.LJJLIIIJILLIZJL();
            return r0;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
