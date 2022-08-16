package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.widget.DialogC9362aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.C65631Buz;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.KLU;
import p003X.KLV;
import p003X.KLZ;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class PreviewGroupPurchaseWidget$onCreate$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewGroupPurchaseWidget this$0;

    static {
        Covode.recordClassIndex(18539);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewGroupPurchaseWidget$onCreate$3(PreviewGroupPurchaseWidget previewGroupPurchaseWidget) {
        super(1);
        this.this$0 = previewGroupPurchaseWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            PreviewStatusInfo LIZ = this.this$0.LJIIJJI().m15893LJ().LIZ();
            int LIZ2 = LIZ.LIZ();
            if (LIZ2 != 0 && LIZ2 != 5) {
                C65631Buz.LIZ(false, null, "icon_conflict", 2, null);
                C88440Kt0.LIZ(view2.getContext().getString(2131586068, LK5.LIZ(2131583884), LIZ.LIZIZ()));
            } else {
                PreviewGroupPurchaseWidget previewGroupPurchaseWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewGroupPurchaseWidget, PreviewGroupPurchaseWidget.LIZ, false, 15).isSupported) {
                    if (previewGroupPurchaseWidget.LIZLLL == null) {
                        Context context = previewGroupPurchaseWidget.context;
                        if (context != null) {
                            previewGroupPurchaseWidget.LIZLLL = new DialogC9362aa((Activity) context);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                        }
                    }
                    DialogC9362aa dialogC9362aa = previewGroupPurchaseWidget.LIZLLL;
                    if (dialogC9362aa != null) {
                        C116971W2r.LIZJ(dialogC9362aa);
                    }
                    ((GroupPurchaseApi) C88306Kqq.LIZ().LIZ(GroupPurchaseApi.class)).getGrouponEntry().subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KLV(previewGroupPurchaseWidget), new KLU(previewGroupPurchaseWidget), KLZ.LIZ);
                }
            }
            PreviewGroupPurchaseWidget previewGroupPurchaseWidget2 = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewGroupPurchaseWidget2, PreviewGroupPurchaseWidget.LIZ, false, 6).isSupported) {
                C4574547f LIZ3 = C4574547f.LIZ();
                HashMap hashMap = new HashMap();
                IUser LIZ4 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                hashMap.put("anchor_id", String.valueOf(LIZ4.getId()));
                hashMap.put("goods_num", String.valueOf(previewGroupPurchaseWidget2.LIZIZ));
                hashMap.put("is_dot_show", previewGroupPurchaseWidget2.LIZLLL());
                LIZ3.LIZ("livesdk_takepage_groupbuy_icon_click", hashMap, new Object[0]);
            }
            this.this$0.m15869LJ();
            PreviewGroupPurchaseWidget previewGroupPurchaseWidget3 = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewGroupPurchaseWidget3, PreviewGroupPurchaseWidget.LIZ, false, 21).isSupported) {
                C87308Kak<HashMap<String, Integer>> c87308Kak = AbstractC80293Hkt.f7206eV;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                HashMap<String, Integer> LIZ5 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                HashMap<String, Integer> hashMap2 = LIZ5;
                String secUid = previewGroupPurchaseWidget3.LIZJ.getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                hashMap2.put(secUid, 2);
            }
        }
        return Unit.INSTANCE;
    }
}
