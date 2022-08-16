package cn.everphoto.core.cvinfo.logic.extraction;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class BaseExtraction$exifTimeFormat$2 extends Lambda implements Function0<SimpleDateFormat> {
    public static final BaseExtraction$exifTimeFormat$2 INSTANCE = new BaseExtraction$exifTimeFormat$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3584);
    }

    public BaseExtraction$exifTimeFormat$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.text.SimpleDateFormat, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SimpleDateFormat mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    }
}
