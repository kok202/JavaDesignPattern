package designpattern02_adapter;

public class MathAdaptee implements MathAdapter{

    @Override
    public float twice(float f) {
        return (float) Math.twice(f);
    }

    @Override
    public float half(float f) {
        return (float) Math.half(f);
    }
    
}
