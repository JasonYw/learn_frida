package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.p039a.AbstractC0679a;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.persistence.table.DbAlbum;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import p003X.AbstractC522106k0;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AlbumRepositoryImpl implements AbstractC0679a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: db */
    public final SdkDatabase f21049db;

    static {
        Covode.recordClassIndex(2918);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0679a
    public final List<Album> getAlbums() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<DbAlbum> albums = this.f21049db.albumDao().getAlbums();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(albums, 10));
        for (DbAlbum dbAlbum : albums) {
            arrayList.add(AlbumRepositoryImplKt.toAlbum(dbAlbum));
        }
        return arrayList;
    }

    public AlbumRepositoryImpl(SdkDatabase sdkDatabase) {
        C106862S5w.LIZ(sdkDatabase);
        this.f21049db = sdkDatabase;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0679a
    public final Album getAlbum(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Album) proxy.result;
        }
        DbAlbum album = this.f21049db.albumDao().getAlbum(j);
        if (album != null) {
            return AlbumRepositoryImplKt.toAlbum(album);
        }
        return null;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0679a
    public final void upsertAlbums(List<Album> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        AbstractC522106k0 albumDao = this.f21049db.albumDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Album album : list) {
            arrayList.add(AlbumRepositoryImplKt.toDbAlbum(album));
        }
        albumDao.upsertAlbums(arrayList);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0679a
    public final int updateAlbumCover(long j, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.f21049db.albumDao().updateAlbumCover(j, j2);
    }
}
