package cn.ever.cloud.android.remote;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.network.entity.NPackTag;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NDataMapperKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2946);
    }

    public static final Album toAlbum(NPackTag nPackTag) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nPackTag}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Album) proxy.result;
        }
        C106862S5w.LIZ(nPackTag);
        return new Album(nPackTag.getId(), nPackTag.getDisplayName(), nPackTag.getCreatedAtUtc(), nPackTag.getModifiedTimeUtc(), nPackTag.getDeleted(), nPackTag.getCoverLink(), nPackTag.getCoverMd5(), new NDataMapperKt$toAlbum$1(null));
    }
}
