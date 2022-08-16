package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC78986HBs;
import p003X.C106862S5w;
import p003X.C78397GvP;
import p003X.HL3;

/* loaded from: classes3.dex */
public final class VideoTalkCPositionBeInvitedDialog extends C9078n {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public C8874fl f26442LJ;
    public boolean LJIIJ;
    public HashMap LJIIJJI;
    public static final C78397GvP LJIIIIZZ = new C78397GvP((byte) 0);
    public static final String LJII = "https://lf1-webcastcdn-tos.douyinstatic.com/obj/live-android/ttlive_ic_c_position_be_invite.png";
    public CompositeDisposable LJIIIZ = new CompositeDisposable();
    public int LJFF = 9;
    public ShowType LJI = ShowType.Invite;

    /* loaded from: classes3.dex */
    public enum ShowType {
        Invite,
        Apply;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30023);
        }

        public static ShowType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ShowType) (proxy.isSupported ? proxy.result : Enum.valueOf(ShowType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ShowType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ShowType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new HashMap();
        }
        View view = (View) this.LJIIJJI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJIIJJI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (hashMap = this.LJIIJJI) != null) {
            hashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(30022);
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDestroyView();
        this.LJIIIZ.dispose();
        if (!this.LJIIJ) {
            LIZ(false, false);
        }
        LIZJ();
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 2131494978);
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNullExpressionValue(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
        }
    }

    @Override // p003X.C88402KsO, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Dialog) proxy.result;
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnCancelListener(new HL3(this));
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    public final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIIJ = true;
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = null;
        if (this.LIZJ) {
            AbstractC4766ag LIZ2 = AbstractC4766ag.LIZ.LIZ();
            if (LIZ2 != null) {
                abstractC78986HBs = LIZ2.LIZLLL();
            }
            LIZ(z, z2, abstractC78986HBs, this.LIZLLL, this.LJI);
            AbstractC4766ag LIZ3 = AbstractC4766ag.LIZ.LIZ();
            if (LIZ3 != null) {
                LIZ3.LIZ(this.LIZIZ, this.LIZLLL, z);
                return;
            }
            return;
        }
        AbstractC4767ah LIZ4 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ4 != null) {
            abstractC78986HBs = LIZ4.LJIIIIZZ();
        }
        LIZ(z, z2, abstractC78986HBs, this.LIZLLL, this.LJI);
        AbstractC4767ah LIZ5 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ5 != null) {
            LIZ5.LIZIZ(this.LIZIZ, this.LIZLLL, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
        if (r10 == null) goto L39;
     */
    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkCPositionBeInvitedDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m14708i(2011);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(2011);
            return view;
        }
        C106862S5w.LIZ(layoutInflater);
        View inflate = layoutInflater.inflate(2131698964, viewGroup);
        MethodCollector.m14707o(2011);
        return inflate;
    }

    public static /* synthetic */ void LIZ(VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog, boolean z, boolean z2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{videoTalkCPositionBeInvitedDialog, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, 2, null}, null, LIZ, true, 8).isSupported) {
            return;
        }
        videoTalkCPositionBeInvitedDialog.LIZ(z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZ(boolean r23, boolean r24, p003X.AbstractC78986HBs<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r25, long r26, com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkCPositionBeInvitedDialog.ShowType r28) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkCPositionBeInvitedDialog.LIZ(boolean, boolean, X.HBs, long, com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkCPositionBeInvitedDialog$ShowType):void");
    }
}
