package com.bytedance.android.live.core.p317e;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.logsdk.collect.p785a.AbstractC9727b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.e.a */
/* loaded from: classes12.dex */
public class C4070a extends Fragment implements AbstractC9727b, AbstractC13971f {
    public static ChangeQuickRedirect LJJLIIJ;
    public final CompositeDisposable LIZ = new CompositeDisposable();
    public boolean LJJLIL;
    public boolean LJJLJ;
    public boolean LJJLJLI;

    static {
        Covode.recordClassIndex(23448);
    }

    @Override // p003X.C43X
    public Map<String, Object> getEnvData() {
        return null;
    }

    public Map<String, Object> getPropertyParams() {
        return null;
    }

    public String getSceneFullName() {
        return "com/bytedance/android/live/core/ui/BaseFragment";
    }

    public String getSceneSimpleName() {
        return "BaseFragment";
    }

    public String getSpm() {
        return null;
    }

    @Override // com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public boolean isIgnored() {
        return false;
    }

    public boolean LJIILIIL() {
        return this.LJJLJ;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LJJLIIJ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJJLJ = false;
        this.LJJLJLI = true;
        this.LIZ.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LJJLIIJ, false, 6).isSupported) {
            return;
        }
        super.onDestroyView();
        this.LJJLJ = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LJJLIIJ, false, 5).isSupported) {
            return;
        }
        super.onPause();
        this.LJJLIL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJJLIIJ, false, 4).isSupported) {
            return;
        }
        super.onResume();
        this.LJJLIL = true;
    }

    public void LIZIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LJJLIIJ, false, 1).isSupported) {
            return;
        }
        this.LIZ.add(disposable);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LJJLIIJ, false, 2).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.LJJLIL = false;
        this.LJJLJ = false;
        this.LJJLJLI = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LJJLIIJ, false, 3).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.LJJLJ = true;
    }
}
