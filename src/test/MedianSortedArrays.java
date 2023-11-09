package test;

import java.util.*;

public class MedianSortedArrays {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            //merge
            List<Integer> merge = new ArrayList<>();
            if(nums1.length==0){
                if(nums2.length%2 == 0){
                    double ret = (double) ( nums2[(nums2.length)/2]+nums2[(nums2.length/2)-1]) / 2;
                    return ret;
                }else{
                    //uneven
                    double ret = nums2[(nums2.length+1)/2];
                    return ret;
                }
            }

            if(nums2.length==0){
                if(nums1.length%2 == 0){
                    double ret = (double) ( nums1[(nums1.length)/2]+nums1[(nums1.length/2)-1]) / 2;
                    return ret;
                }else{
                    //uneven
                    double ret = nums1[(nums1.length+1)/2];
                    return ret;
                }
            }
            int i=0;
            int j=0;
            while(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                    merge.add(nums1[i]);
                    if(i+1>=nums1.length){
                        while(j<nums2.length){
                            merge.add(nums2[j]);
                            j++;
                        }
                        break;
                    }
                    i++;
                }
                else{
                    merge.add(nums2[j]);
                    if(j+1>=nums2.length){
                        while(i<nums1.length){
                            merge.add(nums1[i]);
                            i++;
                        }
                        break;
                    }
                    j++;
                }
            }
            //even size?
            if((nums1.length+nums2.length)%2 == 0){
                double ret = (double) (merge.get(merge.size()/2)+merge.get((merge.size()/2)-1))/2;
                return ret;
            }else{
                //uneven
                double ret = merge.get((merge.size())/2);
                return ret;
            }
        }
}
