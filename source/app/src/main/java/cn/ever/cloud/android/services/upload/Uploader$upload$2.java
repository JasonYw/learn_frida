package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.entity.ToDelAsset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class Uploader$upload$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UploadSandboxEnv $env;
    public final /* synthetic */ UploadMedia $media;
    public final /* synthetic */ Uploader this$0;

    static {
        Covode.recordClassIndex(3159);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uploader$upload$2(Uploader uploader, UploadSandboxEnv uploadSandboxEnv, UploadMedia uploadMedia) {
        super(1);
        this.this$0 = uploader;
        this.$env = uploadSandboxEnv;
        this.$media = uploadMedia;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.this$0.monitorBackup(th, this.$env, this.$media);
        if (th == null && this.$media.getDeleteOnEnd()) {
            this.this$0.repo.insert(new ToDelAsset(this.$media.getAssetId(), this.$media.getPath(), this.$media.getUri()));
        }
        this.this$0.sandboxManager.cleanUploadSandbox(this.$env, this.$media, th);
    }
}
