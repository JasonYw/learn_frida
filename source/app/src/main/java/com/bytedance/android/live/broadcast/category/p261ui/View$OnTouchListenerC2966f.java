package com.bytedance.android.live.broadcast.category.p261ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C88440Kt0;
import p003X.KN1;
import p003X.View$OnClickListenerC86921KMx;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.f */
/* loaded from: classes5.dex */
public final class View$OnTouchListenerC2966f extends C4070a implements View.OnTouchListener, AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = C77347GeT.LIZ(new PreviewCategoryEditFragment$mCategoryViewModel$2(this));
    public HashMap LIZJ;

    static {
        Covode.recordClassIndex(15115);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        View view = (View) this.LIZJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LIZJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C2970a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2970a) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/broadcast/category/ui/PreviewCategoryEditFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "PreviewCategoryEditFragment";
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZ().LJIILLIIL().postValue(null);
        C88440Kt0.LIZ(2131582268);
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (hashMap = this.LIZJ) != null) {
            hashMap.clear();
        }
    }

    public final HashMap<String, String> LIZIZ() {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        C3VF user = ((IUserService) ServiceManager.getService(IUserService.class)).user();
        if (user != null) {
            l = Long.valueOf(user.LIZIZ());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l.longValue()));
        hashMap.put("request_page", "live_start");
        return hashMap;
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(this);
        TextView textView = (TextView) LIZ(2131169125);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        CategoryNode value = LIZ().LJI().getValue();
        if (value != null) {
            str = value.title;
        } else {
            str = null;
        }
        textView.setText(str);
        ((EditText) LIZ(2131175930)).requestFocus();
        ((Button) LIZ(2131169107)).setOnClickListener(new View$OnClickListenerC86921KMx(this));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            Button button = (Button) LIZ(2131169107);
            Intrinsics.checkNotNullExpressionValue(button, "");
            button.setEnabled(false);
            ((EditText) LIZ(2131175930)).addTextChangedListener(new KN1(this));
        }
        C4574547f.LIZ().LIZ("livesdk_room_other_content_show", LIZIZ(), new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        return C116971W2r.LIZ(layoutInflater, 2131698413, viewGroup, false);
    }
}
