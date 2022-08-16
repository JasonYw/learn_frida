package com.bytedance.android.live.base.model.emoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class EmojiUriModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String emojiText;
    public final int iconId;
    public final String localFilePath;

    static {
        Covode.recordClassIndex(14021);
    }

    public static /* synthetic */ EmojiUriModel copy$default(EmojiUriModel emojiUriModel, int i, String str, String str2, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{emojiUriModel, Integer.valueOf(i), str, str2, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EmojiUriModel) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = emojiUriModel.iconId;
        }
        if ((i2 & 2) != 0) {
            str = emojiUriModel.localFilePath;
        }
        if ((i2 & 4) != 0) {
            str2 = emojiUriModel.emojiText;
        }
        return emojiUriModel.copy(i, str, str2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.iconId), this.localFilePath, this.emojiText};
    }

    public final int component1() {
        return this.iconId;
    }

    public final String component2() {
        return this.localFilePath;
    }

    public final String component3() {
        return this.emojiText;
    }

    public final EmojiUriModel copy(int i, String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EmojiUriModel) proxy.result;
        }
        C106862S5w.LIZ(str2);
        return new EmojiUriModel(i, str, str2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiUriModel) {
            return C106862S5w.LIZ(((EmojiUriModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EmojiUriModel:%s,%s,%s", getObjects());
    }

    public final String getEmojiText() {
        return this.emojiText;
    }

    public final int getIconId() {
        return this.iconId;
    }

    public final String getLocalFilePath() {
        return this.localFilePath;
    }

    public EmojiUriModel(int i, String str, String str2) {
        C106862S5w.LIZ(str2);
        this.iconId = i;
        this.localFilePath = str;
        this.emojiText = str2;
    }

    public /* synthetic */ EmojiUriModel(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, str2);
    }
}
