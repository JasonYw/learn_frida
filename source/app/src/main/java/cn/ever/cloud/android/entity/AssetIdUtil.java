package cn.ever.cloud.android.entity;

import cn.ever.cloud.utils.error.ClientError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import kotlin.text.StringsKt__StringsKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AssetIdUtil {
    public static final AssetIdUtil INSTANCE = new AssetIdUtil();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes23.dex */
    public static final class AssetId {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: id */
        public final long f21048id;
        public final AssetIdType idType;

        static {
            Covode.recordClassIndex(2853);
        }

        public static /* synthetic */ AssetId copy$default(AssetId assetId, long j, AssetIdType assetIdType, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{assetId, new Long(j), assetIdType, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (AssetId) proxy.result;
            }
            if ((i & 1) != 0) {
                j = assetId.f21048id;
            }
            if ((i & 2) != 0) {
                assetIdType = assetId.idType;
            }
            return assetId.copy(j, assetIdType);
        }

        private Object[] getObjects() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.f21048id), this.idType};
        }

        public final long component1() {
            return this.f21048id;
        }

        public final AssetIdType component2() {
            return this.idType;
        }

        public final AssetId copy(long j, AssetIdType assetIdType) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), assetIdType}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (AssetId) proxy.result;
            }
            C106862S5w.LIZ(assetIdType);
            return new AssetId(j, assetIdType);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof AssetId) {
                return C106862S5w.LIZ(((AssetId) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AssetIdUtil$AssetId:%s,%s", getObjects());
        }

        public final long getId() {
            return this.f21048id;
        }

        public final AssetIdType getIdType() {
            return this.idType;
        }

        public AssetId(long j, AssetIdType assetIdType) {
            C106862S5w.LIZ(assetIdType);
            this.f21048id = j;
            this.idType = assetIdType;
        }
    }

    /* loaded from: classes23.dex */
    public enum AssetIdType {
        LOCAL_ID(0),
        CLOUD_ID(1),
        LINK_ID(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int type;

        public static AssetIdType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (AssetIdType) (proxy.isSupported ? proxy.result : Enum.valueOf(AssetIdType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AssetIdType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (AssetIdType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final int getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(2854);
        }

        AssetIdType(int i) {
            this.type = i;
        }
    }

    static {
        Covode.recordClassIndex(2852);
    }

    private final List<String> split(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
    }

    public final AssetId parseAssetId(String str) {
        AssetIdType assetIdType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (AssetId) proxy.result;
        }
        C106862S5w.LIZ(str);
        List<String> split = split(str);
        if (split.size() >= 2) {
            int parseInt = Integer.parseInt(split.get(0));
            if (parseInt == AssetIdType.LOCAL_ID.getType()) {
                assetIdType = AssetIdType.LOCAL_ID;
            } else if (parseInt == AssetIdType.CLOUD_ID.getType()) {
                assetIdType = AssetIdType.CLOUD_ID;
            } else if (parseInt == AssetIdType.LINK_ID.getType()) {
                assetIdType = AssetIdType.LINK_ID;
            } else {
                ClientError.Companion companion = ClientError.Companion;
                throw companion.internal("parse assetId:" + str + ", invalid type:" + parseInt);
            }
            return new AssetId(Long.parseLong(split.get(1)), assetIdType);
        }
        ClientError.Companion companion2 = ClientError.Companion;
        throw companion2.internal("parse assetId empty:" + str);
    }

    public final String idToString(long j, AssetIdType assetIdType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), assetIdType}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(assetIdType);
        StringBuilder sb = new StringBuilder();
        sb.append(assetIdType.getType());
        sb.append('_');
        sb.append(j);
        return sb.toString();
    }

    public final long parseAssetId(String str, AssetIdType assetIdType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, assetIdType}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(str, assetIdType);
        List<String> split = split(str);
        if (split.size() >= 2) {
            if (Integer.parseInt(split.get(0)) == assetIdType.getType()) {
                return Long.parseLong(split.get(1));
            }
            ClientError.Companion companion = ClientError.Companion;
            throw companion.internal("parse assetId:" + str + ", invalid type:" + assetIdType);
        }
        ClientError.Companion companion2 = ClientError.Companion;
        throw companion2.internal("parse assetId empty:" + str);
    }
}
