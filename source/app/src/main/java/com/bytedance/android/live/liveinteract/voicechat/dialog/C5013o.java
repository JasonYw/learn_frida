package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.UserHonor;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4319a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.ae$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.C4335ai;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.C4338am;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.SimplePreApplyViewHolder$bindView$1$1;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.model.C4822q;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.liveinteract.voicechat.dialog.C5013o;
import com.bytedance.android.live.liveinteract.voicechat.dialog.C5014p;
import com.bytedance.android.live.profit.fansclub.AbstractC5267o;
import com.bytedance.android.live.profit.fansclub.C5256c;
import com.bytedance.android.live.profit.fansclub.C5265k;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6303g;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.interfaces.DraweeController;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.drakeet.multitype.C35036d;
import p003X.AbstractC413392Xt;
import p003X.AbstractC81336I4c;
import p003X.C106862S5w;
import p003X.C134798c0f;
import p003X.C2JE;
import p003X.C30K;
import p003X.C439993ar;
import p003X.C448703ou;
import p003X.C448843p8;
import p003X.C448853p9;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.IQV;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.dialog.o */
/* loaded from: classes12.dex */
public final class C5013o extends C9078n {
    public static ChangeQuickRedirect LIZ;
    public static final C448703ou LJIILIIL = new C448703ou((byte) 0);
    public Room LIZIZ;
    public C5923dp LIZJ;
    public C5014p LIZLLL;
    public RecyclerView LJFF;
    public FrameLayout LJI;
    public TextView LJII;
    public HSImageView LJIIIIZZ;
    public TextView LJIIIZ;
    public TextView LJIIJ;
    public View LJIIJJI;
    public TextView LJIIL;
    public TextView LJIILL;
    public boolean LJIILLIIL;
    public HashMap LJIJ;
    public final CompositeDisposable LJIILJJIL = new CompositeDisposable();

    /* renamed from: LJ */
    public final C35036d f26482LJ = new C35036d();
    public final C30K<Integer> LJIIZILJ = new C30K<Integer>() { // from class: X.3ov
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(31090);
        }

