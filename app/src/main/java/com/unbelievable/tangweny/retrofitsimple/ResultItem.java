package com.unbelievable.tangweny.retrofitsimple;

/**
 * Created by tangweny on 2016/10/8.
 */
public class ResultItem {
    private int code;
    private String desc;
    private DataItem dataItem;
    public static class DataItem{
        private String method;

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DataItem getDataItem() {
        return dataItem;
    }

    public void setDataItem(DataItem dataItem) {
        this.dataItem = dataItem;
    }
}
