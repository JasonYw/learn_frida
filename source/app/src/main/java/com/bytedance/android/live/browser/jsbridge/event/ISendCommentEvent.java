package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public interface ISendCommentEvent extends AbstractC3959e {

    /* loaded from: classes12.dex */
    public enum Sender {
        Unknown,
        CommentWidget,
        Lottery,
        VsPlusOne;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(22277);
        }

        public static Sender valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Sender) (proxy.isSupported ? proxy.result : Enum.valueOf(Sender.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Sender[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Sender[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(22276);
    }
}
