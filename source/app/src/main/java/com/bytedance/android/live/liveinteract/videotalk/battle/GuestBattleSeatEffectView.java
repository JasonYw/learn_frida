package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.config.C6840aw;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C77540Gha;
import p003X.C78821H5j;
import p003X.C78822H5k;
import p003X.C78828H5q;
import p003X.C80302Hl2;
import p003X.C80312HlC;
import p003X.LK1;

/* loaded from: classes3.dex */
public final class GuestBattleSeatEffectView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public HSImageView LIZIZ;
    public HSImageView LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f26438LJ;
    public boolean LJFF;

    static {
        Covode.recordClassIndex(29812);
    }

    public GuestBattleSeatEffectView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GuestBattleSeatEffectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!this.LJFF && !this.LIZLLL) {
            return;
        }
        this.LIZLLL = false;
        this.LJFF = false;
        LK1.LIZ((View) this);
        if (!C80302Hl2.LIZ()) {
            HSImageView hSImageView = this.LIZJ;
            if (hSImageView != null) {
                LK1.LIZ(hSImageView, 500L, false, 2, null);
                return;
            }
            return;
        }
        HSImageView hSImageView2 = this.LIZIZ;
        if (hSImageView2 != null) {
            hSImageView2.setController(null);
        }
        HSImageView hSImageView3 = this.LIZIZ;
        if (hSImageView3 != null) {
            LK1.LIZ(hSImageView3);
        }
    }

    public final void LIZ(C6166j.C6167a c6167a) {
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 6).isSupported || c6167a == null) {
            return;
        }
        if (c6167a.LJIIJJI) {
            setCrownEffect(c6167a);
        } else if (c6167a.LJIILJJIL) {
            setHeartBreakEffect(c6167a);
        } else {
            LIZ();
        }
    }

    private final void setCrownEffect(C6166j.C6167a c6167a) {
        String str;
        int i;
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 3).isSupported) {
            return;
        }
        int i2 = c6167a.LJIIL;
        if (this.LIZLLL && (i = this.f26438LJ) >= 0 && i == i2) {
            return;
        }
        this.LIZLLL = true;
        this.f26438LJ = i2;
        this.LJFF = false;
        String str2 = "";
        if (!C80302Hl2.LIZLLL() && !C80302Hl2.LIZIZ()) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C6840aw.LIZ, true, 8);
            if (proxy.isSupported) {
                str = (String) proxy.result;
            } else {
                str = C6840aw.LIZ().LJII;
            }
            Intrinsics.checkNotNullExpressionValue(str, str2);
            setSeatWebpEffect(str);
            return;
        }
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null) {
            hSImageView.setAlpha(0.0f);
        }
        Uri LIZ2 = C80312HlC.LIZIZ.LIZ(i2);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str2 = "gold";
                    }
                } else {
                    str2 = "silver";
                }
            } else {
                str2 = "copper";
            }
        } else {
            str2 = "glove";
        }
        LIZ(LIZ2, str2, c6167a);
    }

    private final void setHeartBreakEffect(C6166j.C6167a c6167a) {
        String str;
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 4).isSupported || this.LJFF) {
            return;
        }
        this.LJFF = true;
        this.LIZLLL = false;
        if (!C80302Hl2.LIZLLL() && !C80302Hl2.LIZIZ()) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C6840aw.LIZ, true, 9);
            if (proxy.isSupported) {
                str = (String) proxy.result;
            } else {
                str = C6840aw.LIZ().LJIIIIZZ;
            }
            Intrinsics.checkNotNullExpressionValue(str, "");
            setSeatWebpEffect(str);
            return;
        }
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null) {
            hSImageView.setAlpha(0.0f);
        }
        LIZ(C80312HlC.LIZIZ.LIZIZ(), "heart_break", c6167a);
    }

    private final void setSeatWebpEffect(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported || !C4891b.LIZJ.m23816LJ()) {
            return;
        }
        AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(str).setAutoPlayAnimations(true).setControllerListener(new C78821H5j()).mo27965build();
        Intrinsics.checkNotNullExpressionValue(mo27965build, "");
        LK1.LIZJ(this);
        HSImageView hSImageView = this.LIZIZ;
        if (hSImageView != null) {
            LK1.LIZJ(hSImageView);
        }
        HSImageView hSImageView2 = this.LIZIZ;
        if (hSImageView2 != null) {
            hSImageView2.setController(mo27965build);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleSeatEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(PushConstants.NOTIFICATION_SERVICE_SEND_MESSAGE_BROADCAST);
        this.f26438LJ = -1;
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131699363, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        addView(LIZ2);
        this.LIZIZ = (HSImageView) LIZ2.findViewById(2131192904);
        this.LIZJ = (HSImageView) LIZ2.findViewById(2131192905);
        MethodCollector.m14707o(PushConstants.NOTIFICATION_SERVICE_SEND_MESSAGE_BROADCAST);
    }

    private final void LIZ(Uri uri, String str, C6166j.C6167a c6167a) {
        String str2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        boolean booleanValue;
        if (PatchProxy.proxy(new Object[]{uri, str, c6167a}, this, LIZ, false, 2).isSupported || uri == null || !C4891b.LIZJ.m23816LJ()) {
            return;
        }
        AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27962setUri(uri).setAutoPlayAnimations(true).setControllerListener(new C78822H5k()).mo27965build();
        Intrinsics.checkNotNullExpressionValue(mo27965build, "");
        LK1.LIZJ(this);
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null) {
            hSImageView.setController(mo27965build);
        }
        HSImageView hSImageView2 = this.LIZJ;
        if (hSImageView2 != null) {
            LK1.LIZ(hSImageView2, 500L);
        }
        if (C4891b.LIZJ.LIZJ()) {
            str2 = "ongoing";
        } else {
            str2 = "over";
        }
        C77540Gha c77540Gha = C77540Gha.LIZJ;
        long j = c6167a.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{str, new Long(j), str2}, c77540Gha, C77540Gha.LIZ, false, 9).isSupported) {
            C106862S5w.LIZ(str, str2);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c77540Gha, C77540Gha.LIZ, false, 13);
            if (proxy.isSupported) {
                booleanValue = ((Boolean) proxy.result).booleanValue();
            } else {
                C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
                    booleanValue = LIZIZ.booleanValue();
                }
                HashMap hashMap = new HashMap();
                C78828H5q.LIZIZ(hashMap, 0, 2, (Object) null);
                C78828H5q.m23787LJ(hashMap);
                C78828H5q.LIZIZ(hashMap, (Integer) null, (Integer) null, 6, (Object) null);
                C78828H5q.LJFF(hashMap);
                hashMap.put("crown_type", str);
                hashMap.put("to_user_id", String.valueOf(j));
                hashMap.put("play_stage", str2);
                C4574547f.LIZ().LIZ("livesdk_chatroom_game_bomb_crown_show", hashMap, Room.class);
            }
            if (booleanValue) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            C78828H5q.LIZIZ(hashMap2, 0, 2, (Object) null);
            C78828H5q.m23787LJ(hashMap2);
            C78828H5q.LIZIZ(hashMap2, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.LJFF(hashMap2);
            hashMap2.put("crown_type", str);
            hashMap2.put("to_user_id", String.valueOf(j));
            hashMap2.put("play_stage", str2);
            C4574547f.LIZ().LIZ("livesdk_chatroom_game_bomb_crown_show", hashMap2, Room.class);
        }
    }

    public /* synthetic */ GuestBattleSeatEffectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
