package com.bytedance.android.live.liveinteract.digitavatar;

import android.os.Handler;
import android.os.Looper;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.avframework.livestreamv2.filter.IFilterManager;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC80447HnN;
import p003X.C106862S5w;
import p003X.RunnableC80448HnO;

/* loaded from: classes3.dex */
public final class DigitAvatarMsgController implements MessageCenter.Listener {
    public static ChangeQuickRedirect LIZ;
    public AbstractC80447HnN LIZIZ;
    public AbstractC5436a LIZJ;
    public final Handler LIZLLL = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public enum AvatarStickerType {
        Recognition,
        DigitAvatar;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26586);
        }

        public static AvatarStickerType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (AvatarStickerType) (proxy.isSupported ? proxy.result : Enum.valueOf(AvatarStickerType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AvatarStickerType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (AvatarStickerType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(26585);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 11).isSupported) {
            return;
        }
        ALogger.m15797i("KtvDigitAvatar", "向effect发送可见性指令 visible=true");
        LIZ(8192, 208, 1, (String) null);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        MessageCenter.setListener(this);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        MessageCenter.removeListener(this);
        this.LIZLLL.removeCallbacksAndMessages(null);
    }

    public DigitAvatarMsgController(AbstractC5436a abstractC5436a) {
        this.LIZJ = abstractC5436a;
    }

    public final void LIZ(C4381a c4381a) {
        if (PatchProxy.proxy(new Object[]{c4381a}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4381a);
        LIZ(CollectionsKt__CollectionsJVMKt.listOf(c4381a));
    }

    public final void LIZIZ(File file) {
        if (PatchProxy.proxy(new Object[]{file}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(file);
        LIZ(8192, 205, 0, file.getAbsolutePath());
    }

    public final void LIZ(File file) {
        if (PatchProxy.proxy(new Object[]{file}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(file);
        ALogger.m15797i("KtvDigitAvatar", "send cmd to effect： start recognition");
        new JSONObject().put("picPath", file.getAbsolutePath());
        LIZ(8192, 201, 0, file.getAbsolutePath());
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(8192, 203, 0, str);
    }

    public final void LIZ(List<C4381a> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (C4381a c4381a : list) {
            jSONArray.put(c4381a.LIZIZ);
            jSONArray2.put(c4381a.LIZJ);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playClip", jSONArray);
        jSONObject.put("playMode", jSONArray2);
        ALogger.m15797i("KtvDigitAvatar", "向effect发送动作指令，actionList=" + list);
        LIZ(8192, 204, 0, jSONObject.toString());
    }

    private final void LIZ(int i, int i2, int i3, String str) {
        IFilterManager LJIIJ;
        if (PatchProxy.proxy(new Object[]{8192, Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZ, false, 12).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("向Effect的消息：msgType=0x");
        CharsKt__CharJVMKt.checkRadix(16);
        String num = Integer.toString(8192, 16);
        Intrinsics.checkNotNullExpressionValue(num, "");
        sb.append(num);
        sb.append(", arg1=");
        sb.append(i2);
        sb.append(", arg2=");
        sb.append(i3);
        sb.append(", arg3=");
        sb.append(str);
        ALogger.m15797i("KtvDigitAvatar", sb.toString());
        AbstractC5436a abstractC5436a = this.LIZJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            LJIIJ.sendEffectMsg(8192, i2, i3, str);
        }
    }

    public final void LIZ(int i, int i2, int i3, float f) {
        if (PatchProxy.proxy(new Object[]{0, Integer.valueOf(i2), 0, Float.valueOf(f)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(0);
        jSONArray.put(i2);
        jSONArray.put(0);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(0);
        jSONArray2.put(0);
        jSONArray2.put(0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("position", jSONArray);
        jSONObject.put("orientation", jSONArray2);
        jSONObject.put("scale", Float.valueOf(f));
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        ALogger.m15797i("KtvDigitAvatar", "向effect发送调整相机位置指令 position=[0, " + i2 + ", 0], scale=" + f);
        LIZ(8192, 206, 0, jSONObject2);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZ, false, 13).isSupported && i == 26214) {
            StringBuilder sb = new StringBuilder("收到Effect的消息：msgType=0x");
            CharsKt__CharJVMKt.checkRadix(16);
            String num = Integer.toString(i, 16);
            Intrinsics.checkNotNullExpressionValue(num, "");
            sb.append(num);
            sb.append(", arg1=");
            sb.append(i2);
            sb.append(", arg2=");
            sb.append(i3);
            sb.append(", arg3=");
            sb.append(str);
            ALogger.m15797i("KtvDigitAvatar", sb.toString());
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZ, false, 14).isSupported) {
                this.LIZLLL.post(new RunnableC80448HnO(this, i2, i3, str));
            }
        }
    }
}
