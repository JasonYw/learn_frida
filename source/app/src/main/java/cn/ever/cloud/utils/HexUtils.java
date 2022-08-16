package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public final class HexUtils {
    public static final char[] HEX_DIGITAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3426);
    }

    public static String fromBytes(byte[] bArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte b : bArr) {
                sb.append(HEX_DIGITAL[(b >>> 4) & 15]);
                sb.append(HEX_DIGITAL[b & 15]);
            }
            return sb.toString();
        }
        return "";
    }
}
