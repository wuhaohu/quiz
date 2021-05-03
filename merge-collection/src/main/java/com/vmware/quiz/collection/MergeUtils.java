package com.vmware.quiz.collection;

import java.util.*;

public class MergeUtils {
    public static <O> List<O> collate(final Collection<? extends O> a, final Collection<? extends O> b,
                                      final Comparator<? super O> c) {

        if (a == null || b == null) {
            throw new NullPointerException("The collections must not be null");
        }
        if (c == null) {
            throw new NullPointerException("The comparator must not be null");
        }

        // if both Iterables are a Collection, we can estimate the size
        final int totalSize =  Math.max(1, a.size() + b.size());

        Iterator<? extends O> iter1 = a.iterator();
        Iterator<? extends O> iter2 = b.iterator();
        final ArrayList<O> mergedList = new ArrayList<>(totalSize);

        while(iter1.hasNext() && iter2.hasNext()){
            O o1 = iter1.next();
            O o2 = iter2.next();
            if(c.compare(o1,o2) <= 0){
                mergedList.add(o1);
            }else {
                mergedList.add(o2);
            }
        }
        while(iter1.hasNext()){
            mergedList.add(iter1.next());
        }
        while(iter2.hasNext()){
            mergedList.add(iter2.next());
        }
        return mergedList;
    }

}
