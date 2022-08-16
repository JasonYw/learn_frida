package com.aweme.account.qqauth;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppContextManager;
import com.tencent.tauth.C32528c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.ZPX;

/* loaded from: classes15.dex */
public final class QQAuth$mTencent$2 extends Lambda implements Function0<C32528c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ZPX this$0;

    static {
        Covode.recordClassIndex(9343);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QQAuth$mTencent$2(ZPX zpx) {
        super(0);
        this.this$0 = zpx;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.tauth.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C32528c mo30099invoke() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this.this$0, ZPX.LIZ, false, 11);
        if (proxy2.isSupported) {
            str = (String) proxy2.result;
        } else if (AppContextManager.INSTANCE.isDouyinLite()) {
            str = "101765381";
        } else {
            str = "1105602870";
        }
        return C32528c.LIZ(str, this.this$0.LIZ().getApplicationContext());
    }
}
