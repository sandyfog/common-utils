/**
 * 
 */
package com.baidu.unbiz.common.convert.array;

import com.baidu.unbiz.common.ArrayUtil;
import com.baidu.unbiz.common.able.ArrayConvertable;

/**
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月20日 上午2:19:17
 */
public enum PrimitiveArrayType implements ArrayConvertable {

    BOOLEAN {
        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == boolean[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return (boolean[]) value;
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return ArrayUtil.booleanToByte((boolean[]) value);
        }

        @Override
        public char[] convert2Char(Object value) {
            return ArrayUtil.booleanToChar((boolean[]) value);
        }

        @Override
        public double[] convert2Double(Object value) {
            return ArrayUtil.booleanToDouble((boolean[]) value);
        }

        @Override
        public float[] convert2Float(Object value) {
            return ArrayUtil.booleanToFloat((boolean[]) value);
        }

        @Override
        public int[] convert2Int(Object value) {
            return ArrayUtil.booleanToInt((boolean[]) value);
        }

        @Override
        public long[] convert2Long(Object value) {
            return ArrayUtil.booleanToLong((boolean[]) value);
        }

        @Override
        public short[] convert2Short(Object value) {
            return ArrayUtil.booleanToShort((boolean[]) value);
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.booleanToString((boolean[]) value);
        }
    },
    BYTE {

        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == byte[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return ArrayUtil.byteToBoolean((byte[]) value);
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return (byte[]) value;
        }

        @Override
        public char[] convert2Char(Object value) {
            return ArrayUtil.byteToChar((byte[]) value);
        }

        @Override
        public double[] convert2Double(Object value) {
            return ArrayUtil.byteToDouble((byte[]) value);
        }

        @Override
        public float[] convert2Float(Object value) {
            return ArrayUtil.byteToFloat((byte[]) value);
        }

        @Override
        public int[] convert2Int(Object value) {
            return ArrayUtil.byteToInt((byte[]) value);
        }

        @Override
        public long[] convert2Long(Object value) {
            return ArrayUtil.byteToLong((byte[]) value);
        }

        @Override
        public short[] convert2Short(Object value) {
            return ArrayUtil.byteToShort((byte[]) value);
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.byteToString((byte[]) value);
        }
    },
    CHAR {

        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == char[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return ArrayUtil.charToBoolean((char[]) value);
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return ArrayUtil.charToByte((char[]) value);
        }

        @Override
        public char[] convert2Char(Object value) {
            return (char[]) value;
        }

        @Override
        public double[] convert2Double(Object value) {
            return ArrayUtil.charToDouble((char[]) value);
        }

        @Override
        public float[] convert2Float(Object value) {
            return ArrayUtil.charToFloat((char[]) value);
        }

        @Override
        public int[] convert2Int(Object value) {
            return ArrayUtil.charToInt((char[]) value);
        }

        @Override
        public long[] convert2Long(Object value) {
            return ArrayUtil.charToLong((char[]) value);
        }

        @Override
        public short[] convert2Short(Object value) {
            return ArrayUtil.charToShort((char[]) value);
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.charToString((char[]) value);
        }
    },

