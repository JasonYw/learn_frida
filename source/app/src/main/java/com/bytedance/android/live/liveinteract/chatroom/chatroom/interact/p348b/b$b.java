package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.core.utils.rxutils.autodispose.C4154a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$a;
import com.bytedance.android.livesdk.common.AbstractC6802e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import p003X.C100839PnV;
import p003X.C148062fT6;
import p003X.C7KL;
import p003X.HLJ;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.b.b$b */
/* loaded from: classes3.dex */
public abstract class b$b<T extends b$a> extends C4070a implements AbstractC6802e, AbstractC13971f {
    public static ChangeQuickRedirect LJI;
    public HLJ LJII;
    public T LJIIIZ;
    public final String LJIIIIZZ = getClass().getName();
    public final LinkCrossRoomDataHolder LJIIJ = LinkCrossRoomDataHolder.LJII();

    static {
        Covode.recordClassIndex(25662);
    }

    /* renamed from: J_ */
    public ViewGroup mo15772J_() {
        return null;
    }

    public abstract String LIZ();

    public View LIZIZ() {
        return null;
    }

    public abstract float LIZJ();

    public boolean LJFF() {
        return true;
    }

    public View LJII() {
        return null;
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneFullName() {
        return "com/bytedance/android/live/liveinteract/chatroom/chatroom/interact/contract/InteractDialogFragmentBaseContract$View";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneSimpleName() {
        return "InteractDialogFragmentBaseContract$View";
    }

    public final FrameLayout.LayoutParams LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 2);
        if (proxy.isSupported) {
            return (FrameLayout.LayoutParams) proxy.result;
        }
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public final <S> C7KL<S> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 3);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        return C148062fT6.LIZ(this.LJII.LJI());
    }

    public final <R> C7KL<R> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 4);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        return C148062fT6.LIZ(C4154a.LIZ(this.LJII.LJI(), Lifecycle.Event.ON_DESTROY), C100839PnV.LIZJ());
    }

    public int LIZ(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LJI, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LK5.LIZ(56.0f);
    }
}
