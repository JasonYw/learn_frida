package cn.ever.cloud.network_impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.client.Header;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes23.dex */
public final class CommonHeader {
    public static final CommonHeader INSTANCE = new CommonHeader();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3274);
    }

    public final List<Header> get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Header[]{new Header("X-TT-ENV", ""), new Header("x-ttnet-enabled", "1")});
    }
}
