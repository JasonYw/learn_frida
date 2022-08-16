package cn.ever.cloud.android.persistence.table;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DbUploadTaskItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public final Long cloudId;
    public final boolean deleteOnEnd;
    public final Integer errorCode;
    public final String errorMessage;
    public final long groupId;
    public final String groupKey;

    /* renamed from: id */
    public final long f21055id;
    public final String itemKey;
    public final long linkId;
    public final String path;
    public final Integer pauseReason;
    public final boolean predefineAlbumEdit;
    public final int state;
    public final long tagId;
    public final String uri;

    static {
        Covode.recordClassIndex(2944);
    }

    public static /* synthetic */ DbUploadTaskItem copy$default(DbUploadTaskItem dbUploadTaskItem, long j, String str, String str2, String str3, long j2, long j3, String str4, long j4, String str5, int i, Long l, Integer num, String str6, Integer num2, boolean z, boolean z2, int i2, Object obj) {
        String str7 = str4;
        String str8 = str;
        long j5 = j;
        long j6 = j3;
        String str9 = str3;
        String str10 = str2;
        long j7 = j2;
        boolean z3 = z2;
        Integer num3 = num2;
        boolean z4 = z;
        String str11 = str5;
        long j8 = j4;
        Integer num4 = num;
        int i3 = i;
        Long l2 = l;
        String str12 = str6;
        byte b = z4 ? (byte) 1 : (byte) 0;
        byte b2 = z4 ? (byte) 1 : (byte) 0;
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        byte b4 = z3 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbUploadTaskItem, new Long(j5), str8, str10, str9, new Long(j7), new Long(j6), str7, new Long(j8), str11, Integer.valueOf(i3), l2, num4, str12, num3, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbUploadTaskItem) proxy.result;
        }
        if ((i2 & 1) != 0) {
            j5 = dbUploadTaskItem.f21055id;
        }
        if ((i2 & 2) != 0) {
            str8 = dbUploadTaskItem.assetId;
        }
        if ((i2 & 4) != 0) {
            str10 = dbUploadTaskItem.path;
        }
        if ((i2 & 8) != 0) {
            str9 = dbUploadTaskItem.uri;
        }
        if ((i2 & 16) != 0) {
            j7 = dbUploadTaskItem.tagId;
        }
        if ((i2 & 32) != 0) {
            j6 = dbUploadTaskItem.linkId;
        }
        if ((i2 & 64) != 0) {
            str7 = dbUploadTaskItem.itemKey;
        }
        if ((i2 & 128) != 0) {
            j8 = dbUploadTaskItem.groupId;
        }
        if ((i2 & 256) != 0) {
            str11 = dbUploadTaskItem.groupKey;
        }
        if ((i2 & 512) != 0) {
            i3 = dbUploadTaskItem.state;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) != 0) {
            l2 = dbUploadTaskItem.cloudId;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) != 0) {
            num4 = dbUploadTaskItem.errorCode;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_SCROLLED) != 0) {
            str12 = dbUploadTaskItem.errorMessage;
        }
        if ((i2 & 8192) != 0) {
            num3 = dbUploadTaskItem.pauseReason;
        }
        if ((i2 & 16384) != 0) {
            z4 = dbUploadTaskItem.predefineAlbumEdit;
        }
        if ((i2 & 32768) != 0) {
            z3 = dbUploadTaskItem.deleteOnEnd;
        }
        boolean z5 = z4 ? 1 : 0;
        Object[] objArr = z4 ? 1 : 0;
        boolean z6 = z3 ? 1 : 0;
        Object[] objArr2 = z3 ? 1 : 0;
        return dbUploadTaskItem.copy(j5, str8, str10, str9, j7, j6, str7, j8, str11, i3, l2, num4, str12, num3, z5, z6);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.f21055id), this.assetId, this.path, this.uri, Long.valueOf(this.tagId), Long.valueOf(this.linkId), this.itemKey, Long.valueOf(this.groupId), this.groupKey, Integer.valueOf(this.state), this.cloudId, this.errorCode, this.errorMessage, this.pauseReason, Boolean.valueOf(this.predefineAlbumEdit), Boolean.valueOf(this.deleteOnEnd)};
    }

    public final long component1() {
        return this.f21055id;
    }

    public final int component10() {
        return this.state;
    }

    public final Long component11() {
        return this.cloudId;
    }

    public final Integer component12() {
        return this.errorCode;
    }

    public final String component13() {
        return this.errorMessage;
    }

    public final Integer component14() {
        return this.pauseReason;
    }

    public final boolean component15() {
        return this.predefineAlbumEdit;
    }

    public final boolean component16() {
        return this.deleteOnEnd;
    }

    public final String component2() {
        return this.assetId;
    }

    public final String component3() {
        return this.path;
    }

    public final String component4() {
        return this.uri;
    }

    public final long component5() {
        return this.tagId;
    }

    public final long component6() {
        return this.linkId;
    }

    public final String component7() {
        return this.itemKey;
    }

    public final long component8() {
        return this.groupId;
    }

    public final String component9() {
        return this.groupKey;
    }

    public final DbUploadTaskItem copy(long j, String str, String str2, String str3, long j2, long j3, String str4, long j4, String str5, int i, Long l, Integer num, String str6, Integer num2, boolean z, boolean z2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2, str3, new Long(j2), new Long(j3), str4, new Long(j4), str5, Integer.valueOf(i), l, num, str6, num2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DbUploadTaskItem) proxy.result;
        }
        C106862S5w.LIZ(str, str4, str5);
        return new DbUploadTaskItem(j, str, str2, str3, j2, j3, str4, j4, str5, i, l, num, str6, num2, z, z2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DbUploadTaskItem) {
            return C106862S5w.LIZ(((DbUploadTaskItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DbUploadTaskItem:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final Long getCloudId() {
        return this.cloudId;
    }

    public final boolean getDeleteOnEnd() {
        return this.deleteOnEnd;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final long getId() {
        return this.f21055id;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPauseReason() {
        return this.pauseReason;
    }

    public final boolean getPredefineAlbumEdit() {
        return this.predefineAlbumEdit;
    }

    public final int getState() {
        return this.state;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public final String getUri() {
        return this.uri;
    }

    public DbUploadTaskItem(long j, String str, String str2, String str3, long j2, long j3, String str4, long j4, String str5, int i, Long l, Integer num, String str6, Integer num2, boolean z, boolean z2) {
        C106862S5w.LIZ(str, str4, str5);
        this.f21055id = j;
        this.assetId = str;
        this.path = str2;
        this.uri = str3;
        this.tagId = j2;
        this.linkId = j3;
        this.itemKey = str4;
        this.groupId = j4;
        this.groupKey = str5;
        this.state = i;
        this.cloudId = l;
        this.errorCode = num;
        this.errorMessage = str6;
        this.pauseReason = num2;
        this.predefineAlbumEdit = z;
        this.deleteOnEnd = z2;
    }
}
