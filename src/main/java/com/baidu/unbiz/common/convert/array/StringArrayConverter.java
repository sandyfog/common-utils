package com.baidu.unbiz.common.convert.array;

import com.baidu.unbiz.common.convert.TypeConverter;

/**
 * FIXME ArrayConverter
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月19日 上午3:46:50
 */
@TypeConverter.Convert
public class StringArrayConverter extends ArrayConverter<String> implements TypeConverter<String[]> {

    public StringArrayConverter() {
        register(String[].class);
    }

    @Override
    protected String[] createArray(int length) {
        return new String[length];
    }

    @Override
    protected String[] convertPrimitiveArrayToArray(Object value, Class<?> primitiveComponentType) {
        PrimitiveArrayType arrayType = PrimitiveArrayType.find(value.getClass());
        if (arrayType != null) {
            return arrayType.convert2String(value);
        }

        return null;
    }

}
