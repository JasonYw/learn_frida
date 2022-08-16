package androidx.room.util;

import android.database.Cursor;
import android.os.Build;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p002O.C0002O;

/* loaded from: classes13.dex */
public class TableInfo {
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    static {
        Covode.recordClassIndex(1865);
    }

    /* loaded from: classes13.dex */
    public static class Column {
        public final int affinity;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        static {
            Covode.recordClassIndex(1866);
        }

        public boolean isPrimaryKey() {
            if (this.primaryKeyPosition > 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.name.hashCode() * 31) + this.affinity) * 31;
            if (this.notNull) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.primaryKeyPosition;
        }

        public String toString() {
            return "Column{name='" + this.name + "', type='" + this.type + "', affinity='" + this.affinity + "', notNull=" + this.notNull + ", primaryKeyPosition=" + this.primaryKeyPosition + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Column column = (Column) obj;
                int i = Build.VERSION.SDK_INT;
                if (this.primaryKeyPosition == column.primaryKeyPosition && this.name.equals(column.name) && this.notNull == column.notNull && this.affinity == column.affinity) {
                    return true;
                }
            }
            return false;
        }

        public static int findAffinity(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (upperCase.contains("BLOB")) {
                    return 5;
                }
                if (!upperCase.contains("REAL") && !upperCase.contains("FLOA") && !upperCase.contains("DOUB")) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }

        public Column(String str, String str2, boolean z, int i) {
            this.name = str;
            this.type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.affinity = findAffinity(str2);
        }
    }

    /* loaded from: classes26.dex */
    public static class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        static {
            Covode.recordClassIndex(1867);
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + "', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (!this.referenceTable.equals(foreignKey.referenceTable) || !this.onDelete.equals(foreignKey.onDelete) || !this.onUpdate.equals(foreignKey.onUpdate) || !this.columnNames.equals(foreignKey.columnNames)) {
                return false;
            }
            return this.referenceColumnNames.equals(foreignKey.referenceColumnNames);
        }

        public ForeignKey(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = Collections.unmodifiableList(list);
            this.referenceColumnNames = Collections.unmodifiableList(list2);
        }
    }

    /* loaded from: classes26.dex */
    public static class Index {
        public final List<String> columns;
        public final String name;
        public final boolean unique;

        static {
            Covode.recordClassIndex(1868);
        }

        public int hashCode() {
            int hashCode;
            if (this.name.startsWith("index_")) {
                hashCode = "index_".hashCode();
            } else {
                hashCode = this.name.hashCode();
            }
            return (((hashCode * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Index index = (Index) obj;
            if (this.unique != index.unique || !this.columns.equals(index.columns)) {
                return false;
            }
            if (this.name.startsWith("index_")) {
                return index.name.startsWith("index_");
            }
            return this.name.equals(index.name);
        }

        public Index(String str, boolean z, List<String> list) {
            this.name = str;
            this.unique = z;
            this.columns = list;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.name;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map<String, Column> map = this.columns;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set<ForeignKey> set = this.foreignKeys;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    /* renamed from: androidx.room.util.TableInfo$a */
    /* loaded from: classes13.dex */
    public static class C0402a implements Comparable<C0402a> {
        public final int LIZ;
        public final int LIZIZ;
        public final String LIZJ;
        public final String LIZLLL;

        static {
            Covode.recordClassIndex(1869);
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C0402a c0402a) {
            C0402a c0402a2 = c0402a;
            int i = this.LIZ - c0402a2.LIZ;
            if (i == 0) {
                return this.LIZIZ - c0402a2.LIZIZ;
            }
            return i;
        }

        public C0402a(int i, int i2, String str, String str2) {
            this.LIZ = i;
            this.LIZIZ = i2;
            this.LIZJ = str;
            this.LIZLLL = str2;
        }
    }

    public static List<C0402a> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C33968a.f42937f);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0402a(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        String str = this.name;
        if (str != null) {
            if (!str.equals(tableInfo.name)) {
                return false;
            }
        } else if (tableInfo.name != null) {
            return false;
        }
        Map<String, Column> map = this.columns;
        if (map != null) {
            if (!map.equals(tableInfo.columns)) {
                return false;
            }
        } else if (tableInfo.columns != null) {
            return false;
        }
        Set<ForeignKey> set2 = this.foreignKeys;
        if (set2 != null) {
            if (!set2.equals(tableInfo.foreignKeys)) {
                return false;
            }
        } else if (tableInfo.foreignKeys != null) {
            return false;
        }
        Set<Index> set3 = this.indices;
        if (set3 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public static TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return new TableInfo(str, readColumns(supportSQLiteDatabase, str), readForeignKeys(supportSQLiteDatabase, str), readIndices(supportSQLiteDatabase, str));
    }

    public static Map<String, Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        boolean z;
        Cursor query = supportSQLiteDatabase.query(C0002O.m25085C("PRAGMA table_info(`", str, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (query.getColumnCount() > 0) {
                int columnIndex = query.getColumnIndex("name");
                int columnIndex2 = query.getColumnIndex("type");
                int columnIndex3 = query.getColumnIndex("notnull");
                int columnIndex4 = query.getColumnIndex(PushConstants.URI_PACKAGE_NAME);
                while (query.moveToNext()) {
                    String string = query.getString(columnIndex);
                    String string2 = query.getString(columnIndex2);
                    if (query.getInt(columnIndex3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hashMap.put(string, new Column(string, string2, z, query.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public static Set<Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor query = supportSQLiteDatabase.query(C0002O.m25085C("PRAGMA index_list(`", str, "`)"));
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("origin");
            int columnIndex3 = query.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                return null;
            }
            HashSet hashSet = new HashSet();
            while (query.moveToNext()) {
                if ("c".equals(query.getString(columnIndex2))) {
                    String string = query.getString(columnIndex);
                    boolean z = true;
                    if (query.getInt(columnIndex3) != 1) {
                        z = false;
                    }
                    Index readIndex = readIndex(supportSQLiteDatabase, string, z);
                    if (readIndex == null) {
                        return null;
                    }
                    hashSet.add(readIndex);
                }
            }
            return hashSet;
        } finally {
            query.close();
        }
    }

    public static Set<ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor query = supportSQLiteDatabase.query(C0002O.m25085C("PRAGMA foreign_key_list(`", str, "`)"));
        try {
            int columnIndex = query.getColumnIndex(C33968a.f42937f);
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List<C0402a> readForeignKeyFieldMappings = readForeignKeyFieldMappings(query);
            int count = query.getCount();
            for (int i = 0; i < count; i++) {
                query.moveToPosition(i);
                if (query.getInt(columnIndex2) == 0) {
                    int i2 = query.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0402a c0402a : readForeignKeyFieldMappings) {
                        if (c0402a.LIZ == i2) {
                            arrayList.add(c0402a.LIZJ);
                            arrayList2.add(c0402a.LIZLLL);
                        }
                    }
                    hashSet.add(new ForeignKey(query.getString(columnIndex3), query.getString(columnIndex4), query.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            query.close();
        }
    }

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set) {
        this(str, map, set, Collections.emptySet());
    }

    public static Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        Cursor query = supportSQLiteDatabase.query(C0002O.m25085C("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (query.moveToNext()) {
                    if (query.getInt(columnIndex2) >= 0) {
                        int i = query.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), query.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new Index(str, z, arrayList);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set, Set<Index> set2) {
        Set<Index> unmodifiableSet;
        this.name = str;
        this.columns = Collections.unmodifiableMap(map);
        this.foreignKeys = Collections.unmodifiableSet(set);
        if (set2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.indices = unmodifiableSet;
    }
}
