package com.bytedance.android.btm.impl;

import com.bytedance.android.btm.api.model.BtmItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;

/* loaded from: classes18.dex */
public final class BtmIdCreator$check$5 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BtmItem $btmItem;

    static {
        Covode.recordClassIndex(11361);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmIdCreator$check$5(BtmItem btmItem) {
        super(0);
        this.$btmItem = btmItem;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C0002O.m25086C("createBtm check: btm id ", this.$btmItem.getBtm());
    }
}
