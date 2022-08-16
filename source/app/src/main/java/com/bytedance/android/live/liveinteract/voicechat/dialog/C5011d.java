package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4319a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.ai$a;
import com.bytedance.android.live.liveinteract.interact.audience.paid.C4441a;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4408a;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4409d;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
import com.bytedance.android.live.liveinteract.plantform.model.C4815i;
import com.bytedance.android.live.liveinteract.plantform.model.C4824t;
import com.bytedance.android.live.liveinteract.videotalk.paid.C4935a;
import com.bytedance.android.live.liveinteract.voicechat.paid.C5077a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.drakeet.multitype.C35036d;
import p003X.C106862S5w;
import p003X.C134798c0f;
import p003X.C2WC;
import p003X.C30K;
import p003X.C439993ar;
import p003X.C448853p9;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C77595GiT;
import p003X.C77785GlX;
import p003X.C77875Gmz;
import p003X.C77876Gn0;
import p003X.C77877Gn1;
import p003X.C77878Gn2;
import p003X.C77908GnW;
import p003X.C77910GnY;
import p003X.C77911GnZ;
import p003X.C77912Gna;
import p003X.C77913Gnb;
import p003X.C77916Gne;
import p003X.C78289Gtf;
import p003X.C78538Gxg;
import p003X.C78828H5q;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79242HLo;
import p003X.GX9;
import p003X.HL6;
import p003X.IQV;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;
import p003X.View$OnClickListenerC77598GiW;
import p003X.View$OnClickListenerC77693Gk3;
import p003X.View$OnClickListenerC78006Gp6;
import p003X.View$OnClickListenerC78199GsD;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.dialog.d */
/* loaded from: classes3.dex */
public final class C5011d extends C9078n {
    public static ChangeQuickRedirect LIZ;
    public static final C77911GnZ LJIILJJIL = new C77911GnZ((byte) 0);
    public Room LIZIZ;
    public RecyclerView LIZLLL;

    /* renamed from: LJ */
    public FrameLayout f26480LJ;
    public TextView LJFF;
    public HSImageView LJI;
    public TextView LJII;
    public TextView LJIIIIZZ;
    public TextView LJIIIZ;
    public TextView LJIIJ;
    public TextView LJIIJJI;
    public TextView LJIIL;
    public boolean LJIILIIL;
    public TextView LJIIZILJ;
    public boolean LJIJ;
    public String LJIJI;
    public HashMap LJIJJLI;
    public final CompositeDisposable LJIILL = new CompositeDisposable();
    public final Lazy LJIILLIIL = C77347GeT.LIZ(GuestApplyDialog$vm$2.INSTANCE);
    public final C35036d LIZJ = new C35036d();
    public final C30K<Integer> LJIJJ = new C77875Gmz(this);

    static {
        Covode.recordClassIndex(31054);
    }

