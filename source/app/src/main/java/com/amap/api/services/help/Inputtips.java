package com.amap.api.services.help;

import android.content.Context;
import com.amap.api.services.interfaces.IInputtipsSearch;
import com.amap.api.services.p126a.C1831aw;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public final class Inputtips {

    /* renamed from: a */
    public IInputtipsSearch f25069a;

    /* loaded from: classes19.dex */
    public interface InputtipsListener {
        static {
            Covode.recordClassIndex(5711);
        }

        void onGetInputtips(List<Tip> list, int i);
    }

    static {
        Covode.recordClassIndex(5710);
    }

    public final void requestInputtipsAsyn() {
        IInputtipsSearch iInputtipsSearch = this.f25069a;
        if (iInputtipsSearch != null) {
            iInputtipsSearch.requestInputtipsAsyn();
        }
    }

    public final InputtipsQuery getQuery() {
        IInputtipsSearch iInputtipsSearch = this.f25069a;
        if (iInputtipsSearch != null) {
            return iInputtipsSearch.getQuery();
        }
        return null;
    }

    public final List<Tip> requestInputtips() {
        IInputtipsSearch iInputtipsSearch = this.f25069a;
        if (iInputtipsSearch != null) {
            return iInputtipsSearch.requestInputtips();
        }
        return null;
    }

    public final void setInputtipsListener(InputtipsListener inputtipsListener) {
        IInputtipsSearch iInputtipsSearch = this.f25069a;
        if (iInputtipsSearch != null) {
            iInputtipsSearch.setInputtipsListener(inputtipsListener);
        }
    }

    public final void setQuery(InputtipsQuery inputtipsQuery) {
        IInputtipsSearch iInputtipsSearch = this.f25069a;
        if (iInputtipsSearch != null) {
            iInputtipsSearch.setQuery(inputtipsQuery);
        }
    }

    public final void requestInputtips(String str, String str2) {
        IInputtipsSearch iInputtipsSearch = this.f25069a;
        if (iInputtipsSearch != null) {
            iInputtipsSearch.requestInputtips(str, str2);
        }
    }

    public Inputtips(Context context, InputtipsListener inputtipsListener) {
        try {
            this.f25069a = (IInputtipsSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.InputtipsSearchWrapper", C1831aw.class, new Class[]{Context.class, InputtipsListener.class}, new Object[]{context, inputtipsListener});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25069a == null) {
            try {
                this.f25069a = new C1831aw(context, inputtipsListener);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public Inputtips(Context context, InputtipsQuery inputtipsQuery) {
        try {
            this.f25069a = (IInputtipsSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.InputtipsSearchWrapper", C1831aw.class, new Class[]{Context.class, InputtipsQuery.class}, new Object[]{context, inputtipsQuery});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25069a == null) {
            try {
                this.f25069a = new C1831aw(context, inputtipsQuery);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void requestInputtips(String str, String str2, String str3) {
        IInputtipsSearch iInputtipsSearch = this.f25069a;
        if (iInputtipsSearch != null) {
            iInputtipsSearch.requestInputtips(str, str2, str3);
        }
    }
}
