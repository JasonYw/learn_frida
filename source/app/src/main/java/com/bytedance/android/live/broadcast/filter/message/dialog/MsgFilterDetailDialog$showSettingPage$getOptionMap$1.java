package com.bytedance.android.live.broadcast.filter.message.dialog;

import com.bytedance.android.live.broadcast.filter.message.dialog.MsgValueFilterDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87069KSp;
import p003X.DialogC87063KSj;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class MsgFilterDetailDialog$showSettingPage$getOptionMap$1 extends Lambda implements Function2<MsgValueFilterDialog.Type, List<? extends Integer>, LinkedHashMap<Integer, String>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC87063KSj this$0;

    static {
        Covode.recordClassIndex(15813);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgFilterDetailDialog$showSettingPage$getOptionMap$1(DialogC87063KSj dialogC87063KSj) {
        super(2);
        this.this$0 = dialogC87063KSj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.LinkedHashMap<java.lang.Integer, java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ LinkedHashMap<Integer, String> invoke(MsgValueFilterDialog.Type type, List<? extends Integer> list) {
        Object LIZ;
        MsgValueFilterDialog.Type type2 = type;
        List<? extends Integer> list2 = list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type2, list2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(type2, list2);
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (Integer num : list2) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(intValue);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{type2, Integer.valueOf(intValue)}, this.this$0, DialogC87063KSj.LIZ, false, 20);
            if (proxy2.isSupported) {
                LIZ = proxy2.result;
            } else if (intValue <= 0) {
                LIZ = LK5.LIZ(2131583237);
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
            } else {
                int i = C87069KSp.LIZ[type2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            LIZ = LK5.LIZ(2131583247, Integer.valueOf(intValue));
                            Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        LIZ = LK5.LIZ(2131583230, Integer.valueOf(intValue));
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    }
                } else {
                    LIZ = LK5.LIZ(2131583226, Integer.valueOf(intValue));
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                }
            }
            linkedHashMap.put(valueOf, LIZ);
        }
        return linkedHashMap;
    }
}
