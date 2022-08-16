package cn.ever.cloud.android.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum SourceFrom {
    TUCHONG(2),
    EVERPHOTO(3),
    JIANYING(5),
    HERO(7),
    CARTERNET(8),
    TTVIDEO(9),
    DOUYIN(12);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long sourceFromLong;

    public static SourceFrom valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SourceFrom) (proxy.isSupported ? proxy.result : Enum.valueOf(SourceFrom.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SourceFrom[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SourceFrom[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    public final long getSourceFromLong() {
        return this.sourceFromLong;
    }

    static {
        Covode.recordClassIndex(2837);
    }

    SourceFrom(long j) {
        this.sourceFromLong = j;
    }
}
