package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.C4307p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class InteractDialogPKRecordPresenter$mPkBanSecondMap$2 extends Lambda implements Function0<ConcurrentHashMap<Long, C4307p>> {
    public static final InteractDialogPKRecordPresenter$mPkBanSecondMap$2 INSTANCE = new InteractDialogPKRecordPresenter$mPkBanSecondMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25876);
    }

    public InteractDialogPKRecordPresenter$mPkBanSecondMap$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.b.p>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConcurrentHashMap<Long, C4307p> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ConcurrentHashMap<>();
    }
}
