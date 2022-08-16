package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC100890PoK;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C4574547f;

/* loaded from: classes5.dex */
public final class PreviewBroadcastHelpWidget$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewBroadcastHelpWidget this$0;

    static {
        Covode.recordClassIndex(18445);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBroadcastHelpWidget$onCreate$1(PreviewBroadcastHelpWidget previewBroadcastHelpWidget) {
        super(1);
        this.this$0 = previewBroadcastHelpWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        LiveMode liveMode;
        Object LIZ;
        String str;
        String builder;
        C2WC<C2918r> m15891LJ;
        C2918r LIZ2;
        C2WC<LiveMode> LIZ3;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            PreviewBroadcastHelpWidget previewBroadcastHelpWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewBroadcastHelpWidget, PreviewBroadcastHelpWidget.LIZ, false, 4).isSupported) {
                IBrowserService iBrowserService = (IBrowserService) ServiceManager.getService(IBrowserService.class);
                Context context = previewBroadcastHelpWidget.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], previewBroadcastHelpWidget, PreviewBroadcastHelpWidget.LIZ, false, 5);
                String str2 = "0";
                if (proxy.isSupported) {
                    builder = (String) proxy.result;
                } else {
                    C3180k LJIIJJI = previewBroadcastHelpWidget.LJIIJJI();
                    if (LJIIJJI != null && (LIZ3 = LJIIJJI.LIZ()) != null) {
                        liveMode = LIZ3.LIZ();
                    } else {
                        liveMode = null;
                    }
                    if (liveMode == LiveMode.SCREEN_RECORD) {
                        builder = "https://webcast.amemv.com/falcon/webcast_douyin/page/live_help/index.html";
                    } else {
                        SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_OBS_HELPER_URL;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        Uri.Builder buildUpon = Uri.parse(settingKey.getValue()).buildUpon();
                        SettingKey<String> settingKey2 = LiveConfigSettingKeys.LIVE_PARTNER_DOWNLOAD_URI;
                        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                        String value = settingKey2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "");
                        String str3 = value;
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], previewBroadcastHelpWidget, PreviewBroadcastHelpWidget.LIZ, false, 1);
                        if (proxy2.isSupported) {
                            LIZ = proxy2.result;
                        } else {
                            LIZ = previewBroadcastHelpWidget.LIZ(previewBroadcastHelpWidget.LIZJ, previewBroadcastHelpWidget, PreviewBroadcastHelpWidget.LIZIZ[0]);
                        }
                        C3199v c3199v = (C3199v) LIZ;
                        if (c3199v != null && (m15891LJ = c3199v.m15891LJ()) != null && (LIZ2 = m15891LJ.LIZ()) != null) {
                            long j = LIZ2.LIZ;
                            if (!TextUtils.isEmpty(LIZ2.LIZLLL)) {
                                str3 = LIZ2.LIZLLL;
                                Intrinsics.checkNotNullExpressionValue(str3, "");
                            }
                            if (j == 1) {
                                str = "1";
                                buildUpon.appendQueryParameter("download_url", str3);
                                buildUpon.appendQueryParameter("is_white_list", str);
                                buildUpon.appendQueryParameter("has_nav_bar", str2);
                                builder = buildUpon.toString();
                                Intrinsics.checkNotNullExpressionValue(builder, "");
                            }
                        }
                        str = str2;
                        buildUpon.appendQueryParameter("download_url", str3);
                        buildUpon.appendQueryParameter("is_white_list", str);
                        buildUpon.appendQueryParameter("has_nav_bar", str2);
                        builder = buildUpon.toString();
                        Intrinsics.checkNotNullExpressionValue(builder, "");
                    }
                }
                AbstractC100890PoK buildFullScreenWebPage = iBrowserService.buildFullScreenWebPage(context, builder);
                buildFullScreenWebPage.LIZ(true);
                buildFullScreenWebPage.LIZ();
                C4574547f LIZ4 = C4574547f.LIZ();
                C8668v c8668v = new C8668v();
                c8668v.LIZIZ("live");
                c8668v.LJFF("click");
                c8668v.LIZ("live_take_page");
                LIZ4.LIZ("game_take_guide", c8668v);
                HashMap hashMap = new HashMap();
                if (((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
                    str2 = String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
                }
                hashMap.put("anchor_id", str2);
                C4574547f.LIZ().LIZ("livesdk_live_take_help_click", hashMap, new Object[0]);
            }
        }
        return Unit.INSTANCE;
    }
}
