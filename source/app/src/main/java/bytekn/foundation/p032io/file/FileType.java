package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: bytekn.foundation.io.file.FileType */
/* loaded from: classes13.dex */
public enum FileType {
    Regular,
    Directory,
    Unknown;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2641);
    }

    public static FileType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (FileType) (proxy.isSupported ? proxy.result : Enum.valueOf(FileType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FileType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (FileType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
