package com.bytedance.android.live.liveinteract.interact.audience.emoji.panel;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class LinkPKAudienceInteractPanelItemNormalVH$bind$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC4435j $panelItem;

    static {
        Covode.recordClassIndex(27223);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPKAudienceInteractPanelItemNormalVH$bind$1(AbstractC4435j abstractC4435j) {
        super(1);
        this.$panelItem = abstractC4435j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            this.$panelItem.LIZ(view2);
        }
        return Unit.INSTANCE;
    }
}
