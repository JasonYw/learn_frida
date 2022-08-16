package com.airbnb.lottie.p047a.p048a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.AbstractC0846b;
import com.airbnb.lottie.model.content.C0849j;
import com.airbnb.lottie.model.layer.AbstractC0851a;
import com.airbnb.lottie.model.p051a.C0842l;
import com.airbnb.lottie.p047a.p049b.a$a;
import com.airbnb.lottie.value.LottieValueCallback;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC145196eim;
import p003X.AbstractC145291ekJ;
import p003X.AbstractC145297ekP;
import p003X.C145228ejI;
import p003X.C145328eku;

/* renamed from: com.airbnb.lottie.a.a.d */
/* loaded from: classes19.dex */
public final class C0828d implements AbstractC145291ekJ, AbstractC0830n, a$a, AbstractC145196eim {
    public final Matrix LIZ;
    public final Path LIZIZ;
    public final RectF LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final List<AbstractC0827c> f21082LJ;
    public final LottieDrawable LJFF;
    public List<AbstractC0830n> LJI;
    public C145228ejI LJII;

    static {
        Covode.recordClassIndex(3978);
    }

    @Override // com.airbnb.lottie.p047a.p048a.AbstractC0827c
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // com.airbnb.lottie.p047a.p049b.a$a
    public final void LIZ() {
        this.LJFF.invalidateSelf();
    }

