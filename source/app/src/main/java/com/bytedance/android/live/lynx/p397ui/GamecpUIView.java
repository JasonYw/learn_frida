package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.p1543ui.view.AndroidView;
import com.lynx.tasm.behavior.p1543ui.view.UIView;
import com.lynx.tasm.event.EventsListener;
import com.lynx.tasm.event.LynxDetailEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC109343T3h;
import p003X.C106862S5w;
import p003X.C109342T3g;
import p003X.C109344T3i;

/* renamed from: com.bytedance.android.live.lynx.ui.GamecpUIView */
/* loaded from: classes10.dex */
public final class GamecpUIView extends UIView implements AbstractC109343T3h {
    public static final C109342T3g Companion = new C109342T3g((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean enableEvent;

    static {
        Covode.recordClassIndex(32321);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamecpUIView(LynxContext lynxContext) {
        super(lynxContext);
        C106862S5w.LIZ(lynxContext);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.view.UIView
    public final AndroidView onCreateView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AndroidView) proxy.result;
        }
        C106862S5w.LIZ(context);
        return new C109344T3i(context, this);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void setEvents(Map<String, EventsListener> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        super.setEvents(map);
        if (map != null) {
            this.enableEvent = map.containsKey("onViewAppear");
        }
    }

    @Override // p003X.AbstractC109343T3h
    public final boolean onViewAppear(float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.enableEvent) {
            return false;
        }
        LynxContext lynxContext = getLynxContext();
        Intrinsics.checkNotNullExpressionValue(lynxContext, "");
        EventEmitter eventEmitter = lynxContext.getEventEmitter();
        LynxDetailEvent lynxDetailEvent = new LynxDetailEvent(getSign(), "onViewAppear");
        lynxDetailEvent.addDetail("visibleRegionPercent", Float.valueOf(f));
        eventEmitter.sendCustomEvent(lynxDetailEvent);
        return true;
    }
}
