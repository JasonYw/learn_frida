package cn.ever.cloud.android.persistence;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import cn.ever.cloud.network.auth.UserId;
import cn.ever.cloud.utils.CtxUtil;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC116287Vq5;
import p003X.AbstractC521346im;
import p003X.AbstractC522106k0;
import p003X.AbstractC522116k1;
import p003X.AbstractC522206kA;
import p003X.AbstractC529026vA;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public abstract class SdkDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(2889);
    }

    public abstract AbstractC522106k0 albumDao();

    public abstract AbstractC522116k1 assetDao();

    public abstract AbstractC116287Vq5 keyValueDao();

    public abstract AbstractC529026vA todoAssetDao();

    public abstract AbstractC521346im uploadTaskDao();

    public abstract AbstractC522206kA userDao();

    /* loaded from: classes13.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2890);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clear(SdkDatabase sdkDatabase) {
            Boolean bool;
            if (PatchProxy.proxy(new Object[]{sdkDatabase}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(sdkDatabase);
            sdkDatabase.close();
            SupportSQLiteOpenHelper openHelper = sdkDatabase.getOpenHelper();
            Intrinsics.checkNotNullExpressionValue(openHelper, "");
            String databaseName = openHelper.getDatabaseName();
            Context appContext = CtxUtil.INSTANCE.appContext();
            if (appContext != null) {
                bool = Boolean.valueOf(appContext.deleteDatabase(databaseName));
            } else {
                bool = null;
            }
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20553i("SdkDatabase", "deleted database: " + databaseName + LoggerUtil.BLANK_TAG + bool);
        }

        public final SdkDatabase newInstance(UserId userId) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userId}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (SdkDatabase) proxy.result;
            }
            C106862S5w.LIZ(userId);
            Context appContext = CtxUtil.INSTANCE.appContext();
            Intrinsics.checkNotNull(appContext);
            RoomDatabase.Builder databaseBuilder = Room.databaseBuilder(appContext, SdkDatabase.class, "ever_cloud_sdk-" + userId.getEpUid() + ".db");
            databaseBuilder.addCallback(new RoomDatabase.Callback() { // from class: cn.ever.cloud.android.persistence.SdkDatabase$Companion$newInstance$1
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(2891);
                }

                @Override // androidx.room.RoomDatabase.Callback
                public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                    if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(supportSQLiteDatabase);
                    super.onCreate(supportSQLiteDatabase);
                    LogHelper.INSTANCE.m20553i("SdkDatabase", C0002O.m25086C("onCreate, db:", supportSQLiteDatabase.getPath()));
                }

                @Override // androidx.room.RoomDatabase.Callback
                public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                    if (PatchProxy.proxy(new Object[]{supportSQLiteDatabase}, this, changeQuickRedirect, false, 2).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(supportSQLiteDatabase);
                    super.onOpen(supportSQLiteDatabase);
                    LogHelper.INSTANCE.m20553i("SdkDatabase", C0002O.m25086C("onOpen, db:", supportSQLiteDatabase.getPath()));
                }
            });
            databaseBuilder.fallbackToDestructiveMigration();
            RoomDatabase build = databaseBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "");
            return (SdkDatabase) build;
        }
    }
}
