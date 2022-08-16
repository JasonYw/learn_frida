package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87170KWm;
import p003X.AbstractC87551Kef;
import p003X.C386411Rz;
import p003X.C87605KfX;
import p003X.C87607KfZ;
import p003X.C87608Kfa;
import p003X.C87610Kfc;

/* loaded from: classes5.dex */
public final class NetworkRequestMethod$call$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $domain;
    public final /* synthetic */ String $host;
    public final /* synthetic */ C3605aj $params;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ String $schema;
    public final /* synthetic */ C87607KfZ this$0;

    static {
        Covode.recordClassIndex(20510);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestMethod$call$1(C87607KfZ c87607KfZ, String str, String str2, String str3, C3605aj c3605aj, String str4) {
        super(0);
        this.this$0 = c87607KfZ;
        this.$schema = str;
        this.$host = str2;
        this.$domain = str3;
        this.$params = c3605aj;
        this.$relativePath = str4;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.openapi.NetworkRequestMethod$call$1$1 */
    /* loaded from: classes5.dex */
    public static final class C36011 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20511);
        }

        public C36011() {
            super(0);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.openapi.NetworkRequestMethod$call$1$1$1 */
        /* loaded from: classes5.dex */
        public static final class C36021 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(20512);
            }

            public C36021() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    C87607KfZ c87607KfZ = NetworkRequestMethod$call$1.this.this$0;
                    C36031 c36031 = new C36031();
                    if (!PatchProxy.proxy(new Object[]{c36031}, c87607KfZ, C87607KfZ.LIZ, false, 8).isSupported) {
                        if (c87607KfZ.LJIIIIZZ.LIZ()) {
                            AbstractC87551Kef.LIZ(c87607KfZ, OpenApiErrorInfo.NET_REQUEST_CONCURRENCY_EXCEED_LIMIT, null, 2, null);
                        } else {
                            c36031.mo30099invoke();
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            /* renamed from: com.bytedance.android.live.broadcastgame.opengame.openapi.NetworkRequestMethod$call$1$1$1$1 */
            /* loaded from: classes5.dex */
            public static final class C36031 extends Lambda implements Function0<Unit> {
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(20513);
                }

                public C36031() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final /* synthetic */ Unit mo30099invoke() {
                    if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                        C87607KfZ c87607KfZ = NetworkRequestMethod$call$1.this.this$0;
                        C3605aj c3605aj = NetworkRequestMethod$call$1.this.$params;
                        String str = NetworkRequestMethod$call$1.this.$domain;
                        String str2 = NetworkRequestMethod$call$1.this.$relativePath;
                        if (!PatchProxy.proxy(new Object[]{c3605aj, str, str2}, c87607KfZ, C87607KfZ.LIZ, false, 9).isSupported) {
                            Disposable subscribe = Single.just(c3605aj).subscribeOn(Schedulers.m138io()).map(new C87610Kfc(c87607KfZ, c3605aj, str, str2)).subscribe(C87608Kfa.LIZ, new C87605KfX(c87607KfZ));
                            Intrinsics.checkNotNullExpressionValue(subscribe, "");
                            c87607KfZ.LIZ(subscribe);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                NetworkRequestMethod$call$1.this.this$0.LIZ(NetworkRequestMethod$call$1.this.$domain, NetworkRequestMethod$call$1.this.$schema, NetworkRequestMethod$call$1.this.$host, new C36021());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87607KfZ c87607KfZ = this.this$0;
            String str = this.$schema;
            String str2 = this.$host;
            C36011 c36011 = new C36011();
            if (!PatchProxy.proxy(new Object[]{str, str2, c36011}, c87607KfZ, C87607KfZ.LIZ, false, 5).isSupported) {
                if (AbstractC87170KWm.LJI.LIZIZ() && c87607KfZ.LIZLLL() && C386411Rz.LIZ(str2)) {
                    c36011.mo30099invoke();
                } else if (Intrinsics.areEqual("https", str)) {
                    c36011.mo30099invoke();
                } else {
                    AbstractC87551Kef.LIZ(c87607KfZ, OpenApiErrorInfo.NET_REQUEST_PRE_VERIFY_NOT_HTTPS, null, 2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
