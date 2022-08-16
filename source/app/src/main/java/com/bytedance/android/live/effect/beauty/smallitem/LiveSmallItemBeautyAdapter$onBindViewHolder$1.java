package com.bytedance.android.live.effect.beauty.smallitem;

import com.bytedance.android.live.effect.beauty.smallitem.C4190a;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class LiveSmallItemBeautyAdapter$onBindViewHolder$1 extends Lambda implements Function2<C4190a.AbstractC4191a, Sticker, Unit> {
    public static final LiveSmallItemBeautyAdapter$onBindViewHolder$1 INSTANCE = new LiveSmallItemBeautyAdapter$onBindViewHolder$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24414);
    }

    public LiveSmallItemBeautyAdapter$onBindViewHolder$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(C4190a.AbstractC4191a abstractC4191a, Sticker sticker) {
        if (!PatchProxy.proxy(new Object[]{abstractC4191a, sticker}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC4191a, sticker);
        }
        return Unit.INSTANCE;
    }
}
