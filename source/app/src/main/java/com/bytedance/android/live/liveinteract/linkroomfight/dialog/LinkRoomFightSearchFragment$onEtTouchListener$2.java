package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C80087HhZ;

/* loaded from: classes3.dex */
public final class LinkRoomFightSearchFragment$onEtTouchListener$2 extends Lambda implements Function0<View.OnTouchListener> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80087HhZ this$0;

    static {
        Covode.recordClassIndex(27688);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSearchFragment$onEtTouchListener$2(C80087HhZ c80087HhZ) {
        super(0);
        this.this$0 = c80087HhZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.view.View$OnTouchListener] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View.OnTouchListener mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new View.OnTouchListener() { // from class: com.bytedance.android.live.liveinteract.linkroomfight.dialog.LinkRoomFightSearchFragment$onEtTouchListener$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(27689);
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return ((Boolean) proxy2.result).booleanValue();
                }
                Intrinsics.checkNotNullExpressionValue(motionEvent, "");
                if (motionEvent.getAction() == 1) {
                    LinkRoomFightSearchFragment$onEtTouchListener$2.this.this$0.LJIILJJIL();
                    C80087HhZ c80087HhZ = LinkRoomFightSearchFragment$onEtTouchListener$2.this.this$0;
                    if (!PatchProxy.proxy(new Object[0], c80087HhZ, C80087HhZ.LIZIZ, false, 20).isSupported) {
                        RecyclerView recyclerView = c80087HhZ.LJIIJJI;
                        if (recyclerView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        recyclerView.setVisibility(8);
                    }
                    C80087HhZ.LIZ(LinkRoomFightSearchFragment$onEtTouchListener$2.this.this$0).LIZIZ();
                    C80087HhZ.LIZIZ(LinkRoomFightSearchFragment$onEtTouchListener$2.this.this$0).setCursorVisible(true);
                }
                return false;
            }
        };
    }
}
