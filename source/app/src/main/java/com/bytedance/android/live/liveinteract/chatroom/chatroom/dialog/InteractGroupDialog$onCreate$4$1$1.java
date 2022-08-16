package com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import p003X.C88440Kt0;

/* loaded from: classes.dex */
public final class InteractGroupDialog$onCreate$4$1$1 extends Lambda implements Function4<Integer, Integer, String, Long, Unit> {
    public static final InteractGroupDialog$onCreate$4$1$1 INSTANCE = new InteractGroupDialog$onCreate$4$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25441);
    }

    public InteractGroupDialog$onCreate$4$1$1() {
        super(4);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ Unit invoke(Integer num, Integer num2, String str, Long l) {
        if (!PatchProxy.proxy(new Object[]{num, num2, str, l}, this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ(2131585674);
        }
        return Unit.INSTANCE;
    }
}
