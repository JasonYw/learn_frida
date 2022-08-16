package com.bytedance.android.live.effect.beauty.smallitem;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C86766KGy;
import p003X.KH2;

/* loaded from: classes5.dex */
public final /* synthetic */ class LiveSmallSubItemBeautyAdapter$onBindViewHolder$2 extends FunctionReferenceImpl implements Function2<e$a, Sticker, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24420);
    }

    public LiveSmallSubItemBeautyAdapter$onBindViewHolder$2(C86766KGy c86766KGy) {
        super(2, c86766KGy, C86766KGy.class, "afterBindVideoViewHolder", "afterBindVideoViewHolder(Lcom/bytedance/android/live/effect/beauty/smallitem/LiveSmallSubItemBeautyAdapter$AbsSmallItemViewHolder;Lcom/bytedance/android/livesdkapi/depend/model/Sticker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(e$a e_a, Sticker sticker) {
        e$a e_a2 = e_a;
        if (!PatchProxy.proxy(new Object[]{e_a2, sticker}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(e_a2, sticker);
            if (!PatchProxy.proxy(new Object[]{e_a2, sticker}, this.receiver, C86766KGy.LIZ, false, 4).isSupported && !(e_a2 instanceof KH2)) {
                View view = e_a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                View findViewById = view.findViewById(2131178176);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                findViewById.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }
}
