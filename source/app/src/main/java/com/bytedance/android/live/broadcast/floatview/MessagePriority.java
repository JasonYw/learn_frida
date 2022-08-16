package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes5.dex */
public enum MessagePriority {
    MESSAGE_7(700, "7"),
    MESSAGE_6(600, "6"),
    MESSAGE_5(500, "5"),
    MESSAGE_4(SDKMonitor.SDK_VERSION, "4"),
    MESSAGE_3(300, PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START),
    MESSAGE_2(200, "2"),
    MESSAGE_1(100, "1"),
    NONE(0, "0");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String logStr;
    public final int priority;

    public static MessagePriority valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (MessagePriority) (proxy.isSupported ? proxy.result : Enum.valueOf(MessagePriority.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static MessagePriority[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (MessagePriority[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(15873);
    }

    MessagePriority(int i, String str) {
        this.priority = i;
        this.logStr = str;
    }
}
