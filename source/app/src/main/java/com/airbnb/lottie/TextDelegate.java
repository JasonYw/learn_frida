package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class TextDelegate {
    public final LottieAnimationView animationView;
    public boolean cacheText;
    public final LottieDrawable drawable;
    public final Map<String, String> stringMap;

    static {
        Covode.recordClassIndex(3971);
    }

    private String getText(String str) {
        return str;
    }

    private void invalidate() {
        LottieAnimationView lottieAnimationView = this.animationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.drawable;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public void invalidateAllText() {
        this.stringMap.clear();
        invalidate();
    }

    public TextDelegate() {
        this.stringMap = new HashMap();
        this.cacheText = true;
        this.animationView = null;
        this.drawable = null;
    }

    public void setCacheText(boolean z) {
        this.cacheText = z;
    }

    public void invalidateText(String str) {
        this.stringMap.remove(str);
        invalidate();
    }

    public TextDelegate(LottieAnimationView lottieAnimationView) {
        this.stringMap = new HashMap();
        this.cacheText = true;
        this.animationView = lottieAnimationView;
        this.drawable = null;
    }

    public final String getTextInternal(String str) {
        if (this.cacheText && this.stringMap.containsKey(str)) {
            return this.stringMap.get(str);
        }
        getText(str);
        if (this.cacheText) {
            this.stringMap.put(str, str);
        }
        return str;
    }

    public TextDelegate(LottieDrawable lottieDrawable) {
        this.stringMap = new HashMap();
        this.cacheText = true;
        this.drawable = lottieDrawable;
        this.animationView = null;
    }

    public void setText(String str, String str2) {
        this.stringMap.put(str, str2);
        invalidate();
    }
}
