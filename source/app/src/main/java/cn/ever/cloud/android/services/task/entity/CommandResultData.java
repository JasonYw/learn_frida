package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.CloudAsset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class CommandResultData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<CloudAsset> asset;
    public final List<AlbumAssetRelation> relations;
    public final List<Album> tags;

    static {
        Covode.recordClassIndex(3081);
    }

    public static /* synthetic */ CommandResultData copy$default(CommandResultData commandResultData, List list, List list2, List list3, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{commandResultData, list, list2, list3, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CommandResultData) proxy.result;
        }
        if ((i & 1) != 0) {
            list = commandResultData.asset;
        }
        if ((i & 2) != 0) {
            list2 = commandResultData.tags;
        }
        if ((i & 4) != 0) {
            list3 = commandResultData.relations;
        }
        return commandResultData.copy(list, list2, list3);
    }

    private Object[] getObjects() {
        return new Object[]{this.asset, this.tags, this.relations};
    }

    public final List<CloudAsset> component1() {
        return this.asset;
    }

    public final List<Album> component2() {
        return this.tags;
    }

    public final List<AlbumAssetRelation> component3() {
        return this.relations;
    }

    public final CommandResultData copy(List<CloudAsset> list, List<Album> list2, List<AlbumAssetRelation> list3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, list2, list3}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (CommandResultData) proxy.result : new CommandResultData(list, list2, list3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommandResultData) {
            return C106862S5w.LIZ(((CommandResultData) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CommandResultData:%s,%s,%s", getObjects());
    }

    public final List<CloudAsset> getAsset() {
        return this.asset;
    }

    public final List<AlbumAssetRelation> getRelations() {
        return this.relations;
    }

    public final List<Album> getTags() {
        return this.tags;
    }

    public CommandResultData(List<CloudAsset> list, List<Album> list2, List<AlbumAssetRelation> list3) {
        this.asset = list;
        this.tags = list2;
        this.relations = list3;
    }
}
