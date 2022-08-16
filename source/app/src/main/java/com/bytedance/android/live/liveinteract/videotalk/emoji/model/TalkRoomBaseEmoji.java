package com.bytedance.android.live.liveinteract.videotalk.emoji.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public class TalkRoomBaseEmoji {
    public transient Type LIZ = Type.NormalEmoji;

    static {
        Covode.recordClassIndex(30229);
    }

    /* loaded from: classes3.dex */
    public enum Type {
        DummyEmoji,
        NormalEmoji;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Type[]) proxy.result;
            }
            return (Type[]) values().clone();
        }

        static {
            Covode.recordClassIndex(30230);
        }

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Type) proxy.result;
            }
            return (Type) Enum.valueOf(Type.class, str);
        }
    }
}
