package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89045L6p;

/* loaded from: classes5.dex */
public final class GameDetailContentWidget$initJSB$1 extends Lambda implements Function1<C3952am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailContentWidget this$0;

    static {
        Covode.recordClassIndex(16574);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailContentWidget$initJSB$1(GameDetailContentWidget gameDetailContentWidget) {
        super(1);
        this.this$0 = gameDetailContentWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3952am c3952am) {
        Object obj;
        Object obj2;
        Map<String, String> map;
        C3952am c3952am2 = c3952am;
        if (!PatchProxy.proxy(new Object[]{c3952am2}, this, changeQuickRedirect, false, 1).isSupported) {
            Map<String, Object> map2 = c3952am2.LIZJ;
            if (map2 == null || (obj = map2.get("tab_id")) == null) {
                obj = "";
            }
            String obj3 = obj.toString();
            Map<String, Object> map3 = c3952am2.LIZJ;
            if (map3 == null || (obj2 = map3.get("index")) == null) {
                obj2 = 1;
            }
            String obj4 = obj2.toString();
            if (obj4.length() > 0) {
                C89045L6p c89045L6p = this.this$0.LIZIZ;
                if (c89045L6p != null && c89045L6p.LJIJJ != null) {
                    C89045L6p c89045L6p2 = this.this$0.LIZIZ;
                    if (c89045L6p2 != null && (map = c89045L6p2.LJIJJ) != null) {
                        map.put(obj3, obj4);
                    }
                } else {
                    C89045L6p c89045L6p3 = this.this$0.LIZIZ;
                    if (c89045L6p3 != null) {
                        c89045L6p3.LJIJJ = MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to(obj3, obj4));
                    }
                }
            }
            this.this$0.LIZ(obj3, Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
