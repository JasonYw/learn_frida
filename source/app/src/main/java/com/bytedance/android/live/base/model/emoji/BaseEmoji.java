package com.bytedance.android.live.base.model.emoji;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class BaseEmoji {
    public String description;
    public Drawable drawable;
    public int iconId;
    public boolean isRecommendEmoji;
    public String localFilePath;
    public Type type = Type.SmallEmoji;
    public int position = -1;

    static {
        Covode.recordClassIndex(14019);
    }

    /* loaded from: classes17.dex */
    public enum Type {
        DummyEmoji,
        SmallEmoji,
        DeleteEmoji,
        SelfEmoji;
        
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
            Covode.recordClassIndex(14020);
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
