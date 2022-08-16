package com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.AbstractC4370h;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4369e;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C78571GyD;
import p003X.C80755HsL;
import p003X.C80756HsM;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.ui.FollowHintAnimationView */
/* loaded from: classes3.dex */
public final class FollowHintAnimationView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public C80755HsL LIZIZ;
    public C80756HsM LIZJ;
    public View LIZLLL;

    static {
        Covode.recordClassIndex(26405);
    }

    public FollowHintAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FollowHintAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        C80755HsL c80755HsL = this.LIZIZ;
        if (c80755HsL != null) {
            c80755HsL.LIZ();
        }
        C80756HsM c80756HsM = this.LIZJ;
        if (c80756HsM != null) {
            c80756HsM.LIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        C80755HsL c80755HsL = this.LIZIZ;
        if (c80755HsL != null && !PatchProxy.proxy(new Object[0], c80755HsL, C80755HsL.LIZ, false, 3).isSupported) {
            c80755HsL.LIZJ = true;
            c80755HsL.LIZIZ.clear();
        }
        C80756HsM c80756HsM = this.LIZJ;
        if (c80756HsM != null && !PatchProxy.proxy(new Object[0], c80756HsM, C80756HsM.LIZ, false, 4).isSupported) {
            c80756HsM.LJFF = true;
            c80756HsM.LIZIZ.clear();
        }
    }

    public final void setFollowHintAnimListener(AbstractC4370h abstractC4370h) {
        if (PatchProxy.proxy(new Object[]{abstractC4370h}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4370h);
        C80755HsL c80755HsL = this.LIZIZ;
        if (c80755HsL != null && !PatchProxy.proxy(new Object[]{abstractC4370h}, c80755HsL, C80755HsL.LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(abstractC4370h);
            if (abstractC4370h instanceof C4369e) {
                c80755HsL.LIZIZ.addFirst(abstractC4370h);
            } else {
                c80755HsL.LIZIZ.add(abstractC4370h);
            }
        }
        C80756HsM c80756HsM = this.LIZJ;
        if (c80756HsM != null && !PatchProxy.proxy(new Object[]{abstractC4370h}, c80756HsM, C80756HsM.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(abstractC4370h);
            if (abstractC4370h instanceof C4369e) {
                c80756HsM.LIZIZ.addFirst(abstractC4370h);
            } else {
                c80756HsM.LIZIZ.add(abstractC4370h);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowHintAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1767);
        MethodCollector.m14707o(1767);
    }

    public final void LIZ(int i, boolean z, List<Integer> list) {
        MethodCollector.m14708i(1766);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), list}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1766);
            return;
        }
        this.LIZLLL = FrameLayout.inflate(getContext(), LIZIZ(i, z, list), this);
        this.LIZIZ = new C80755HsL(this.LIZLLL);
        this.LIZJ = new C80756HsM(this.LIZLLL);
        MethodCollector.m14707o(1766);
    }

    private final int LIZIZ(int i, boolean z, List<Integer> list) {
        Room room;
        C2WC<Room> LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), list}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (i != 5) {
            if (i != 8) {
                if (i != 9) {
                    switch (i) {
                        case 12:
                            if (!C78571GyD.LIZIZ(list)) {
                                return 2131700604;
                            }
                            if (z) {
                                return 2131700606;
                            }
                            return 2131700607;
                        case 13:
                            if (z) {
                                return 2131700603;
                            }
                            return 2131700604;
                        default:
                            return 2131700604;
                    }
                }
                return 2131700519;
            } else if (z) {
                return 2131700603;
            } else {
                return 2131700604;
            }
        }
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        if (C78571GyD.LIZ(room)) {
            return 2131700516;
        }
        return 2131700515;
    }

    public /* synthetic */ FollowHintAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void LIZ(FollowHintAnimationView followHintAnimationView, int i, boolean z, List list, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{followHintAnimationView, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), null, 4, null}, null, LIZ, true, 2).isSupported) {
            return;
        }
        followHintAnimationView.LIZ(i, z, null);
    }
}
