package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.drakeet.multitype.C35036d;

/* loaded from: classes3.dex */
public final class LinkRoomFightSearchFragment$searchResultAdapter$2 extends Lambda implements Function0<C35036d> {
    public static final LinkRoomFightSearchFragment$searchResultAdapter$2 INSTANCE = new LinkRoomFightSearchFragment$searchResultAdapter$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27691);
    }

    public LinkRoomFightSearchFragment$searchResultAdapter$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [me.drakeet.multitype.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C35036d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C35036d();
    }
}
