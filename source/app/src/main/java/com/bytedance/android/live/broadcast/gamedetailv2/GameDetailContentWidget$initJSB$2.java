package com.bytedance.android.live.broadcast.gamedetailv2;

import android.content.Context;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C89045L6p;
import p003X.LCG;

/* loaded from: classes5.dex */
public final class GameDetailContentWidget$initJSB$2 extends Lambda implements Function1<C3952am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailContentWidget this$0;

    static {
        Covode.recordClassIndex(16575);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailContentWidget$initJSB$2(GameDetailContentWidget gameDetailContentWidget) {
        super(1);
        this.this$0 = gameDetailContentWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3952am c3952am) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        C3952am c3952am2 = c3952am;
        if (!PatchProxy.proxy(new Object[]{c3952am2}, this, changeQuickRedirect, false, 1).isSupported) {
            LCG lcg = LCG.LIZIZ;
            Context context = this.this$0.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            Pair[] pairArr = new Pair[9];
            Map<String, Object> map = c3952am2.LIZJ;
            Integer num = null;
            if (map != null) {
                obj = map.get("game_id");
            } else {
                obj = null;
            }
            pairArr[0] = TuplesKt.m137to("game_id", obj);
            Map<String, Object> map2 = c3952am2.LIZJ;
            if (map2 != null) {
                obj2 = map2.get("game_name");
            } else {
                obj2 = null;
            }
            pairArr[1] = TuplesKt.m137to("game_name", obj2);
            Map<String, Object> map3 = c3952am2.LIZJ;
            if (map3 != null) {
                obj3 = map3.get("prop_id");
            } else {
                obj3 = null;
            }
            pairArr[2] = TuplesKt.m137to("prop_id", obj3);
            Map<String, Object> map4 = c3952am2.LIZJ;
            if (map4 != null) {
                obj4 = map4.get("prop_name");
            } else {
                obj4 = null;
            }
            pairArr[3] = TuplesKt.m137to("prop_name", obj4);
            Map<String, Object> map5 = c3952am2.LIZJ;
            if (map5 != null) {
                obj5 = map5.get("prop_enter_from");
            } else {
                obj5 = null;
            }
            pairArr[4] = TuplesKt.m137to("prop_enter_from", obj5);
            Map<String, Object> map6 = c3952am2.LIZJ;
            if (map6 != null) {
                obj6 = map6.get("market_price");
            } else {
                obj6 = null;
            }
            Map<String, Object> map7 = c3952am2.LIZJ;
            if (map7 != null) {
                obj7 = map7.get("selling_price");
            } else {
                obj7 = null;
            }
            pairArr[5] = TuplesKt.m137to("is_discount", Boolean.valueOf(true ^ Intrinsics.areEqual(obj6, obj7)));
            Map<String, Object> map8 = c3952am2.LIZJ;
            if (map8 != null) {
                obj8 = map8.get("is_introduce");
            } else {
                obj8 = null;
            }
            pairArr[6] = TuplesKt.m137to("is_introduce", obj8);
            Map<String, Object> map9 = c3952am2.LIZJ;
            if (map9 != null) {
                obj9 = map9.get("all_props_from");
            } else {
                obj9 = null;
            }
            pairArr[7] = TuplesKt.m137to("all_props_from", obj9);
            C89045L6p c89045L6p = this.this$0.LIZIZ;
            if (c89045L6p != null) {
                num = Integer.valueOf(c89045L6p.LIZLLL);
            }
            pairArr[8] = TuplesKt.m137to("promote_scene", num);
            lcg.LIZ(context, MapsKt__MapsKt.mutableMapOf(pairArr));
        }
        return Unit.INSTANCE;
    }
}
