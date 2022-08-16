package bytedance.p029io;

import bytedance.p029io.exception.IllegalPathException;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import p003X.S5K;
import p003X.S5R;

/* renamed from: bytedance.io.BdFile */
/* loaded from: classes9.dex */
public class BdFile extends File {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final S5R fms = S5R.LIZ();

    static {
        Covode.recordClassIndex(2568);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.io.File
    /* renamed from: LIZJ */
    public BdFile getAbsoluteFile() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (BdFile) proxy.result;
        }
        try {
            return new BdFile(getAbsolutePath());
        } catch (IllegalPathException e) {
            S5K.LIZIZ(e.toString());
            return null;
        }
    }

    @Override // java.io.File
    /* renamed from: LIZ */
    public final BdFile getParentFile() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (BdFile) proxy.result;
        }
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new BdFile(parent);
        } catch (IllegalPathException e) {
            S5K.LIZIZ(e.toString());
            return null;
        }
    }

    @Override // java.io.File
    /* renamed from: LIZIZ */
    public final BdFile[] listFiles() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (BdFile[]) proxy.result;
        }
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        BdFile[] bdFileArr = new BdFile[length];
        for (int i = 0; i < length; i++) {
            try {
                bdFileArr[i] = new BdFile(getPath(), list[i]);
            } catch (IllegalPathException e) {
                S5K.LIZIZ(e.toString());
            }
        }
        return bdFileArr;
    }

    @Override // java.io.File
    public String getParent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new BdFile(parent).getPath();
        } catch (IllegalPathException e) {
            S5K.LIZIZ(e.toString());
            return null;
        }
    }

    public BdFile(String str) {
        super(fms.LIZ(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.io.File
    /* renamed from: LIZ */
    public BdFile[] listFiles(FileFilter fileFilter) {
        BdFile bdFile;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fileFilter}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (BdFile[]) proxy.result;
        }
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                bdFile = new BdFile(getPath(), str);
            } catch (IllegalPathException e) {
                S5K.LIZIZ(e.toString());
                bdFile = null;
            }
            if (fileFilter == null || fileFilter.accept(bdFile)) {
                arrayList.add(bdFile);
            }
        }
        return (BdFile[]) arrayList.toArray(new BdFile[arrayList.size()]);
    }

    @Override // java.io.File
    /* renamed from: LIZ */
    public final BdFile[] listFiles(FilenameFilter filenameFilter) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{filenameFilter}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (BdFile[]) proxy.result;
        }
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                try {
                    arrayList.add(new BdFile(getPath(), str));
                } catch (IllegalPathException e) {
                    S5K.LIZIZ(e.toString());
                }
            }
        }
        return (BdFile[]) arrayList.toArray(new BdFile[arrayList.size()]);
    }

    public BdFile(String str, String str2) {
        super(fms.LIZ(str, str2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BdFile(java.io.File r6, java.lang.String r7) {
        /*
            r5 = this;
            X.S5R r4 = bytedance.p029io.BdFile.fms
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r6
            r0 = 1
            r3[r0] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.S5R.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1e
            java.lang.Object r7 = r1.result
            java.lang.String r7 = (java.lang.String) r7
        L1a:
            r5.<init>(r7)
            return
        L1e:
            if (r7 == 0) goto L1a
            if (r6 == 0) goto L3e
            java.lang.String r1 = r6.getPath()
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "/"
            java.lang.String r7 = r4.LIZ(r0, r7)
            goto L1a
        L35:
            java.lang.String r0 = r6.getPath()
            java.lang.String r7 = r4.LIZ(r0, r7)
            goto L1a
        L3e:
            java.lang.String r7 = r4.LIZ(r7)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: bytedance.p029io.BdFile.<init>(java.io.File, java.lang.String):void");
    }
}
