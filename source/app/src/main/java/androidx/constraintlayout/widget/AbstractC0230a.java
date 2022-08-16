package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.Arrays;
import p003X.C146243ezl;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes19.dex */
public abstract class AbstractC0230a extends View {
    public int[] LIZ;
    public int LIZIZ;
    public Context LIZJ;
    public C146243ezl LIZLLL;

    /* renamed from: LJ */
    public boolean f20240LJ;
    public String LJFF;

    static {
        Covode.recordClassIndex(853);
    }

    public void LIZJ() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    public final void LIZIZ() {
        if (this.LIZLLL == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).widget = this.LIZLLL;
        }
    }

    public AbstractC0230a(Context context) {
        super(context);
        this.LIZ = new int[32];
        this.LIZJ = context;
        LIZ((AttributeSet) null);
    }

    public void setReferencedIds(int[] iArr) {
        this.LIZIZ = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                LIZ(str.substring(i));
                return;
            } else {
                LIZ(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void LIZ(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.LJFF);
        }
        C146243ezl c146243ezl = this.LIZLLL;
        if (c146243ezl == null) {
            return;
        }
        c146243ezl.LJJII();
        for (int i = 0; i < this.LIZIZ; i++) {
            View viewById = constraintLayout.getViewById(this.LIZ[i]);
            if (viewById != null) {
                this.LIZLLL.LIZ(constraintLayout.getViewWidget(viewById));
            }
        }
    }

    private void LIZ(String str) {
        int i;
        Object designInformation;
        if (str == null || this.LIZJ == null) {
            return;
        }
        String trim = str.trim();
        try {
            i = R$id.class.getField(trim).getInt(null);
        } catch (Exception unused) {
        }
        if (i == 0) {
            i = this.LIZJ.getResources().getIdentifier(trim, C33968a.f42937f, this.LIZJ.getPackageName());
            if (i == 0 && (!isInEditMode() || !(getParent() instanceof ConstraintLayout) || (designInformation = ((ConstraintLayout) getParent()).getDesignInformation(0, trim)) == null || !(designInformation instanceof Integer) || (i = ((Integer) designInformation).intValue()) == 0)) {
                return;
            }
        }
        setTag(i, null);
    }

    public void LIZ(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, 2130771969, 2130771970, 2130771971, 2130771973, 2130771974, 2130771975, 2130771976, 2130771977, 2130771978, 2130771979, 2130771980, 2130771981, 2130771982, 2130771984, 2130771985, 2130771986, 2130771988, 2130771989, 2130771990, 2130772038, 2130772042, 2130772045, 2130772055, 2130772056, 2130772057, 2130772296, 2130772551, 2130772783, 2130773497, 2130773498, 2130773499, 2130773500, 2130773501, 2130773502, 2130773503, 2130773504, 2130773505, 2130773506, 2130773507, 2130773508, 2130773509, 2130773510, 2130773511, 2130773512, 2130773513, 2130773514, 2130773521, 2130773522, 2130773526, 2130773527, 2130773528, 2130773529, 2130773530, 2130773531, 2130773554});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 23) {
                    this.LJFF = obtainStyledAttributes.getString(index);
                    setIds(this.LJFF);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f20240LJ) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public AbstractC0230a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = new int[32];
        this.LIZJ = context;
        LIZ(attributeSet);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.LIZIZ + 1;
        int[] iArr = this.LIZ;
        if (i2 > iArr.length) {
            this.LIZ = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.LIZ;
        int i3 = this.LIZIZ;
        iArr2[i3] = i;
        this.LIZIZ = i3 + 1;
    }

    public AbstractC0230a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LIZ = new int[32];
        this.LIZJ = context;
        LIZ(attributeSet);
    }
}
