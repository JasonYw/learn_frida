package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.widget.PreviewMiniAppWidget;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3368e;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.widget.DialogC9362aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC439593aD;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2VQ;
import p003X.C439473a1;
import p003X.C4574547f;
import p003X.C87793KiZ;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PreviewMiniAppWidget$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $curUserId;
    public final /* synthetic */ PreviewMiniAppWidget this$0;

    static {
        Covode.recordClassIndex(18618);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewMiniAppWidget$onCreate$2(PreviewMiniAppWidget previewMiniAppWidget, String str) {
        super(1);
        this.this$0 = previewMiniAppWidget;
        this.$curUserId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            if (this.this$0.LJIIJJI().m15893LJ().LIZ().LIZ() == 1) {
                C88440Kt0.LIZ(2131585707);
                HashMap hashMap = new HashMap();
                String str = this.$curUserId;
                str.toString();
                hashMap.put("anchor_id", str);
                hashMap.put("_param_live_platform", "live");
                hashMap.put("live_status_type", "live_before");
                C4574547f.LIZ().LIZ("livesdk_mp_remind_toast_show", hashMap, new Object[0]);
            } else if (this.this$0.LJIIJJI().m15893LJ().LIZ().LIZ() != 4 && this.this$0.LJIIJJI().m15893LJ().LIZ().LIZ() != 5 && this.this$0.LJIIJJI().m15893LJ().LIZ().LIZ() != 6) {
                final PreviewMiniAppWidget previewMiniAppWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewMiniAppWidget, PreviewMiniAppWidget.LIZ, false, 10).isSupported) {
                    C87793KiZ.LIZIZ.LIZ(false, C2VQ.LIZ(previewMiniAppWidget.LJIIJJI().LIZ().LIZ()), "live_take_page");
                    IService service = ServiceManager.getService(IHostContext.class);
                    Intrinsics.checkNotNullExpressionValue(service, "");
                    if (!((IHostContext) service).isOpSandboxDevMode()) {
                        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MINIAPP_ENTRANCE_PERMISSION;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        Boolean value = settingKey.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "");
                        if (value.booleanValue()) {
                            previewMiniAppWidget.LIZLLL();
                            Context context = previewMiniAppWidget.context;
                            if (context != null) {
                                final FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                                if (previewMiniAppWidget.LJIILIIL == 1) {
                                    Context context2 = previewMiniAppWidget.context;
                                    if (context2 != null) {
                                        final DialogC9362aa dialogC9362aa = new DialogC9362aa((Activity) context2);
                                        C116971W2r.LIZJ(dialogC9362aa);
                                        previewMiniAppWidget.LJIIL = new AbstractC439593aD() { // from class: X.3aB
                                            public static ChangeQuickRedirect LIZ;

                                            static {
                                                Covode.recordClassIndex(18614);
                                            }

                                            @Override // p003X.AbstractC439593aD
                                            public final void LIZIZ() {
                                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                                                    return;
                                                }
                                                C116971W2r.LIZ(dialogC9362aa);
                                                C88440Kt0.LIZ(2131586346);
                                                PreviewMiniAppWidget.this.LIZJ();
                                            }

                                            @Override // p003X.AbstractC439593aD
                                            public final void LIZ() {
                                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                    return;
                                                }
                                                C116971W2r.LIZ(dialogC9362aa);
                                                C3368e c3368e = PreviewMiniAppWidget.this.LJI;
                                                if (c3368e != null && c3368e.LIZIZ) {
                                                    PreviewMiniAppWidget.this.LJFF();
                                                    C439473a1.f942LJ.LIZ(PreviewMiniAppWidget.this.LJI, C2VQ.LIZ(PreviewMiniAppWidget.this.LJIIJJI().LIZ().LIZ())).show(supportFragmentManager, "PreviewMiniAppDialog");
                                                    return;
                                                }
                                                PreviewMiniAppWidget previewMiniAppWidget2 = PreviewMiniAppWidget.this;
                                                Context context3 = PreviewMiniAppWidget.this.context;
                                                Intrinsics.checkNotNullExpressionValue(context3, "");
                                                previewMiniAppWidget2.startActivity(((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).getPreviewOpenFeatureActivity(context3));
                                            }
                                        };
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                                    }
                                } else if (previewMiniAppWidget.LJIILIIL == 0) {
                                    C3368e c3368e = previewMiniAppWidget.LJI;
                                    if (c3368e != null && c3368e.LIZIZ) {
                                        previewMiniAppWidget.LJFF();
                                        C439473a1.f942LJ.LIZ(previewMiniAppWidget.LJI, C2VQ.LIZ(previewMiniAppWidget.LJIIJJI().LIZ().LIZ())).show(supportFragmentManager, "PreviewMiniAppDialog");
                                    } else {
                                        Context context3 = previewMiniAppWidget.context;
                                        Intrinsics.checkNotNullExpressionValue(context3, "");
                                        previewMiniAppWidget.startActivity(((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).getPreviewOpenFeatureActivity(context3));
                                    }
                                } else {
                                    C88440Kt0.LIZ(2131586346);
                                    previewMiniAppWidget.LIZJ();
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                        }
                    }
                    Context context4 = previewMiniAppWidget.context;
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    previewMiniAppWidget.startActivity(((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).getPreviewOpenFeatureActivity(context4));
                }
            } else {
                C88440Kt0.LIZ(view2.getContext().getString(2131586068, LK5.LIZ(2131586303), this.this$0.LJIIJJI().m15893LJ().LIZ().LIZIZ()));
            }
        }
        return Unit.INSTANCE;
    }
}
