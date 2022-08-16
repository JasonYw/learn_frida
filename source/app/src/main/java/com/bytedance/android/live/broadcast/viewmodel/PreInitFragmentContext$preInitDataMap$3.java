package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class PreInitFragmentContext$preInitDataMap$3 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18119);
    }

    public PreInitFragmentContext$preInitDataMap$3(C3257c c3257c) {
        super(1, c3257c, C3257c.class, "fetchUserPermissionInternal", "fetchUserPermissionInternal(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            ((C3257c) this.receiver).LIZIZ(booleanValue);
        }
        return Unit.INSTANCE;
    }
}
