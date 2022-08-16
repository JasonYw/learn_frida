package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.android.p039a.AbstractC0684f;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.persistence.table.DbUserStorage;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UserRepositoryImpl implements AbstractC0684f {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: db */
    public final SdkDatabase f21054db;

    static {
        Covode.recordClassIndex(2935);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0684f
    public final Storage getUserStorage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Storage) proxy.result;
        }
        DbUserStorage userStorage = this.f21054db.userDao().getUserStorage();
        if (userStorage != null) {
            return UserRepositoryImplKt.toStorage(userStorage);
        }
        return null;
    }

    public UserRepositoryImpl(SdkDatabase sdkDatabase) {
        C106862S5w.LIZ(sdkDatabase);
        this.f21054db = sdkDatabase;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0684f
    public final boolean upsertUserStorage(Storage storage) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{storage}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(storage);
        if (this.f21054db.userDao().upsertUserStorage(UserRepositoryImplKt.toDbUserStorage(storage)) != 0) {
            return true;
        }
        return false;
    }
}
