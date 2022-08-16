package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.upload.UploadGuard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class UploadGuard$runInGuard$2 extends Lambda implements Function1<Pair<? extends Object, ? extends UploadGuard.ReferencedMutex>, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $id;

    static {
        Covode.recordClassIndex(3139);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadGuard$runInGuard$2(Object obj) {
        super(1);
        this.$id = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Pair<? extends Object, ? extends UploadGuard.ReferencedMutex> pair) {
        return Boolean.valueOf(invoke2((Pair<? extends Object, UploadGuard.ReferencedMutex>) pair));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(Pair<? extends Object, UploadGuard.ReferencedMutex> pair) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(pair);
        return Intrinsics.areEqual(pair.getFirst(), this.$id);
    }
}
