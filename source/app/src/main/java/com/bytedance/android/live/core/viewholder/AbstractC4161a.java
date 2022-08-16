package com.bytedance.android.live.core.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/* renamed from: com.bytedance.android.live.core.viewholder.a */
/* loaded from: classes8.dex */
public abstract class AbstractC4161a<T> extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LJIIJJI;
    public final CompositeDisposable LIZ = new CompositeDisposable();
    public boolean LJIIL;

    static {
        Covode.recordClassIndex(24221);
    }

    public abstract void LIZ(T t, int i);

    public boolean LIZIZ() {
        return false;
    }

    public void LIZJ() {
        this.LJIIL = true;
    }

    public void LIZLLL() {
        this.LJIIL = false;
    }

    public void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 2).isSupported) {
            return;
        }
        this.LIZ.clear();
    }

    public AbstractC4161a(View view) {
        super(view);
    }

    public final void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LJIIJJI, false, 1).isSupported) {
            return;
        }
        this.LIZ.add(disposable);
    }
}
