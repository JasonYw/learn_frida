package com.android.ttcjpaysdk.thirdparty.front.counter.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.p135ui.CJPayMiddleTitleText;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import p003X.AbstractC137398cgc;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC137394cgY;
import p003X.View$OnClickListenerC137397cgb;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.counter.fragment.b */
/* loaded from: classes17.dex */
public final class C2375b extends CJPayBaseFragment {
    public static ChangeQuickRedirect LIZ;
    public AbstractC137398cgc LIZIZ;
    public CJPayCustomButton LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public CJPayMiddleTitleText f25532LJ;
    public ImageView LJFF;
    public TextView LJIIJ;
    public String LJIIJJI;
    public int LJIIL = 470;
    public HashMap LJIILIIL;

    static {
        Covode.recordClassIndex(8662);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690614;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        Bundle arguments;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (arguments = getArguments()) != null) {
            this.LJIIJJI = arguments.getString("insufficient_hint_msg");
            this.LJIIL = arguments.getInt("insufficient_fragment_height");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (hashMap = this.LJIILIIL) != null) {
            hashMap.clear();
        }
    }

    public final void LIZ(AbstractC137398cgc abstractC137398cgc) {
        if (PatchProxy.proxy(new Object[]{abstractC137398cgc}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC137398cgc);
        this.LIZIZ = abstractC137398cgc;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 4).isSupported) {
            return;
        }
        CJPayCustomButton cJPayCustomButton = this.LIZJ;
        if (cJPayCustomButton != null) {
            cJPayCustomButton.setOnClickListener(new View$OnClickListenerC137394cgY(this));
        }
        ImageView imageView = this.LJFF;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC137397cgb(this));
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        CJPayCustomButton cJPayCustomButton;
        View view2;
        CJPayMiddleTitleText cJPayMiddleTitleText;
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 2).isSupported) {
            return;
        }
        TextView textView = null;
        if (view != null) {
            cJPayCustomButton = (CJPayCustomButton) view.findViewById(2131177960);
        } else {
            cJPayCustomButton = null;
        }
        this.LIZJ = cJPayCustomButton;
        if (view != null) {
            view2 = view.findViewById(2131165575);
        } else {
            view2 = null;
        }
        this.LIZLLL = view2;
        if (view != null) {
            cJPayMiddleTitleText = (CJPayMiddleTitleText) view.findViewById(2131169910);
        } else {
            cJPayMiddleTitleText = null;
        }
        this.f25532LJ = cJPayMiddleTitleText;
        if (view != null) {
            imageView = (ImageView) view.findViewById(2131165337);
        } else {
            imageView = null;
        }
        this.LJFF = imageView;
        if (view != null) {
            textView = (TextView) view.findViewById(2131177974);
        }
        this.LJIIJ = textView;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        TextView textView;
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        View view2 = this.LIZLLL;
        if (view2 != null && this.LJIIL != 470 && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = CJPayBasicUtils.dipToPX(getContext(), this.LJIIL);
        }
        ImageView imageView = this.LJFF;
        if (imageView != null) {
            imageView.setImageResource(2130840410);
        }
        CJPayMiddleTitleText cJPayMiddleTitleText = this.f25532LJ;
        if (cJPayMiddleTitleText != null) {
            cJPayMiddleTitleText.setText("抖音支付");
        }
        if (!TextUtils.isEmpty(this.LJIIJJI) && (textView = this.LJIIJ) != null) {
            textView.setText(this.LJIIJJI);
        }
    }
}
