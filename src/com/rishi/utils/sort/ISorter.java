package com.rishi.utils.sort;

public interface ISorter<TDataType> {

    TDataType sort(TDataType arr[]);
    TDataType compare(TDataType firstElement, TDataType secondElement);

}
