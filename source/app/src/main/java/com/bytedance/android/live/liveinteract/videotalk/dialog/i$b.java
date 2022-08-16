package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.model.C6092ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;
import p003X.DialogC77827GmD;

/* loaded from: classes3.dex */
public final class i$b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ;
    public final Lazy LIZJ;
    public final Lazy LIZLLL;

    /* renamed from: LJ */
    public final Lazy f26443LJ;
    public C6092ad.C6093a LJFF;
    public final /* synthetic */ DialogC77827GmD LJI;

    static {
        Covode.recordClassIndex(30113);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i$b(DialogC77827GmD dialogC77827GmD, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LJI = dialogC77827GmD;
        this.LIZIZ = LazyKt__LazyJVMKt.lazy(new C4914xbe500188(view));
        this.LIZJ = LazyKt__LazyJVMKt.lazy(new C4915x3daa5f32(view));
        this.LIZLLL = LazyKt__LazyJVMKt.lazy(new C4917xbcc24e59(view));
        this.f26443LJ = LazyKt__LazyJVMKt.lazy(new C4916x89acc620(view));
    }
}
