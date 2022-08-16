package com.bytedance.android.live.liveinteract.widget.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multianchor.p367e.C4518a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC78050Gpo;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C79169HIt;
import p003X.C79910Hei;

/* loaded from: classes3.dex */
public final class PKLastBattleResultLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;

    static {
        Covode.recordClassIndex(31939);
    }

    public PKLastBattleResultLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public PKLastBattleResultLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void LIZ() {
        String str;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        hashMap.put("pk_id", String.valueOf(LJII.f26249LJ));
        hashMap.put("invitee_list", C79910Hei.LIZIZ.LIZIZ((int) LJII.LJII));
        hashMap.put("channel_id", String.valueOf(LJII.LIZLLL));
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_anchor", str);
        hashMap.put("connection_type", getPKConnectionType());
        C4574547f.LIZ().LIZ("livesdk_pk_result_icon_show", hashMap, Room.class);
    }

    public final String getPKConnectionType() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        C4518a LIZ2;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
        if (iInteractService != null) {
            int linkMode = iInteractService.getLinkMode();
            if (C79169HIt.LIZIZ(linkMode, 4)) {
                String linkConnectionType = iInteractService.getLinkConnectionType();
                Intrinsics.checkNotNullExpressionValue(linkConnectionType, "");
                return linkConnectionType;
            } else if (C79169HIt.LIZIZ(linkMode, 64)) {
                C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ3 != null && (LJIILJJIL = LIZ3.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
                    AbstractC4782v LIZ4 = AbstractC4782v.LJIIL.LIZ();
                    if (LIZ4 == null || (LIZ2 = LIZ4.LIZ()) == null || (str = LIZ2.LJIIIIZZ) == null) {
                        return "";
                    }
                    return str;
                }
                return "anchor";
            }
        }
        return "";
    }

    public final void setBackgroundAlpha(int i) {
        TextView textView;
        Drawable background;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported && (textView = this.LIZIZ) != null && (background = textView.getBackground()) != null) {
            background.setAlpha(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKLastBattleResultLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2106);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131700480, (ViewGroup) this, true);
        this.LIZIZ = (TextView) findViewById(2131192958);
        TextView textView = this.LIZIZ;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.widget.widget.PKLastBattleResultLayout.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(31940);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Room room;
                    String str;
                    String str2;
                    User owner;
                    String secUid;
                    User owner2;
                    C2WC<Room> LIZ2;
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    PKLastBattleResultLayout pKLastBattleResultLayout = PKLastBattleResultLayout.this;
                    if (!PatchProxy.proxy(new Object[0], pKLastBattleResultLayout, PKLastBattleResultLayout.LIZ, false, 4).isSupported) {
                        SettingKey<String> settingKey = LiveSettingKeys.LIVE_LAST_PK_RESULT_DETAILS_LYNX_URL;
                        String str3 = "";
                        Intrinsics.checkNotNullExpressionValue(settingKey, str3);
                        String value = settingKey.getValue();
                        if (value == null) {
                            return;
                        }
                        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                        Long l = null;
                        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
                            room = LIZ2.LIZ();
                        } else {
                            room = null;
                        }
                        AbstractC4774i LIZ4 = AbstractC78050Gpo.LIZ();
                        if (LIZ4 != null) {
                            int LJJIFFI = LIZ4.LJJIFFI();
                            if (C79169HIt.LIZIZ(LJJIFFI, 4)) {
                                str = "0";
                            } else if (C79169HIt.LIZIZ(LJJIFFI, 64)) {
                                str = "1";
                            } else {
                                str = str3;
                            }
                            C9303cy c9303cy = new C9303cy(value);
                            C9303cy LIZJ = c9303cy.LIZJ(PushConstants.WEB_URL);
                            LIZJ.LIZ("pk_type", str);
                            LIZJ.LIZ("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
                            if (room != null) {
                                l = Long.valueOf(room.getId());
                            }
                            LIZJ.LIZ("room_id", String.valueOf(l));
                            if (room == null || (owner2 = room.getOwner()) == null || (str2 = owner2.getIdStr()) == null) {
                                str2 = str3;
                            }
                            LIZJ.LIZ("anchor_id", str2);
                            if (room != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                                str3 = secUid;
                            }
                            LIZJ.LIZ("sec_anchor_id", str3);
                            LIZJ.LIZ("connection_type", pKLastBattleResultLayout.getPKConnectionType());
                            ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(pKLastBattleResultLayout.getContext(), c9303cy.LIZ());
                        }
                    }
                }
            });
            MethodCollector.m14707o(2106);
            return;
        }
        MethodCollector.m14707o(2106);
    }

    public /* synthetic */ PKLastBattleResultLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
