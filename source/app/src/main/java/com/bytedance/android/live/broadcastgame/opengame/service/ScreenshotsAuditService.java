package com.bytedance.android.live.broadcastgame.opengame.service;

import android.graphics.Bitmap;
import com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag;
import com.bytedance.android.live.broadcastgame.opengame.message.AuditBean;
import com.bytedance.android.live.broadcastgame.opengame.message.C3513ah;
import com.bytedance.android.live.broadcastgame.opengame.message.PreUploadCheckBean;
import com.bytedance.android.live.broadcastgame.opengame.message.ReviewApi;
import com.bytedance.android.live.broadcastgame.opengame.message.UploadCheckRsp;
import com.bytedance.android.live.broadcastgame.opengame.message.UploadFileRsp;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.C3716a;
import com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3718b;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C16E;
import p003X.C16F;
import p003X.C1V2;
import p003X.C1V9;
import p003X.C387281Vi;
import p003X.C387291Vj;
import p003X.C387301Vk;
import p003X.C390501dE;
import p003X.C87549Ked;
import p003X.KM9;

/* loaded from: classes.dex */
public final class ScreenshotsAuditService implements AbstractC3718b {
    public static ChangeQuickRedirect LIZ;
    public long LIZJ;
    public boolean LJIIJ;
    public C3682x LJIIJJI;
    public final /* synthetic */ C87549Ked LJIIL = new C87549Ked();
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new ScreenshotsAuditService$appId$2(this));

    /* renamed from: LJ */
    public final Lazy f26088LJ = LazyKt__LazyJVMKt.lazy(new ScreenshotsAuditService$roomId$2(this));
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(ScreenshotsAuditService$queue$2.INSTANCE);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(ScreenshotsAuditService$cache$2.INSTANCE);
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(ScreenshotsAuditService$mainDir$2.INSTANCE);
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new ScreenshotsAuditService$appIdDir$2(this));
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(new ScreenshotsAuditService$screenshotsDir$2(this));
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(ScreenshotsAuditService$api$2.INSTANCE);

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService$2 */
    /* loaded from: classes.dex */
    public static final class C37102<T> implements Consumer<Throwable> {
        public static final C37102 LIZ = new C37102();

        static {
            Covode.recordClassIndex(21039);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* bridge */ /* synthetic */ void accept(Throwable th) {
        }
    }

    static {
        Covode.recordClassIndex(21037);
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (String) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIL.LIZ(disposable);
    }

    public final Queue<AbstractC3711a> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (Queue) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final C3720b LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C3720b) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    /* renamed from: LJ */
    public final String m15840LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (String) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    public final String LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (String) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    public final C3716a LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C3716a) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    public final C3682x LJIILJJIL() {
        return this.LJIIJJI;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        C387291Vj.LIZ(this);
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        if (!this.LJIIJ) {
            this.LJIIJ = true;
        }
        LJIILIIL();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        C1V2.LIZIZ.LIZIZ(m15840LJ());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        C387291Vj.LIZJ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        C387291Vj.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        C387291Vj.m25034LJ(this);
    }

    private final AbstractC3659g LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (AbstractC3659g) proxy.result;
        }
        if (((PanelStateReportService) LJIILJJIL().LIZ((Class<AbstractC3719c>) PanelStateReportService.class)).LJIILIIL()) {
            return LJIILJJIL().LIZIZ();
        }
        return null;
    }

    public final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported || !this.LJIIJ) {
            return;
        }
        while (!LIZJ().isEmpty()) {
            AbstractC3711a poll = LIZJ().poll();
            if (poll instanceof C1V9) {
                LIZ((C1V9) poll);
            }
        }
    }

    private final Observable<String> LJIILL() {
        Observable<Bitmap> captureView;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        if (LJIILLIIL() == null) {
            ALogger.m15797i("Screenshots", "get from ReportPicUploader");
            byte[] LIZJ = C390501dE.f263LJ.LIZJ();
            if (LIZJ == null) {
                Observable<String> just = Observable.just("");
                Intrinsics.checkNotNullExpressionValue(just, "");
                return just;
            }
            captureView = Observable.just(LIZJ).map(C387281Vi.LIZIZ);
        } else {
            AbstractC3659g LIZIZ = LJIILJJIL().LIZIZ();
            if (LIZIZ == null || (captureView = LIZIZ.captureView()) == null) {
                Observable<String> just2 = Observable.just("");
                Intrinsics.checkNotNullExpressionValue(just2, "");
                return just2;
            }
        }
        Observable map = captureView.map(new Function<Bitmap, String>() { // from class: X.1Vh
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21054);
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.String] */
            @Override // io.reactivex.functions.Function
            public final /* synthetic */ String apply(Bitmap bitmap) {
                ScreenshotsAuditService screenshotsAuditService;
                String str;
                Bitmap bitmap2 = bitmap;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{bitmap2}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                C106862S5w.LIZ(bitmap2);
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], ScreenshotsAuditService.this, ScreenshotsAuditService.LIZ, false, 24);
                if (proxy3.isSupported) {
                    str = (String) proxy3.result;
                } else {
                    str = screenshotsAuditService.LJFF() + File.separator + System.currentTimeMillis() + ".jpg";
                }
                ScreenshotsAuditService.this.LIZ(bitmap2, str);
                return str;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        return map;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJII() {
        Object mo27335getValue;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            C3720b LIZLLL = LIZLLL();
            if (!PatchProxy.proxy(new Object[0], LIZLLL, C3720b.LIZ, false, 7).isSupported) {
                LIZLLL.LIZ().clear();
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZLLL, C3720b.LIZ, false, 2);
                if (proxy.isSupported) {
                    mo27335getValue = proxy.result;
                } else {
                    mo27335getValue = LIZLLL.LIZIZ.mo27335getValue();
                }
                ((ConcurrentSkipListSet) mo27335getValue).clear();
            }
            C1V2.LIZIZ.LIZIZ(m15840LJ());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3711a {
        public final long LIZ;

        static {
            Covode.recordClassIndex(21040);
        }

        public AbstractC3711a(long j) {
            this.LIZ = j;
        }

        public /* synthetic */ AbstractC3711a(long j, byte b) {
            this(j);
        }
    }

    private final void LIZ(final C1V9 c1v9) {
        if (PatchProxy.proxy(new Object[]{c1v9}, this, LIZ, false, 15).isSupported) {
            return;
        }
        Disposable subscribe = LJIILL().observeOn(Schedulers.m138io()).subscribe(new Consumer<String>() { // from class: X.1V6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21055);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(String str) {
                if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                    final ScreenshotsAuditService screenshotsAuditService = ScreenshotsAuditService.this;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(str);
                    final long j = c1v9.LIZ;
                    if (!PatchProxy.proxy(new Object[]{listOf, new Long(j)}, screenshotsAuditService, ScreenshotsAuditService.LIZ, false, 18).isSupported) {
                        final HashMap<String, String> hashMap = new HashMap<>();
                        final ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : listOf) {
                            if (!StringsKt__StringsJVMKt.isBlank((String) t)) {
                                arrayList2.add(t);
                            }
                        }
                        screenshotsAuditService.LIZ(arrayList2, hashMap, arrayList);
                        Set<String> keySet = hashMap.keySet();
                        Intrinsics.checkNotNullExpressionValue(keySet, "");
                        Disposable subscribe2 = Observable.just(CollectionsKt___CollectionsKt.toList(keySet)).observeOn(Schedulers.m138io()).filter(new Predicate<List<? extends String>>() { // from class: X.1V7
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(21045);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // io.reactivex.functions.Predicate
                            public final /* synthetic */ boolean test(List<? extends String> list) {
                                List<? extends String> list2 = list;
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list2}, this, LIZ, false, 1);
                                if (proxy.isSupported) {
                                    return ((Boolean) proxy.result).booleanValue();
                                }
                                C106862S5w.LIZ(list2);
                                ScreenshotsAuditService.this.LIZ((List<String>) list2, (List<AuditBean>) arrayList, j);
                                if (!list2.isEmpty()) {
                                    return true;
                                }
                                return false;
                            }
                        }).flatMap(new Function<List<? extends String>, ObservableSource<? extends UploadCheckRsp>>() { // from class: X.1VA
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(21046);
                            }

                            /* JADX WARN: Type inference failed for: r0v9, types: [io.reactivex.ObservableSource<? extends com.bytedance.android.live.broadcastgame.opengame.message.UploadCheckRsp>, java.lang.Object] */
                            @Override // io.reactivex.functions.Function
                            public final /* synthetic */ ObservableSource<? extends UploadCheckRsp> apply(List<? extends String> list) {
                                List<? extends String> list2 = list;
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list2}, this, LIZ, false, 1);
                                if (proxy.isSupported) {
                                    return proxy.result;
                                }
                                C106862S5w.LIZ(list2);
                                C3716a LJI = ScreenshotsAuditService.this.LJI();
                                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{list2}, LJI, C3716a.LIZ, false, 2);
                                if (proxy2.isSupported) {
                                    return (Observable) proxy2.result;
                                }
                                C106862S5w.LIZ(list2);
                                return LJI.LIZ().preUploadCheck(new PreUploadCheckBean(list2));
                            }
                        }).flatMap(new Function<UploadCheckRsp, ObservableSource<? extends List<? extends String>>>() { // from class: X.1V0
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(21048);
                            }

                            /* JADX WARN: Type inference failed for: r0v19, types: [io.reactivex.ObservableSource<? extends java.util.List<? extends java.lang.String>>, java.lang.Object] */
                            @Override // io.reactivex.functions.Function
                            public final /* synthetic */ ObservableSource<? extends List<? extends String>> apply(UploadCheckRsp uploadCheckRsp) {
                                UploadCheckRsp uploadCheckRsp2 = uploadCheckRsp;
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadCheckRsp2}, this, LIZ, false, 1);
                                if (proxy.isSupported) {
                                    return proxy.result;
                                }
                                C106862S5w.LIZ(uploadCheckRsp2);
                                for (Map.Entry<String, String> entry : uploadCheckRsp2.getRs().entrySet()) {
                                    ScreenshotsAuditService screenshotsAuditService2 = ScreenshotsAuditService.this;
                                    HashMap hashMap2 = hashMap;
                                    List list = arrayList;
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    if (!PatchProxy.proxy(new Object[]{hashMap2, list, key, value}, screenshotsAuditService2, ScreenshotsAuditService.LIZ, false, 20).isSupported) {
                                        String str2 = (String) hashMap2.get(key);
                                        if (str2 != null) {
                                            C1V2.LIZIZ.LIZ(str2);
                                        }
                                        hashMap2.remove(key);
                                        list.add(new AuditBean(key, value, 2));
                                        screenshotsAuditService2.LIZLLL().LIZ(key, value);
                                    }
                                }
                                Collection values = hashMap.values();
                                Intrinsics.checkNotNullExpressionValue(values, "");
                                return Observable.just(CollectionsKt___CollectionsKt.toList(values));
                            }
                        }).filter(new Predicate<List<? extends String>>() { // from class: X.1V8
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(21049);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // io.reactivex.functions.Predicate
                            public final /* synthetic */ boolean test(List<? extends String> list) {
                                List<? extends String> list2 = list;
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list2}, this, LIZ, false, 1);
                                if (proxy.isSupported) {
                                    return ((Boolean) proxy.result).booleanValue();
                                }
                                C106862S5w.LIZ(list2);
                                ScreenshotsAuditService.this.LIZ((List<String>) list2, (List<AuditBean>) arrayList, j);
                                if (!list2.isEmpty()) {
                                    return true;
                                }
                                return false;
                            }
                        }).flatMap(new Function<List<? extends String>, ObservableSource<? extends List<? extends UploadFileRsp>>>() { // from class: X.1VB
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(21050);
                            }

                            /* JADX WARN: Type inference failed for: r5v4, types: [io.reactivex.ObservableSource<? extends java.util.List<? extends com.bytedance.android.live.broadcastgame.opengame.message.UploadFileRsp>>, java.lang.Object] */
                            @Override // io.reactivex.functions.Function
                            public final /* synthetic */ ObservableSource<? extends List<? extends UploadFileRsp>> apply(List<? extends String> list) {
                                Single<List<UploadFileRsp>> list2;
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1);
                                if (proxy.isSupported) {
                                    return proxy.result;
                                }
                                C106862S5w.LIZ(list);
                                C3716a LJI = ScreenshotsAuditService.this.LJI();
                                Collection values = hashMap.values();
                                Intrinsics.checkNotNullExpressionValue(values, "");
                                List list3 = CollectionsKt___CollectionsKt.toList(values);
                                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{list3}, LJI, C3716a.LIZ, false, 3);
                                if (proxy2.isSupported) {
                                    return (Observable) proxy2.result;
                                }
                                C106862S5w.LIZ(list3);
                                ArrayList<String> arrayList3 = new ArrayList();
                                for (T t2 : list3) {
                                    if (!StringsKt__StringsJVMKt.isBlank((String) t2)) {
                                        arrayList3.add(t2);
                                    }
                                }
                                Observable<UploadFileRsp> observable = null;
                                for (String str2 : arrayList3) {
                                    RequestBody create = RequestBody.create(MediaType.parse("CommonImage"), new File(str2));
                                    if (observable == null) {
                                        ReviewApi LIZ2 = LJI.LIZ();
                                        Intrinsics.checkNotNullExpressionValue(create, "");
                                        observable = LIZ2.uploadFiles(create);
                                    } else {
                                        ReviewApi LIZ3 = LJI.LIZ();
                                        Intrinsics.checkNotNullExpressionValue(create, "");
                                        observable = Observable.merge(observable, LIZ3.uploadFiles(create));
                                    }
                                }
                                if (observable == null || (list2 = observable.toList()) == null) {
                                    return null;
                                }
                                return list2.toObservable();
                            }
                        }).subscribe(new Consumer<List<? extends UploadFileRsp>>() { // from class: X.1V1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(21051);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(List<? extends UploadFileRsp> list) {
                                List<? extends UploadFileRsp> list2 = list;
                                if (!PatchProxy.proxy(new Object[]{list2}, this, LIZ, false, 1).isSupported) {
                                    Intrinsics.checkNotNullExpressionValue(list2, "");
                                    for (UploadFileRsp uploadFileRsp : list2) {
                                        ScreenshotsAuditService.this.LIZLLL().LIZ(uploadFileRsp.getMd5(), uploadFileRsp.getOid());
                                        arrayList.add(new AuditBean(uploadFileRsp.getMd5(), uploadFileRsp.getOid(), 1));
                                        C1V2.LIZIZ.LIZ((String) hashMap.get(uploadFileRsp.getMd5()));
                                    }
                                    hashMap.clear();
                                    ScreenshotsAuditService.this.LIZ((List<String>) null, arrayList, j);
                                }
                            }
                        }, C16N.LIZIZ);
                        Intrinsics.checkNotNullExpressionValue(subscribe2, "");
                        screenshotsAuditService.LIZ(subscribe2);
                    }
                }
            }
        }, C16E.LIZIZ);
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }

    public ScreenshotsAuditService(C3682x c3682x) {
        Observable LIZ2;
        Disposable subscribe;
        C106862S5w.LIZ(c3682x);
        this.LJIIJJI = c3682x;
        AbstractC3512ag abstractC3512ag = LJIILJJIL().LJII;
        if (abstractC3512ag != null && (LIZ2 = abstractC3512ag.LIZ(C3513ah.class)) != null && (subscribe = LIZ2.subscribe(new Consumer<C3513ah>() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21038);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C3513ah c3513ah) {
                C3513ah c3513ah2 = c3513ah;
                if (!PatchProxy.proxy(new Object[]{c3513ah2}, this, LIZ, false, 1).isSupported) {
                    ScreenshotsAuditService screenshotsAuditService = ScreenshotsAuditService.this;
                    final long j = c3513ah2.LIZJ;
                    if (!PatchProxy.proxy(new Object[]{new Long(j)}, screenshotsAuditService, ScreenshotsAuditService.LIZ, false, 13).isSupported) {
                        long currentTimeMillis = System.currentTimeMillis() - screenshotsAuditService.LIZJ;
                        screenshotsAuditService.LIZJ += currentTimeMillis;
                        if (currentTimeMillis >= 500) {
                            screenshotsAuditService.LIZJ().offer(new AbstractC3711a(j) { // from class: X.1V9
                                static {
                                    Covode.recordClassIndex(21041);
                                }
                            });
                            screenshotsAuditService.LJIILIIL();
                        }
                    }
                }
            }
        }, C37102.LIZ)) != null) {
            LIZ(subscribe);
        }
    }

    public final void LIZ(Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        MethodCollector.m14708i(1470);
        if (PatchProxy.proxy(new Object[]{bitmap, str}, this, LIZ, false, 17).isSupported) {
            MethodCollector.m14707o(1470);
            return;
        }
        C1V2 c1v2 = C1V2.LIZIZ;
        String LJFF = LJFF();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LJFF}, c1v2, C1V2.LIZ, false, 1);
        if (proxy.isSupported) {
            ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(LJFF);
            File file = new File(LJFF);
            if ((!file.exists() || !file.isDirectory()) && (!file.exists() || C116971W2r.LIZ(file))) {
                file.mkdirs();
            }
        }
        File file2 = new File(str);
        if (!file2.createNewFile()) {
            bitmap.recycle();
            MethodCollector.m14707o(1470);
            return;
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            Bitmap LIZ2 = C116971W2r.LIZ(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, true);
            bitmap.recycle();
            LIZ2.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream2);
            LIZ2.recycle();
            th = null;
        } finally {
        }
    }

    public final void LIZ(List<String> list, HashMap<String, String> hashMap, List<AuditBean> list2) {
        Triple triple;
        if (PatchProxy.proxy(new Object[]{list, hashMap, list2}, this, LIZ, false, 19).isSupported) {
            return;
        }
        for (String str : list) {
            C3720b LIZLLL = LIZLLL();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, LIZLLL, C3720b.LIZ, false, 4);
            if (proxy.isSupported) {
                triple = (Triple) proxy.result;
            } else {
                C106862S5w.LIZ(str);
                File file = new File(str);
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{file}, LIZLLL, C3720b.LIZ, false, 5);
                if (proxy2.isSupported) {
                    triple = (Triple) proxy2.result;
                } else {
                    C106862S5w.LIZ(file);
                    if (!file.exists()) {
                        triple = new Triple("", Boolean.TRUE, "");
                    } else {
                        String md5Hex = DigestUtils.md5Hex(file);
                        Boolean valueOf = Boolean.valueOf(LIZLLL.LIZ().containsKey(md5Hex));
                        String str2 = LIZLLL.LIZ().get(md5Hex);
                        if (str2 == null) {
                            str2 = "";
                        }
                        triple = new Triple(md5Hex, valueOf, str2);
                    }
                }
            }
            String str3 = (String) triple.component1();
            boolean booleanValue = ((Boolean) triple.component2()).booleanValue();
            String str4 = (String) triple.component3();
            if (!StringsKt__StringsJVMKt.isBlank(str3)) {
                if (!booleanValue) {
                    hashMap.put(str3, str);
                } else {
                    list2.add(new AuditBean(str3, str4, 2));
                    C1V2.LIZIZ.LIZ(str);
                }
            }
        }
    }

    public final void LIZ(List<String> list, List<AuditBean> list2, long j) {
        long longValue;
        Observable<C5176i<Object>> sendScreenShotAudit;
        if (PatchProxy.proxy(new Object[]{list, list2, new Long(j)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        if ((list == null || list.isEmpty()) && (!list2.isEmpty())) {
            C3716a LJI = LJI();
            String LIZ2 = LIZ();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                longValue = ((Long) proxy.result).longValue();
            } else {
                longValue = ((Number) this.f26088LJ.mo27335getValue()).longValue();
            }
            List list3 = CollectionsKt___CollectionsKt.toList(list2);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{LIZ2, new Long(longValue), list3, new Long(j)}, LJI, C3716a.LIZ, false, 4);
            if (proxy2.isSupported) {
                sendScreenShotAudit = (Observable) proxy2.result;
            } else {
                C106862S5w.LIZ(LIZ2, list3);
                ReviewApi LIZ3 = LJI.LIZ();
                String json = GsonProtectorUtils.toJson(KM9.LIZ(), list3);
                Intrinsics.checkNotNullExpressionValue(json, "");
                sendScreenShotAudit = LIZ3.sendScreenShotAudit(LIZ2, longValue, j, json);
            }
            Disposable subscribe = sendScreenShotAudit.subscribe(C387301Vk.LIZ, C16F.LIZIZ);
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
        }
    }
}
