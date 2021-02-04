package data;

import exceptions.NotTriangleException;
import exceptions.NotPositiveParameterException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle {

    private int a;
    private int b;
    private int c;

    public String getType(){


        checkParamPositivity(a);
        checkParamPositivity(b);
        checkParamPositivity(c);

        if (!isTriangle(a, b, c)) {
            throw new NotTriangleException( a + " " + b + " " + c);
        }

        if(a == b){
            if(a == c)
                return TriangleType.EQUILATERAL.getDescription();
            else
                return TriangleType.ISOSCELES.getDescription();

        }else if(b == c || a == c){
            return TriangleType.ISOSCELES.getDescription();

        }else
            return TriangleType.SCALANE.getDescription();
    }

    private void checkParamPositivity(int x){
        if(!(x > 0))
            throw new NotPositiveParameterException(" " + x +" ");
    }

    private boolean isTriangle(int a, int b, int c){
        boolean result = false;

        if(a + b > c)
            if(b + c > a)
                if(a + c > b)
                    result = true;

         return result;
    }

}
