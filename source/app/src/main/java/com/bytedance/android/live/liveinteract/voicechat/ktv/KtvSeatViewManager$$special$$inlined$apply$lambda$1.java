package com.bytedance.android.live.liveinteract.voicechat.ktv;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.C4374l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C80557Hp9;

/* loaded from: classes3.dex */
public final class KtvSeatViewManager$$special$$inlined$apply$lambda$1 extends Lambda implements Function2<Integer, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80557Hp9 this$0;

    static {
        Covode.recordClassIndex(31420);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvSeatViewManager$$special$$inlined$apply$lambda$1(C80557Hp9 c80557Hp9) {
        super(2);
        this.this$0 = c80557Hp9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        Integer valueOf = Integer.valueOf(intValue);
        if (!PatchProxy.proxy(new Object[]{valueOf, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZLLL();
            AbstractKtvSeatListAdapter abstractKtvSeatListAdapter = this.this$0.LJJIFFI;
            if (abstractKtvSeatListAdapter != null) {
                int itemCount = abstractKtvSeatListAdapter.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    C4374l c4374l = this.this$0.LJJIIJ;
                    if (c4374l != null) {
                        c4374l.LIZLLL(i);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
