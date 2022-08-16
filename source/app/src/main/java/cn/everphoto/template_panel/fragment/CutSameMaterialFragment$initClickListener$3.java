package cn.everphoto.template_panel.fragment;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C83312IsU;

/* loaded from: classes4.dex */
public final class CutSameMaterialFragment$initClickListener$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83312IsU this$0;

    static {
        Covode.recordClassIndex(3705);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameMaterialFragment$initClickListener$3(C83312IsU c83312IsU) {
        super(0);
        this.this$0 = c83312IsU;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ImageView imageView = (ImageView) this.this$0.LIZ(2131171873);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "");
            imageView.setImportantForAccessibility(1);
            ImageView imageView2 = (ImageView) this.this$0.LIZ(2131192140);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "");
            imageView2.setImportantForAccessibility(1);
            RecyclerView recyclerView = (RecyclerView) this.this$0.LIZ(2131182767);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "");
            recyclerView.setImportantForAccessibility(1);
            LinearLayout linearLayout = (LinearLayout) this.this$0.LIZ(2131191939);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "");
            linearLayout.setImportantForAccessibility(1);
        }
        return Unit.INSTANCE;
    }
}
