package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.persistence.table.DbAlbum;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AlbumRepositoryImplKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2919);
    }

    public static final DbAlbum toDbAlbum(Album album) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{album}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (DbAlbum) proxy.result;
        }
        C106862S5w.LIZ(album);
        return new DbAlbum(album.getAlbumId(), album.getName(), album.getCreateAt(), album.getUpdateAt(), album.isDeleted(), album.getCoverLink(), album.getCoverMd5());
    }

    public static final Album toAlbum(DbAlbum dbAlbum) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbAlbum}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Album) proxy.result;
        }
        C106862S5w.LIZ(dbAlbum);
        return new Album(dbAlbum.getAlbumId(), dbAlbum.getName(), dbAlbum.getCreateAt(), dbAlbum.getUpdateAt(), dbAlbum.isDeleted(), dbAlbum.getCoverLink(), dbAlbum.getCoverMd5(), new AlbumRepositoryImplKt$toAlbum$1(null));
    }
}
