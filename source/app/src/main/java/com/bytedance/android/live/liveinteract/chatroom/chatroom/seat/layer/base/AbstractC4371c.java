package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4371c implements AbstractC4373j {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public ViewGroup f26289LJ;
    public int LJFF;
    public final MicSeatScene LJI;

    static {
        Covode.recordClassIndex(26318);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public void LIZIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZLLL, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
    }

    public int LJIIJ() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public View LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        ViewGroup viewGroup = this.f26289LJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    /* renamed from: U_ */
    public final ViewGroup m15748U_() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        ViewGroup viewGroup = this.f26289LJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    public AbstractC4371c(MicSeatScene micSeatScene) {
        C106862S5w.LIZ(micSeatScene);
        this.LJI = micSeatScene;
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZLLL, false, 6);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        ViewGroup viewGroup = this.f26289LJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup.findViewById(i);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.AbstractC4373j
    public void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZLLL, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        View LIZ = C116971W2r.LIZ(LayoutInflater.from(context), LJIIJ(), (ViewGroup) null, false);
        if (LIZ != null) {
            this.f26289LJ = (ViewGroup) LIZ;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
