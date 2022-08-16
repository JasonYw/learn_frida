package androidx.loader.p019a;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0326p;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p003X.AbstractC145696equ;
import p003X.C145690eqo;
import p003X.C145691eqp;

/* renamed from: androidx.loader.a.a */
/* loaded from: classes19.dex */
public abstract class AbstractC0327a {
    static {
        Covode.recordClassIndex(1423);
    }

    public abstract <D> C145691eqp<D> LIZ(int i, Bundle bundle, AbstractC145696equ<D> abstractC145696equ);

    public abstract void LIZ();

    public abstract void LIZ(int i);

    public abstract void LIZ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> C145691eqp<D> LIZIZ(int i, Bundle bundle, AbstractC145696equ<D> abstractC145696equ);

    public static <T extends LifecycleOwner & AbstractC0326p> AbstractC0327a LIZ(T t) {
        return new C145690eqo(t, t.getViewModelStore());
    }
}
