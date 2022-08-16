package androidx.room.util;

import android.database.Cursor;
import android.database.MatrixCursor;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p002O.C0002O;

/* loaded from: classes2.dex */
public class CursorUtil {
    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(1862);
        } else {
            Covode.recordClassIndex(1862);
        }
    }

    public static Cursor copyAndClose(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    int type = cursor.getType(i);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i] = cursor.getBlob(i);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i] = cursor.getString(i);
                                }
                            } else {
                                objArr[i] = Double.valueOf(cursor.getDouble(i));
                            }
                        } else {
                            objArr[i] = Long.valueOf(cursor.getLong(i));
                        }
                    } else {
                        objArr[i] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    public static int getColumnIndex(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndex(C0002O.m25085C("`", str, "`"));
    }

    public static int getColumnIndexOrThrow(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow(C0002O.m25085C("`", str, "`"));
    }
}
