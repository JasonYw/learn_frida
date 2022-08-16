package com.bytedance.android.live.base.model.emoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class EmojiUriNode {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final EmojiUriModel emojiUri;
    public final int endIndex;
    public final int startIndex;

    static {
        Covode.recordClassIndex(14022);
    }

    public static /* synthetic */ EmojiUriNode copy$default(EmojiUriNode emojiUriNode, EmojiUriModel emojiUriModel, int i, int i2, int i3, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{emojiUriNode, emojiUriModel, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EmojiUriNode) proxy.result;
        }
        if ((i3 & 1) != 0) {
            emojiUriModel = emojiUriNode.emojiUri;
        }
        if ((i3 & 2) != 0) {
            i = emojiUriNode.startIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = emojiUriNode.endIndex;
        }
        return emojiUriNode.copy(emojiUriModel, i, i2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.emojiUri, Integer.valueOf(this.startIndex), Integer.valueOf(this.endIndex)};
    }

    public final EmojiUriModel component1() {
        return this.emojiUri;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final EmojiUriNode copy(EmojiUriModel emojiUriModel, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{emojiUriModel, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EmojiUriNode) proxy.result;
        }
        C106862S5w.LIZ(emojiUriModel);
        return new EmojiUriNode(emojiUriModel, i, i2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiUriNode) {
            return C106862S5w.LIZ(((EmojiUriNode) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EmojiUriNode:%s,%s,%s", getObjects());
    }

    public final EmojiUriModel getEmojiUri() {
        return this.emojiUri;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public EmojiUriNode(EmojiUriModel emojiUriModel, int i, int i2) {
        C106862S5w.LIZ(emojiUriModel);
        this.emojiUri = emojiUriModel;
        this.startIndex = i;
        this.endIndex = i2;
    }
}