    @JvmStatic
    public static final C5011d LIZ(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, null, LIZ, true, 22);
        return proxy.isSupported ? (C5011d) proxy.result : LJIILJJIL.LIZ(room);
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIJJLI == null) {
            this.LJIJJLI = new HashMap();
        }
        View view = (View) this.LJIJJLI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJIJJLI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C5012e LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C5012e) (proxy.isSupported ? proxy.result : this.LJIILLIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && (hashMap = this.LJIJJLI) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }

    /* renamed from: LJ */
    public final void m15652LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        TextView textView = this.LJIIJ;
        if (textView != null) {
            LK1.LIZIZ(textView);
        }
        TextView textView2 = this.LJIIJJI;
        if (textView2 != null) {
            LK1.LIZIZ(textView2);
        }
        TextView textView3 = this.LJIIL;
        if (textView3 != null) {
            LK1.LIZIZ(textView3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        if (!this.LJIILL.isDisposed()) {
            this.LJIILL.dispose();
        }
        super.onDestroy();
        C79046HEa.LIZ().LIZ((C30K) this.LJIJJ);
    }

    public final boolean LIZLLL() {
        AbstractC4408a audioPaidLinkService;
        AbstractC4409d interactPaidLinkService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4410g videoPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).videoPaidLinkService();
        if ((videoPaidLinkService == null || !videoPaidLinkService.LIZJ()) && (((audioPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).audioPaidLinkService()) == null || !audioPaidLinkService.LIZJ()) && ((interactPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).interactPaidLinkService()) == null || !interactPaidLinkService.LIZIZ()))) {
            return false;
        }
        return true;
    }

    @Override // p003X.C88402KsO, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Dialog) proxy.result;
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnCancelListener(new HL6(this));
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNullExpressionValue(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
            window.setSoftInputMode(48);
        }
        LIZ(C77912Gna.LIZIZ);
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 2131494978);
        C78828H5q c78828H5q = C78828H5q.LJFF;
        String str = this.LJIJI;
        if (!PatchProxy.proxy(new Object[]{str}, c78828H5q, C78828H5q.LIZ, false, 175).isSupported) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C78828H5q.LIZIZ(linkedHashMap, 0, 2, (Object) null);
            C78828H5q.LIZIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.m23787LJ(linkedHashMap);
            if (str != null) {
                linkedHashMap.put("request_page", str);
            }
            C4574547f.LIZ().LIZ("livesdk_guest_connection_apply_page_show", linkedHashMap, Room.class);
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJIJ = false;
        this.LJIILIIL = false;
        super.onDismiss(dialogInterface);
        C5012e LIZIZ = LIZIZ();
        if (LIZIZ != null && !PatchProxy.proxy(new Object[0], LIZIZ, C5012e.LIZ, false, 14).isSupported) {
            LIZIZ.LJIILJJIL.clear();
            LIZIZ.LIZIZ = "";
            LIZIZ.LJIIIIZZ.setValue(null);
            LIZIZ.LJIIJJI.setValue(null);
            LIZIZ.f26481LJ = true;
            LIZIZ.LJII.clear();
            LIZIZ.LJIIL.setValue(null);
            LIZIZ.LJIILIIL.setValue(null);
            LIZIZ.LJI = 0L;
            LIZIZ.LJIILL = false;
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            LJII.LJJIIJ = 0L;
        }
    }

    public final void LIZ(C9605p c9605p) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{c9605p}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (c9605p == null) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.m23776LJ() && (textView = this.LJIIZILJ) != null) {
                textView.setText(LK5.LIZ(2131584063));
                return;
            }
            return;
        }
        TextView textView2 = this.LJIIZILJ;
        if (textView2 != null) {
            textView2.setText(C134798c0f.LIZ(c9605p, ""));
        }
    }

    public final void LIZ(Context context, String str) {
        FragmentManager fragmentManager;
        if (PatchProxy.proxy(new Object[]{context, str}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        if (!LJIILIIL() && !this.LJIJ) {
            this.LJIJ = true;
            this.LJIJI = str;
            FragmentActivity LIZIZ = C439993ar.LIZIZ(context);
            if (LIZIZ != null) {
                fragmentManager = LIZIZ.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            show(fragmentManager, "GuestApplyDialog");
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C2WC<Boolean> LIZIZ;
        Observable<Boolean> LIZIZ2;
        Disposable subscribe;
        C2WC<Boolean> LIZIZ3;
        Observable<Boolean> LIZIZ4;
        Disposable subscribe2;
        C2WC<Boolean> LIZIZ5;
        Observable<Boolean> LIZIZ6;
        Disposable subscribe3;
        LiveData<List<Object>> LIZJ;
        LiveData<C4815i> LIZLLL;
        LiveData<C4824t> LIZIZ7;
        MutableLiveData<C9605p> mutableLiveData;
        LiveData<Integer> LIZ2;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        this.LJIIZILJ = (TextView) view.findViewById(2131172330);
        this.LIZLLL = (RecyclerView) view.findViewById(2131197478);
        this.f26480LJ = (FrameLayout) view.findViewById(2131197477);
        this.LJFF = (TextView) view.findViewById(2131193880);
        this.LJI = (HSImageView) view.findViewById(2131165351);
        this.LJII = (TextView) view.findViewById(2131172260);
        this.LJIIIIZZ = (TextView) view.findViewById(2131195618);
        this.LJIIIZ = (TextView) view.findViewById(2131193644);
        this.LJIIJ = (TextView) view.findViewById(2131184465);
        this.LJIIJJI = (TextView) view.findViewById(2131172240);
        this.LJIIL = (TextView) view.findViewById(2131172241);
        if (IQV.LIZ("GuestApplyViewModel") == null) {
            return;
        }
        C79046HEa LIZ3 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        Integer num = (Integer) LIZ3.LJJIIZI;
        if (num == null || num.intValue() != 2) {
            C79046HEa.LIZ().LIZIZ(this.LJIJJ);
        }
        this.LIZJ.LIZ(C4824t.class, new C78289Gtf(new GuestApplyDialog$onViewCreated$1(this)));
        this.LIZJ.LIZ(ai$a.class, new C77785GlX(null, null, 3));
        this.LIZJ.LIZ(C4319a.class, new C448853p9());
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && C79242HLo.LJIIJ() == 13) {
            m15652LJ();
        }
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LIZJ);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addOnScrollListener(new C77908GnW(this));
        }
        C5012e LIZIZ8 = LIZIZ();
        if (LIZIZ8 != null && (LIZ2 = LIZIZ8.LIZ()) != null) {
            LIZ2.observe(this, GX9.LIZIZ);
        }
        C5012e LIZIZ9 = LIZIZ();
        if (LIZIZ9 != null && (mutableLiveData = LIZIZ9.LJIIIIZZ) != null) {
            mutableLiveData.observe(this, new C77910GnY(this));
        }
        C5012e LIZIZ10 = LIZIZ();
        if (LIZIZ10 != null && (LIZIZ7 = LIZIZ10.LIZIZ()) != null) {
            LIZIZ7.observe(this, new C77916Gne(this));
        }
        C5012e LIZIZ11 = LIZIZ();
        if (LIZIZ11 != null && (LIZLLL = LIZIZ11.LIZLLL()) != null) {
            LIZLLL.observe(this, new C77595GiT(this));
        }
        C5012e LIZIZ12 = LIZIZ();
        if (LIZIZ12 != null && (LIZJ = LIZIZ12.LIZJ()) != null) {
            LIZJ.observe(this, new C77913Gnb(this));
        }
        C5012e LIZIZ13 = LIZIZ();
        if (LIZIZ13 != null) {
            C5012e.LIZ(LIZIZ13, this.LIZIZ, null, 2, null);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            C4935a LIZ4 = C4935a.LIZJ.LIZ();
            if (LIZ4 != null && (LIZIZ5 = LIZ4.LIZIZ()) != null && (LIZIZ6 = LIZIZ5.LIZIZ()) != null && (subscribe3 = LIZIZ6.subscribe(new C77876Gn0(this))) != null) {
                QB4.LIZ(subscribe3, this.LJIILL);
            }
            C5077a LIZ5 = C5077a.LIZJ.LIZ();
            if (LIZ5 != null && (LIZIZ3 = LIZ5.LIZIZ()) != null && (LIZIZ4 = LIZIZ3.LIZIZ()) != null && (subscribe2 = LIZIZ4.subscribe(new C77877Gn1(this))) != null) {
                QB4.LIZ(subscribe2, this.LJIILL);
            }
            C4441a LIZ6 = C4441a.LIZJ.LIZ();
            if (LIZ6 != null && (LIZIZ = LIZ6.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new C77878Gn2(this))) != null) {
                QB4.LIZ(subscribe, this.LJIILL);
            }
        }
        TextView textView = this.LJIIIZ;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC78199GsD(this));
        }
        m15652LJ();
        if (C78538Gxg.LIZ(this.LIZIZ) && LIZLLL()) {
            TextView textView2 = this.LJIIJ;
            if (textView2 != null) {
                textView2.setBackgroundResource(2130854855);
            }
            TextView textView3 = this.LJIIJ;
            if (textView3 != null) {
                textView3.setClickable(true);
            }
            TextView textView4 = this.LJIIJ;
            if (textView4 != null) {
                textView4.setText(LK5.LIZ(2131585515));
            }
            TextView textView5 = this.LJIIJ;
            if (textView5 != null) {
                textView5.setOnClickListener(new View$OnClickListenerC77693Gk3(this));
            }
        } else {
            TextView textView6 = this.LJIIJ;
            if (textView6 != null) {
                textView6.setBackgroundResource(2130854855);
            }
            TextView textView7 = this.LJIIJ;
            if (textView7 != null) {
                textView7.setClickable(true);
            }
            TextView textView8 = this.LJIIJ;
            if (textView8 != null) {
                textView8.setText(LK5.LIZ(2131584268));
            }
            TextView textView9 = this.LJIIJ;
            if (textView9 != null) {
                textView9.setOnClickListener(new View$OnClickListenerC78006Gp6(this));
            }
        }
        HSImageView hSImageView = this.LJI;
        if (hSImageView != null) {
            hSImageView.setOnClickListener(new View$OnClickListenerC77598GiW(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m14708i(2075);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(2075);
            return view;
        }
        C106862S5w.LIZ(layoutInflater);
        View inflate = layoutInflater.inflate(2131698688, viewGroup);
        MethodCollector.m14707o(2075);
        return inflate;
    }
}
