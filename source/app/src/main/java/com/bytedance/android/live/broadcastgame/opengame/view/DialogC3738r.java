package com.bytedance.android.live.broadcastgame.opengame.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.opengame.network.MiniGameIntroCardApi;
import com.bytedance.android.live.broadcastgame.opengame.p292b.C3483a;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.livesdk.widget.AbstractDialogC9364c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p1594ss.android.ugc.aweme.teen.api.constant.DialogType;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC87952Kl8;
import p003X.C106862S5w;
import p003X.C116968W2o;
import p003X.C17D;
import p003X.C403021xQ;
import p003X.C419062iC;
import p003X.C596569go;
import p003X.C87010KQi;
import p003X.C87171KWn;
import p003X.C87549Ked;
import p003X.C87890Kk8;
import p003X.C87977KlX;
import p003X.C87986Klg;
import p003X.C87989Klj;
import p003X.C88306Kqq;
import p003X.LK1;
import p003X.QB4;
import p003X.View$OnClickListenerC88001Klv;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.r */
/* loaded from: classes5.dex */
public class DialogC3738r extends AbstractDialogC9364c {
    public static ChangeQuickRedirect LIZJ;
    public final /* synthetic */ C87549Ked LIZ;
    public final AbstractC87952Kl8 LIZLLL;

    /* renamed from: LJ */
    public C3735o f26098LJ;
    public final C3682x LJFF;
    public final boolean LJI;

    static {
        Covode.recordClassIndex(21221);
    }

    public static int LIZIZ(boolean z) {
        return z ? 2130856655 : 2130856654;
    }

    public static int LIZJ(boolean z) {
        return z ? 2130856281 : 2130856333;
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9364c
    public int LIZ() {
        return 2131700074;
    }

    public final void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZJ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LIZ.LIZ(disposable);
    }