        @Override // p003X.C30K
        public final /* synthetic */ void onChanged(Integer num) {
            Integer num2 = num;
            if (!PatchProxy.proxy(new Object[]{num2}, this, LIZ, false, 1).isSupported && num2 != null) {
                if (num2.intValue() == 0) {
                    TextView textView = C5013o.this.LJIIL;
                    if (textView != null) {
                        textView.setText(LK5.LIZ(2131584062));
                    }
                    C5013o.this.LIZ((C9605p) null);
                } else if (num2.intValue() == 1) {
                    TextView textView2 = C5013o.this.LJIIL;
                    if (textView2 == null) {
                        return;
                    }
                    textView2.setText(LK5.LIZ(2131581961));
                } else if (num2.intValue() != 2) {
                } else {
                    C5013o.this.dismiss();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(31088);
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIJ == null) {
            this.LJIJ = new HashMap();
        }
        View view = (View) this.LJIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && (hashMap = this.LJIJ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDestroy();
        C79046HEa.LIZ().LIZ((C30K) this.LJIIZILJ);
        this.LJIILJJIL.dispose();
    }

    public final void LIZ(Context context) {
        FragmentManager fragmentManager;
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        if (!LJIILIIL() && !this.LJIILLIIL) {
            this.LJIILLIIL = true;
            FragmentActivity LIZIZ = C439993ar.LIZIZ(context);
            if (LIZIZ != null) {
                fragmentManager = LIZIZ.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            show(fragmentManager, "RadioGuestApplyDialog");
        }
    }

    @Override // p003X.C88402KsO, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Dialog) proxy.result;
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.3p1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31093);
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                InputMethodManager inputMethodManager;
                if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C5013o c5013o = C5013o.this;
                if (!PatchProxy.proxy(new Object[0], c5013o, C5013o.LIZ, false, 5).isSupported) {
                    Dialog dialog = c5013o.getDialog();
                    Context context = c5013o.getContext();
                    if (dialog != null && context != null) {
                        Dialog dialog2 = c5013o.getDialog();
                        Intrinsics.checkNotNullExpressionValue(dialog2, "");
                        View currentFocus = dialog2.getCurrentFocus();
                        if (currentFocus != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null && inputMethodManager.isActive()) {
                            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                        }
                    }
                }
            }
        });
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 4).isSupported) {
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
        LIZ(C448843p8.LIZIZ);
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC413392Xt<AbstractC6303g> LJJLL;
        AbstractC6303g LIZIZ;
        Observable<C6306l> LIZIZ2;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 2131494978);
        Pair LIZ2 = IQV.LIZ((Function0) RadioGuestApplyDialog$onCreate$1.INSTANCE);
        this.LIZLLL = (C5014p) LIZ2.component1();
        this.LJIILJJIL.add((Disposable) LIZ2.component2());
        C5923dp c5923dp = this.LIZJ;
        if (c5923dp != null && (LJJLL = c5923dp.LJJLL()) != null && (LIZIZ = LJJLL.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new Consumer<C6306l>() { // from class: X.3p4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31092);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C6306l c6306l) {
                C6306l c6306l2 = c6306l;
                if (!PatchProxy.proxy(new Object[]{c6306l2}, this, LIZ, false, 1).isSupported && c6306l2.f26940LJ != 0) {
                    C5013o.this.dismiss();
                }
            }
        })) != null) {
            this.LJIILJJIL.add(subscribe);
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJIILLIIL = false;
        super.onDismiss(dialogInterface);
        C5014p c5014p = this.LIZLLL;
        if (c5014p != null && !PatchProxy.proxy(new Object[0], c5014p, C5014p.LIZ, false, 7).isSupported) {
            c5014p.LJIIIIZZ.clear();
            c5014p.LIZIZ = "";
            c5014p.LJFF.setValue(null);
            c5014p.f26483LJ = true;
            c5014p.LJII.setValue(null);
            c5014p.LJIIIZ = false;
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            LJII.LJJIIJ = 0L;
        }
    }

    public final void LIZ(C9605p c9605p) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{c9605p}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (c9605p == null) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.m23776LJ() && (textView = this.LJIILL) != null) {
                textView.setText(LK5.LIZ(2131584063));
                return;
            }
            return;
        }
        TextView textView2 = this.LJIILL;
        if (textView2 != null) {
            textView2.setText(C134798c0f.LIZ(c9605p, ""));
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<List<Object>> mutableLiveData;
        MutableLiveData<C4822q> mutableLiveData2;
        MutableLiveData<C9605p> mutableLiveData3;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        this.LJIILL = (TextView) view.findViewById(2131172330);
        this.LJFF = (RecyclerView) view.findViewById(2131197478);
        this.LJI = (FrameLayout) view.findViewById(2131197477);
        this.LJII = (TextView) view.findViewById(2131193880);
        this.LJIIIIZZ = (HSImageView) view.findViewById(2131165351);
        this.LJIIIZ = (TextView) view.findViewById(2131172260);
        this.LJIIJ = (TextView) view.findViewById(2131195618);
        this.LJIIJJI = view.findViewById(2131197481);
        View view2 = this.LJIIJJI;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.LJIIL = (TextView) view.findViewById(2131193644);
        C79046HEa LIZ2 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        Integer num = (Integer) LIZ2.LJJIIZI;
        if (num == null || num.intValue() != 2) {
            C79046HEa.LIZ().LIZIZ(this.LJIIZILJ);
        }
        this.f26482LJ.LIZ(C4822q.class, new AbstractC81336I4c<C4822q, C4338am>() { // from class: X.3ab
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(26031);
            }

            @Override // p003X.AbstractC81336I4c
            public final /* synthetic */ C4338am LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return (C4338am) proxy.result;
                }
                C106862S5w.LIZ(layoutInflater, viewGroup);
                View LIZ3 = C116971W2r.LIZ(layoutInflater, 2131699481, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                return new C4338am(LIZ3);
            }

            @Override // p003X.AbstractC81336I4c
            public final /* synthetic */ void LIZ(C4338am c4338am, C4822q c4822q) {
                User user;
                String valueOf;
                C5265k LIZ3;
                final C5256c c5256c;
                ImageModel LIZIZ;
                ImageModel LJIIJ;
                final C4338am c4338am2 = c4338am;
                C4822q c4822q2 = c4822q;
                if (!PatchProxy.proxy(new Object[]{c4338am2, c4822q2}, this, LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(c4338am2, c4822q2);
                    int LIZLLL = LIZLLL(c4338am2);
                    if (!PatchProxy.proxy(new Object[]{c4822q2, Integer.valueOf(LIZLLL)}, c4338am2, C4338am.LIZ, false, 1).isSupported && c4822q2 != null && (user = c4822q2.LIZ) != null) {
                        M0Q.LIZIZ((ImageView) c4338am2.LIZJ, user.getAvatarThumb());
                        TextView textView = c4338am2.LIZIZ;
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        if (LIZLLL >= 99) {
                            valueOf = "99+";
                        } else {
                            valueOf = String.valueOf(LIZLLL);
                        }
                        textView.setText(valueOf);
                        TextView textView2 = c4338am2.LIZLLL;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setText(user.getNickName());
                        c4338am2.LIZ(user);
                        if (!PatchProxy.proxy(new Object[]{user}, c4338am2, C4338am.LIZ, false, 3).isSupported) {
                            UserHonor mo25553getUserHonor = user.mo25553getUserHonor();
                            if (mo25553getUserHonor != null && (LJIIJ = mo25553getUserHonor.LJIIJ()) != null) {
                                HSImageView hSImageView = c4338am2.LJFF;
                                Intrinsics.checkNotNullExpressionValue(hSImageView, "");
                                hSImageView.setVisibility(0);
                                M0Q.LIZ((ImageView) c4338am2.LJFF, LJIIJ);
                            } else {
                                HSImageView hSImageView2 = c4338am2.LJFF;
                                Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
                                hSImageView2.setVisibility(8);
                            }
                        }
                        if (!PatchProxy.proxy(new Object[]{user}, c4338am2, C4338am.LIZ, false, 4).isSupported) {
                            AbstractC5267o LIZJ = C458444Ba.LIZJ();
                            if (LIZJ != null && (LIZ3 = LIZJ.LIZ(user)) != null && (c5256c = LIZ3.LIZIZ) != null && (LIZIZ = c5256c.LIZIZ()) != null) {
                                LinearLayout linearLayout = c4338am2.LJI;
                                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                                linearLayout.setVisibility(0);
                                M0Q.LIZ(c4338am2.LJI, LIZIZ, C101486Pxw.LIZ(LK5.LJIIJ()), new AbstractC91424M0c() { // from class: X.38x
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(26108);
                                    }

                                    @Override // p003X.AbstractC91424M0c
                                    public final void LIZ(Exception exc) {
                                    }

                                    @Override // p003X.AbstractC91424M0c
                                    public final void LIZ(Bitmap bitmap) {
                                        float f;
                                        DisplayMetrics displayMetrics;
                                        if (PatchProxy.proxy(new Object[]{bitmap}, this, LIZ, false, 1).isSupported || bitmap == null) {
                                            return;
                                        }
                                        Resources LIZ4 = LK5.LIZ();
                                        if (LIZ4 != null && (displayMetrics = LIZ4.getDisplayMetrics()) != null) {
                                            f = displayMetrics.density / 3.0f;
                                        } else {
                                            f = 1.0f;
                                        }
                                        LK5.LIZ(C4338am.this.LJI, M0Q.LIZ(bitmap, f));
                                        TextView textView3 = C4338am.this.LJII;
                                        Intrinsics.checkNotNullExpressionValue(textView3, "");
                                        textView3.setText(c5256c.LIZIZ);
                                    }
                                });
                            } else {
                                LinearLayout linearLayout2 = c4338am2.LJI;
                                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                                linearLayout2.setVisibility(8);
                            }
                        }
                        c4338am2.itemView.setOnClickListener(C414192aL.LIZ(0L, new SimplePreApplyViewHolder$bindView$1$1(user), 1, null));
                        TextView textView3 = c4338am2.f26280LJ;
                        if (textView3 != null) {
                            textView3.setText(IQA.LIZ(LK5.LJIIJ(), c4822q2.LIZIZ * 1000, c4822q2.f26425LJ * 1000));
                        }
                    }
                }
            }
        });
        this.f26482LJ.LIZ(ae$a.class, new AbstractC81336I4c<ae$a, C4335ai>() { // from class: X.3p7
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(26027);
            }

            @Override // p003X.AbstractC81336I4c
            public final /* synthetic */ C4335ai LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return (C4335ai) proxy.result;
                }
                C106862S5w.LIZ(layoutInflater, viewGroup);
                View LIZ3 = C116971W2r.LIZ(layoutInflater, 2131699574, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                return new C4335ai(LIZ3);
            }

            @Override // p003X.AbstractC81336I4c
            public final /* synthetic */ void LIZ(C4335ai c4335ai, ae$a ae_a) {
                Object mo27335getValue;
                Object mo27335getValue2;
                C4335ai c4335ai2 = c4335ai;
                if (!PatchProxy.proxy(new Object[]{c4335ai2, ae_a}, this, LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(c4335ai2, ae_a);
                    if (!PatchProxy.proxy(new Object[0], c4335ai2, C4335ai.LIZ, false, 3).isSupported) {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c4335ai2, C4335ai.LIZ, false, 1);
                        if (proxy.isSupported) {
                            mo27335getValue = proxy.result;
                        } else {
                            mo27335getValue = c4335ai2.LIZIZ.mo27335getValue();
                        }
                        ((TextView) mo27335getValue).setText(2131559405);
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c4335ai2, C4335ai.LIZ, false, 2);
                        if (proxy2.isSupported) {
                            mo27335getValue2 = proxy2.result;
                        } else {
                            mo27335getValue2 = c4335ai2.LIZJ.mo27335getValue();
                        }
                        ((TextView) mo27335getValue2).setText(2131589377);
                    }
                }
            }
        });
        this.f26482LJ.LIZ(C4319a.class, new C448853p9());
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f26482LJ);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: X.3oz
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(31094);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                    C5014p c5014p;
                    if (PatchProxy.proxy(new Object[]{recyclerView2, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(recyclerView2);
                    C5013o c5013o = C5013o.this;
                    if (!PatchProxy.proxy(new Object[]{recyclerView2, Integer.valueOf(i)}, c5013o, C5013o.LIZ, false, 9).isSupported && i == 0) {
                        RecyclerView.LayoutManager mo25799getLayoutManager = recyclerView2.mo25799getLayoutManager();
                        if (mo25799getLayoutManager != null) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mo25799getLayoutManager;
                            if (linearLayoutManager.findLastVisibleItemPosition() >= linearLayoutManager.getItemCount() - 1 && (c5014p = c5013o.LIZLLL) != null) {
                                c5014p.LIZ(c5013o.LIZIZ, false);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    }
                    super.onScrollStateChanged(recyclerView2, i);
                }
            });
        }
        C5014p c5014p = this.LIZLLL;
        if (c5014p != null && (mutableLiveData3 = c5014p.LJFF) != null) {
            mutableLiveData3.observe(this, new Observer<C9605p>() { // from class: X.3ow
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(31095);
                }

                @Override // androidx.lifecycle.Observer
                public final /* synthetic */ void onChanged(C9605p c9605p) {
                    C9605p c9605p2 = c9605p;
                    if (!PatchProxy.proxy(new Object[]{c9605p2}, this, LIZ, false, 1).isSupported) {
                        C5013o.this.LIZ(c9605p2);
                    }
                }
            });
        }
        C5014p c5014p2 = this.LIZLLL;
        if (c5014p2 != null && (mutableLiveData2 = c5014p2.LJI) != null) {
            mutableLiveData2.observe(this, new Observer<C4822q>() { // from class: X.3ox
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(31096);
                }

                @Override // androidx.lifecycle.Observer
                public final /* synthetic */ void onChanged(C4822q c4822q) {
                    ImageModel imageModel;
                    DraweeController draweeController;
                    C4822q c4822q2 = c4822q;
                    if (!PatchProxy.proxy(new Object[]{c4822q2}, this, LIZ, false, 1).isSupported) {
                        if (c4822q2 != null) {
                            C5013o c5013o = C5013o.this;
                            if (!PatchProxy.proxy(new Object[]{c4822q2}, c5013o, C5013o.LIZ, false, 8).isSupported) {
                                View view3 = c5013o.LJIIJJI;
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                }
                                String str = null;
                                User user = c4822q2.LIZ;
                                if (user != null) {
                                    imageModel = user.getAvatarThumb();
                                } else {
                                    imageModel = null;
                                }
                                PipelineDraweeControllerBuilder autoPlayAnimations = Fresco.newDraweeControllerBuilder().setFirstAvailableImageRequests(M0Q.LIZJ(imageModel)).setAutoPlayAnimations(false);
                                HSImageView hSImageView = c5013o.LJIIIIZZ;
                                if (hSImageView != null) {
                                    draweeController = hSImageView.getController();
                                } else {
                                    draweeController = null;
                                }
                                AbstractDraweeController mo27965build = autoPlayAnimations.mo27967setOldController(draweeController).mo27965build();
                                HSImageView hSImageView2 = c5013o.LJIIIIZZ;
                                if (hSImageView2 != null) {
                                    hSImageView2.setController(mo27965build);
                                }
                                TextView textView = c5013o.LJIIIZ;
                                if (textView != null) {
                                    User user2 = c4822q2.LIZ;
                                    if (user2 != null) {
                                        str = user2.getNickName();
                                    }
                                    textView.setText(str);
                                }
                                C79046HEa LIZ3 = C79046HEa.LIZ();
                                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                                boolean LIZLLL = LIZ3.LIZLLL();
                                String str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                                if (LIZLLL) {
                                    int i = c4822q2.LIZJ;
                                    TextView textView2 = c5013o.LJII;
                                    if (textView2 != null) {
                                        if (i >= 100) {
                                            str2 = "99+";
                                        } else if (i != 0) {
                                            str2 = String.valueOf(i);
                                        }
                                        textView2.setText(str2);
                                    }
                                    TextView textView3 = c5013o.LJIIJ;
                                    if (textView3 != null) {
                                        textView3.setVisibility(0);
                                    }
                                    TextView textView4 = c5013o.LJIIJ;
                                    if (textView4 != null) {
                                        textView4.setText(IQA.LIZ(LK5.LJIIJ(), c4822q2.LIZIZ * 1000, c4822q2.f26425LJ * 1000));
                                        return;
                                    }
                                    return;
                                }
                                TextView textView5 = c5013o.LJII;
                                if (textView5 != null) {
                                    textView5.setText(str2);
                                }
                                TextView textView6 = c5013o.LJIIJ;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        View view4 = C5013o.this.LJIIJJI;
                        if (view4 == null) {
                            return;
                        }
                        view4.setVisibility(8);
                    }
                }
            });
        }
        C5014p c5014p3 = this.LIZLLL;
        if (c5014p3 != null && (mutableLiveData = c5014p3.LJII) != null) {
            mutableLiveData.observe(this, new Observer<List<Object>>() { // from class: X.3oy
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(31097);
                }

                @Override // androidx.lifecycle.Observer
                public final /* synthetic */ void onChanged(List<Object> list) {
                    List<Object> list2 = list;
                    if (!PatchProxy.proxy(new Object[]{list2}, this, LIZ, false, 1).isSupported) {
                        if (list2 != null) {
                            if (list2.isEmpty()) {
                                FrameLayout frameLayout = C5013o.this.LJI;
                                if (frameLayout != null) {
                                    frameLayout.setVisibility(0);
                                }
                            } else {
                                FrameLayout frameLayout2 = C5013o.this.LJI;
                                if (frameLayout2 != null) {
                                    frameLayout2.setVisibility(8);
                                }
                                RecyclerView recyclerView2 = C5013o.this.LJFF;
                                if (recyclerView2 != null) {
                                    recyclerView2.setVisibility(0);
                                }
                            }
                            C5013o.this.f26482LJ.LIZJ(list2);
                            C5013o.this.f26482LJ.notifyDataSetChanged();
                            return;
                        }
                        FrameLayout frameLayout3 = C5013o.this.LJI;
                        if (frameLayout3 != null) {
                            frameLayout3.setVisibility(0);
                        }
                        RecyclerView recyclerView3 = C5013o.this.LJFF;
                        if (recyclerView3 != null) {
                            recyclerView3.setVisibility(4);
                        }
                    }
                }
            });
        }
        C5014p c5014p4 = this.LIZLLL;
        if (c5014p4 != null) {
            c5014p4.LIZ(this.LIZIZ, true);
        }
        TextView textView = this.LJIIL;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: X.3p0
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(31098);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    if (PatchProxy.proxy(new Object[]{view3}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C79046HEa LIZ3 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    Integer num2 = (Integer) LIZ3.LJJIIZI;
                    if (num2 != null && num2.intValue() == 0) {
                        C5014p c5014p5 = C5013o.this.LIZLLL;
                        if (c5014p5 != null) {
                            Intrinsics.checkNotNullExpressionValue(view3, "");
                            Context context = view3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            Room room = C5013o.this.LIZIZ;
                            if (!PatchProxy.proxy(new Object[]{context, room}, c5014p5, C5014p.LIZ, false, 2).isSupported) {
                                C106862S5w.LIZ(context);
                                if (room != null) {
                                    C80517HoV.LIZ().LIZ(new C4825a(context, 8, OperateType.PRE_APPLY, 2, room, 0L, null, null, 224), new H6C(room, c5014p5, context));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C5014p c5014p6 = C5013o.this.LIZLLL;
                    if (c5014p6 == null) {
                        return;
                    }
                    Room room2 = C5013o.this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{room2}, c5014p6, C5014p.LIZ, false, 5).isSupported || room2 == null) {
                        return;
                    }
                    c5014p6.LJIIIIZZ.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).prepareApplyCancel(room2.getRoomId()).compose(C100839PnV.LIZJ()).subscribe(C448783p2.LIZIZ, C448793p3.LIZIZ));
                }
            });
        }
        HSImageView hSImageView = this.LJIIIIZZ;
        if (hSImageView != null) {
            hSImageView.setOnClickListener(C2JE.LIZIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m14708i(2078);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(2078);
            return view;
        }
        C106862S5w.LIZ(layoutInflater);
        View inflate = layoutInflater.inflate(2131698892, viewGroup);
        MethodCollector.m14707o(2078);
        return inflate;
    }
}
