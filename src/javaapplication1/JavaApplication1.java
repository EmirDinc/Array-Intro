package javaapplication1;
public class JavaApplication1 {
    public static void main(String[] args) {
        
        
        int test [ ] ;
        test = new int [8] ;
        
        System.out.println(" Number of elements in the test array = " + test.length);
        
        DisplayIntArrays ( test );
        
        for ( int ArrayElementIndex = 0 ; ArrayElementIndex < test.length; 
            ArrayElementIndex++ )
        {
            test[ArrayElementIndex] = ArrayElementIndex * ArrayElementIndex;
        }
        DisplayIntArrays ( test );
    }
    
    public static void DisplayIntArrays ( int intArrayIn [ ])
    {
        for ( int ArrayElementIndex = 0 ; ArrayElementIndex < intArrayIn.length; 
            ArrayElementIndex++ )
        {
            System.out.print ( intArrayIn [ ArrayElementIndex ] + "\t" );
        }
        System.out.println("\n");
    }
}
