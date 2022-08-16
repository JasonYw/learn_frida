package cn.ever.cloud.android;

import cn.ever.cloud.android.services.upload.AbstractC0727a;
import cn.ever.cloud.android.services.upload.UploadGuard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes20.dex */
public abstract class AndroidBackupModule {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(2730);
    }

    public abstract AbstractC0727a bindUploadCompleter(MediaUploadCompleterImpl mediaUploadCompleterImpl);

    /* loaded from: classes20.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2731);
        }

        public Companion() {
        }

        public final UploadGuard provideUploadGuard() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (UploadGuard) proxy.result;
            }
            return new UploadGuard();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
