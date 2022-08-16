package com.bytedance.als.p196ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC104331R6n;
import p003X.C102066QHk;
import p003X.QJB;

/* renamed from: com.bytedance.als.ui.UIStateComponent$sceneStatesContainer$2 */
/* loaded from: classes8.dex */
public final class UIStateComponent$sceneStatesContainer$2 extends Lambda implements Function0<C102066QHk<STATE>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC104331R6n this$0;

    static {
        Covode.recordClassIndex(10080);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIStateComponent$sceneStatesContainer$2(AbstractC104331R6n abstractC104331R6n) {
        super(0);
        this.this$0 = abstractC104331R6n;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object mo30099invoke = this.this$0.LJIILIIL().mo30099invoke();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{mo30099invoke}, null, QJB.LIZ, true, 2);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return new C102066QHk(mo30099invoke);
    }
}
