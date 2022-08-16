package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.KeyValue;
import cn.ever.cloud.android.persistence.table.DbKeyValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class KeyValueRepositoryImplKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2928);
    }

    public static final DbKeyValue toDbKeyValue(KeyValue keyValue) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{keyValue}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbKeyValue) proxy.result;
        }
        C106862S5w.LIZ(keyValue);
        return new DbKeyValue(keyValue.getKey(), keyValue.getValue());
    }

    public static final KeyValue toKeyValue(DbKeyValue dbKeyValue) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbKeyValue}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (KeyValue) proxy.result;
        }
        C106862S5w.LIZ(dbKeyValue);
        return new KeyValue(dbKeyValue.getKey(), dbKeyValue.getValue());
    }
}
