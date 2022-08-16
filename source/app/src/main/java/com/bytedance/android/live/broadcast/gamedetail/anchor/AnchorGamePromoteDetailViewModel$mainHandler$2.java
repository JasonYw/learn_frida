package com.bytedance.android.live.broadcast.gamedetail.anchor;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AnchorGamePromoteDetailViewModel$mainHandler$2 extends Lambda implements Function0<Handler> {
    public static final AnchorGamePromoteDetailViewModel$mainHandler$2 INSTANCE = new AnchorGamePromoteDetailViewModel$mainHandler$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16034);
    }

    public AnchorGamePromoteDetailViewModel$mainHandler$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Handler mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new Handler(Looper.getMainLooper());
    }
}
