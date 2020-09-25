package com.rsupak;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        if (extraBuckets < 0) return -1;

        double wallArea = width * height;
        double currentBucketArea = areaPerBucket * extraBuckets;
        return (int)Math.ceil((wallArea - currentBucketArea) / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        double wallArea = width * height;
        return (int)Math.ceil(wallArea / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;

        return (int)Math.ceil(area / areaPerBucket);
    }
}
