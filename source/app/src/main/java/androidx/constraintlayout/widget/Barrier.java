package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import p003X.C146249ezr;

/* loaded from: classes19.dex */
public class Barrier extends AbstractC0230a {
    public int LJFF;
    public int LJI;
    public C146249ezr LJII;

    static {
        Covode.recordClassIndex(845);
    }

    public int getType() {
        return this.LJFF;
    }

    public final boolean LIZ() {
        return this.LJII.LIZIZ;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.LJII.LIZIZ = z;
    }

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setType(int i) {
        this.LJFF = i;
        this.LJI = i;
        int i2 = Build.VERSION.SDK_INT;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i3 = this.LJFF;
            if (i3 == 5) {
                this.LJI = 1;
            } else if (i3 == 6) {
                this.LJI = 0;
            }
        } else {
            int i4 = this.LJFF;
            if (i4 == 5) {
                this.LJI = 0;
            } else if (i4 == 6) {
                this.LJI = 1;
            }
        }
        this.LJII.LIZ = this.LJI;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0230a
    public void LIZ(AttributeSet attributeSet) {
        super.LIZ(attributeSet);
        this.LJII = new C146249ezr();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, 2130771969, 2130771970, 2130771971, 2130771973, 2130771974, 2130771975, 2130771976, 2130771977, 2130771978, 2130771979, 2130771980, 2130771981, 2130771982, 2130771984, 2130771985, 2130771986, 2130771988, 2130771989, 2130771990, 2130772038, 2130772042, 2130772045, 2130772055, 2130772056, 2130772057, 2130772296, 2130772551, 2130772783, 2130773497, 2130773498, 2130773499, 2130773500, 2130773501, 2130773502, 2130773503, 2130773504, 2130773505, 2130773506, 2130773507, 2130773508, 2130773509, 2130773510, 2130773511, 2130773512, 2130773513, 2130773514, 2130773521, 2130773522, 2130773526, 2130773527, 2130773528, 2130773529, 2130773530, 2130773531, 2130773554});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 22) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 30) {
                    this.LJII.LIZIZ = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.LIZLLL = this.LJII;
        LIZIZ();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
