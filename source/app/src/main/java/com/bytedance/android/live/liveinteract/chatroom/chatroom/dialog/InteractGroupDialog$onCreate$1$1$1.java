package com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C88440Kt0;

/* loaded from: classes.dex */
public final class InteractGroupDialog$onCreate$1$1$1 extends Lambda implements Function1<String, Unit> {
    public static final InteractGroupDialog$onCreate$1$1$1 INSTANCE = new InteractGroupDialog$onCreate$1$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25440);
    }

    public InteractGroupDialog$onCreate$1$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ(2131585669);
        }
        return Unit.INSTANCE;
    }
}
