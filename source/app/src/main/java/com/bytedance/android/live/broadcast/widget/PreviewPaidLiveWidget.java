package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C77347GeT;
import p003X.KLC;

@AbstractC445813kF(LIZ = "PAID_LIVE")
/* loaded from: classes5.dex */
public final class PreviewPaidLiveWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public RoomCreateInfo LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final String f25994LJ = "PreviewPaidLiveWidget[" + hashCode() + LoggerUtil.M_RIGHT_TAG;
    public final Lazy LJFF = LIZ(C3199v.class);
    public final Lazy LJI = C77347GeT.LIZ(new PreviewPaidLiveWidget$getCommonLogMap$2(this));

    static {
        Covode.recordClassIndex(18631);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewPaidLiveWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJFF, this, LIZIZ[0]));
    }

    public final Map<String, String> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (Map) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700844;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return this.f25994LJ;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LJIILJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.LJIILJJIL();
        ALogger.m15801d(LIZ(), "do show container");
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        LJIILL();
        LJIIJJI().LIZ(new PreviewPaidLiveWidget$onCreate$1(this));
        View view = this.contentView;
        if (view != null) {
            view.setOnClickListener(new KLC(this));
        }
        LIZIZ().LJIJ().LIZ(new PreviewPaidLiveWidget$onCreate$3(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        r8 = android.net.Uri.parse(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r0 = r8.getQueryParameter(com.meizu.cloud.pushsdk.constants.PushConstants.WEB_URL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r5 = new com.bytedance.android.livesdkapi.util.url.UrlBuilder(r4);
        r5.addParam("enter_from_merge", "direct_shoot");
        r5.addParam("live_type", p003X.C2VQ.LIZ(LJIIJJI().LIZ().LIZ()));
        r0 = r13.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r0 = r0.LJJJJJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        r0 = r0.f8432LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
        r5.addParam("has_sign", java.lang.String.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{r5}, r13, com.bytedance.android.live.broadcast.widget.PreviewPaidLiveWidget.LIZ, false, 4).isSupported != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (LIZIZ().LJJJJL().LIZ().intValue() != 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r5.addParam("break_context", p003X.LK5.LIZ(2131588137));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c3, code lost:
        r6 = LJIIJJI().m15893LJ().LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d6, code lost:
        if (r6.LIZ() == 6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01dc, code lost:
        if (r6.LIZ() == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01de, code lost:
        r5.addParam("break_toast", p003X.LK5.LIZ(2131582406, r6.LIZIZ()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
        r5.addParam("enter_method", "direct_shoot");
        r0 = r13.LIZJ;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r0 = r0.LJJJJJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r0 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r5.addParam("paid_live_create_rights", p003X.C426132tb.LIZ(r0));
        r0 = r13.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
        r0 = r0.LJJJJJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
        if (r0.LIZLLL != true) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
        r5.addParam("replay_right", r4);
        r0 = LIZIZ().LJIIIIZZ().LIZ().LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
        r1 = r0.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
        r5.addParam("paid_live_img", r1);
        r5.addParam("paid_live_title", LIZIZ().LJII().LIZ());
        r0 = r13.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011d, code lost:
        r0 = r0.LJJJJJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        if (r0.f8432LJ != true) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
        r5.addParam("is_show_agreement_page", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
        if (LIZIZ().LJJJJLL().LIZ().longValue() == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0143, code lost:
        r5.addParam("ticket_id", LIZIZ().LJJJJLL().LIZ().longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
        r5.addParam("is_paid_live", LIZIZ().LJJJJL().LIZ().intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
        if (r13.LIZLLL == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0175, code lost:
        r5.addParam("open_paid_live_panel", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017a, code lost:
        r4 = p003X.S5C.LIZ(r8, com.meizu.cloud.pushsdk.constants.PushConstants.WEB_URL).buildUpon().appendQueryParameter(com.meizu.cloud.pushsdk.constants.PushConstants.WEB_URL, r5.build()).build();
        r1 = (com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0196, code lost:
        if (r1 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0198, code lost:
        r1.handle(r13.context, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019d, code lost:
        com.bytedance.android.live.core.log.ALogger.m15801d(LIZ(), "openPaidLivePanel: newSchema=[" + r4 + com.bytedance.unisus.uniservice.logger.LoggerUtil.M_RIGHT_TAG);
        r13.LIZLLL = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ba, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bd, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c0, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f4, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0227, code lost:
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewPaidLiveWidget.LIZJ():void");
    }
}
