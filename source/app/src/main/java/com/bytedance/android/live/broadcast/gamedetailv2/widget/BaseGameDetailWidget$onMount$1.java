package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class BaseGameDetailWidget$onMount$1 extends Lambda implements Function2<Boolean, T, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseGameDetailWidget this$0;

    static {
        Covode.recordClassIndex(16736);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGameDetailWidget$onMount$1(BaseGameDetailWidget baseGameDetailWidget) {
        super(2);
        this.this$0 = baseGameDetailWidget;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Object obj) {
        boolean booleanValue = bool.booleanValue();
        AbstractC3125c abstractC3125c = (AbstractC3125c) obj;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), abstractC3125c}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3125c);
            this.this$0.LIZ(booleanValue, (boolean) abstractC3125c);
        }
        return Unit.INSTANCE;
    }
}
