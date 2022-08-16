package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: bytekn.foundation.io.file.ContentEncoding */
/* loaded from: classes8.dex */
public enum ContentEncoding {
    Utf8,
    Ascii,
    Base64;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2638);
    }

    public static ContentEncoding valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (ContentEncoding) (proxy.isSupported ? proxy.result : Enum.valueOf(ContentEncoding.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ContentEncoding[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (ContentEncoding[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
