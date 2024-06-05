package Interfaces;

public class Main implements Flying{
    public static void main(String[] args) {

        Flying.numbers[2] = 5;
        final int [] numbers = {1,2,3};
        numbers[1] = 0;

        // Flying.number = 3;
        System.out.println(Flying.numbers[2]);
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'land'");
    }

    @Override
    public void descend() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'descend'");
    }

    @Override
    public void ascend() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ascend'");
    }
}
