package androidx.paging;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import p003X.AbstractC149005fiJ;
import p003X.AbstractC149007fiL;
import p003X.AbstractC149016fiU;
import p003X.AbstractC149017fiV;
import p003X.C149014fiS;
import p003X.C149015fiT;
import p003X.C149018fiW;
import p003X.C149019fiX;

/* renamed from: androidx.paging.e */
/* loaded from: classes20.dex */
public abstract class AbstractC0344e<Key, Value> extends AbstractC149005fiJ<Key, Value> {
    static {
        Covode.recordClassIndex(1547);
    }

    public abstract Key LIZ(Value value);

    public abstract void LIZ(C149018fiW<Key> c149018fiW, AbstractC149016fiU<Value> abstractC149016fiU);

    public abstract void LIZ(C149019fiX<Key> c149019fiX, AbstractC149017fiV<Value> abstractC149017fiV);

    public abstract void LIZIZ(C149019fiX<Key> c149019fiX, AbstractC149017fiV<Value> abstractC149017fiV);

    @Override // p003X.AbstractC149005fiJ
    public final Key LIZ(int i, Value value) {
        if (value == null) {
            return null;
        }
        return LIZ((AbstractC0344e<Key, Value>) value);
    }

    @Override // p003X.AbstractC149005fiJ
    public final void LIZ(int i, Value value, int i2, Executor executor, AbstractC149007fiL<Value> abstractC149007fiL) {
        LIZ(new C149019fiX<>(LIZ((AbstractC0344e<Key, Value>) value), i2), new C149014fiS(this, 1, executor, abstractC149007fiL));
    }

    @Override // p003X.AbstractC149005fiJ
    public final void LIZIZ(int i, Value value, int i2, Executor executor, AbstractC149007fiL<Value> abstractC149007fiL) {
        LIZIZ(new C149019fiX<>(LIZ((AbstractC0344e<Key, Value>) value), i2), new C149014fiS(this, 2, executor, abstractC149007fiL));
    }

    @Override // p003X.AbstractC149005fiJ
    public final void LIZ(Key key, int i, int i2, boolean z, Executor executor, AbstractC149007fiL<Value> abstractC149007fiL) {
        C149015fiT c149015fiT = new C149015fiT(this, z, abstractC149007fiL);
        LIZ(new C149018fiW<>(key, i, z), c149015fiT);
        c149015fiT.LIZ.LIZ(executor);
    }
}
