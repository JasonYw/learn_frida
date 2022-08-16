package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.alibaba.wireless.security.framework.utils.c */
/* loaded from: classes26.dex */
public class C1129c {

    /* renamed from: a */
    public FileChannel f21808a;

    /* renamed from: b */
    public FileLock f21809b;

    /* renamed from: c */
    public RandomAccessFile f21810c;

    /* renamed from: d */
    public File f21811d;

    /* renamed from: e */
    public boolean f21812e;

    /* renamed from: f */
    public String f21813f;

    static {
        Covode.recordClassIndex(4553);
    }

    public C1129c(Context context, String str) {
        this.f21812e = true;
        this.f21813f = str;
        this.f21812e = m19707c();
    }

    /* renamed from: c */
    private boolean m19707c() {
        try {
            this.f21811d = new File(this.f21813f);
            if (!this.f21811d.exists()) {
                this.f21811d.createNewFile();
            }
        } catch (Exception unused) {
            if (!this.f21811d.exists()) {
                try {
                    this.f21811d.createNewFile();
                } catch (Exception unused2) {
                }
            }
        }
        File file = this.f21811d;
        return file != null && file.exists();
    }

    /* renamed from: a */
    public boolean m19709a() {
        if (!this.f21812e) {
            this.f21812e = m19707c();
            if (!this.f21812e) {
                return true;
            }
        }
        boolean z = false;
        try {
            if (this.f21811d == null) {
                return false;
            }
            this.f21810c = new RandomAccessFile(this.f21811d, "rw");
            this.f21808a = this.f21810c.getChannel();
            this.f21809b = this.f21808a.lock();
            z = true;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    /* renamed from: b */
    public boolean m19708b() {
        boolean z = true;
        if (!this.f21812e) {
            return true;
        }
        try {
            if (this.f21809b != null) {
                this.f21809b.release();
                this.f21809b = null;
            }
        } catch (IOException unused) {
            z = false;
        }
        try {
            if (this.f21808a != null) {
                this.f21808a.close();
                this.f21808a = null;
            }
        } catch (IOException unused2) {
            z = false;
        }
        try {
            if (this.f21810c == null) {
                return z;
            }
            this.f21810c.close();
            this.f21810c = null;
            return z;
        } catch (IOException unused3) {
            return false;
        }
    }
}
