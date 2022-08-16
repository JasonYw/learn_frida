package com.bytedance.android.live.effect.sticker.p331ui;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.StickerFavoriteView$mTipTextNormal$2 */
/* loaded from: classes16.dex */
public final class StickerFavoriteView$mTipTextNormal$2 extends Lambda implements Function0<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $context;

    static {
        Covode.recordClassIndex(24650);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerFavoriteView$mTipTextNormal$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$context.getString(2131583055);
    }
}
