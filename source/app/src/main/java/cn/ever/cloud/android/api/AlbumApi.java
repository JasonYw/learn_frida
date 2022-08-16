package cn.ever.cloud.android.api;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.AlbumChange;
import cn.ever.cloud.android.entity.Media;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.android.entity.PageParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes23.dex */
public interface AlbumApi {
    static {
        Covode.recordClassIndex(2749);
    }

    Object addAssets(long j, List<Media> list, Continuation<? super List<String>> continuation);

    Object addAssetsPredefineAlbumId(long j, List<Media> list, Continuation<? super List<String>> continuation);

    Object cancelAndRemove(long j, Continuation<? super Boolean> continuation);

    Object create(String str, Continuation<? super Album> continuation);

    Object createPredefineAlbum(long j, Continuation<? super Album> continuation);

    Object delete(long j, Continuation<? super Boolean> continuation);

    Object getAlbumInfo(long j, Continuation<? super Album> continuation);

    Object getAlbums(PageParams pageParams, Continuation<? super PageData<Album>> continuation);

    Flow<AlbumChange> getChange(Long l);

    Object modifyCover(long j, String str, Continuation<? super Boolean> continuation);

    Object removeAssets(long j, List<String> list, Continuation<? super Boolean> continuation);

    Object rename(long j, String str, Continuation<? super Boolean> continuation);

    /* loaded from: classes23.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2750);
        }

        public static /* synthetic */ Flow getChange$default(AlbumApi albumApi, Long l, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumApi, l, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Flow) proxy.result;
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    l = null;
                }
                return albumApi.getChange(l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChange");
        }
    }
}
