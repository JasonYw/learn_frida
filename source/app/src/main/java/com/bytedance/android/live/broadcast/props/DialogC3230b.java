package com.bytedance.android.live.broadcast.props;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.props.p278a.C3219d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Map;
import p003X.C106862S5w;
import p003X.C82006ITw;
import p003X.C89178LBs;
import p003X.LB6;
import p003X.RunnableC81856IOc;
import p003X.View$OnClickListenerC89167LBh;
import p003X.View$OnClickListenerC89177LBr;
import p003X.View$OnClickListenerC89179LBt;

/* renamed from: com.bytedance.android.live.broadcast.props.b */
/* loaded from: classes5.dex */
public final class DialogC3230b extends LB6 {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public EditText f25936LJ;
    public TextView LJFF;
    public ArrayList<C3219d> LJI;
    public final C3231j LJII;
    public final Map<String, Object> LJIIIIZZ;

    static {
        Covode.recordClassIndex(17623);
    }

    @Override // p003X.LB6
    public final int LIZLLL() {
        return 2131698671;
    }

    @Override // p003X.LB6
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1).isSupported) {
            return;
        }
        this.f25936LJ = (EditText) findViewById(2131174185);
        this.LJFF = (TextView) findViewById(2131195224);
        EditText editText = (EditText) findViewById(2131174185);
        if (!PatchProxy.proxy(new Object[]{editText, 250L}, null, C82006ITw.LIZ, true, 4).isSupported && editText != null) {
            editText.postDelayed(new RunnableC81856IOc(editText), 250L);
        }
        TextView textView = (TextView) findViewById(2131171740);
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC89179LBt(this));
        }
        View findViewById = findViewById(2131178497);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC89177LBr(this));
        }
        TextView textView2 = this.LJFF;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC89167LBh(this));
        }
        EditText editText2 = (EditText) findViewById(2131174185);
        if (editText2 != null) {
            editText2.addTextChangedListener(new C89178LBs(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3230b(Context context, boolean z, C3231j c3231j, Map<String, Object> map) {
        super(context, z);
        C106862S5w.LIZ(context, c3231j, map);
        this.LJII = c3231j;
        this.LJIIIIZZ = map;
    }
}