    DOUBLE {

        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == double[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return ArrayUtil.doubleToBoolean((double[]) value);
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return ArrayUtil.doubleToByte((double[]) value);
        }

        @Override
        public char[] convert2Char(Object value) {
            return ArrayUtil.doubleToChar((double[]) value);
        }

        @Override
        public double[] convert2Double(Object value) {
            return (double[]) value;
        }

        @Override
        public float[] convert2Float(Object value) {
            return ArrayUtil.doubleToFloat((double[]) value);
        }

        @Override
        public int[] convert2Int(Object value) {
            return ArrayUtil.doubleToInt((double[]) value);
        }

        @Override
        public long[] convert2Long(Object value) {
            return ArrayUtil.doubleToLong((double[]) value);
        }

        @Override
        public short[] convert2Short(Object value) {
            return ArrayUtil.doubleToShort((double[]) value);
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.doubleToString((double[]) value);
        }
    },
    FLOAT {

        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == float[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return ArrayUtil.floatToBoolean((float[]) value);
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return ArrayUtil.floatToByte((float[]) value);
        }

        @Override
        public char[] convert2Char(Object value) {
            return ArrayUtil.floatToChar((float[]) value);
        }

        @Override
        public double[] convert2Double(Object value) {
            return ArrayUtil.floatToDouble((float[]) value);
        }

        @Override
        public float[] convert2Float(Object value) {
            return (float[]) value;
        }

        @Override
        public int[] convert2Int(Object value) {
            return ArrayUtil.floatToInt((float[]) value);
        }

        @Override
        public long[] convert2Long(Object value) {
            return ArrayUtil.floatToLong((float[]) value);
        }

        @Override
        public short[] convert2Short(Object value) {
            return ArrayUtil.floatToShort((float[]) value);
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.floatToString((float[]) value);
        }
    },
    INT {

        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == int[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return ArrayUtil.intToBoolean((int[]) value);
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return ArrayUtil.intToByte((int[]) value);
        }

        @Override
        public char[] convert2Char(Object value) {
            return ArrayUtil.intToChar((int[]) value);
        }

        @Override
        public double[] convert2Double(Object value) {
            return ArrayUtil.intToDouble((int[]) value);
        }

        @Override
        public float[] convert2Float(Object value) {
            return ArrayUtil.intToFloat((int[]) value);
        }

        @Override
        public int[] convert2Int(Object value) {
            return (int[]) value;
        }

        @Override
        public long[] convert2Long(Object value) {
            return ArrayUtil.intToLong((int[]) value);
        }

        @Override
        public short[] convert2Short(Object value) {
            return ArrayUtil.intToShort((int[]) value);
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.intToString((int[]) value);
        }
    },
    LONG {

        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == long[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return ArrayUtil.longToBoolean((long[]) value);
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return ArrayUtil.longToByte((long[]) value);
        }

        @Override
        public char[] convert2Char(Object value) {
            return ArrayUtil.longToChar((long[]) value);
        }

        @Override
        public double[] convert2Double(Object value) {
            return ArrayUtil.longToDouble((long[]) value);
        }

        @Override
        public float[] convert2Float(Object value) {
            return ArrayUtil.longToFloat((long[]) value);
        }

        @Override
        public int[] convert2Int(Object value) {
            return ArrayUtil.longToInt((long[]) value);
        }

        @Override
        public long[] convert2Long(Object value) {
            return (long[]) value;
        }

        @Override
        public short[] convert2Short(Object value) {
            return ArrayUtil.longToShort((long[]) value);
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.longToString((long[]) value);
        }
    },
    SHORT {

        @Override
        public boolean hit(Class<?> clazz) {
            return clazz == short[].class;
        }

        @Override
        public boolean[] convert2Boolean(Object value) {
            return ArrayUtil.shortToBoolean((short[]) value);
        }

        @Override
        public byte[] convert2Byte(Object value) {
            return ArrayUtil.shortToByte((short[]) value);
        }

        @Override
        public char[] convert2Char(Object value) {
            return ArrayUtil.shortToChar((short[]) value);
        }

        @Override
        public double[] convert2Double(Object value) {
            return ArrayUtil.shortToDouble((short[]) value);
        }

        @Override
        public float[] convert2Float(Object value) {
            return ArrayUtil.shortToFloat((short[]) value);
        }

        @Override
        public int[] convert2Int(Object value) {
            return ArrayUtil.shortToInt((short[]) value);
        }

        @Override
        public long[] convert2Long(Object value) {
            return ArrayUtil.shortToLong((short[]) value);
        }

        @Override
        public short[] convert2Short(Object value) {
            return (short[]) value;
        }

        @Override
        public String[] convert2String(Object value) {
            return ArrayUtil.shortToString((short[]) value);
        }
    };

    public abstract boolean hit(Class<?> clazz);

    public static PrimitiveArrayType find(Class<?> type) {
        for (PrimitiveArrayType arrayType : PrimitiveArrayType.values()) {
            if (arrayType.hit(type)) {
                return arrayType;
            }
        }

        return null;
    }

}
