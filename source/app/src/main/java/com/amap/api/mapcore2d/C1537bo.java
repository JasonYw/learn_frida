package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

/* renamed from: com.amap.api.mapcore2d.bo */
/* loaded from: classes10.dex */
public class C1537bo<T> {

    /* renamed from: a */
    public LinkedList<T> f23033a = new LinkedList<>();

    /* renamed from: b */
    public final Semaphore f23034b = new Semaphore(0, false);

    /* renamed from: c */
    public boolean f23035c = true;

    static {
        Covode.recordClassIndex(5085);
    }

    /* renamed from: a */
    public void m18266a() {
        this.f23035c = false;
        this.f23034b.release(100);
    }

    /* renamed from: b */
    public void m18263b() {
        LinkedList<T> linkedList = this.f23033a;
        if (linkedList == null) {
            return;
        }
        linkedList.clear();
    }

    /* renamed from: a */
    public ArrayList<T> m18265a(int i, boolean z) {
        LinkedList<T> linkedList = this.f23033a;
        ArrayList<T> arrayList = null;
        if (linkedList != null && linkedList.size() != 0) {
            try {
                this.f23034b.acquire();
            } catch (InterruptedException unused) {
            }
            try {
                if (this.f23035c) {
                    arrayList = mo18260b(i, z);
                }
            } catch (Throwable unused2) {
            }
            this.f23034b.release();
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void m18264a(List<T> list, boolean z) {
        if (this.f23033a == null) {
            return;
        }
        if (z) {
            try {
                this.f23033a.clear();
            } catch (Throwable unused) {
                return;
            }
        }
        if (list != null) {
            this.f23033a.addAll(list);
        }
        this.f23034b.release();
    }

    /* renamed from: b */
    public synchronized ArrayList<T> mo18260b(int i, boolean z) {
        if (this.f23033a == null) {
            return null;
        }
        int size = this.f23033a.size();
        if (i > size) {
            i = size;
        }
        ArrayList<T> arrayList = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.f23033a.get(0));
            this.f23033a.removeFirst();
        }
        return arrayList;
    }
}
