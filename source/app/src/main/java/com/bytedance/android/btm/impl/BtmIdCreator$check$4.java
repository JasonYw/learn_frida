package com.bytedance.android.btm.impl;

import com.bytedance.android.btm.api.model.BtmItem;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BtmIdCreator$check$4 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BtmItem $btmItem;
    public final /* synthetic */ PageInfo $pageInfo;

    static {
        Covode.recordClassIndex(11360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmIdCreator$check$4(BtmItem btmItem, PageInfo pageInfo) {
        super(0);
        this.$btmItem = btmItem;
        this.$pageInfo = pageInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        String btm = this.$btmItem.getBtm();
        PageInfo pageInfo = this.$pageInfo;
        if (pageInfo != null && (str = pageInfo.pageBtm) != null) {
            this.$btmItem.setBtm(str);
        }
        return btm;
    }
}
