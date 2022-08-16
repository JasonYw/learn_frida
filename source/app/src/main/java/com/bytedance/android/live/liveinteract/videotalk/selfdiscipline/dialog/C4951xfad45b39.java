package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C448143o0;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog.SelfDisciplineTargetDialog$TargetListAdapter$onBindViewHolder$$inlined$with$lambda$1 */
/* loaded from: classes12.dex */
public final class C4951xfad45b39 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $position$inlined;
    public final /* synthetic */ TextView $this_with;
    public final /* synthetic */ C448143o0 this$0;

    static {
        Covode.recordClassIndex(30412);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4951xfad45b39(TextView textView, C448143o0 c448143o0, int i) {
        super(1);
        this.$this_with = textView;
        this.this$0 = c448143o0;
        this.$position$inlined = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            TextView textView = this.$this_with;
            textView.setSelected(true ^ textView.isSelected());
            this.this$0.LIZIZ.LIZIZ = this.$this_with.getText().toString();
            this.this$0.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
