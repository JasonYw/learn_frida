package com.bytedance.android.live.lynx.p397ui.p398vs;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.event.LynxDetailEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.T47;

/* renamed from: com.bytedance.android.live.lynx.ui.vs.VSLynxVideoView$createView$$inlined$apply$lambda$1 */
/* loaded from: classes10.dex */
public final class VSLynxVideoView$createView$$inlined$apply$lambda$1 extends Lambda implements Function2<String, Map<String, ? extends Object>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VSLynxVideoView this$0;

    static {
        Covode.recordClassIndex(32404);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VSLynxVideoView$createView$$inlined$apply$lambda$1(VSLynxVideoView vSLynxVideoView) {
        super(2);
        this.this$0 = vSLynxVideoView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(String str, Map<String, ? extends Object> map) {
        boolean contains;
        String str2 = str;
        Map<String, ? extends Object> map2 = map;
        if (!PatchProxy.proxy(new Object[]{str2, map2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2, map2);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, VSLynxVideoView.Companion, T47.LIZ, false, 1);
            if (proxy.isSupported) {
                contains = ((Boolean) proxy.result).booleanValue();
            } else {
                C106862S5w.LIZ(str2);
                contains = SetsKt__SetsKt.setOf((Object[]) new String[]{"play", "pause", "stop", "ended", "error", "timeupdate", "previewfinish"}).contains(str2);
            }
            if (contains) {
                LynxContext lynxContext = this.this$0.getLynxContext();
                Intrinsics.checkNotNullExpressionValue(lynxContext, "");
                EventEmitter eventEmitter = lynxContext.getEventEmitter();
                LynxDetailEvent lynxDetailEvent = new LynxDetailEvent(this.this$0.getSign(), str2);
                for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                    lynxDetailEvent.addDetail(entry.getKey(), entry.getValue());
                }
                eventEmitter.sendCustomEvent(lynxDetailEvent);
            }
        }
        return Unit.INSTANCE;
    }
}
