package com.bytedance.android.live.effect.sticker.p331ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.StickerFavoriteView$mIconIV$2 */
/* loaded from: classes20.dex */
public final class StickerFavoriteView$mIconIV$2 extends Lambda implements Function0<StickerFavoriteImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StickerFavoriteView this$0;

    static {
        Covode.recordClassIndex(24648);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerFavoriteView$mIconIV$2(StickerFavoriteView stickerFavoriteView) {
        super(0);
        this.this$0 = stickerFavoriteView;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.bytedance.android.live.effect.sticker.ui.StickerFavoriteImageView] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.effect.sticker.ui.StickerFavoriteImageView] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ StickerFavoriteImageView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.findViewById(2131174652);
    }
}
