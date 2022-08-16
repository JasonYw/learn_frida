package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.KeyValue;
import cn.ever.cloud.android.p039a.AbstractC0681c;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.persistence.table.DbKeyValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class KeyValueRepositoryImpl implements AbstractC0681c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: db */
    public final SdkDatabase f21051db;

    static {
        Covode.recordClassIndex(2927);
    }

    public KeyValueRepositoryImpl(SdkDatabase sdkDatabase) {
        C106862S5w.LIZ(sdkDatabase);
        this.f21051db = sdkDatabase;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0681c
    public final KeyValue getKeyValue(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (KeyValue) proxy.result;
        }
        C106862S5w.LIZ(str);
        DbKeyValue query = this.f21051db.keyValueDao().query(str);
        if (query != null) {
            return KeyValueRepositoryImplKt.toKeyValue(query);
        }
        return null;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0681c
    public final long upsertKeyValue(KeyValue keyValue) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{keyValue}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(keyValue);
        return this.f21051db.keyValueDao().upsert(KeyValueRepositoryImplKt.toDbKeyValue(keyValue));
    }
}
