package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.android.persistence.table.DbUserStorage;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UserRepositoryImplKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2936);
    }

    public static final DbUserStorage toDbUserStorage(Storage storage) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{storage}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (DbUserStorage) proxy.result;
        }
        C106862S5w.LIZ(storage);
        return new DbUserStorage(storage.getUserId(), storage.getQuota(), storage.getUsage(), storage.getMediaNum());
    }

    public static final Storage toStorage(DbUserStorage dbUserStorage) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbUserStorage}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Storage) proxy.result;
        }
        C106862S5w.LIZ(dbUserStorage);
        return new Storage(dbUserStorage.getUserId(), dbUserStorage.getQuota(), dbUserStorage.getUsage(), dbUserStorage.getMediaNum());
    }
}
