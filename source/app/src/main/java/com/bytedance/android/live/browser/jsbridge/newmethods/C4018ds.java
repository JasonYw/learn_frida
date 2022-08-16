package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.google.gson.annotations.SerializedName;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C101072PrG;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.ds */
/* loaded from: classes8.dex */
public final class C4018ds extends AbstractC13049f<C4019a, Unit> {
    public static ChangeQuickRedirect LIZ;
    public OnMessageListener LIZIZ;
    public final DataCenter LIZJ;

    /* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.ds$a */
    /* loaded from: classes8.dex */
    public static final class C4019a {
        @SerializedName("type_list")
        public List<String> LIZ;

        static {
            Covode.recordClassIndex(22795);
        }
    }

    static {
        Covode.recordClassIndex(22794);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
        IMessageManager iMessageManager;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (iMessageManager = (IMessageManager) this.LIZJ.get("data_message_manager", (String) null)) != null) {
            iMessageManager.removeMessageListener(this.LIZIZ);
        }
    }

    public C4018ds(DataCenter dataCenter) {
        C106862S5w.LIZ(dataCenter);
        this.LIZJ = dataCenter;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(C4019a c4019a, C13052h c13052h) {
        C4019a c4019a2 = c4019a;
        if (!PatchProxy.proxy(new Object[]{c4019a2, c13052h}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c4019a2, c13052h);
            IMessageManager iMessageManager = (IMessageManager) this.LIZJ.get("data_message_manager", (String) null);
            List<String> list = c4019a2.LIZ;
            if (list != null) {
                for (String str : list) {
                    String m25086C = C0002O.m25086C("Webcast", str);
                    MessageType[] valuesCustom = MessageType.valuesCustom();
                    int length = valuesCustom.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            MessageType messageType = valuesCustom[i];
                            if (Intrinsics.areEqual(messageType.wsMethod, m25086C)) {
                                LIZ(iMessageManager, messageType, c13052h);
                                break;
                            } else if (Intrinsics.areEqual(messageType.wsMethod, str)) {
                                LIZ(iMessageManager, messageType, c13052h);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    private final void LIZ(IMessageManager iMessageManager, MessageType messageType, C13052h c13052h) {
        if (PatchProxy.proxy(new Object[]{iMessageManager, messageType, c13052h}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new C101072PrG(c13052h);
        }
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(messageType.LIZ(), this.LIZIZ);
        }
    }
}
