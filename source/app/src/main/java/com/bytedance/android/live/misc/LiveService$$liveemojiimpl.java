package com.bytedance.android.live.misc;

import com.bytedance.android.live.emoji.EmojiService;
import com.bytedance.android.live.emoji.api.IEmojiService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC459134Dr;

/* loaded from: classes17.dex */
public class LiveService$$liveemojiimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32499);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IEmojiService.class, new EmojiService());
        ServiceManager.registerService(AbstractC459134Dr.class, new EmojiService());
    }
}
