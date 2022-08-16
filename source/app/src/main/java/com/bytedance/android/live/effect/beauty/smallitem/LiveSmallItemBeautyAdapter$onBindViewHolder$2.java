package com.bytedance.android.live.effect.beauty.smallitem;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class LiveSmallItemBeautyAdapter$onBindViewHolder$2 extends Lambda implements Function1<Sticker, Boolean> {
    public static final LiveSmallItemBeautyAdapter$onBindViewHolder$2 INSTANCE = new LiveSmallItemBeautyAdapter$onBindViewHolder$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24415);
    }

    public LiveSmallItemBeautyAdapter$onBindViewHolder$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Sticker sticker) {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(sticker);
        }
        return Boolean.valueOf(z);
    }
}
