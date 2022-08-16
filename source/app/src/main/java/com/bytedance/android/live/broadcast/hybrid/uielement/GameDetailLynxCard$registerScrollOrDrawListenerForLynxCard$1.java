package com.bytedance.android.live.broadcast.hybrid.uielement;

import com.bytedance.android.annie.api.card.HybridCard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C436843Py;

/* loaded from: classes5.dex */
public final class GameDetailLynxCard$registerScrollOrDrawListenerForLynxCard$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailLynxCard this$0;

    static {
        Covode.recordClassIndex(16787);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailLynxCard$registerScrollOrDrawListenerForLynxCard$1(GameDetailLynxCard gameDetailLynxCard) {
        super(2);
        this.this$0 = gameDetailLynxCard;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Float f) {
        HybridCard hybridCard;
        boolean booleanValue = bool.booleanValue();
        float floatValue = f.floatValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Float.valueOf(floatValue)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue) {
            GameDetailLynxCard gameDetailLynxCard = this.this$0;
            if (!PatchProxy.proxy(new Object[]{Float.valueOf(floatValue)}, gameDetailLynxCard, GameDetailLynxCard.LIZ, false, 4).isSupported && (hybridCard = gameDetailLynxCard.LIZIZ) != null) {
                hybridCard.sendJsEvent("gamecpCardVisible", C436843Py.LIZ(MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("visibilityRegionPer", Float.valueOf(floatValue)))));
            }
        }
        return Unit.INSTANCE;
    }
}
