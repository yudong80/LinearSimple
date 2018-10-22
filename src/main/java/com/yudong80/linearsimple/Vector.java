package com.yudong80.linearsimple;

public class Vector {
    private double[] values;

    public Vector(double[] v) {
        values = v;
    }

    public Vector add(Vector v) {
        double[] newValues = values.clone();
        for (int i=0; i< values.length; ++i) {
            newValues[i] += v.get(i);
        }
        return new Vector(newValues);
    }

    public Vector substract(Vector v) {
        double[] newValues = values.clone();
        for (int i=0; i< values.length; ++i) {
            newValues[i] -= v.get(i);
        }
        return new Vector(newValues);
    }

    public Vector dotProduct(Vector v) {
        double[] newValues = values.clone();
        for (int i=0; i< values.length; ++i) {
            newValues[i] *= v.get(i);
        }
        return new Vector(newValues);
    }

    public double get(int i) {
        return values[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i=0; i< values.length; ++i) sb.append(values[i]).append(',');
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(new double[] {1,2,3});
        Vector v2 = new Vector(new double[] {2,3,4});
        System.out.println(v1.add(v2));
    }
}
