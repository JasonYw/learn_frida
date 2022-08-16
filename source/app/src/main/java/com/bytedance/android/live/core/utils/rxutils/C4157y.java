package com.bytedance.android.live.core.utils.rxutils;

import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.core.utils.rxutils.rxlifecycle.LifecycleEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.utils.rxutils.y */
/* loaded from: classes3.dex */
public class C4157y extends ViewModel {
    public static ChangeQuickRedirect LJIIJJI;
    public final CompositeDisposable LIZ = new CompositeDisposable();
    public final BehaviorSubject<LifecycleEvent> LJIIL = BehaviorSubject.create();
    public final List<Pair<LiveData, Observer>> LIZIZ = new ArrayList();

    static {
        Covode.recordClassIndex(24107);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 1).isSupported) {
            return;
        }
        this.LIZ.clear();
        for (Pair<LiveData, Observer> pair : this.LIZIZ) {
            ((LiveData) pair.first).removeObserver((Observer) pair.second);
        }
        this.LIZIZ.clear();
        this.LJIIL.onNext(LifecycleEvent.DESTROY);
    }

    public final void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LJIIJJI, false, 2).isSupported) {
            return;
        }
        this.LIZ.add(disposable);
    }
}
