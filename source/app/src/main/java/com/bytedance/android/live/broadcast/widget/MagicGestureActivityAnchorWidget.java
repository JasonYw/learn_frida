package com.bytedance.android.live.broadcast.widget;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.C5990av;
import com.bytedance.android.livesdk.message.model.C8880fs;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C86676KDm;
import p003X.C87010KQi;
import p003X.IOJ;
import p003X.KDU;
import p003X.KDV;

/* loaded from: classes3.dex */
public final class MagicGestureActivityAnchorWidget extends LiveRecyclableWidget implements Observer<KVData>, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public IMessageManager LIZIZ;
    public Sticker LIZJ;
    public C8880fs LIZLLL;

    /* renamed from: LJ */
    public final CompositeDisposable f25974LJ = new CompositeDisposable();
    public final AbstractC5436a LJFF;

    static {
        Covode.recordClassIndex(18361);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void LIZ() {
        Sticker sticker;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (sticker = this.LIZJ) != null) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(C86676KDm.LIZJ, sticker);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        IMessageManager iMessageManager = this.LIZIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(MessageType.MAGIC_GESTURE_ACTIVITY_MESSAGE.LIZ(), this);
        }
        this.f25974LJ.dispose();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.removeObserver(this);
        }
    }

    public MagicGestureActivityAnchorWidget(AbstractC5436a abstractC5436a) {
        C106862S5w.LIZ(abstractC5436a);
        this.LJFF = abstractC5436a;
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 3).isSupported && iMessage != null && (iMessage instanceof C8880fs)) {
            LIZ((C8880fs) iMessage);
        }
    }

    public final void onEvent(C5990av c5990av) {
        if (PatchProxy.proxy(new Object[]{c5990av}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C8880fs c8880fs = new C8880fs();
        c8880fs.LIZ = c5990av.LIZIZ;
        c8880fs.LIZJ = c5990av.LIZLLL;
        c8880fs.LIZIZ = c5990av.LIZJ;
        c8880fs.f27903LJ = c5990av.LJFF;
        c8880fs.LIZLLL = c5990av.f26840LJ;
        LIZ(c8880fs);
    }

    private final JSONObject LIZ(String str) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C8880fs c8880fs = this.LIZLLL;
            if (c8880fs != null) {
                str2 = c8880fs.LIZIZ;
            } else {
                str2 = null;
            }
            if (StringsKt__StringsJVMKt.equals$default(str2, jSONObject.optString("effect_id"), false, 2, null)) {
                if (jSONObject.optInt("status") == 1) {
                    return LIZ(jSONObject);
                }
                if (jSONObject.optInt("status") == 0) {
                    return LIZIZ(jSONObject);
                }
            }
        } catch (Exception e) {
            ALogger.m15800e("MagicGestureActivityAnchorWidget", "createMagicSJson: " + e);
        }
        return null;
    }

    private final JSONObject LIZIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", 0);
            jSONObject2.put("effect_id", jSONObject.optString("effect_id"));
            jSONObject2.put("anchor_id", ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
            return jSONObject2;
        } catch (Exception e) {
            ALogger.m15800e("MagicGestureActivityAnchorWidget", "createMagicStopJson: " + e);
            return null;
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        JSONObject LIZ2;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 8).isSupported && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey()) && Intrinsics.areEqual(kVData2.getKey(), "cmd_magic_gesture_active") && (str = (String) kVData2.getData()) != null && (LIZ2 = LIZ(str)) != null && !PatchProxy.proxy(new Object[]{LIZ2}, this, LIZ, false, 10).isSupported && this.LJFF != null) {
            ALogger.m15800e("MagicGestureActivityAnchorWidget", "sendMagicDataToAudience addSeiField jsonObject: " + LIZ2);
            int LIZ3 = this.LJFF.LIZ("magic_gesture_activity_sei", LIZ2, 1, false, false);
            ALogger.m15800e("MagicGestureActivityAnchorWidget", "sendMagicDataToAudience log: " + LIZ3);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        DataCenter dataCenter = this.dataCenter;
        IMessageManager iMessageManager = null;
        if (dataCenter != null) {
            iMessageManager = (IMessageManager) dataCenter.get("data_message_manager", (String) null);
        }
        this.LIZIZ = iMessageManager;
        IMessageManager iMessageManager2 = this.LIZIZ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.MAGIC_GESTURE_ACTIVITY_MESSAGE.LIZ(), this);
        }
        this.f25974LJ.add(C87010KQi.LIZ().LIZ(C5990av.class).subscribe(new IOJ(this)));
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.observe("cmd_magic_gesture_active", this);
        }
    }

    private final JSONObject LIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", 1);
            C8880fs c8880fs = this.LIZLLL;
            if (c8880fs != null) {
                if (!TextUtils.isEmpty(c8880fs.LIZLLL)) {
                    jSONObject2.put("action_type", c8880fs.LIZJ);
                    jSONObject2.put("action_schema", c8880fs.LIZLLL);
                }
            } else {
                jSONObject2.put("action_type", jSONObject.optInt("action_type"));
                jSONObject2.put("action_schema", jSONObject.optString("action_schema"));
            }
            jSONObject2.put("point_x", jSONObject.optJSONArray("clip_position").get(0));
            jSONObject2.put("point_y", jSONObject.optJSONArray("clip_position").get(1));
            jSONObject2.put("radius", jSONObject.optInt("clip_radius"));
            jSONObject2.put("effect_id", jSONObject.optString("effect_id"));
            jSONObject2.put("anchor_id", ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
            return jSONObject2;
        } catch (Exception e) {
            ALogger.m15800e("MagicGestureActivityAnchorWidget", "createMagicStartJson: " + e);
            return null;
        }
    }

    private final void LIZ(C8880fs c8880fs) {
        if (PatchProxy.proxy(new Object[]{c8880fs}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZLLL = c8880fs;
        if (c8880fs.LIZ == 1) {
            KDU kdu = KDU.LIZIZ;
            String str = c8880fs.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(str, "");
            kdu.LIZ(str, new KDV(this));
            return;
        }
        LIZ();
    }

    public final void LIZ(Sticker sticker) {
        if (PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZJ = sticker;
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(C86676KDm.LIZJ, sticker);
    }
}
