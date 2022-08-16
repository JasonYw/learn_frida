package com.bytedance.android.live.misc;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public class LiveService$$livesdkshell {
    public static final String[] CLASS_FQ_NAMES = {"com.bytedance.android.livesdk.chatroom.AudienceSDKServiceImpl", "com.bytedance.android.livesdk.chatroom.broadcast.BroadcastSDKServiceImpl"};
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32512);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        for (String str : CLASS_FQ_NAMES) {
            try {
                C116971W2r.LIZ(str).newInstance();
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
