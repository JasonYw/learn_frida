package com.android.ttcjpaysdk.base.framework;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.service.api.CJPayDataKeepAPI;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import p003X.AbstractC136217cNY;
import p003X.C116971W2r;
import p003X.C136458cRR;

/* loaded from: classes17.dex */
public abstract class BaseFragment extends Fragment {
    public static ChangeQuickRedirect LJI;
    public AbstractC136217cNY LJII;
    public boolean LJIIIIZZ;
    public View LJIIIZ;
    public Context mContext;
    public volatile boolean mIsQueryConnecting;

    static {
        Covode.recordClassIndex(6019);
    }

    public abstract void LIZ(View view);

    public abstract void LIZ(View view, Bundle bundle);

    public abstract int LIZIZ();

    public abstract void LIZIZ(View view);

    public abstract void LIZIZ(boolean z, boolean z2);

    public View LIZJ(View view) {
        return view;
    }

    public abstract void LIZJ();

    /* renamed from: LJ */
    public int mo16030LJ() {
        return -1;
    }

    public int LJFF() {
        return -1;
    }

    public String LJI() {
        return null;
    }

    public boolean getIsQueryConnecting() {
        return this.mIsQueryConnecting;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 4).isSupported) {
            return;
        }
        super.onPause();
        LIZ(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 3).isSupported) {
            return;
        }
        super.onResume();
        if (getUserVisibleHint()) {
            LIZ(true);
        }
    }

    public void setIsQueryConnecting(boolean z) {
        this.mIsQueryConnecting = z;
    }

    public final <T> T LIZ(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LJI, false, 16);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        AbstractC136217cNY abstractC136217cNY = this.LJII;
        if (abstractC136217cNY == null) {
            return null;
        }
        try {
            return cls.cast(abstractC136217cNY);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LJI, false, 17).isSupported) {
            return;
        }
        CJPayDataKeepAPI.saveData(bundle, this);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJI, false, 5).isSupported) {
            return;
        }
        super.setUserVisibleHint(z);
        getUserVisibleHint();
        if (isResumed()) {
            LIZ(z);
        }
    }

    public String getStringParam(String str) {
        String queryParameter;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJI, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (getActivity() != null && getActivity().getIntent() != null) {
            if (getActivity().getIntent().hasExtra(str)) {
                queryParameter = getActivity().getIntent().getStringExtra(str);
            } else if (getActivity().getIntent().getData() != null) {
                queryParameter = getActivity().getIntent().getData().getQueryParameter(str);
            }
            if (queryParameter == null) {
                return "";
            }
            return queryParameter;
        }
        return "";
    }

    public final Serializable LIZ(String str) {
        Serializable serializable;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LJI, false, 12);
        if (proxy.isSupported) {
            return (Serializable) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, this, LJI, false, 11);
        if (proxy2.isSupported) {
            serializable = (Serializable) proxy2.result;
        } else {
            if (getActivity() != null && getActivity().getIntent() != null) {
                if (getActivity().getIntent().hasExtra(str)) {
                    serializable = getActivity().getIntent().getSerializableExtra(str);
                } else if (getActivity().getIntent().getData() != null) {
                    serializable = getActivity().getIntent().getData().getQueryParameter(str);
                }
                if (serializable == null) {
                    serializable = "";
                }
            }
            serializable = "";
        }
        if (serializable instanceof String) {
            return null;
        }
        return serializable;
    }

    public void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJI, false, 6).isSupported) {
            return;
        }
        if (z) {
            C136458cRR.LIZ(LJI());
            CJPayPerformance.LIZ().LIZIZ(getClass().toString());
            return;
        }
        CJPayPerformance.LIZ().LIZJ(getClass().toString());
    }

    public final String LIZ(Context context, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i)}, this, LJI, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (context != null) {
            return context.getString(i);
        }
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LJI, false, 2).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        LIZJ();
        LIZ(view, bundle);
        LIZIZ(view);
        this.LJIIIIZZ = true;
    }

    public final long LIZ(String str, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, 0L}, this, LJI, false, 9);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (getActivity() != null && getActivity().getIntent() != null) {
            if (getActivity().getIntent().hasExtra(str)) {
                return getActivity().getIntent().getLongExtra(str, 0L);
            }
            if (getActivity().getIntent().getData() != null) {
                try {
                    return Long.valueOf(getActivity().getIntent().getData().getQueryParameter(str)).longValue();
                } catch (Exception unused) {
                }
            }
        }
        return 0L;
    }

    public final Boolean LIZ(String str, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, bool}, this, LJI, false, 10);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        if (getActivity() != null && getActivity().getIntent() != null) {
            if (getActivity().getIntent().hasExtra(str)) {
                return Boolean.valueOf(getActivity().getIntent().getBooleanExtra(str, bool.booleanValue()));
            }
            if (getActivity().getIntent().getData() != null) {
                try {
                    return Boolean.valueOf(getActivity().getIntent().getData().getBooleanQueryParameter(str, bool.booleanValue()));
                } catch (Exception unused) {
                }
            }
        }
        return bool;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LJI, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (bundle != null) {
            CJPayDataKeepAPI.restoreData(bundle, this);
        } else {
            CJPayDataKeepAPI.autoWiredData(bundle, this);
        }
        C136458cRR.LIZ(LJI());
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mContext = getActivity();
        View LIZJ = LIZJ(C116971W2r.LIZ(layoutInflater, LIZIZ(), viewGroup, false));
        LIZJ.setOnClickListener(new View.OnClickListener(this) { // from class: com.android.ttcjpaysdk.base.framework.BaseFragment.1
            static {
                Covode.recordClassIndex(6020);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        LIZ(LIZJ);
        this.LJIIIZ = LIZJ;
        return LIZJ;
    }

    public final String LIZ(Context context, int i, Object... objArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), objArr}, this, LJI, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (context != null) {
            return context.getString(i, objArr);
        }
        return "";
    }
}