    public void LIZIZ() {
        RecyclerView recyclerView;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 8).isSupported && (recyclerView = (RecyclerView) findViewById(2131168649)) != null) {
            this.f26098LJ = LIZ(this, LIZ(this, false, false, 1, null));
            recyclerView.setAdapter(this.f26098LJ);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new C87989Klj((int) C419062iC.LIZ(recyclerView.getContext(), 26.0f)));
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9364c, p003X.LB5, p003X.LN4, androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 15).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{this}, null, LIZJ, true, 17).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZJ, true, 16).isSupported) {
                super.dismiss();
            }
            C403021xQ.LIZIZ.LIZ(this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 18).isSupported) {
            this.LIZ.LIZ();
        }
    }

    @Override // p003X.LN4, android.app.Dialog
    public void onStart() {
        C3384q LIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 2).isSupported) {
            return;
        }
        super.onStart();
        if (this.LJI && (LIZ = this.LJFF.LJIIIIZZ.LIZ()) != null && C87171KWn.LIZ(LIZ)) {
            Disposable subscribe = ((MiniGameIntroCardApi) C88306Kqq.LIZ().LIZ(MiniGameIntroCardApi.class)).getMiniGameIntroCardStatus(this.LJFF.LJIIIIZZ.LJII, this.LJFF.LJIIIIZZ()).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C87986Klg(this), C17D.LIZ);
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9364c, p003X.LB5, android.app.Dialog
    public void show() {
        RecyclerView.Adapter adapter;
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 7).isSupported && !PatchProxy.proxy(new Object[0], this, LIZJ, false, 11).isSupported) {
            boolean z = this.LJFF.LJIIIIZZ.LJFF;
            RecyclerView recyclerView = (RecyclerView) findViewById(2131168649);
            if (recyclerView != null) {
                adapter = recyclerView.mo25798getAdapter();
            } else {
                adapter = null;
            }
            if (!(adapter instanceof C3735o)) {
                adapter = null;
            }
            C3735o c3735o = (C3735o) adapter;
            if (c3735o != null) {
                Iterator<T> it = c3735o.LIZLLL.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    C3736p c3736p = (C3736p) next;
                    if (c3736p.LIZIZ == 9) {
                        if (z) {
                            str = "取消投屏";
                        } else {
                            str = "投屏";
                        }
                        c3736p.LIZ(str);
                        c3736p.LIZLLL = LIZJ(z);
                        c3735o.notifyItemChanged(i);
                    } else {
                        i = i2;
                    }
                }
            }
        }
        Observable LIZ = C87010KQi.LIZ().LIZ(C3483a.class);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ(C87890Kk8.LIZ(QB4.LIZIZ(LIZ), new OPPluginMoreDialog$show$1(this)));
        if (!PatchProxy.proxy(new Object[]{this}, null, LIZJ, true, 6).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZJ, true, 5).isSupported) {
                if (!PatchProxy.proxy(new Object[]{this}, null, LIZJ, true, 4).isSupported) {
                    super.show();
                }
                if (this instanceof BottomSheetDialog) {
                    C596569go.LIZ(this, DialogType.BOTTOM_SHEET);
                } else {
                    C596569go.LIZ(this, null);
                }
            }
            C116968W2o.LIZ(this);
        }
    }

    public final void LIZ(boolean z) {
        RecyclerView.Adapter adapter;
        String str;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 10).isSupported) {
            return;
        }
        this.LJFF.LJIIIIZZ.LIZLLL = z;
        if (isShowing()) {
            RecyclerView recyclerView = (RecyclerView) findViewById(2131168649);
            if (recyclerView != null) {
                adapter = recyclerView.mo25798getAdapter();
            } else {
                adapter = null;
            }
            if (!(adapter instanceof C3735o)) {
                adapter = null;
            }
            C3735o c3735o = (C3735o) adapter;
            if (c3735o != null) {
                for (Object obj : c3735o.LIZLLL) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    C3736p c3736p = (C3736p) obj;
                    if (c3736p.LIZIZ == 2) {
                        if (z) {
                            str = "取消常用";
                        } else {
                            str = "设为常用";
                        }
                        c3736p.LIZ(str);
                        c3736p.LIZLLL = LIZIZ(z);
                        c3735o.notifyItemChanged(i);
                        return;
                    }
                    i = i2;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9364c, p003X.LN4, androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZJ, false, 1).isSupported) {
            return;
        }
        super.onCreate(bundle);
        LIZIZ();
        TextView textView = (TextView) findViewById(2131174281);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        LK1.LIZJ(textView);
        ((TextView) findViewById(2131174281)).setOnClickListener(new View$OnClickListenerC88001Klv(this));
        TextView textView2 = (TextView) findViewById(2131165259);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setText(this.LJFF.LJIIIIZZ.LIZ(this.LJI));
        Object obj = this.LJFF.LJIIIIZZ.LJIIIZ.get("OPEN_APP_ICON_URL");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        DraweeView draweeView = (DraweeView) findViewById(2131167533);
        Intrinsics.checkNotNullExpressionValue(draweeView, "");
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) draweeView.getHierarchy();
        ((SimpleDraweeView) findViewById(2131167533)).setActualImageResource(2131629078);
        genericDraweeHierarchy.setPlaceholderImage(2131629078);
        genericDraweeHierarchy.setFailureImage(2131629078);
        DraweeView draweeView2 = (DraweeView) findViewById(2131167533);
        Intrinsics.checkNotNullExpressionValue(draweeView2, "");
        draweeView2.setHierarchy(genericDraweeHierarchy);
        if (str.length() > 0) {
            DraweeView draweeView3 = (DraweeView) findViewById(2131167533);
            Intrinsics.checkNotNullExpressionValue(draweeView3, "");
            draweeView3.setController(Fresco.newDraweeControllerBuilder().setAutoPlayAnimations(true).mo27962setUri(Uri.parse(str)).mo27965build());
        }
    }

    public C3735o LIZ(DialogC3738r dialogC3738r, List<C3736p> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogC3738r, list}, this, LIZJ, false, 9);
        if (proxy.isSupported) {
            return (C3735o) proxy.result;
        }
        C106862S5w.LIZ(dialogC3738r, list);
        return new C3735o(this, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0101, code lost:
        if (r0 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.bytedance.android.live.broadcastgame.opengame.view.C3736p> LIZ(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.view.DialogC3738r.LIZ(boolean, boolean):java.util.List");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3738r(Context context, C3682x c3682x, boolean z, boolean z2) {
        super(context, z2);
        AbstractC87952Kl8 c87977KlX;
        C106862S5w.LIZ(context, c3682x);
        this.LIZ = new C87549Ked();
        this.LJFF = c3682x;
        this.LJI = z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 14);
        if (proxy.isSupported) {
            c87977KlX = (AbstractC87952Kl8) proxy.result;
        } else {
            c87977KlX = new C87977KlX(this);
        }
        this.LIZLLL = c87977KlX;
    }

    public /* synthetic */ DialogC3738r(Context context, C3682x c3682x, boolean z, boolean z2, int i) {
        this(context, c3682x, z, false);
    }

    public static /* synthetic */ List LIZ(DialogC3738r dialogC3738r, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogC3738r, Byte.valueOf(b), (byte) 0, Integer.valueOf(i), null}, null, LIZJ, true, 13);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return dialogC3738r.LIZ(z, z2);
    }
}
