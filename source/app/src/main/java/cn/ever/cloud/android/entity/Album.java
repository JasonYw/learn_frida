package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes23.dex */
public final class Album {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long albumId;
    public final Lazy cover$delegate;
    public Long coverLink;
    public String coverMd5;
    public final long createAt;
    public Function2<? super Long, ? super Continuation<? super Asset>, ? extends Object> getCoverClosure;
    public final boolean isDeleted;
    public final String name;
    public final long updateAt;

    static {
        Covode.recordClassIndex(2845);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Album copy$default(Album album, long j, String str, long j2, long j3, boolean z, Long l, String str2, Function2 function2, int i, Object obj) {
        String str3 = str;
        long j4 = j;
        long j5 = j2;
        boolean z2 = z;
        long j6 = j3;
        String str4 = str2;
        Long l2 = l;
        Function2<? super Long, ? super Continuation<? super Asset>, ? extends Object> function22 = function2;
        byte b = z2 ? (byte) 1 : (byte) 0;
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{album, new Long(j4), str3, new Long(j5), new Long(j6), Byte.valueOf(b), l2, str4, function22, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (Album) proxy.result;
        }
        if ((i & 1) != 0) {
            j4 = album.albumId;
        }
        if ((i & 2) != 0) {
            str3 = album.name;
        }
        if ((i & 4) != 0) {
            j5 = album.createAt;
        }
        if ((i & 8) != 0) {
            j6 = album.updateAt;
        }
        if ((i & 16) != 0) {
            z2 = album.isDeleted;
        }
        if ((i & 32) != 0) {
            l2 = album.coverLink;
        }
        if ((i & 64) != 0) {
            str4 = album.coverMd5;
        }
        if ((i & 128) != 0) {
            function22 = album.getCoverClosure;
        }
        Long l3 = l2;
        String str5 = str4;
        long j7 = j6;
        boolean z3 = z2 ? 1 : 0;
        Object[] objArr = z2 ? 1 : 0;
        return album.copy(j4, str3, j5, j7, z3, l3, str5, function22);
    }

    public final long component1() {
        return this.albumId;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.createAt;
    }

    public final long component4() {
        return this.updateAt;
    }

    public final boolean component5() {
        return this.isDeleted;
    }

    public final Long component6() {
        return this.coverLink;
    }

    public final String component7() {
        return this.coverMd5;
    }

    public final Function2<Long, Continuation<? super Asset>, Object> component8() {
        return this.getCoverClosure;
    }

    public final Album copy(long j, String str, long j2, long j3, boolean z, Long l, String str2, Function2<? super Long, ? super Continuation<? super Asset>, ? extends Object> function2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), new Long(j3), Byte.valueOf(z ? (byte) 1 : (byte) 0), l, str2, function2}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (Album) proxy.result;
        }
        C106862S5w.LIZ(str, function2);
        return new Album(j, str, j2, j3, z, l, str2, function2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof Album) {
                Album album = (Album) obj;
                if (this.albumId != album.albumId || !Intrinsics.areEqual(this.name, album.name) || this.createAt != album.createAt || this.updateAt != album.updateAt || this.isDeleted != album.isDeleted || !Intrinsics.areEqual(this.coverLink, album.coverLink) || !Intrinsics.areEqual(this.coverMd5, album.coverMd5) || !Intrinsics.areEqual(this.getCoverClosure, album.getCoverClosure)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Asset getCover() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (Asset) (proxy.isSupported ? proxy.result : this.cover$delegate.mo27335getValue());
    }

    public final int hashCode() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int LIZ = C116971W2r.LIZ(this.albumId) * 31;
        String str = this.name;
        int hashCode = (((((LIZ + (str != null ? str.hashCode() : 0)) * 31) + C116971W2r.LIZ(this.createAt)) * 31) + C116971W2r.LIZ(this.updateAt)) * 31;
        boolean z = this.isDeleted;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (hashCode + i2) * 31;
        Long l = this.coverLink;
        int hashCode2 = (i4 + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.coverMd5;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function2<? super Long, ? super Continuation<? super Asset>, ? extends Object> function2 = this.getCoverClosure;
        if (function2 != null) {
            i = function2.hashCode();
        }
        return hashCode3 + i;
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final Long getCoverLink() {
        return this.coverLink;
    }

    public final String getCoverMd5() {
        return this.coverMd5;
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    public final Function2<Long, Continuation<? super Asset>, Object> getGetCoverClosure() {
        return this.getCoverClosure;
    }

    public final String getName() {
        return this.name;
    }

    public final long getUpdateAt() {
        return this.updateAt;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "Album(albumId=" + this.albumId + ", name='" + this.name + "', updateAt=" + this.updateAt + LoggerUtil.S_RIGHT_TAG;
    }

    public final void setCoverLink(Long l) {
        this.coverLink = l;
    }

    public final void setCoverMd5(String str) {
        this.coverMd5 = str;
    }

    public final void setGetCoverClosure(Function2<? super Long, ? super Continuation<? super Asset>, ? extends Object> function2) {
        if (PatchProxy.proxy(new Object[]{function2}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(function2);
        this.getCoverClosure = function2;
    }

    public Album(long j, String str, long j2, long j3, boolean z, Long l, String str2, Function2<? super Long, ? super Continuation<? super Asset>, ? extends Object> function2) {
        C106862S5w.LIZ(str, function2);
        this.albumId = j;
        this.name = str;
        this.createAt = j2;
        this.updateAt = j3;
        this.isDeleted = z;
        this.coverLink = l;
        this.coverMd5 = str2;
        this.getCoverClosure = function2;
        this.cover$delegate = LazyKt__LazyJVMKt.lazy(new Album$cover$2(this));
    }

    public /* synthetic */ Album(long j, String str, long j2, long j3, boolean z, Long l, String str2, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, j2, j3, z, (i & 32) != 0 ? null : l, (i & 64) == 0 ? str2 : null, function2);
    }
}
