package com.bytedance.android.live.liveinteract.videotalk.emoji.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class TalkRoomInteractEmoji {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("pass_image")
    public InteractEmojiAnim pathEmoji;
    @SerializedName("to_image")
    public InteractEmojiAnim receiverEmoji;
    @SerializedName("from_image")
    public InteractEmojiAnim senderEmoji;

    static {
        Covode.recordClassIndex(30234);
    }

    public boolean isValid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        InteractEmojiAnim interactEmojiAnim = this.pathEmoji;
        if (interactEmojiAnim == null || !interactEmojiAnim.isValid()) {
            return false;
        }
        return true;
    }
}
