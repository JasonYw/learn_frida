package com.bytedance.android.live.liveinteract.commontalkroom;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.config.ba$a;
import com.bytedance.android.livesdk.message.model.C8870fj;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.C9627at;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC78986HBs;
import p003X.C106862S5w;
import p003X.C3801313v;
import p003X.C79399HRp;
import p003X.C79400HRq;
import p003X.C80794Hsy;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class CommonTalkRoomGuestWidget extends BaseAdminLinkWidget<LinkPlayerInfo> implements a$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public ba$a LIZJ;
    public AbstractC78986HBs<LinkPlayerInfo> LIZLLL;

    /* renamed from: LJ */
    public C80794Hsy f26305LJ;
    public C79399HRp LJFF = new C79399HRp(this);
    public boolean LJI;

    static {
        Covode.recordClassIndex(26558);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C8870fj c8870fj) {
        if (PatchProxy.proxy(new Object[]{c8870fj}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8870fj);
    }

    @Override // p003X.HHU
    public final void LIZ(InteractConfig interactConfig) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a
    public final boolean LIZ(int i) {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final AbstractC6070q LIZIZ(String str) {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final int LIZJ() {
        return 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699815;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a178";
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CommonTalkRoomGuestWidget() {
        /*
            r2 = this;
            X.HCn r1 = p003X.C79007HCn.LJII()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r2.<init>(r1)
            X.HRp r1 = new X.HRp
            r0 = r2
            r1.<init>(r0)
            r2.LJFF = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.commontalkroom.CommonTalkRoomGuestWidget.<init>():void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final AbstractC78986HBs<LinkPlayerInfo> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (this.LIZLLL == null) {
            Room LJJIIJZLJL = LJJIIJZLJL();
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LIZLLL = new C4806x(LJJIIJZLJL, dataCenter, 8);
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LIZLLL;
        if (abstractC78986HBs != null) {
            return abstractC78986HBs;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.base.ILinkUserInfoCenter<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        LIZ(false);
        C80794Hsy c80794Hsy = this.f26305LJ;
        if (c80794Hsy != null && !PatchProxy.proxy(new Object[0], c80794Hsy, C80794Hsy.LIZ, false, 3).isSupported) {
            c80794Hsy.LJIILJJIL.setVisibility(8);
            AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = c80794Hsy.LJIIZILJ;
            if (abstractC78986HBs != null) {
                abstractC78986HBs.LIZIZ(c80794Hsy.LJIIJJI);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C80794Hsy c80794Hsy;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.findViewById(2131188471);
        Room LJJIIJZLJL = LJJIIJZLJL();
        View view2 = this.contentView;
        if (view2 != null) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.f26305LJ = new C80794Hsy(LJJIIJZLJL, false, (FrameLayout) view2, context, dataCenter, LIZ());
            ba$a ba_a = this.LIZJ;
            if (ba_a != null && (c80794Hsy = this.f26305LJ) != null) {
                c80794Hsy.LIZ(ba_a);
            }
            C80794Hsy c80794Hsy2 = this.f26305LJ;
            if (c80794Hsy2 != null) {
                c80794Hsy2.LJIIJ = this.LJI;
            }
            C80794Hsy c80794Hsy3 = this.f26305LJ;
            if (c80794Hsy3 != null && !PatchProxy.proxy(new Object[0], c80794Hsy3, C80794Hsy.LIZ, false, 2).isSupported) {
                c80794Hsy3.LJIILJJIL.setVisibility(8);
                c80794Hsy3.LIZJ = (RecyclerView) c80794Hsy3.LJIILJJIL.findViewById(2131188471);
                AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = c80794Hsy3.LJIIZILJ;
                if (abstractC78986HBs != null) {
                    abstractC78986HBs.LIZ(c80794Hsy3.LJIIJJI);
                }
            }
            View view3 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            SettingKey<String> settingKey = LiveSettingKeys.LIVE_EQUALROOM_TOP_BG_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            M0Q.LIZ((HSImageView) view3.findViewById(2131179690), settingKey.getValue());
            View view4 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            SettingKey<String> settingKey2 = LiveSettingKeys.LIVE_EQUALROOM_BOTTOM_BG_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            M0Q.LIZ((HSImageView) view4.findViewById(2131178645), settingKey2.getValue());
            View view5 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            SettingKey<String> settingKey3 = LiveSettingKeys.LIVE_EQUALROOM_TOP_BG_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            M0Q.LIZ((HSImageView) view5.findViewById(2131179143), settingKey3.getValue());
            View view6 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            SettingKey<String> settingKey4 = LiveSettingKeys.LIVE_EQUALROOM_TOP_BG_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey4, "");
            M0Q.LIZ((HSImageView) view6.findViewById(2131179480), settingKey4.getValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public final void LIZ(boolean z) {
        this.LJI = z;
        C80794Hsy c80794Hsy = this.f26305LJ;
        if (c80794Hsy != null) {
            c80794Hsy.LJIIJ = z;
        }
    }

    public final void LIZ(ba$a ba_a) {
        if (!PatchProxy.proxy(new Object[]{ba_a}, this, LIZIZ, false, 5).isSupported && ba_a != null) {
            this.LIZJ = ba_a;
            C80794Hsy c80794Hsy = this.f26305LJ;
            if (c80794Hsy != null) {
                c80794Hsy.LIZ(ba_a);
            }
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 3).isSupported || !this.isViewValid) {
            return;
        }
        this.LJFF.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a
    public final void LIZ(C79400HRq c79400HRq) {
        C80794Hsy c80794Hsy;
        String str;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[]{c79400HRq}, this, LIZIZ, false, 4).isSupported && (c80794Hsy = this.f26305LJ) != null && !PatchProxy.proxy(new Object[]{c79400HRq}, c80794Hsy, C80794Hsy.LIZ, false, 6).isSupported) {
            String str2 = null;
            if (c79400HRq != null) {
                str = c79400HRq.LJFF;
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, String.valueOf(c80794Hsy.LJIILIIL.getId()))) {
                StringBuilder sb = new StringBuilder("sei channel id wrong ");
                if (c79400HRq != null) {
                    str2 = c79400HRq.LJFF;
                }
                sb.append(str2);
                sb.append(" room ");
                sb.append(c80794Hsy.LJIILIIL.getId());
                ALogger.m15801d("CommonTalkRoomWindowManager", sb.toString());
                return;
            }
            if (!c80794Hsy.LJII && c80794Hsy.LIZIZ != null) {
                c80794Hsy.LIZ(c79400HRq);
                c80794Hsy.LJII = true;
            }
            c80794Hsy.LJIILJJIL.setVisibility(0);
            if (c79400HRq == null || Lists.isEmpty(c79400HRq.LJI)) {
                return;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = c79400HRq.LJI.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = "";
            }
            boolean[] zArr = new boolean[c79400HRq.LJI.size()];
            int size2 = c79400HRq.LJI.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C9627at c9627at = c79400HRq.LJI.get(i2);
                Intrinsics.checkNotNullExpressionValue(c9627at, "");
                String LIZJ = c9627at.LIZJ();
                LIZJ.toString();
                strArr[i2] = LIZJ;
                zArr[i2] = c9627at.LIZ();
                String LIZJ2 = c9627at.LIZJ();
                Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
                hashMap.put(LIZJ2, Integer.valueOf(c9627at.LIZIZ));
                String LIZJ3 = c9627at.LIZJ();
                Intrinsics.checkNotNullExpressionValue(LIZJ3, "");
                hashMap2.put(LIZJ3, Integer.valueOf(c9627at.LJIILJJIL));
            }
            c80794Hsy.LIZ(strArr, zArr);
            if (!C3801313v.LIZ(hashMap, c80794Hsy.f7375LJ)) {
                c80794Hsy.f7375LJ.clear();
                c80794Hsy.f7375LJ.putAll(hashMap);
                z = true;
            }
            if (!C3801313v.LIZ(hashMap2, c80794Hsy.LJFF)) {
                c80794Hsy.LJFF.clear();
                c80794Hsy.LJFF.putAll(hashMap2);
            } else if (!z) {
                return;
            }
            c80794Hsy.LJIIJJI.LIZ(c80794Hsy.LJIIIIZZ);
        }
    }
}
