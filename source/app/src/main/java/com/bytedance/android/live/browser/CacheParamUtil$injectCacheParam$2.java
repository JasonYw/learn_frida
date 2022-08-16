package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class CacheParamUtil$injectCacheParam$2 extends Lambda implements Function2<Map<String, ? extends Object>, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.BooleanRef $hasApiStorage;
    public final /* synthetic */ Function1 $storageResolve;

    static {
        Covode.recordClassIndex(21881);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheParamUtil$injectCacheParam$2(Ref.BooleanRef booleanRef, Function1 function1) {
        super(2);
        this.$hasApiStorage = booleanRef;
        this.$storageResolve = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Map<String, ? extends Object> map, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{map, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(map);
            this.$hasApiStorage.element = booleanValue;
            this.$storageResolve.invoke(map);
        }
        return Unit.INSTANCE;
    }
}
