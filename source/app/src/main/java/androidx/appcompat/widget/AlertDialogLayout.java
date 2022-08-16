package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    static {
        Covode.recordClassIndex(609);
    }

    public AlertDialogLayout(Context context) {
        super(context);
    }

    public static int LIZ(View view) {
        while (true) {
            int minimumHeight = ViewCompat.getMinimumHeight(view);
            if (minimumHeight > 0) {
                return minimumHeight;
            }
            if (!(view instanceof ViewGroup)) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() != 1) {
                break;
            }
            view = viewGroup.getChildAt(0);
        }
        return 0;
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        int i8 = 0;
        while (true) {
            i3 = i2;
            if (i8 < childCount) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == 2131165318) {
                        view = childAt;
                    } else if (id == 2131165294) {
                        view2 = childAt;
                    } else if ((id == 2131165271 || id == 2131165269) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i8++;
            } else {
                int mode = View.MeasureSpec.getMode(i3);
                int size = View.MeasureSpec.getSize(i3);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i, 0);
                    paddingTop += view.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i4 = 0;
                }
                if (view2 != null) {
                    view2.measure(i, 0);
                    i5 = LIZ(view2);
                    i6 = view2.getMeasuredHeight() - i5;
                    paddingTop += i5;
                    i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i, makeMeasureSpec);
                    i7 = view3.getMeasuredHeight();
                    paddingTop += i7;
                    i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
                } else {
                    i7 = 0;
                }
                int i9 = size - paddingTop;
                if (view2 != null) {
                    int i10 = paddingTop - i5;
                    int min = Math.min(i9, i6);
                    if (min > 0) {
                        i9 -= min;
                        i5 += min;
                    }
                    view2.measure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                    paddingTop = i10 + view2.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
                }
                if (view3 != null && i9 > 0) {
                    view3.measure(i, View.MeasureSpec.makeMeasureSpec(i7 + i9, mode));
                    paddingTop = (paddingTop - i7) + view3.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
                }
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2.getVisibility() != 8) {
                        i11 = Math.max(i11, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i11 + getPaddingLeft() + getPaddingRight(), i, i4), View.resolveSizeAndState(paddingTop, i3, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt3 = getChildAt(i13);
                        if (childAt3.getVisibility() != 8) {
                            LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i14 = layoutParams.height;
                                layoutParams.height = childAt3.getMeasuredHeight();
                                i3 = i3;
                                measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i3, 0);
                                layoutParams.height = i14;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        super.onMeasure(i, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        /*
            r13 = this;
            int r12 = r13.getPaddingLeft()
            int r17 = r17 - r15
            int r0 = r13.getPaddingRight()
            int r11 = r17 - r0
            int r17 = r17 - r12
            int r0 = r13.getPaddingRight()
            int r17 = r17 - r0
            int r2 = r13.getMeasuredHeight()
            int r3 = r13.getChildCount()
            int r10 = r13.getGravity()
            r1 = r10 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r10 = r10 & r0
            r0 = 16
            if (r1 == r0) goto La7
            r0 = 80
            if (r1 == r0) goto L9d
            int r1 = r13.getPaddingTop()
        L32:
            android.graphics.drawable.Drawable r0 = r13.getDividerDrawable()
            r6 = 0
            if (r0 != 0) goto L98
            r9 = 0
        L3a:
            if (r6 >= r3) goto Lb3
            android.view.View r7 = r13.getChildAt(r6)
            if (r7 == 0) goto L84
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L84
            int r5 = r7.getMeasuredWidth()
            int r8 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            int r2 = r4.gravity
            if (r2 >= 0) goto L5d
            r2 = r10
        L5d:
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r13)
            int r0 = p003X.C138389cwj.LIZ(r2, r0)
            r2 = r0 & 7
            r0 = 1
            if (r2 == r0) goto L87
            r0 = 5
            if (r2 == r0) goto L92
            int r2 = r4.leftMargin
            int r2 = r2 + r12
        L70:
            boolean r0 = r13.hasDividerBeforeChildAt(r6)
            if (r0 == 0) goto L77
            int r1 = r1 + r9
        L77:
            int r0 = r4.topMargin
            int r1 = r1 + r0
            int r5 = r5 + r2
            int r0 = r1 + r8
            r7.layout(r2, r1, r5, r0)
            int r0 = r4.bottomMargin
            int r8 = r8 + r0
            int r1 = r1 + r8
        L84:
            int r6 = r6 + 1
            goto L3a
        L87:
            int r0 = r17 - r5
            int r2 = r0 / 2
            int r2 = r2 + r12
            int r0 = r4.leftMargin
            int r2 = r2 + r0
            int r0 = r4.rightMargin
            goto L96
        L92:
            int r2 = r11 - r5
            int r0 = r4.rightMargin
        L96:
            int r2 = r2 - r0
            goto L70
        L98:
            int r9 = r0.getIntrinsicHeight()
            goto L3a
        L9d:
            int r1 = r13.getPaddingTop()
            int r1 = r1 + r18
            int r1 = r1 - r16
            int r1 = r1 - r2
            goto L32
        La7:
            int r1 = r13.getPaddingTop()
            int r18 = r18 - r16
            int r18 = r18 - r2
            int r0 = r18 / 2
            int r1 = r1 + r0
            goto L32
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }
}
