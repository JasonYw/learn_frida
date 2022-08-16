package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PKRivalsPanelSearchWidget$mOnEtTouchListener$2 extends Lambda implements Function0<View.OnTouchListener> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PKRivalsPanelSearchWidget this$0;

    static {
        Covode.recordClassIndex(26515);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKRivalsPanelSearchWidget$mOnEtTouchListener$2(PKRivalsPanelSearchWidget pKRivalsPanelSearchWidget) {
        super(0);
        this.this$0 = pKRivalsPanelSearchWidget;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.view.View$OnTouchListener] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View.OnTouchListener mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new View.OnTouchListener() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsPanelSearchWidget$mOnEtTouchListener$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(26516);
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return ((Boolean) proxy2.result).booleanValue();
                }
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    PKRivalsPanelSearchWidget$mOnEtTouchListener$2.this.this$0.LIZ();
                    PKRivalsPanelSearchWidget$mOnEtTouchListener$2.this.this$0.LJIIIIZZ.LIZIZ();
                    PKRivalsPanelSearchWidget.LIZ(PKRivalsPanelSearchWidget$mOnEtTouchListener$2.this.this$0).setCursorVisible(true);
                }
                return false;
            }
        };
    }
}
