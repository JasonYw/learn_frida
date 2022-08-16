package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.interact.model.C6051an;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.j */
/* loaded from: classes3.dex */
public final class C4341j extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public C6051an LIZIZ;
    public long LIZJ = -1;

    static {
        Covode.recordClassIndex(26119);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4341j(View view) {
        super(view);
        C106862S5w.LIZ(view);
    }

    public final void LIZ(long j) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZJ = j;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        TextView textView = (TextView) view.findViewById(2131193391);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C6051an c6051an = this.LIZIZ;
        if (c6051an != null && (str2 = c6051an.LIZ) != null) {
            str = StringsKt__StringsJVMKt.replace$default(str2, "{0}", LIZIZ(j * 1000), false, 4, (Object) null);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    public final String LIZIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        long j2 = j / 3600000;
        long j3 = (j % 3600000) / 60000;
        long j4 = (j % 60000) / 1000;
        if (j2 > 0) {
            String format = String.format(Locale.CHINA, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }
        String format2 = String.format(Locale.CHINA, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "");
        return format2;
    }
}
