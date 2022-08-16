package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.app.Dialog;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.livehostapi.business.depend.livead.p486a.C5816w;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C1KL;
import p003X.C87838KjI;
import p003X.C87850KjU;
import p003X.C88440Kt0;
import p003X.DialogInterface$OnClickListenerC87856Kja;
import p003X.DialogInterface$OnClickListenerC87857Kjb;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$showChooserCoverDialog$1$onPicked$1 extends Lambda implements Function1<C5816w, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87850KjU this$0;

    static {
        Covode.recordClassIndex(21576);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$showChooserCoverDialog$1$onPicked$1(C87850KjU c87850KjU) {
        super(1);
        this.this$0 = c87850KjU;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [X.L1g, T] */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.L1g, T] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5816w c5816w) {
        List<String> list;
        String str;
        String str2;
        String str3;
        PageDataV2.ReviewStatus reviewStatus;
        C87838KjI c87838KjI;
        PageDataV2 pageDataV2;
        C87838KjI c87838KjI2;
        PageDataV2 pageDataV22;
        C87838KjI c87838KjI3;
        List<String> list2;
        C5816w c5816w2 = c5816w;
        if (!PatchProxy.proxy(new Object[]{c5816w2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5816w2);
            C116971W2r.LIZ(this.this$0.LIZIZ.LIZIZ());
            C2852e c2852e = c5816w2.LIZ;
            if (c2852e != null && (list = c2852e.LIZIZ) != null && (!list.isEmpty())) {
                C2852e c2852e2 = c5816w2.LIZ;
                C3561g c3561g = null;
                if (c2852e2 != null) {
                    str = c2852e2.LIZ;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C2852e c2852e3 = c5816w2.LIZ;
                    if (c2852e3 != null && (list2 = c2852e3.LIZIZ) != null) {
                        str2 = list2.get(0);
                    } else {
                        str2 = null;
                    }
                    MiniAppCardSettingDialog miniAppCardSettingDialog = this.this$0.LIZIZ;
                    if (!PatchProxy.proxy(new Object[0], miniAppCardSettingDialog, MiniAppCardSettingDialog.LIZ, false, 18).isSupported) {
                        if (miniAppCardSettingDialog.LIZJ()) {
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.element = null;
                            v$a v_a = new v$a(miniAppCardSettingDialog);
                            v_a.LIZ(miniAppCardSettingDialog.getString(2131586718));
                            v_a.LIZIZ(miniAppCardSettingDialog.getString(2131586699));
                            objectRef.element = v_a.LIZIZ(0, miniAppCardSettingDialog.getString(2131584606), new DialogInterface$OnClickListenerC87856Kja(objectRef)).LIZLLL();
                            Dialog dialog = (Dialog) objectRef.element;
                            if (dialog != null) {
                                C116971W2r.LIZJ(dialog);
                            }
                        } else {
                            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                            objectRef2.element = null;
                            v$a v_a2 = new v$a(miniAppCardSettingDialog);
                            v_a2.LIZ(miniAppCardSettingDialog.getString(2131586718));
                            v_a2.LIZIZ(miniAppCardSettingDialog.getString(2131586700));
                            objectRef2.element = v_a2.LIZIZ(0, miniAppCardSettingDialog.getString(2131584606), new DialogInterface$OnClickListenerC87857Kjb(objectRef2)).LIZLLL();
                            Dialog dialog2 = (Dialog) objectRef2.element;
                            if (dialog2 != null) {
                                C116971W2r.LIZJ(dialog2);
                            }
                        }
                    }
                    C3796c LIZ = this.this$0.LIZIZ.LIZ();
                    C87838KjI c87838KjI4 = new C87838KjI(null, null, 3);
                    C2852e c2852e4 = c5816w2.LIZ;
                    if (c2852e4 != null) {
                        str3 = c2852e4.LIZ;
                    } else {
                        str3 = null;
                    }
                    c87838KjI4.LIZ(str3, str2);
                    if (!PatchProxy.proxy(new Object[]{c87838KjI4}, LIZ, C3796c.LIZ, false, 21).isSupported) {
                        C106862S5w.LIZ(c87838KjI4);
                        PageDataV2 pageDataV23 = LIZ.LIZJ;
                        if (pageDataV23 != null) {
                            reviewStatus = pageDataV23.LJII;
                        } else {
                            reviewStatus = null;
                        }
                        if (reviewStatus == PageDataV2.ReviewStatus.REVIEW_PASS && (pageDataV2 = LIZ.LIZJ) != null && (c87838KjI2 = pageDataV2.LIZJ) != null && (pageDataV22 = LIZ.LIZJ) != null && (c87838KjI3 = pageDataV22.LJIIIIZZ) != null) {
                            c87838KjI3.LIZ(c87838KjI2);
                        }
                        LIZ.LIZ((C1KL<C1KL<PageDataV2.ReviewStatus>>) LIZ.LJII(), (C1KL<PageDataV2.ReviewStatus>) PageDataV2.ReviewStatus.REVIEW_UNKNOWN);
                        PageDataV2 pageDataV24 = LIZ.LIZJ;
                        if (pageDataV24 != null) {
                            pageDataV24.LIZ(PageDataV2.ReviewStatus.REVIEW_UNKNOWN);
                        }
                        PageDataV2 pageDataV25 = LIZ.LIZJ;
                        if (pageDataV25 != null && (c87838KjI = pageDataV25.LIZJ) != null) {
                            c87838KjI.LIZ(c87838KjI4);
                        }
                        C1KL<String> LIZIZ = LIZ.LIZIZ();
                        Pair<C8733af, C3561g> pair = LIZ.f26110LJ;
                        if (pair != null) {
                            c3561g = pair.getSecond();
                        }
                        LIZ.LIZ((C1KL<C1KL<String>>) LIZIZ, (C1KL<String>) LIZ.LIZ(c3561g, false));
                    }
                }
            }
            C88440Kt0.LIZ(2131586712);
        }
        return Unit.INSTANCE;
    }
}
