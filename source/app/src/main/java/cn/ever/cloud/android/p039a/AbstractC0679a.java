package cn.ever.cloud.android.p039a;

import cn.ever.cloud.android.entity.Album;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: cn.ever.cloud.android.a.a */
/* loaded from: classes23.dex */
public interface AbstractC0679a {
    static {
        Covode.recordClassIndex(2743);
    }

    Album getAlbum(long j);

    List<Album> getAlbums();

    int updateAlbumCover(long j, long j2);

    void upsertAlbums(List<Album> list);
}
