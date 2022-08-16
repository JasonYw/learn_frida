package cn.everphoto.sdkcv.moment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C106939S8v;

/* loaded from: classes9.dex */
public final class MomentApiImpl$usedMoment$2 extends Lambda implements Function0<Set<String>> {
    public static final MomentApiImpl$usedMoment$2 INSTANCE = new MomentApiImpl$usedMoment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3687);
    }

    public MomentApiImpl$usedMoment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Set<java.lang.String>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Set<String> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106939S8v c106939S8v = C106939S8v.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{"used_moment"}, c106939S8v, C106939S8v.LIZ, false, 7);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ("used_moment");
        return new HashSet(c106939S8v.LIZ().getStringSet("used_moment", new LinkedHashSet()));
    }
}
