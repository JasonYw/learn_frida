package com.bytedance.android.btm.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class HybridContainerContextManager$hybridContainerContextList$2 extends Lambda implements Function0<List<IHybridContainerContext>> {
    public static final HybridContainerContextManager$hybridContainerContextList$2 INSTANCE = new HybridContainerContextManager$hybridContainerContextList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11340);
    }

    public HybridContainerContextManager$hybridContainerContextList$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: collision with other method in class */
    public final List<IHybridContainerContext> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        IHybridContainerContext bulletContext = HybridContainerContextManager.INSTANCE.getBulletContext();
        if (bulletContext != null) {
            arrayList.add(bulletContext);
        }
        IHybridContainerContext liveContext = HybridContainerContextManager.INSTANCE.getLiveContext();
        if (liveContext != null) {
            arrayList.add(liveContext);
        }
        arrayList.add(new TTWebViewContainerContext());
        IHybridContainerContext hybridContainerContext = BtmBridgeProvider.INSTANCE.getHybridContainerContext();
        if (hybridContainerContext != null) {
            arrayList.add(hybridContainerContext);
        }
        return arrayList;
    }
}
