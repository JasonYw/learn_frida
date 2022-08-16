package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget$floatContextRef$2 extends Lambda implements Function0<Pair<? extends BroadcastFloatContext, ? extends Disposable>> {
    public static final BroadcastFloatWindowWidget$floatContextRef$2 INSTANCE = new BroadcastFloatWindowWidget$floatContextRef$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15864);
    }

    public BroadcastFloatWindowWidget$floatContextRef$2() {
        super(0);
    }

    /* renamed from: com.bytedance.android.live.broadcast.floatview.BroadcastFloatWindowWidget$floatContextRef$2$1 */
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class C30121 extends FunctionReferenceImpl implements Function0<BroadcastFloatContext> {
        public static final C30121 INSTANCE = new C30121();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(15865);
        }

        public C30121() {
            super(0, BroadcastFloatContext.class, "<init>", "<init>()V", 0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ BroadcastFloatContext mo30099invoke() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new BroadcastFloatContext();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Pair<? extends com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext, ? extends io.reactivex.disposables.Disposable>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Pair<? extends BroadcastFloatContext, ? extends Disposable> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return IQV.LIZ((Function0) C30121.INSTANCE);
    }
}
