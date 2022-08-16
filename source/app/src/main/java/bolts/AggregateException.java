package bolts;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes2.dex */
public class AggregateException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = 1;
    public List<Throwable> innerThrowables;

    static {
        Covode.recordClassIndex(2483);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        if (PatchProxy.proxy(new Object[]{printStream}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) Integer.toString(i));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        if (PatchProxy.proxy(new Object[]{printWriter}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) Integer.toString(i));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AggregateException(java.lang.String r2, java.util.List<? extends java.lang.Throwable> r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L19
            int r0 = r3.size()
            if (r0 <= 0) goto L19
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        Lf:
            r1.<init>(r2, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            r1.innerThrowables = r0
            return
        L19:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.AggregateException.<init>(java.lang.String, java.util.List):void");
    }
}
