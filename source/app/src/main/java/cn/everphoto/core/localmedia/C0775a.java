package cn.everphoto.core.localmedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC536287Gk;
import p003X.C106862S5w;

/* renamed from: cn.everphoto.core.localmedia.a */
/* loaded from: classes23.dex */
public final class C0775a implements AbstractC0776b {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC536287Gk<String> LIZIZ;
    public final BehaviorSubject<List<Asset>> LIZJ;
    public volatile boolean LIZLLL;

    static {
        Covode.recordClassIndex(3613);
    }

    public C0775a() {
        BehaviorSubject<List<Asset>> create = BehaviorSubject.create();
        Intrinsics.checkExpressionValueIsNotNull(create, "");
        this.LIZJ = create;
        new ConcurrentHashMap();
        PublishSubject create2 = PublishSubject.create();
        Intrinsics.checkExpressionValueIsNotNull(create2, "");
        this.LIZIZ = create2;
    }

    @Override // cn.everphoto.core.localmedia.AbstractC0776b
    public final void LIZ() {
        MethodCollector.m14708i(245);
        if (!this.LIZLLL) {
            synchronized (C0775a.class) {
                try {
                    if (!this.LIZLLL) {
                        this.LIZLLL = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(245);
                    throw th;
                }
            }
            MethodCollector.m14707o(245);
            return;
        }
        MethodCollector.m14707o(245);
    }

    @Override // cn.everphoto.core.localmedia.AbstractC0776b
    public final Observable<List<Asset>> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        Observable<List<Asset>> throttleLatest = this.LIZJ.throttleLatest(4L, TimeUnit.SECONDS);
        Intrinsics.checkExpressionValueIsNotNull(throttleLatest, "");
        return throttleLatest;
    }

    @Override // cn.everphoto.core.localmedia.AbstractC0776b
    public final void LIZ(List<? extends Asset> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZJ.onNext(list);
    }
}
