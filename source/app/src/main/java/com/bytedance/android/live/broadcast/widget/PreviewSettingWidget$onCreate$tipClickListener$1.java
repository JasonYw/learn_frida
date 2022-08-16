package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C422102n6;
import p003X.C436493Op;
import p003X.C4574547f;
import p003X.C87308Kak;

/* loaded from: classes12.dex */
public final class PreviewSettingWidget$onCreate$tipClickListener$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSettingWidget this$0;

    static {
        Covode.recordClassIndex(18675);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSettingWidget$onCreate$tipClickListener$1(PreviewSettingWidget previewSettingWidget) {
        super(0);
        this.this$0 = previewSettingWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        int i;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PreviewSettingWidget previewSettingWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewSettingWidget, PreviewSettingWidget.LIZ, false, 26).isSupported) {
                if (previewSettingWidget.LIZJ == 1 && UIUtils.isViewVisible(previewSettingWidget.LIZJ())) {
                    i = 1;
                } else {
                    i = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_page", "live_take_page");
                hashMap.put("is_open", String.valueOf(i));
                C4574547f.LIZ().LIZ("click_live_setting", hashMap, new Object[0]);
            }
            if (this.this$0.context instanceof FragmentActivity) {
                C4574547f LIZ = C4574547f.LIZ();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("request_page", "live_start");
                hashMap2.put("live_type", C422102n6.LIZIZ(C422102n6.LIZ()));
                LIZ.LIZ("livesdk_anchor_liveplay_setting_click", hashMap2, new Object[0]);
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZLLIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ2 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.booleanValue()) {
                    IUser LIZ3 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    if (!LIZ3.isEnableShowCommerceSale()) {
                        C4574547f LIZ4 = C4574547f.LIZ();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("request_page", "live_start");
                        hashMap3.put("live_status_type", "live_before");
                        C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLZIIL;
                        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                        Boolean LIZ5 = c87308Kak2.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                        if (LIZ5.booleanValue()) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        hashMap3.put("to_status", str);
                        hashMap3.put("live_type", C422102n6.LIZIZ(C422102n6.LIZ()));
                        hashMap3.put("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
                        LIZ4.LIZ("livesdk_live_record_status_show", hashMap3, new Object[0]);
                    }
                }
                Context context = this.this$0.context;
                if (context != null) {
                    new C436493Op().show(((FragmentActivity) context).getSupportFragmentManager(), "PreLiveSettingDialog");
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            int i2 = this.this$0.LIZLLL;
            if (i2 != 0) {
                if (i2 == 1) {
                    C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.f7265p;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                    c87308Kak3.LIZ(Boolean.FALSE);
                }
            } else {
                C87308Kak<Boolean> c87308Kak4 = AbstractC80293Hkt.f7262m;
                Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
                c87308Kak4.LIZ(Boolean.FALSE);
            }
            PreviewSettingWidget previewSettingWidget2 = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewSettingWidget2, PreviewSettingWidget.LIZ, false, 15).isSupported) {
                UIUtils.setViewVisibility(previewSettingWidget2.LIZIZ(), 8);
                if (previewSettingWidget2.m15862LJ()) {
                    C87308Kak<Boolean> c87308Kak5 = AbstractC80293Hkt.f7266q;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak5, "");
                    c87308Kak5.LIZ(Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
