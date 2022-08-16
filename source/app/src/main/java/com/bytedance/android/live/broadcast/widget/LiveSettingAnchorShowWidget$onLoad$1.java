package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdkapi.util.url.UrlBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4574547f;

/* loaded from: classes12.dex */
public final class LiveSettingAnchorShowWidget$onLoad$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveSettingAnchorShowWidget this$0;

    static {
        Covode.recordClassIndex(18351);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSettingAnchorShowWidget$onLoad$1(LiveSettingAnchorShowWidget liveSettingAnchorShowWidget) {
        super(1);
        this.this$0 = liveSettingAnchorShowWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        Object mo27335getValue;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            LiveSettingAnchorShowWidget liveSettingAnchorShowWidget = this.this$0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], liveSettingAnchorShowWidget, LiveSettingAnchorShowWidget.LJFF, false, 2);
            if (proxy.isSupported) {
                mo27335getValue = proxy.result;
            } else {
                mo27335getValue = liveSettingAnchorShowWidget.LJI.mo27335getValue();
            }
            Uri parse = Uri.parse(new UrlBuilder((String) mo27335getValue).build());
            ILiveActionHandler iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class);
            if (iLiveActionHandler != null) {
                iLiveActionHandler.handle(this.this$0.context, parse);
            }
            C4574547f.LIZ().LIZ("livesdk_anchor_programlist_click", MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchor_id", this.this$0.LIZLLL()), TuplesKt.m137to("enter_from", "live_takepage")), new Object[0]);
            this.this$0.LJII.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
