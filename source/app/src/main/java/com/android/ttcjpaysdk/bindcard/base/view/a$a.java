package com.android.ttcjpaysdk.bindcard.base.view;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.DialogC135318c93;
import p003X.View$OnClickListenerC135319c94;

/* loaded from: classes17.dex */
public class a$a {
    public static ChangeQuickRedirect LIZ;
    public View.OnClickListener LIZIZ;
    public Context LIZJ;
    public String LIZLLL = "首绑支付更多优惠";

    /* renamed from: LJ */
    public String f25478LJ = "";
    public String LJFF = "知道了";

    static {
        Covode.recordClassIndex(7207);
    }

    public final DialogC135318c93 LIZ() {
        MethodCollector.m14708i(460);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            DialogC135318c93 dialogC135318c93 = (DialogC135318c93) proxy.result;
            MethodCollector.m14707o(460);
            return dialogC135318c93;
        }
        DialogC135318c93 dialogC135318c932 = new DialogC135318c93(this.LIZJ, 2131493160);
        dialogC135318c932.getWindow().setDimAmount(0.5f);
        View inflate = LayoutInflater.from(this.LIZJ).inflate(2131690702, (ViewGroup) null);
        dialogC135318c932.LIZ(inflate);
        dialogC135318c932.addContentView(inflate, new ViewGroup.LayoutParams(-2, -2));
        if (!TextUtils.isEmpty(this.LIZLLL) && dialogC135318c932.LIZIZ != null) {
            dialogC135318c932.LIZIZ.setText(this.LIZLLL);
        }
        if (!TextUtils.isEmpty(this.f25478LJ)) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            dialogC135318c932.LIZJ.setText(this.f25478LJ);
            dialogC135318c932.LIZJ.measure(makeMeasureSpec, makeMeasureSpec2);
            if (dialogC135318c932.LIZJ.getMeasuredHeight() >= CJPayBasicUtils.dipToPX(this.LIZJ, 280.0f)) {
                dialogC135318c932.LIZJ.setHeight(CJPayBasicUtils.dipToPX(this.LIZJ, 280.0f));
                dialogC135318c932.LIZJ.setMovementMethod(ScrollingMovementMethod.getInstance());
            }
        }
        if (!TextUtils.isEmpty(this.LJFF)) {
            dialogC135318c932.LIZLLL.setText(this.LJFF);
        }
        if (this.LIZIZ != null) {
            dialogC135318c932.LIZLLL.setOnClickListener(new View$OnClickListenerC135319c94(this));
        }
        dialogC135318c932.setCanceledOnTouchOutside(false);
        MethodCollector.m14707o(460);
        return dialogC135318c932;
    }

    public final a$a LIZ(View.OnClickListener onClickListener) {
        this.LIZIZ = onClickListener;
        return this;
    }

    public a$a(Context context) {
        this.LIZJ = context;
    }

    public final a$a LIZ(ArrayList<String> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (a$a) proxy.result;
        }
        if (arrayList == null) {
            return this;
        }
        arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            this.f25478LJ += arrayList.get(i);
            if (i != arrayList.size() - 1) {
                this.f25478LJ += '\n';
            }
        }
        return this;
    }
}
