package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class LinkRoomFightWidget$initDataContext$pair$1 extends FunctionReferenceImpl implements Function0<C4492d> {
    public static final LinkRoomFightWidget$initDataContext$pair$1 INSTANCE = new LinkRoomFightWidget$initDataContext$pair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27613);
    }

    public LinkRoomFightWidget$initDataContext$pair$1() {
        super(0, C4492d.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.liveinteract.linkroomfight.core.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4492d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4492d();
    }
}