    public final Matrix LIZLLL() {
        C145228ejI c145228ejI = this.LJII;
        if (c145228ejI != null) {
            return c145228ejI.LIZ();
        }
        this.LIZ.reset();
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<AbstractC0830n> LIZJ() {
        if (this.LJI == null) {
            this.LJI = new ArrayList();
            for (int i = 0; i < this.f21082LJ.size(); i++) {
                AbstractC0827c abstractC0827c = this.f21082LJ.get(i);
                if (abstractC0827c instanceof AbstractC0830n) {
                    this.LJI.add(abstractC0827c);
                }
            }
        }
        return this.LJI;
    }

    @Override // com.airbnb.lottie.p047a.p048a.AbstractC0830n
    /* renamed from: LJ */
    public final Path mo20542LJ() {
        this.LIZ.reset();
        C145228ejI c145228ejI = this.LJII;
        if (c145228ejI != null) {
            this.LIZ.set(c145228ejI.LIZ());
        }
        this.LIZIZ.reset();
        for (int size = this.f21082LJ.size() - 1; size >= 0; size--) {
            AbstractC0827c abstractC0827c = this.f21082LJ.get(size);
            if (abstractC0827c instanceof AbstractC0830n) {
                this.LIZIZ.addPath(((AbstractC0830n) abstractC0827c).mo20542LJ(), this.LIZ);
            }
        }
        return this.LIZIZ;
    }

    public static C0842l LIZ(List<AbstractC0846b> list) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC0846b abstractC0846b = list.get(i);
            if (abstractC0846b instanceof C0842l) {
                return (C0842l) abstractC0846b;
            }
        }
        return null;
    }

    @Override // p003X.AbstractC145196eim
    public final <T> void LIZ(T t, LottieValueCallback<T> lottieValueCallback) {
        C145228ejI c145228ejI = this.LJII;
        if (c145228ejI != null) {
            c145228ejI.LIZ(t, lottieValueCallback);
        }
    }

    @Override // p003X.AbstractC145291ekJ
    public final void LIZ(RectF rectF, Matrix matrix) {
        this.LIZ.set(matrix);
        C145228ejI c145228ejI = this.LJII;
        if (c145228ejI != null) {
            this.LIZ.preConcat(c145228ejI.LIZ());
        }
        this.LIZJ.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f21082LJ.size() - 1; size >= 0; size--) {
            AbstractC0827c abstractC0827c = this.f21082LJ.get(size);
            if (abstractC0827c instanceof AbstractC145291ekJ) {
                AbstractC145291ekJ abstractC145291ekJ = (AbstractC145291ekJ) abstractC0827c;
                abstractC145291ekJ.LIZ(this.LIZJ, this.LIZ);
                if (C145328eku.LIZ) {
                    abstractC145291ekJ.LIZ(this.LIZJ, this.LIZ);
                    rectF.union(this.LIZJ);
                } else if (rectF.isEmpty()) {
                    rectF.set(this.LIZJ);
                } else {
                    rectF.set(Math.min(rectF.left, this.LIZJ.left), Math.min(rectF.top, this.LIZJ.top), Math.max(rectF.right, this.LIZJ.right), Math.max(rectF.bottom, this.LIZJ.bottom));
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p047a.p048a.AbstractC0827c
    public final void LIZ(List<AbstractC0827c> list, List<AbstractC0827c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f21082LJ.size());
        arrayList.addAll(list);
        for (int size = this.f21082LJ.size() - 1; size >= 0; size--) {
            AbstractC0827c abstractC0827c = this.f21082LJ.get(size);
            abstractC0827c.LIZ(arrayList, this.f21082LJ.subList(0, size));
            arrayList.add(abstractC0827c);
        }
    }

    public C0828d(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a, C0849j c0849j) {
        this(lottieDrawable, abstractC0851a, c0849j.LIZ, LIZ(lottieDrawable, abstractC0851a, c0849j.LIZIZ), LIZ(c0849j.LIZIZ));
    }

    public static List<AbstractC0827c> LIZ(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a, List<AbstractC0846b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            AbstractC0827c LIZ = list.get(i).LIZ(lottieDrawable, abstractC0851a);
            if (LIZ != null) {
                arrayList.add(LIZ);
            }
        }
        return arrayList;
    }

    @Override // p003X.AbstractC145291ekJ
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        this.LIZ.set(matrix);
        C145228ejI c145228ejI = this.LJII;
        if (c145228ejI != null) {
            this.LIZ.preConcat(c145228ejI.LIZ());
            i = (int) ((((this.LJII.f19300LJ.LJFF().intValue() / 100.0f) * i) / 255.0f) * 255.0f);
        }
        for (int size = this.f21082LJ.size() - 1; size >= 0; size--) {
            AbstractC0827c abstractC0827c = this.f21082LJ.get(size);
            if (abstractC0827c instanceof AbstractC145291ekJ) {
                ((AbstractC145291ekJ) abstractC0827c).LIZ(canvas, this.LIZ, i);
            }
        }
    }

    @Override // p003X.AbstractC145196eim
    public final void LIZ(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        if (!keyPath.matches(LIZIZ(), i)) {
            return;
        }
        if (!"__container".equals(LIZIZ())) {
            keyPath2 = keyPath2.addKey(LIZIZ());
            if (keyPath.fullyResolvesTo(LIZIZ(), i)) {
                list.add(keyPath2.resolve(this));
            }
        }
        if (keyPath.propagateToChildren(LIZIZ(), i)) {
            int incrementDepthBy = i + keyPath.incrementDepthBy(LIZIZ(), i);
            for (int i2 = 0; i2 < this.f21082LJ.size(); i2++) {
                AbstractC0827c abstractC0827c = this.f21082LJ.get(i2);
                if (abstractC0827c instanceof AbstractC145196eim) {
                    ((AbstractC145196eim) abstractC0827c).LIZ(keyPath, incrementDepthBy, list, keyPath2);
                }
            }
        }
    }

    public C0828d(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a, String str, List<AbstractC0827c> list, C0842l c0842l) {
        this.LIZ = new Matrix();
        this.LIZIZ = new Path();
        this.LIZJ = new RectF();
        this.LIZLLL = str;
        this.LJFF = lottieDrawable;
        this.f21082LJ = list;
        if (c0842l != null) {
            this.LJII = c0842l.LIZ();
            this.LJII.LIZ(abstractC0851a);
            this.LJII.LIZ(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC0827c abstractC0827c = list.get(size);
            if (abstractC0827c instanceof AbstractC145297ekP) {
                arrayList.add(abstractC0827c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((AbstractC145297ekP) arrayList.get(size2)).LIZ(list.listIterator(list.size()));
        }
    }
}
