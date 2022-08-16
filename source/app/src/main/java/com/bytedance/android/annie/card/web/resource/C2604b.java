package com.bytedance.android.annie.card.web.resource;

import android.webkit.WebResourceResponse;
import com.bytedance.android.annie.card.base.AbstractC2600f;
import com.bytedance.android.annie.service.resource.AbstractC2645g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC90724Lok;
import p003X.AbstractC99696POg;
import p003X.C90746Lp6;
import p003X.PP3;

/* renamed from: com.bytedance.android.annie.card.web.resource.b */
/* loaded from: classes7.dex */
public final class C2604b implements AbstractC2600f {
    public static ChangeQuickRedirect LIZ;
    public volatile boolean LIZIZ;
    public final ConcurrentHashMap<String, AbstractC2645g> LIZJ;
    public AbstractC99696POg LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25620LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Boolean LJIIJ;
    public static final PP3 LJIIIZ = new PP3((byte) 0);
    public static final List<String> LJII = CollectionsKt__CollectionsKt.mutableListOf(".js", ".html", ".css");
    public static final List<String> LJIIIIZZ = CollectionsKt__CollectionsKt.mutableListOf(".js", ".html", ".css", ".json", ".ico", ".jpeg", ".webp", ".jpg", ".png", ".gif", ".wott", ".svg", ".ttf");

    public C2604b() {
        this(false, false, 3);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2600f
    public final ConcurrentHashMap<String, AbstractC2645g> getPendingRequest() {
        return this.LIZJ;
    }

    public final WebResourceResponse LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (WebResourceResponse) proxy.result;
        }
        Boolean bool = this.LJIIJ;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (!bool.booleanValue() || this.LJI) {
            return null;
        }
        return new WebResourceResponse("", "", null);
    }

    static {
        Covode.recordClassIndex(10730);
    }

    public C2604b(boolean z, boolean z2) {
        this.LJFF = z;
        this.LJI = z2;
        this.LIZJ = new ConcurrentHashMap<>();
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJJIIZI;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        this.LJIIJ = c90746Lp6.LIZ();
        this.f25620LJ = LazyKt__LazyJVMKt.lazy(WebResourceProvider$forceUseForest$2.INSTANCE);
    }

    public /* synthetic */ C2604b(boolean z, boolean z2, int i) {
        this(false, false);
    }
}
