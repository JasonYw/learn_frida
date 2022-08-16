package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Writer;
import p003X.AbstractC103423Qo5;
import p003X.C106862S5w;

/* renamed from: bytekn.foundation.io.file.j */
/* loaded from: classes8.dex */
public class C0623j implements AbstractC103423Qo5 {
    public static ChangeQuickRedirect LIZ;
    public final Writer LIZIZ;

    static {
        Covode.recordClassIndex(2654);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZIZ.flush();
    }

    @Override // p003X.AbstractC103423Qo5
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZIZ.close();
    }

    public C0623j(Writer writer) {
        C106862S5w.LIZ(writer);
        this.LIZIZ = writer;
    }

    public final void LIZ(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(charSequence);
        this.LIZIZ.append(charSequence);
    }

    public final void LIZ(String str) {
        MethodCollector.m14708i(163);
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(163);
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZIZ.write(str);
        MethodCollector.m14707o(163);
    }
}
