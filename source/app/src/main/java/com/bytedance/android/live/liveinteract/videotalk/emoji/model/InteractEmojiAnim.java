package com.bytedance.android.live.liveinteract.videotalk.emoji.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class InteractEmojiAnim {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("duration_ms")
    public long duration;
    @SerializedName("interact_emoji")
    public ImageModel dynamicImage;
    @SerializedName("own_emoji_duration_ms")
    public long extraDuration;
    @SerializedName("own_emoji")
    public ImageModel extraDynamicImage;
    @SerializedName("start")
    public long start;

    static {
        Covode.recordClassIndex(30228);
    }

    public boolean isExtraValid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ImageModel imageModel = this.extraDynamicImage;
        if (imageModel == null || !imageModel.isValid()) {
            return false;
        }
        return true;
    }

    public boolean isValid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ImageModel imageModel = this.dynamicImage;
        if (imageModel == null || !imageModel.isValid()) {
            return false;
        }
        return true;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "InteractEmojiAnim{dynamicImage=" + this.dynamicImage + ", duration=" + this.duration + ", start=" + this.start + '}';
    }
}
