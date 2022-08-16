package bytekn.foundation.encryption;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C149622fsL;

/* loaded from: classes20.dex */
public enum Padding {
    NoPadding,
    PKCS7Padding,
    ANSIX923Padding,
    ISO10126Padding,
    ZeroPadding;
    
    public static final C149622fsL Companion = new C149622fsL((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2623);
    }

    public static Padding valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (Padding) (proxy.isSupported ? proxy.result : Enum.valueOf(Padding.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Padding[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (Padding[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
